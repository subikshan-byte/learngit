package ecomerce.Newbuy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productId;
    private int quantity;
    public Long getId() {
        return id;}
    public void setId(Long id) {
        this.id = id;}
    public User getUserId() {
        return userId;}
    public void setUserId(User userId) {
        this.userId = userId;}  
    public Product getProductId() {
        return productId;}
    public void setProductId(Product productId) {
        this.productId = productId;}
    public int getQuantity() {
        return quantity;}
    public void setQuantity(int quantity) {
        this.quantity = quantity;}


}
