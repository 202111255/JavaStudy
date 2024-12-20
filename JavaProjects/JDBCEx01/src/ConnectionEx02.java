import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx02 {
    public static void main(String[] args) {
        System.out.println("시작");

        //드라이버 이름 : org.mariadb.jdbc.Driver
        //동적으로 클래스 로딩
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("드라이버 로딩");
        } catch (ClassNotFoundException e) {
            System.out.println("[에러 ]" + e.getMessage());
        }


        //연결 (local or 원격)
        //데이터베이스 위치(IP & PORT)
        //사용자 아이디
        //비밀번호
        String url = "jdbc:mariadb://localhost:3306/sample"; //localhost 앞까지는 예약어
        String user = "root";
        String password = "!123456";

        Connection conn = null;;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터베이스 연결 성공");
        } catch (SQLException e) {
            System.out.println("[에러] " + e.getMessage());
        } finally {
            if (conn != null) {
                try {conn.close();} catch (SQLException e) {};
            }
        }

        System.out.println("끝");
    }
}
