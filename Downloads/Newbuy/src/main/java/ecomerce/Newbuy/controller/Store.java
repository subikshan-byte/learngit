package ecomerce.Newbuy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Store {
    @GetMapping("store")
    public String getMethodName() {
        return "store";
    }
    

}
