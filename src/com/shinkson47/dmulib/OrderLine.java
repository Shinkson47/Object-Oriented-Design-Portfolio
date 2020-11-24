package com.shinkson47.dmulib;

/**
 * <h1>Representation of a collection of a one priceable item.</h1>
 * <p>
 * Such that all items in this line are the same, and the total cost is equal
 * to <b>price * quantity.</b>
 * </p>
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 27/10/2020</a>
 */
public class OrderLine {

    //#region fields
    private String id;
    private int unitPrice;
    private int quantity;
    //#endregion

    //#region constructor


    public OrderLine() {
        this("",0,0);
    }

    /**
     * Creates a new order line.
     * @param id
     * @param unitPrice
     * @param quantity
     */
    public OrderLine(String id, int unitPrice, int quantity) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    //#endregion

    //#region get/set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //#endregion get/set

    //#region methods

    /**
     * Calculates the total cost of all items in this line.
     * @return <b>price * quantity</b>
     */
    public int getCost() {
        return getUnitPrice() * getQuantity();
    }
    //#endregion

    //#region Object Super
    @Override
    protected Object clone() {
        return new OrderLine(id, unitPrice, quantity);
    }

    @Override
    public String toString() {
        return  "OrderLine:[" +
                "ID =" + getId() +
                ", Price =" + getUnitPrice() +
                ", Quantity =" + getQuantity() +
                "]";

    }



    @Override
    public boolean equals(Object obj) {
        return  (obj != null && obj.getClass().getTypeName().equals(getClass().getTypeName()))
                && (super.equals(obj) ||
                        (((OrderLine) obj).getId().equals(getId())
                        && ((OrderLine) obj).getQuantity() == getQuantity()
                        && ((OrderLine) obj).getUnitPrice() == getUnitPrice()));
    }
    //#endregion
}
