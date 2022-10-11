package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "ddddddfffff");
        return "hello"; 
        //templates밑에 있는 hello.html로 가서 렌더링 하라
    }
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
      model.addAttribute("name", name);
      return "hello-template";
    }
    
    @GetMapping("hello-string")
    // ResponseBody : http통신 프로토콜 헤더, 바디중 바디에 직접 데이터를 넣어주겠다.
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
      return "hello" + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
      Hello hello = new Hello();
      hello.setName(name);
      return hello;
    }
    
    static class Hello {
      private String name;

      public String getName() {
        return this.name;
      }

      public void setName(String name) {
        this.name = name;
      };

     

    
      
    }
}