/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.choicespecs.e_commerce_proj_product_service.entity;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author metal
 */
@Table(name="products")
public class ProductEntity {
    @Id
    private Long id;
    private String name;
    private String price;
    private String UPC;

    private Instant createdAt;
    private Instant updatedAt;
}
