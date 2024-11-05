package com.exam1;

import java.sql.*;
import java.util.Scanner;

public class SendMessage {
    public void send() {
        String url = "jdbc:mariadb://localhost:3306/user";
        String user = "root";
        String password = "!123456";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();

            System.out.print("쪽지 발신자의 번호를 입력해주세요: ");
            int senderId = sc.nextInt();
            sc.nextLine();
            String checkSql = "SELECT * FROM user WHERE number = " + senderId;
            rs = stmt.executeQuery(checkSql);


            if (rs.next()) {
                System.out.print("쪽지 수신자의 번호를 입력해주세요: ");
                int receiverId = sc.nextInt();
                sc.nextLine();
                String checkSql2 = "SELECT * FROM user WHERE number = " + receiverId;
                rs = stmt.executeQuery(checkSql2);

                if (rs.next()) {
                    System.out.println("보낼 메세지의 제목을 입력해주세요: ");
                    System.out.print(">> 제목: ");
                    String title  = sc.nextLine();
                    System.out.println("보낼 메세지의 내용을 입력해주세요: ");
                    System.out.print(">> 내용: ");
                    String body  = sc.nextLine();

                    String sql = String.format("insert into message(sender_id, receiver_id, message_title, message_body) values ('%s', '%s', '%s', '%s')",
                            senderId, receiverId, title, body);
                    int row = stmt.executeUpdate(sql);
                    if (row > 0) {
                        System.out.println("메세지를 성공적으로 전송하였습니다.");
                    } else {
                        System.out.println("메세지 전송에 실패하였습니다.");
                    }

                } else {
                    System.out.println("입력하신 회원번호에 해당하는 회원은 존재하지 않습니다.");
                }

            } else {
                System.out.println("입력하신 회원번호에 해당하는 회원은 존재하지 않습니다.");
            }



        } catch (ClassNotFoundException e) {
            System.out.println("에러: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("에러: " + e.getMessage());
        } finally {
            if( rs != null) { try{rs.close();} catch (SQLException e) {}}
            if( stmt != null) { try {stmt.close();} catch (SQLException e) {}}
            if(conn != null) { try { conn.close();} catch (SQLException e) {}}
        }
    }
}