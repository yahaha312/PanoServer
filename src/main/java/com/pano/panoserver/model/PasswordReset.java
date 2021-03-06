package com.pano.panoserver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by wangboquan on 17/2/22.
 */
@Entity
public class PasswordReset {
    @Id
    @NotNull
    @GeneratedValue
    private int id;

    @NotNull
    private String email;

    @NotNull
    private String keyword;

//    private long outDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKey() {
        return keyword;
    }

    public void setKey(String keyword) {
        this.keyword = keyword;
    }

//    public long getOutDate() {
//        return outDate;
//    }
//
//    public void setOutDate(long outDate) {
//        this.outDate = outDate;
//    }
}
