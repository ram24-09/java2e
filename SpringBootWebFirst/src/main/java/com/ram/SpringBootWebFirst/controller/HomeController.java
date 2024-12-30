package com.ram.SpringBootWebFirst.controller;

import com.ram.SpringBootWebFirst.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }


//In servlet way to add two numbers received from client.
//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1+num2;
//        session.setAttribute("result", result);
//
//        return "result.jsp";
//    }


// Using spring
//    @RequestMapping("/add")
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model){
//        int result = num1+num2;
//        model.addAttribute("result", result);
//        return "result";
//    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){
        int result = num1+num2;
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }


//    adding new record (with person class)
//    @RequestMapping("/addPerson")
//    public ModelAndView addPerson(@RequestParam("pid") int pid, @RequestParam("pname") String pname, ModelAndView mv){
//        Person p = new Person();
//        p.setPid(pid);
//        p.setPname(pname);
//        mv.addObject("p", p);
//        mv.setViewName("result");
//        return mv;
//    }

    //alternate way to add record using @ModelAttribute
    @RequestMapping("/addPerson")
    public String addPerson(@ModelAttribute("p") Person p){//@ModelAttribute("p") is optional if we are using same name
        return "result";
    }
}
