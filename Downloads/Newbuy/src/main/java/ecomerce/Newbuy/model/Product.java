package ecomerce.Newbuy.model;
import jakarta.persistence.*;


@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
    private String imageUrl;
    public enum New{
        YES, NO
    }
    @Enumerated(EnumType.STRING)
    private New isNew=New.YES;
    public enum Home{
        YES, NO
    }
    @Enumerated(EnumType.STRING)
    private Home isHome=Home.NO;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public String getImageUrl() {
        return imageUrl;
    }   
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public New getIsNew() {
        return isNew;
    }   
    public void setIsNew(New isNew) {
        this.isNew = isNew;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public Home getIsHome() {
        return isHome;
    }
    public void setIsHome(Home isHome) {
        this.isHome = isHome;}
}
