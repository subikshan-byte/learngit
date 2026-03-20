package ecomerce.Newbuy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class category {
    @GetMapping("category")
    public String categorypath() {
        return "category";
    }
    
}
