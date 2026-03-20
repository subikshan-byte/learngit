package ecomerce.Newbuy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ImageDisplay {
    @GetMapping("image")
    public String getMethodName() {
        return "image";
    }
    

}
