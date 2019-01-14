package models;

import play.db.ebean.Model;

import java.util.List;

/**
 * Created by Administrator on 14/1/2562.
 */
public class Menu extends Model {
    private String mid;
    private String name;
    private double price;
    private String desc;
    private String picture;
    private Category category;

    public Finder<String, Menu> finder= new Finder<String, Menu>(String .class, Menu.class);
    public Menu() {
    }

    public Menu(String mid, String name, double price, String desc, String picture, Category category) {
        this.mid = mid;
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.picture = picture;
        this.category = category;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Menu> list() {
        return finder.all();
    }

}
