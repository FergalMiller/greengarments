package com.fergalmiller.greengarments.model.product.size;

public enum Size {
    XS("Extra small"), S("Small"), M("Medium"), L("Large"), XL("Extra large");

    private String formattedName;

    Size(final String formattedName) {
        this.formattedName = formattedName;
    }

    public String getFormattedName() {
        return formattedName;
    }
}
