package cewitte.github.com.reference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cewitte.github.com.reference.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
