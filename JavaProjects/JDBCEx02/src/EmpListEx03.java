import java.sql.*;

public class EmpListEx03 {
    //문제 : emp 테이블의 10번 부서 데이터를 emp10으로 옮기기
    public static void main(String[] args) {
        System.out.println("시작");

        String url = "jdbc:mariadb://localhost:3306/sample"; //localhost 앞까지는 예약어
        String user = "root";
        String password = "!123456";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공");

            stmt = conn.createStatement();

            String sql = "select * from emp where deptno = 10";
            rs = stmt.executeQuery(sql);


            //전체 데이터 다 읽기
            while (rs.next()) {
                sql = String.format("insert into emp10 values(%s, '%s', '%s', %s, '%s', %s, %s, %s)",
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8));
                stmt.executeUpdate(sql);
            }


            System.out.println("쿼리 실행 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("[에러 ]" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러] " + e.getMessage());
        } finally {
            if (conn != null) {
                try {conn.close();} catch (SQLException e) {};
            }
            if (stmt != null) {
                try {stmt.close();} catch (SQLException e) {};
            }
            if (rs != null) {
                try {rs.close();} catch (SQLException e) {};
            }
        }

        System.out.println("끝");
    }
}