package com.lshsd.appinfo.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * (AppState)实体类
 *
 * @author mr.sun
 * @since 2021-04-26 08:44:34
 */
public class AppState implements Serializable {
    private static final long serialVersionUID = 408965929874049272L;
    /**
     * 编号
     */
    private Integer id;
    /**
     * 状态名称（aap:1,版本:2,用户:3）
     */
    private Integer tableId;
    /**
     * 类型名称
     */
    private String statename;
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

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
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

    public AppState() {
    }

    public AppState(Integer tableId, String statename, Integer createid, Date createdate, Integer modifyid, Date modifydate) {
        this.tableId = tableId;
        this.statename = statename;
        this.createid = createid;
        this.createdate = createdate;
        this.modifyid = modifyid;
        this.modifydate = modifydate;
    }

    public AppState(Integer id, Integer tableId, String statename, Integer createid, Date createdate, Integer modifyid, Date modifydate) {
        this.id = id;
        this.tableId = tableId;
        this.statename = statename;
        this.createid = createid;
        this.createdate = createdate;
        this.modifyid = modifyid;
        this.modifydate = modifydate;
    }
}