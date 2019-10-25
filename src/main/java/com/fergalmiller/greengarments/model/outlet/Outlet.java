package com.fergalmiller.greengarments.model.outlet;

import java.util.Map;

import javax.persistence.*;

import org.jetbrains.annotations.Contract;

@Entity
public class Outlet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ElementCollection
    @MapKeyColumn(name = "product_serial_number")
    @Column(name = "quantity")
    @CollectionTable(
                        name = "inventory",
                        joinColumns = @JoinColumn(name = "outlet_id", referencedColumnName = "id"))
    private Map<Long, Integer> inventory;

    @Column(nullable = false)
    private String location;

    @Contract(pure = true)
    public Outlet(){}

    @Contract(pure = true)
    public Outlet(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
