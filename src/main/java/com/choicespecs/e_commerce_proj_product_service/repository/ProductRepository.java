/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.choicespecs.e_commerce_proj_product_service.repository;

import org.springframework.data.repository.CrudRepository;
  
import com.choicespecs.e_commerce_proj_product_service.entity.ProductEntity;  

/**
 *
 * @author metal
 */
public interface ProductRepository extends CrudRepository<ProductEntity, Long> {
    // Additional query methods can be defined here if needed

}
