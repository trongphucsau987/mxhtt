package com.ph.pojo;

import com.ph.pojo.MxhttOrder;
import com.ph.pojo.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-26T17:33:32")
@StaticMetamodel(OrderDetail.class)
public class OrderDetail_ { 

    public static volatile SingularAttribute<OrderDetail, Long> unitPrice;
    public static volatile SingularAttribute<OrderDetail, Product> productId;
    public static volatile SingularAttribute<OrderDetail, MxhttOrder> orderId;
    public static volatile SingularAttribute<OrderDetail, String> num;
    public static volatile SingularAttribute<OrderDetail, Integer> id;

}