package com.rishi.springbootweb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){

        return "Java";
    }

    @RequestMapping("/")//this annotation is resposible for mapping a reuqest in a url
    public String home(){
        System.out.println("Home Method Called!");
        //return "index.jsp";
        return "index";
    }

    @RequestMapping("add")
    //the below approach is done by following the approach in servlets to accpet data from client

   /* public String add(HttpServletRequest req, HttpSession session){
        //System.out.println("in Add");
        int num1=Integer.parseInt(req.getParameter("num1"));
        int num2=Integer.parseInt(req.getParameter("num2"));
        int result=num1+num2;
        //System.out.println(result);
        session.setAttribute("result",result);
        return "result.jsp";
    } */

    //THE BELOW APPROACH IS SPRING APPROACH
    //public String add(@RequestParam("num1") int num, int num2, HttpSession session){
   /* public String add( int num1, int num2, HttpSession session){
        int result=num1+num2 +1;
        session.setAttribute("result", result);
        return "result.jsp";
    }
    in this block we are using session object to avoid that and also based on mvc concept,
    we need a Model which is nothing the object which contains data
    the below block has Model init, Model is an interface.to transfer data from controller to jsp we use model
    */

    /*
    this block is using only model
    public String add( int num1, int num2, Model model){
        int result=num1+num2 +1;
        model.addAttribute("result", result);
        //return "result.jsp";
        return "result";
    }*/

    //the below block is using modelview
    public ModelAndView add( int num1, int num2, ModelAndView mv){
        int result=num1+num2 ;
        mv.addObject("result",result);
        mv.setViewName("result");
        //here we are passing data and view into a single advantage

        //return "result.jsp";
        //return "result";
        return mv;
        }

       /* @RequestMapping("addStudent")
      public ModelAndView addStudent(@RequestParam("sid") int sid,@RequestParam("sname") String sname,ModelAndView mv){
        Student student=new Student();

        student.setSid(sid);
        student.setSname(sname);

        mv.addObject("student",student);
        mv.setViewName("result");

        return mv;
    }*/

    //using ModelAttribute
    @RequestMapping("addStudent")
    //public String addStudent(@ModelAttribute("student1") Student student){
    public String addStudent(Student student){

        return "result";
    }


}
