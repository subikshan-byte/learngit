package ecomerce.Newbuy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class home {
    @GetMapping("/")
    public String homeString() {
        return "home";
    }
    

}
