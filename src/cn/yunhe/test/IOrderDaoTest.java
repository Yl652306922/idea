package cn.yunhe.test;
import cn.yunhe.beans.Item;
import cn.yunhe.beans.Order2;
import cn.yunhe.beans.OrderDetail;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class IOrderDaoTest {
        @Test
    public void  queryOrderList() throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session= factory.openSession();
        List<Order2> order2List=session.selectList("queryOrderList");
        System.out.println(order2List);
        session.close();
        inputStream.close();
    }
    @Test
    public void queryOrderById() throws IOException {
            InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session=factory.openSession();
            List<Order2>order2List=session.selectList("queryOrderById","132456");
        System.out.println(order2List);
        session.close();
        inputStream.close();
    }
    @Test
    public void OrderDetail() throws IOException {
         InputStream inputStream=Resources.getResourceAsStream("SqlMapConfig.xml");
         SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(inputStream);
         SqlSession session=factory.openSession();
         Item item = new Item();
         item.setItem_name("苹");
         item.setItem_type("服装");

         List<OrderDetail> orderList=session.selectList("OrderDetail",item);
        System.out.println(orderList);
        session.close();
        inputStream.close();

    }
}
