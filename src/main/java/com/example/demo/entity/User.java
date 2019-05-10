package com.example.demo.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String order_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
}