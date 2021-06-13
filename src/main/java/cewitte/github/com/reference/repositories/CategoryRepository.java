package cewitte.github.com.reference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cewitte.github.com.reference.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
