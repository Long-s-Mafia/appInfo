package com.lshsd.appinfo.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * (DevUser)实体类
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:17
 */
public class DevUser implements Serializable {
    private static final long serialVersionUID = 870056493370888352L;

    private Integer id;

    private String devcode;

    private String devpwd;

    private String devname;

    private String devemail;

    private String devphone;

    private Date createdate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDevcode() {
        return devcode;
    }

    public void setDevcode(String devcode) {
        this.devcode = devcode;
    }

    public String getDevpwd() {
        return devpwd;
    }

    public void setDevpwd(String devpwd) {
        this.devpwd = devpwd;
    }

    public String getDevname() {
        return devname;
    }

    public void setDevname(String devname) {
        this.devname = devname;
    }

    public String getDevemail() {
        return devemail;
    }

    public void setDevemail(String devemail) {
        this.devemail = devemail;
    }

    public String getDevphone() {
        return devphone;
    }

    public void setDevphone(String devphone) {
        this.devphone = devphone;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public DevUser() {
    }

    public DevUser(String devcode, String devpwd, String devname, String devemail, String devphone, Date createdate) {
        this.devcode = devcode;
        this.devpwd = devpwd;
        this.devname = devname;
        this.devemail = devemail;
        this.devphone = devphone;
        this.createdate = createdate;
    }

    public DevUser(Integer id, String devcode, String devpwd, String devname, String devemail, String devphone, Date createdate) {
        this.id = id;
        this.devcode = devcode;
        this.devpwd = devpwd;
        this.devname = devname;
        this.devemail = devemail;
        this.devphone = devphone;
        this.createdate = createdate;
    }
}