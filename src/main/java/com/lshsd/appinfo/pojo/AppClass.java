package com.lshsd.appinfo.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * (AppClass)实体类
 *
 * @author mr.sun
 * @since 2021-04-25 15:09:51
 */
public class AppClass implements Serializable {
    private static final long serialVersionUID = 992992563422064619L;
    /**
     * 分类id
     */
    private Integer id;
    /**
     * 分类名称
     */
    private String classname;
    /**
     * 父级id
     */
    private Integer parent;
    /**
     * 创建者id
     */
    private Integer createid;
    /**
     * 创建时间
     */
    private Date createdate;
    /**
     * 修改者id
     */
    private Integer modifyid;
    /**
     * 修改时间
     */
    private Date modifydate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getCreateid() {
        return createid;
    }

    public void setCreateid(Integer createid) {
        this.createid = createid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getModifyid() {
        return modifyid;
    }

    public void setModifyid(Integer modifyid) {
        this.modifyid = modifyid;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public AppClass() {
    }

    public AppClass(String classname, Integer parent, Integer createid, Date createdate, Integer modifyid, Date modifydate) {
        this.classname = classname;
        this.parent = parent;
        this.createid = createid;
        this.createdate = createdate;
        this.modifyid = modifyid;
        this.modifydate = modifydate;
    }

    public AppClass(Integer id, String classname, Integer parent, Integer createid, Date createdate, Integer modifyid, Date modifydate) {
        this.id = id;
        this.classname = classname;
        this.parent = parent;
        this.createid = createid;
        this.createdate = createdate;
        this.modifyid = modifyid;
        this.modifydate = modifydate;
    }

    @Override
    public String toString() {
        return "AppClass{" +
                "id=" + id +
                ", classname='" + classname + '\'' +
                ", parent=" + parent +
                ", createid=" + createid +
                ", createdate=" + createdate +
                ", modifyid=" + modifyid +
                ", modifydate=" + modifydate +
                '}';
    }
}