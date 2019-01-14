package models;

import play.db.ebean.Model;

import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 14/1/2562.
 */
public class Category extends Model {
    private String cid;
    private String name;

    public Finder<String, Category> finder= new Finder<String, Category>(String .class, Category.class);

    public Category() {
        setCid();
    }


    public Category(String name) {
        setCid();
        this.name = name;
    }

    public Category(String cid, String name) {
        this.cid=cid;
        this.name = name;
    }

    public String getCid() {
        return cid;
    }

    public void setCid() {
        int newid;
        Random rand = new Random();
        newid= rand.nextInt(100)+1;
        this.cid = Integer.toString(newid);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public List<Category> list() {
        return finder.all();
    }

}
