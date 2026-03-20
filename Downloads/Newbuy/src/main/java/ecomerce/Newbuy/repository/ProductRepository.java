package ecomerce.Newbuy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ecomerce.Newbuy.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
