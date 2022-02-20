package com.sheryians.major.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sheryians.major.model.Product;


public interface ProductRepository extends JpaRepository<Product,Long> {
	List<Product> findAllByCategory_Id(int id);
	
	@Query(value = "select * from Product p where p.image_name like %:keyword% ", nativeQuery = true)
	 List<Product > findByKeyword(@Param("keyword") String keyword);

}
