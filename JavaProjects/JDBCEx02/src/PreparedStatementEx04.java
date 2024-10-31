import java.sql.*;

public class PreparedStatementEx04 {
    public static void main(String[] args) {

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "root";
        String password = "!123456";

        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName( "org.mariadb.jdbc.Driver" );
            conn = DriverManager.getConnection( url, user, password );

            String sql = "select empno, ename, sal from emp where ename like ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%co%");


            rs = pstmt.executeQuery();

            while (rs.next()) {
                String empno = rs.getString(1);
                String ename = rs.getString(2);
                String sal = rs.getString(3);

                System.out.print(empno + "\t");
                System.out.print(ename + "\t");
                System.out.println(sal);
            }



        } catch (ClassNotFoundException e) {
            System.out.println("[에러] " + e.getMessage());
        } catch (SQLException e ) {
            System.out.println("[에러] " + e.getMessage());
        } finally {
            if ( rs != null ) { try { rs.close(); } catch (SQLException e) {} }
            if ( pstmt != null ) { try { pstmt.close(); } catch (SQLException e) {} }
            if ( conn != null ) { try { conn.close(); } catch (SQLException e) {} }
        }


    }
}
