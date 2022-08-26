package com.ph.pojo;

import com.ph.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-26T17:33:32")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, Integer> id;
    public static volatile SingularAttribute<Comment, String> commentContent;
    public static volatile SingularAttribute<Comment, Date> commentTime;
    public static volatile SingularAttribute<Comment, User> userId;

}