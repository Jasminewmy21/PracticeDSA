package com.itheima._05Collections工具类;

/**
 * CollectionsDemo02中用到
 */
public class Orange implements Comparable{
    private String type;
    private String price;
    private double weight;

    public Orange() {
    }

    public Orange(String type, String price, double weight) {
        this.type = type;
        this.price = price;
        this.weight = weight;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", weight=" + weight +
                '}' + "\n";
    }

    @Override
    public int compareTo(Object o) {
        Orange o2 = (Orange) o;
        //集合会自动送入两个橘子对象来比较
        if(this.weight > o2.weight) return 1;
        if(this.weight < o2.weight) return -1;
        return 0;
    }
}
