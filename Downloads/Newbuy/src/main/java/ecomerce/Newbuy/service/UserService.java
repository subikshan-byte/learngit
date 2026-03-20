package ecomerce.Newbuy.service;
import ecomerce.Newbuy.repository.UserRepository;
import ecomerce.Newbuy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserService {
    @Autowired
    private final UserRepository userrepository;
    public UserService(UserRepository userrepository) {
        this.userrepository = userrepository;}
    public User getUserById(Long id) {
        return userrepository.findById(id).orElse(null);}
    public User saveUser(User user) {
        return userrepository.save(user);}
        public List<User> getAllUsers() {
            return userrepository.findAll();
        }
    public User findUserByUsername(String username) {
        userrepository.findAll();
        for (User user : userrepository.findAll()) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
