import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx01 {
    public static void main(String[] args) {
        System.out.println("시작");




        //연결 (local or 원격)
        //데이터베이스 위치(IP & PORT)
        //사용자 아이디
        //비밀번호
        String url = "jdbc:mariadb://localhost:3306/sample"; //localhost 앞까지는 예약어
        String user = "root";
        String password = "!123456";


        Connection conn = null;
        Statement stmt = null;

        //드라이버 이름 : org.mariadb.jdbc.Driver
        //동적으로 클래스 로딩
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공");

            //Statement + SQL
            //Select => 리턴
            //기타 전부 => 리턴 X : Insert, Update, Delete 등
            stmt = conn.createStatement();
            //select 이외의 모든 SQL에 사용

            //String sql = "insert into dept2 values(52, '생산부', '목포')";
            String deptno = "53";
            String dname = "연구부";
            String loc = "대전";

            //String sql = "insert into dept2 values (" + deptno + ", '" + dname + "', '" + loc + "')";
            String sql = String.format("insert into dept2 values (%s, '%s', '%s')", deptno, dname, loc);

            stmt.executeUpdate(sql);
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
        }

        System.out.println("끝");
    }
}
