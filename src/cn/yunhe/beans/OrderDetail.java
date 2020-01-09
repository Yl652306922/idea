package cn.yunhe.beans;

public class OrderDetail {
    private int detail_id;
    private String order_id;
    private String item_id;
    private Item item;
    public int getDetail_id() {
        return detail_id;
    }

    public void setDetail_id(int detail_id) {
        this.detail_id = detail_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "detail_id=" + detail_id +
                ", order_id='" + order_id + '\'' +
                ", item_id='" + item_id + '\'' +
                ", item=" + item +
                '}';
    }
}
