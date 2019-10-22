package com.fergalmiller.greengarments.controller.product.command;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jetbrains.annotations.Contract;

public class ProductCommand
{
    @NotNull
    private long serialNo;

    @NotNull
    @Size(min = 1, max = 32)
    private String brand;

    @NotNull
    @Size(min = 1, max = 64)
    private String productName;

    private String category;

    private String subcategory;

    @NotNull
    @Size(min = 1, max = 2)
    private String size;

    @Contract(pure = true)
    public ProductCommand(@NotNull long serialNo, @NotNull @Size(min = 1, max = 32) String brand, @NotNull @Size(min = 1, max = 64) String productName, String category, String subcategory, @NotNull @Size(min = 1, max = 2) String size)
    {
        this.serialNo = serialNo;
        this.brand = brand;
        this.productName = productName;
        this.category = category;
        this.subcategory = subcategory;
        this.size = size;
    }

    public long getSerialNo()
    {
        return serialNo;
    }

    public void setSerialNo(long serialNo)
    {
        this.serialNo = serialNo;
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

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
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

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }
}
