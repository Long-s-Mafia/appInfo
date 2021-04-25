package com.lshsd.appinfo.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * (AppInfo)实体类
 *
 * @author mr.sun
 * @since 2021-04-25 15:09:59
 */
public class AppInfo implements Serializable {
    private static final long serialVersionUID = 634114828086302412L;

    private Integer id;
    /**
     * 名称(唯一)
     */
    private String appname;
    /**
     * 开发者id
     */
    private Integer devid;
    /**
     * 审核员id
     */
    private Integer auditorid;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 审核状态备注
     */
    private String rstatusnotes;
    /**
     * 当前软件的版本号id
     */
    private Integer versionid;
    /**
     * 一级分类
     */
    private Integer category1;
    /**
     * 二级分类
     */
    private Integer category2;
    /**
     * 三级分类
     */
    private Integer category3;
    /**
     * app简介
     */
    private String appintroduction;
    /**
     * 上架时间
     */
    private Date ondate;
    /**
     * 下架时间
     */
    private Date underdate;
    /**
     * apk大小
     */
    private String apksize;
    /**
     * apk路径
     */
    private String apkurl;
    /**
     * 下载次数
     */
    private Integer download;
    /**
     * 创建时间
     */
    private Date createdate;
    /**
     * 修改时间
     */
    private Date upddate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public Integer getDevid() {
        return devid;
    }

    public void setDevid(Integer devid) {
        this.devid = devid;
    }

    public Integer getAuditorid() {
        return auditorid;
    }

    public void setAuditorid(Integer auditorid) {
        this.auditorid = auditorid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRstatusnotes() {
        return rstatusnotes;
    }

    public void setRstatusnotes(String rstatusnotes) {
        this.rstatusnotes = rstatusnotes;
    }

    public Integer getVersionid() {
        return versionid;
    }

    public void setVersionid(Integer versionid) {
        this.versionid = versionid;
    }

    public Integer getCategory1() {
        return category1;
    }

    public void setCategory1(Integer category1) {
        this.category1 = category1;
    }

    public Integer getCategory2() {
        return category2;
    }

    public void setCategory2(Integer category2) {
        this.category2 = category2;
    }

    public Integer getCategory3() {
        return category3;
    }

    public void setCategory3(Integer category3) {
        this.category3 = category3;
    }

    public String getAppintroduction() {
        return appintroduction;
    }

    public void setAppintroduction(String appintroduction) {
        this.appintroduction = appintroduction;
    }

    public Date getOndate() {
        return ondate;
    }

    public void setOndate(Date ondate) {
        this.ondate = ondate;
    }

    public Date getUnderdate() {
        return underdate;
    }

    public void setUnderdate(Date underdate) {
        this.underdate = underdate;
    }

    public String getApksize() {
        return apksize;
    }

    public void setApksize(String apksize) {
        this.apksize = apksize;
    }

    public String getApkurl() {
        return apkurl;
    }

    public void setApkurl(String apkurl) {
        this.apkurl = apkurl;
    }

    public Integer getDownload() {
        return download;
    }

    public void setDownload(Integer download) {
        this.download = download;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpddate() {
        return upddate;
    }

    public void setUpddate(Date upddate) {
        this.upddate = upddate;
    }

    public AppInfo() {
    }

    public AppInfo(String appname, Integer devid, Integer auditorid, Integer status, String rstatusnotes, Integer versionid, Integer category1, Integer category2, Integer category3, String appintroduction, Date ondate, Date underdate, String apksize, String apkurl, Integer download, Date createdate, Date upddate) {
        this.appname = appname;
        this.devid = devid;
        this.auditorid = auditorid;
        this.status = status;
        this.rstatusnotes = rstatusnotes;
        this.versionid = versionid;
        this.category1 = category1;
        this.category2 = category2;
        this.category3 = category3;
        this.appintroduction = appintroduction;
        this.ondate = ondate;
        this.underdate = underdate;
        this.apksize = apksize;
        this.apkurl = apkurl;
        this.download = download;
        this.createdate = createdate;
        this.upddate = upddate;
    }

    public AppInfo(Integer id, String appname, Integer devid, Integer auditorid, Integer status, String rstatusnotes, Integer versionid, Integer category1, Integer category2, Integer category3, String appintroduction, Date ondate, Date underdate, String apksize, String apkurl, Integer download, Date createdate, Date upddate) {
        this.id = id;
        this.appname = appname;
        this.devid = devid;
        this.auditorid = auditorid;
        this.status = status;
        this.rstatusnotes = rstatusnotes;
        this.versionid = versionid;
        this.category1 = category1;
        this.category2 = category2;
        this.category3 = category3;
        this.appintroduction = appintroduction;
        this.ondate = ondate;
        this.underdate = underdate;
        this.apksize = apksize;
        this.apkurl = apkurl;
        this.download = download;
        this.createdate = createdate;
        this.upddate = upddate;
    }
}