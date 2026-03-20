package ecomerce.Newbuy.service;
import java.util.List;
import ecomerce.Newbuy.model.Category;
import ecomerce.Newbuy.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatgoryService {
    @Autowired
    private final CategoryRepository categoryrepository;
    public CatgoryService(CategoryRepository categoryrepository) {
        this.categoryrepository = categoryrepository;}
    public List<Category> getAllCategories() {
        return categoryrepository.findAll();
    }
    public Category getCategoryById(Long id) {
        return categoryrepository.findById(id).orElse(null);
    }

}
