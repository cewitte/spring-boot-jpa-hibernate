package cewitte.github.com.reference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cewitte.github.com.reference.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
