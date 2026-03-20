package ecomerce.Newbuy.service;
import ecomerce.Newbuy.model.Product;
import ecomerce.Newbuy.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProductService {
    @Autowired
    private final ProductRepository productrepository;
    public ProductService(ProductRepository productrepository) {
        this.productrepository = productrepository;
    }
    public List<Product> getAllProducts() {
        return productrepository.findAll();
    }
    public Product getProductById(Long id) {
        return productrepository.findById(id).orElse(null);
    }
    public Product saveProduct(Product product) {
        return productrepository.save(product);}
    public void deleteProduct(Long id) {
        productrepository.deleteById(id);}
    public Product updateProduct(Long id, Product updatedProduct) {
        return productrepository.findById(id).map(product -> {
                product.setName(updatedProduct.getName());
                product.setDescription(updatedProduct.getDescription());
                product.setPrice(updatedProduct.getPrice());
                product.setCategory(updatedProduct.getCategory());
                return productrepository.save(product);
            }).orElse(null);
        }
}
