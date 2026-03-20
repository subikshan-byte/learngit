package ecomerce.Newbuy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ecomerce.Newbuy.repository.ProductRepository;



@Controller
public class Shop {
    @Autowired
    private final ProductRepository productrepository;
    public Shop(ProductRepository productrepository) {
        this.productrepository = productrepository;
    }
    @GetMapping("shop")
    public String Shopmap() {
        productrepository.findAll();
        return "shop";
    }
    

}
