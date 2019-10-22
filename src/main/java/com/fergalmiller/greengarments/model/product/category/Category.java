package com.fergalmiller.greengarments.model.product.category;

import java.util.List;

import com.google.common.collect.ImmutableList;

public enum Category {
    TOP("Top",
            ImmutableList.of("Shirt", "Jumper", "Button-up", "Hoodie", "Shell", "Outerwear", "Other")),
    BOTTOM("Bottom",
            ImmutableList.of("Trousers", "Shorts", "Skirt", "Other")),
    ACCESSORIES("Accessories",
            ImmutableList.of("Jewelry", "Hat", "Gloves", "Belt", "Other")),
    SHOES("Shoes",
            ImmutableList.of("Casual", "Formal", "Outdoor activity"));

    private String formattedName;

    private List<String> subcategories;

    Category(final String formattedName, final List<String> subcategories)
    {
        this.formattedName = formattedName;
        this.subcategories = subcategories;
    }

    public String getFormattedName()
    {
        return formattedName;
    }

    public void setFormattedName(String formattedName)
    {
        this.formattedName = formattedName;
    }

    public List<String> getSubcategories()
    {
        return subcategories;
    }

    public void setSubcategories(List<String> subcategories)
    {
        this.subcategories = subcategories;
    }
}
