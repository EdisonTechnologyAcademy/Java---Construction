package com.edison.Prac02lLess24.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edison.Prac02lLess24.Model.Product;




public interface ProductRepository extends JpaRepository<Product,Integer> {
	 Product findByName(String name);
}
