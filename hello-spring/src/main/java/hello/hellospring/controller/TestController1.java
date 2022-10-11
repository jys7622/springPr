package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TestController1 {
  @GetMapping("test1")
    public String test1(Model model){
      model.addAttribute("mytest", "hhhhhh");
        return "test1";
    }
  @GetMapping(value="test2-mvc")
    public String test2(@RequestParam("name") String name, Model model) {
      model.addAttribute("name",name);
      return "test2";
  }
  
  
}
