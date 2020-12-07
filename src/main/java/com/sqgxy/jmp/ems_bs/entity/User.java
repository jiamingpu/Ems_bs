package com.sqgxy.jmp.ems_bs.entity;

public class User {
    /**
     *用户 id
     */
     private int id;
     /**
      *用户名
      */
      private String UserName;
      /**
       *用户密码
       */
       private String UserPassword;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }
}
