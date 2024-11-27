import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class InsertZipCodeEx03 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "!123456";

        BufferedReader br = null;
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName( "org.mariadb.jdbc.Driver" );
            conn = DriverManager.getConnection( url, user, password );


            br = new BufferedReader(new FileReader( "./zipcode_seoul_utf8_type2.csv" ) );
            String line = "";
            while( ( line = br.readLine() ) != null ) {

                String[] addresses = line.split( "," );
                String sql = "insert into zipcode values ( ?, ?, ?, ?, ?, ?, ? )";

                        //String.format( "insert into zipcode values ( '%s', '%s', '%s', '%s', '%s', '%s', %s )"
                        //,addresses[0], addresses[1], addresses[2], addresses[3], addresses[4], addresses[5], addresses[6] );

                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, addresses[0]);
                pstmt.setString(2, addresses[1]);
                pstmt.setString(3, addresses[2]);
                pstmt.setString(4, addresses[3]);
                pstmt.setString(5, addresses[4]);
                pstmt.setString(6, addresses[5]);
                pstmt.setString(7, addresses[6]);
                pstmt.executeUpdate();
            }

            System.out.println( "복구 완료" );

        } catch (IOException e) {
            System.out.println("[에러] " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("[에러] " + e.getMessage());
        } catch (SQLException e ) {
            System.out.println("[에러] " + e.getMessage());
        } finally {
            if ( br != null ) { try { br.close(); } catch (IOException e) {} }

            if ( pstmt != null ) { try { pstmt.close(); } catch (SQLException e) {} }
            if ( conn != null ) { try { conn.close(); } catch (SQLException e) {} }
        }
    }
}