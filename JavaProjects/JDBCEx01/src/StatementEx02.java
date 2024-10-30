import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx02 {
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

            //update / delete
            //String sql = String.format("update dept2 set loc='%s' where deptno = %s", "서울", 53);
            String sql = String.format("delete from dept2 where deptno = %s", 53);

            int result = stmt.executeUpdate(sql); //영향을 받은 행의 수 리턴
            System.out.println(result);

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
