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

    public ProductEntity() {}

    public ProductEntity(Long id, String name, String price, String UPC, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.UPC = UPC;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getUPC() {
        return UPC;
    }
    public void setUPC(String UPC) {
        this.UPC = UPC;
    }
    public Instant getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
    public Instant getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
    @Override
    public String toString() {
        return "ProductEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", UPC='" + UPC + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductEntity)) return false;
        ProductEntity that = (ProductEntity) o;
        return id.equals(that.id) &&
                name.equals(that.name) &&
                price.equals(that.price) &&
                UPC.equals(that.UPC) &&
                createdAt.equals(that.createdAt) &&
                updatedAt.equals(that.updatedAt);
    }
    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + price.hashCode();
        result = 31 * result + UPC.hashCode();
        result = 31 * result + createdAt.hashCode();
        result = 31 * result + updatedAt.hashCode();
        return result;
    }
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final ProductEntity product = new ProductEntity();

        public Builder id(Long id) {
            product.setId(id);
            return this;
        }

        public Builder name(String name) {
            product.setName(name);
            return this;
        }

        public Builder price(String price) {
            product.setPrice(price);
            return this;
        }

        public Builder UPC(String UPC) {
            product.setUPC(UPC);
            return this;
        }

        public Builder createdAt(Instant createdAt) {
            product.setCreatedAt(createdAt);
            return this;
        }

        public Builder updatedAt(Instant updatedAt) {
            product.setUpdatedAt(updatedAt);
            return this;
        }

        public ProductEntity build() {
            return product;
        }
    }

}
