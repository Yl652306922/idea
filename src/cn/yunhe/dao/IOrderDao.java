package cn.yunhe.dao;

import cn.yunhe.beans.Item;
import cn.yunhe.beans.Order2;
import cn.yunhe.beans.OrderDetail;

import java.util.List;

public interface IOrderDao {
    /**
     * 查询所有订单
     * @return
     */
    List<Order2> queryOrderList();
    Order2 queryOrderById(String orderId);
    List<OrderDetail>queryDetail(Item item);
}
