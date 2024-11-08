package com.exam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx03 {
    public static void main(String[] args) {

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            URLConnection conn = new URL( "https://t1.daumcdn.net/news/202411/01/kppa/20241101131019918qtps.jpg" ).openConnection();

            // 읽어 올 이미지
            bis = new BufferedInputStream( conn.getInputStream() );
            // 저장 이미지
            bos = new BufferedOutputStream( new FileOutputStream( "./gallery.jpg" ) );

            int data = 0;
            while( ( data = bis.read() ) != -1 ) {
                bos.write( data );
            }

            System.out.println( "저장 완료" );
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if ( bis != null ) { try { bis.close(); } catch (IOException e) {} }
            if ( bos != null ) { try { bos.close(); } catch (IOException e) {} }
        }
    }
}