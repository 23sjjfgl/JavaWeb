package com.lanqiao.pojo;


// 用户实体类
public class User {

    private Integer id;
    private String  userName;
    private String  userPassword;
    private String  userRealname;


    public User() {
    }

    public User(Integer id, String userName, String userPassword, String userRealname) {
        this.id = id;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRealname = userRealname;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置
     * @param userPassword
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取
     * @return userRealname
     */
    public String getUserRealname() {
        return userRealname;
    }

    /**
     * 设置
     * @param userRealname
     */
    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    public String toString() {
        return "User{id = " + id + ", userName = " + userName + ", userPassword = " + userPassword + ", userRealname = " + userRealname + "}";
    }
}
