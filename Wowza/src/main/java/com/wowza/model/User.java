package com.wowza.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long userId;
    @Column(unique = true, nullable = true)
    private String username;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = true)
    private String password;
    @Column(nullable = false, name = "full_name")
    private String fullName;
    @Column(unique = true, nullable = true, name = "device_access_token")
    private String deviceAccessToken;
    @Column(unique = true, nullable = true, name = "mobile_no")
    private String mobileNo;
    @Column(unique = true, nullable = false, name = "uid")
    private String uid;
    @Column(nullable = false, name = "streaming")
    private String streaming;


    public User() {

    }

    public void setStreaming(String streaming) {
        this.streaming = streaming;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDeviceAccessToken() {
        return deviceAccessToken;
    }

    public void setDeviceAccessToken(String deviceAccessToken) {
        this.deviceAccessToken = deviceAccessToken;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getStreaming() {
        return streaming;
    }
}
