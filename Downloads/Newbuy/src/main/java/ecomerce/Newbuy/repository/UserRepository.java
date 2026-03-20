package ecomerce.Newbuy.repository;
import ecomerce.Newbuy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {

}
