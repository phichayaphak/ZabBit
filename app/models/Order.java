package models;

import play.db.ebean.Model;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 14/1/2562.
 */
public class Order extends Model {
    private String oid;
    private Date odate;
    private String by;
    private boolean status;

    public Finder<String, Order> finder= new Finder<String, Order>(String .class, Order.class);

    public Order() {
        setOid();
    }

    public Order(Date odate, boolean status) {
        setOid();
        this.odate = odate;
        this.status = status;
    }

    public String getOid() {
        return oid;
    }

    public void setOid() {
        int newid;
        Random rand = new Random();
        newid= rand.nextInt(10000)+1;
        this.oid = Integer.toString(newid);
    }

    public Date getOdate() {
        return odate;
    }

    public void setOdate(Date odate) {
        this.odate = odate;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Order> list() {
        return finder.all();
    }

}
