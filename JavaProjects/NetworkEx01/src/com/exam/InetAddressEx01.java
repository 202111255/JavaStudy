package com.exam;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx01 {
    public static void main(String[] args) {
        // java.net 패키지에서 InetAddress 클래스 사용
        // 도메인 <-> IP 주소 변환

        try {
            // 도메인 이름을 통해 IP 주소 정보를 가져옴
            InetAddress inetAddress1 = InetAddress.getByName("www.daum.net");

            // 호스트 이름 출력
            System.out.println("Host Name: " + inetAddress1.getHostName());

            // 호스트의 IP 주소 출력
            System.out.println("다음 Host Address: " + inetAddress1.getHostAddress());

            InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
            for (InetAddress inetAddress : inetAddresses) {
                System.out.println("네이버 HostAddress: " + inetAddress.getHostAddress());
            }
        } catch (UnknownHostException e) {
            // 도메인 이름을 찾을 수 없을 때 발생하는 예외 처리
            System.out.println("[에러] " + e.getMessage());
        }
    }
}
