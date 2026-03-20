package ecomerce.Newbuy.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ecomerce.Newbuy.Data_transfer_layer.UserDTO;
import ecomerce.Newbuy.model.User;
import ecomerce.Newbuy.service.UserService;
import ecomerce.Newbuy.utility.DjangoPasswordCheck;

@Controller
public class Login {
    @Autowired
    private final UserService userService;
    public Login(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/login")
    public String getMethodName() {
        return "login";
    }
    @PostMapping("/success")
    public String postMethodName(@ModelAttribute UserDTO userDTO) {
        User user = userService.findUserByUsername(userDTO.getUsername());
        if(user == null) {
            return "User not found";
        }
          boolean valid = DjangoPasswordCheck.checkPassword(
            userDTO.getPassword(),
            user.getPassword()
    );

    if (valid) {
        return "redirect:/";
    } else {
        return "Invalid password";
    }
    }
    
    

}
