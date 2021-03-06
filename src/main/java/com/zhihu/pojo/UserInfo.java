package com.zhihu.pojo;

import javax.persistence.*;

/**
 * @author tzz
 * @Package com.zhihu.book.pojo
 * @Name UserInfo
 */
@Entity
@Table(name = "userInfo", uniqueConstraints = {@UniqueConstraint(columnNames = {"userName"})})
public class UserInfo {

    @Id
    private String id;

    private String userName;

    private String userPassword;

    private String userSex;

    private String userIcon;

    private String userEmail;

    private String userPhone;

    @Column(length = 500)
    private String userIntro;

    //, fetch = FetchType.LAZY
    @ManyToOne(cascade = CascadeType.PERSIST, optional = false)
    private Role userRole;

    public String getUserIntro() {
        return userIntro;
    }

    public void setUserIntro(String userIntro) {
        this.userIntro = userIntro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userIcon='" + userIcon + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userIntro='" + userIntro + '\'' +
                '}';
    }
}
