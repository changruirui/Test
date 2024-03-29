package com.yuanian.pojo;

public class User {

    private String userCode;
    private String userName;
    private String department;

    public User(String userCode, String userName, String department) {
        this.userCode = userCode;
        this.userName = userName;
        this.department = department;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
