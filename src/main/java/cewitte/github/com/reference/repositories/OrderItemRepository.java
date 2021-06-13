package cewitte.github.com.reference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cewitte.github.com.reference.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
