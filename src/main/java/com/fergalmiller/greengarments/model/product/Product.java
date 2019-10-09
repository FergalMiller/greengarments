package com.fergalmiller.greengarments.model.product;

import com.fergalmiller.greengarments.model.outlet.Outlet;
import com.fergalmiller.greengarments.model.product.size.Size;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Size size;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "store_id", nullable = false)
    @NotNull
    private Outlet store;

    @Column(name = "in_transit", nullable = false)
    private boolean inTransit;

    public Product(Size size, @NotNull Outlet store, boolean inTransit) {
        this.size = size;
        this.store = store;
        this.inTransit = inTransit;
    }

    public Outlet getStore() {
        return store;
    }

    public void setStore(Outlet store) {
        this.store = store;
    }

    public boolean isInTransit() {
        return inTransit;
    }

    public void setInTransit(boolean inTransit) {
        this.inTransit = inTransit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
