package com.ph.pojo;

import com.ph.pojo.Comment;
import com.ph.pojo.MxhttOrder;
import com.ph.pojo.Post;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-26T17:33:32")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SingularAttribute<User, String> address;
    public static volatile SingularAttribute<User, String> userlRol;
    public static volatile SetAttribute<User, Post> postSet;
    public static volatile SingularAttribute<User, String> firstName;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, Boolean> acive;
    public static volatile SetAttribute<User, Comment> commentSet;
    public static volatile SingularAttribute<User, String> phone;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SetAttribute<User, MxhttOrder> mxhttOrderSet;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;

}