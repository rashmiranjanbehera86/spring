package com.technopanditg;

import com.technopanditg.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {
    @Autowired
    AddService addService;

    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {

        int i = Integer.parseInt(request.getParameter("t1"));
        int j = Integer.parseInt(request.getParameter("t2"));

        System.out.println("Passing value to addService()"+i+" : "+j);
        int k = addService.add(i, j);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display.jsp");
        mv.addObject("result", k);
        return mv;
    }
}
