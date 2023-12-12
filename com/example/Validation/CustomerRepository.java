package com.example.Validation;
 
import java.util.Optional;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface CustomerRepository extends JpaRepository<Customer,Long> {
 
	Optional<Customer> findById(long id);
 
	boolean existsById(Long id);
 
	void deleteById(Long id);

}