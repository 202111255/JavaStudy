package org.example;

import java.sql.*;

public class JDBCEx01 {
    public static void main(String[] args) {

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

            String sql = String.format( "select * from dept" );
            rs = stmt.executeQuery( sql );

            while( rs.next() ) {
                String deptno = rs.getString( "deptno" );
                String dname = rs.getString( "dname" );
                String loc = rs.getString( "loc" );

                String result = String.format( "%s\t%s\t%s", deptno, dname, loc );
                System.out.println( result );
            }
        } catch( ClassNotFoundException e ) {
            // TODO Auto-generated catch block
            System.out.println( e.getMessage() );
        } catch( SQLException e ) {
            // TODO Auto-generated catch block
            System.out.println( e.getMessage() );
        } finally {
            if( rs != null ) try { rs.close(); } catch( SQLException e ) {}
            if( stmt != null ) try { stmt.close(); } catch( SQLException e ) {}
            if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
        }

    }
}