package cn.yunhe.test;

import cn.yunhe.beans.Order;
import cn.yunhe.beans.User;
import cn.yunhe.beans.UserCustom;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class IUserDaoTest {
 /*
     * key:{key1:value,key2:valvue}
     *
     * 前台传递的数据格式
     * {
     *     "user":{
     *         "uid":1,
     *         "uname":"小张"
     *     },
     *     "orderList":[
     *          {
     *              "order_id":"132456",
     *              "order_create_date":"2020-01-02 12:12:12",
     *              "order_enddate":"2020-01-02 12:14:10",
     *              "order_price":2000.00,
     *              "order_status":3,
     *              "uid":1
     *          },
     *          {
     *              "order_id":"122456",
     *              "order_create_date":"2020-01-02 12:12:12",
     *              "order_enddate":"2020-01-02 12:14:10",
     *              "order_price":2000.00,
     *              "order_status":3,
     *              "uid":1
     *          }
     *     ]
     * }

  */

    @Test
    public void addOrder() throws IOException {
        String json = "{\n" +
                "          \"user\":{\n" +
                "              \"uid\":1,\n" +
                "              \"uname\":\"小罗\"\n" +
                "                         },\n" +
                "          \"orderList\":[\n" +
                "               {\n" +
                "                   \"order_id\":\"132456\",\n" +
                "                   \"order_create_date\":\"2020-01-02 12:12:12\",\n" +
                "                   \"order_enddate\":\"2020-01-02 12:14:10\",\n" +
                "                   \"order_price\":2000.00,\n" +
                "                   \"order_status\":3\n" +
                "                              },\n" +
                "               {\n" +
                "                   \"order_id\":\"122456\",\n" +
                "                   \"order_create_date\":\"2020-01-02 12:42:12\",\n" +
                "                   \"order_enddate\":\"2020-01-02 12:52:10\",\n" +
                "                   \"order_price\":2000.00,\n" +
                "                   \"order_status\":3\n" +
                "                              }\n" +
                "          ]\n" +
                "      }";
        JSONObject object= JSONObject.parseObject(json);
        UserCustom userCustom= JSON.toJavaObject(object, UserCustom.class);
       InputStream inputStream=Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=factory.openSession();
        for (Order order:userCustom.getOrderList()) {
            session.insert("addOrder",order);
        }
        session.commit();
        session.close();
        inputStream.close();
    }
    @Test
    public void addUser() throws IOException {
        InputStream inputStream=Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=factory.openSession();
        UserCustom userCustom=new UserCustom();
        User user=new User();
        user.setUname("刘跃雄");
        user.setUphone("159357");
        user.setUpwd("123");
        user.setSex("男");
        userCustom.setUser(user);
        session.insert("addUser",userCustom);
        session.commit();
        session.close();
        inputStream.close();


    }
}