package com.ph.pojo;

import com.ph.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-26T17:33:32")
@StaticMetamodel(Post.class)
public class Post_ { 

    public static volatile SingularAttribute<Post, String> postImage;
    public static volatile SingularAttribute<Post, Date> postTime;
    public static volatile SingularAttribute<Post, String> postContent;
    public static volatile SingularAttribute<Post, Integer> id;
    public static volatile SingularAttribute<Post, User> userId;

}