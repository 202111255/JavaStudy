package org.example.model2;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.model1.ZipcodeDAO;
import org.example.model1.ZipcodeTO;

import java.util.ArrayList;

public class ZipcodeOkAction implements Action{
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("ZipcodeOkAction 호출");
        String dong = req.getParameter("dong");
        System.out.println("dong : " + dong);

        ZipcodeDAO dao = new ZipcodeDAO();
        ArrayList<ZipcodeTO> lists = dao.zipcodeList(dong);
        System.out.println("갯수 : " + lists.size());

        //View로 보내기
        req.setAttribute("lists", lists);
    }
}
