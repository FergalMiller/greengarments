package com.fergalmiller.greengarments.model.product.size;

public enum Size {
    XS("Extra small"), S("Small"), M("Medium"), L("Large"), XL("Extra large");

    private String value;

    Size(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
