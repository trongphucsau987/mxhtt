package com.ph.pojo;

import com.ph.pojo.OrderDetail;
import com.ph.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-26T17:33:32")
@StaticMetamodel(MxhttOrder.class)
public class MxhttOrder_ { 

    public static volatile SingularAttribute<MxhttOrder, Long> amount;
    public static volatile SingularAttribute<MxhttOrder, Date> createdDate;
    public static volatile SingularAttribute<MxhttOrder, Integer> id;
    public static volatile SingularAttribute<MxhttOrder, User> userId;
    public static volatile SetAttribute<MxhttOrder, OrderDetail> orderDetailSet;

}