package com.sathya.mvc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathya.mvc.entities.ProductEntity;

@Repository
public   interface ProductRepository extends JpaRepository<ProductEntity, Long>{


	}
