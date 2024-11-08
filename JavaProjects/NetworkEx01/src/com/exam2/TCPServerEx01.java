package com.exam2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.ServerSocket;

public class TCPServerEx01 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        //클라이언트에서 보낸 메세지 받기
        BufferedReader br = null;


        try {
            serverSocket = new ServerSocket(7777);
            System.out.println("서버가 준비되었습니다.");

            socket = serverSocket.accept();
            System.out.println("클라이언트와 연결되었습니다.");

            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("메세지 : " + br.readLine());
        } catch (IOException e) {
            System.out.println("[에러] " + e.getMessage());
        } finally {
            if (socket != null) {
                try {socket.close();} catch (IOException e) {}
            }
            if (serverSocket != null) {
                try {serverSocket.close();} catch (IOException e) {}
            }
        }


    }
}
