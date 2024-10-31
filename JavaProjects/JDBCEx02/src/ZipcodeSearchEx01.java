import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class ZipcodeSearchEx01 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("[실행 방법] java 클래스명 동이름");
            System.exit(0);
        }
        if (args.length < 2) {
            System.out.println("동이름을 2자 이상 입력하세요.");
            System.exit(0);
        }

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "!123456";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName( "org.mariadb.jdbc.Driver" );
            conn = DriverManager.getConnection( url, user, password );
            stmt = conn.createStatement();

            String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like '" + args[0] +"%'";

            rs = stmt.executeQuery(sql);

            while(rs.next()) {
                //출력문
                String zipcode = rs.getString("zipcode");;
                String sido = rs.getString("sido");
                String gugun = rs.getString("gugun");
                String dong =  rs.getString("dong");
                String ri = rs.getString("ri");
                String bunji = rs.getString("bunji");

                System.out.printf("[%s] %s %s %s %s %s%n", zipcode, sido, gugun, dong, ri, bunji );
            }


        } catch (ClassNotFoundException e) {
            System.out.println("[에러] " + e.getMessage());
        } catch (SQLException e ) {
            System.out.println("[에러] " + e.getMessage());
        } finally {
            if ( rs != null ) { try { rs.close(); } catch (SQLException e) {} }
            if ( stmt != null ) { try { stmt.close(); } catch (SQLException e) {} }
            if ( conn != null ) { try { conn.close(); } catch (SQLException e) {} }
        }

    }
}
