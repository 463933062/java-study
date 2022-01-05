package com.itheima.pojo;

public class User {
    private int p_id;
    private String name;
    private String user_ad;

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_ad() {
        return user_ad;
    }

    public void setUser_ad(String user_ad) {
        this.user_ad = user_ad;
    }

    @Override
    public String toString() {
        return "User{" +
                "p_id=" + p_id +
                ", name='" + name + '\'' +
                ", user_ad='" + user_ad + '\'' +
                '}';
    }
}
