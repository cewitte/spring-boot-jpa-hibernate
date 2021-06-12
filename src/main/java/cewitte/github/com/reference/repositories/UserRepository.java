package cewitte.github.com.reference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cewitte.github.com.reference.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
