package com.fergalmiller.greengarments.model.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.jetbrains.annotations.Contract;

import com.fergalmiller.greengarments.model.product.category.Category;
import com.fergalmiller.greengarments.model.product.size.Size;

@Entity
public class Product {

    @Id
    private long serialNo;

    private String brand;

    @Column(name = "product_name")
    private String productName;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Size size;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String subcategory;

    @Contract(pure = true)
    public Product(){}

    @Contract(pure = true)
    public Product(long serialNo, String brand, String productName, Size size, Category category, String subcategory)
    {
        this.serialNo = serialNo;
        this.brand = brand;
        this.productName = productName;
        this.size = size;
        this.category = category;
        this.subcategory = subcategory;
    }

    public long getSerialNo()
    {
        return serialNo;
    }

    public void setSerialNo(long serialNo)
    {
        this.serialNo = serialNo;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public Category getCategory()
    {
        return category;
    }

    public void setCategory(Category category)
    {
        this.category = category;
    }

    public String getSubcategory()
    {
        return subcategory;
    }

    public void setSubcategory(String subcategory)
    {
        this.subcategory = subcategory;
    }
}
