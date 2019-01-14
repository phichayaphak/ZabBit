package models;

import play.db.ebean.Model;

import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 14/1/2562.
 */
public class OrdersDetail extends Model{
    private String did;
    private int amount;
    private Order order;
    private Menu menu;

    public Finder<String, OrdersDetail> finder= new Finder<String, OrdersDetail>(String .class, OrdersDetail.class);

    public OrdersDetail() {
        setDid();
    }

    public OrdersDetail(String did, int amount, Order order, Menu menu) {
        setDid();
        this.amount = amount;
        this.order = order;
        this.menu = menu;
    }

    public String getDid() {
        return did;
    }

    public void setDid() {
        int newid;
        Random rand = new Random();
        newid= rand.nextInt(100000)+1;
        this.did = Integer.toString(newid);
    }

    public void setDid(String did) {
        this.did = did;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<OrdersDetail> list() {
        return finder.all();
    }

}
