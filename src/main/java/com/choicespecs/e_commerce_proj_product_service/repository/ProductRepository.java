/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.choicespecs.e_commerce_proj_product_service.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.choicespecs.e_commerce_proj_product_service.entity.ProductEntity;  

/**
 *
 * @author metal
 */
@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Long> {
    // Additional query methods can be defined here if needed
    List<ProductEntity> findAll();

    @Query("SELECT * FROM product WHERE name = :name")
    ProductEntity findByName(String name);
}
