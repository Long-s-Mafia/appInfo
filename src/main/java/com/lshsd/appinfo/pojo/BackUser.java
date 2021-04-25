package com.lshsd.appinfo.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * (BackUser)实体类
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:13
 */
public class BackUser implements Serializable {
    private static final long serialVersionUID = 948464105995724449L;

    private Integer id;

    private String usercode;

    private String usesrpwd;

    private String username;

    private Integer createby;

    private Date createdate;

    private String modifyby;

    private Date modifydate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUsesrpwd() {
        return usesrpwd;
    }

    public void setUsesrpwd(String usesrpwd) {
        this.usesrpwd = usesrpwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getCreateby() {
        return createby;
    }

    public void setCreateby(Integer createby) {
        this.createby = createby;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getModifyby() {
        return modifyby;
    }

    public void setModifyby(String modifyby) {
        this.modifyby = modifyby;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public BackUser() {
    }

    public BackUser(String usercode, String usesrpwd, String username, Integer createby, Date createdate, String modifyby, Date modifydate) {
        this.usercode = usercode;
        this.usesrpwd = usesrpwd;
        this.username = username;
        this.createby = createby;
        this.createdate = createdate;
        this.modifyby = modifyby;
        this.modifydate = modifydate;
    }

    public BackUser(Integer id, String usercode, String usesrpwd, String username, Integer createby, Date createdate, String modifyby, Date modifydate) {
        this.id = id;
        this.usercode = usercode;
        this.usesrpwd = usesrpwd;
        this.username = username;
        this.createby = createby;
        this.createdate = createdate;
        this.modifyby = modifyby;
        this.modifydate = modifydate;
    }
}