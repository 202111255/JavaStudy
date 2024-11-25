package org.example.cookie.Controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @RequestMapping("/getcookie")
    public String getCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("cookieid")) {
                    System.out.println(cookie.getName() + " : " + cookie.getValue());
                } else {
                    System.out.println(cookie.getName() + " : " + cookie.getValue());
                }
            }
        }
        return "getcookie";
    }

    @RequestMapping("/setcookie")
    public String setCookie(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie1 = new Cookie("cookieid", "tester");

        //옵션 - 만료시간(초)
        cookie1.setMaxAge(5*60); //5분 - 이렇게 하면 브라우저가 꺼져도 쿠키가 남아있게됨

        response.addCookie(cookie1);
        return "setcookie";
    }

    @RequestMapping("/getcookie2")
    public String getCookie2(
            @CookieValue(value = "cookieid", required = false) String id
    ) {
        if (id != null) {
            System.out.println("cookieid : " + id);
        }
        return "getcookie";
    }

    // 로그인

    @RequestMapping("/login_form")
    public String login_form() {
        return "login_form";
    }

    @RequestMapping("/login_ok")
    public String login_ok(
    ) {
        return "login_ok";
    }

    @RequestMapping("/login_complete")
    public String login_complete() {
        return "login_complete";
    }
}
