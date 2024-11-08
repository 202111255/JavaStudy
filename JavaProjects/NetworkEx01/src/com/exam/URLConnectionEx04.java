package com.exam;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx04 {
    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            URLConnection conn = new URL( "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.xml?key=fd7566d03ea3d24d7da49858bfab44af&targetDt=20241026\n" ).openConnection();

            br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line = br.readLine().replaceAll("><", ">\n<");
            //System.out.println(line);

            String[] lines = line.split("\n");
            for (String data : lines) {
                if (data.trim().startsWith("<movieNm" +
                        ">")) {
                    System.out.println(data.trim());
                }
            }
        } catch (IOException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if ( br != null ) { try { br.close(); } catch (IOException e) {} }
        }
    }
}