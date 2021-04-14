package com.itheima._04Map集合存储自定义类型;

import java.util.Objects;

public class Orange {
    private String type;
    private String price;
    private String weight;

    public Orange(String type, String price, String weight) {
        this.type = type;
        this.price = price;
        this.weight = weight;
    }

    public Orange() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orange orange = (Orange) o;
        return Objects.equals(type, orange.type) && Objects.equals(price, orange.price) && Objects.equals(weight, orange.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price, weight);
    }
}
