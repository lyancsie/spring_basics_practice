package thymeleaf.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/main")
public class Controller {
  
  @GetMapping("/form")
  public String getInfo() {
    
    return "form";
  }
  
  @PostMapping("/form")
  public String postInfo(@ModelAttribute("postdata") String receivedData) {
    System.out.println(receivedData);  //ModelAttribute: what you get from the HTML.
    return "form";
  }
}