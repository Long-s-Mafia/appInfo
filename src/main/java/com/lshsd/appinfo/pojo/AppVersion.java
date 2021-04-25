package com.lshsd.appinfo.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * (AppVersion)实体类
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:09
 */
public class AppVersion implements Serializable {
    private static final long serialVersionUID = 142384825318297513L;
    /**
     * 版本号id
     */
    private Integer id;
    /**
     * 版本号
     */
    private String versioncode;
    /**
     * appId
     */
    private Integer infoid;
    /**
     * 当前版本大小
     */
    private String versionapksize;
    /**
     * 当前版本路径
     */
    private String versionapkurl;
    /**
     * 创建时间
     */
    private Date createdate;
    /**
     * 修改时间
     */
    private Date modifydate;
    /**
     * 版本状态
     */
    private Integer versionstatus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVersioncode() {
        return versioncode;
    }

    public void setVersioncode(String versioncode) {
        this.versioncode = versioncode;
    }

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    public String getVersionapksize() {
        return versionapksize;
    }

    public void setVersionapksize(String versionapksize) {
        this.versionapksize = versionapksize;
    }

    public String getVersionapkurl() {
        return versionapkurl;
    }

    public void setVersionapkurl(String versionapkurl) {
        this.versionapkurl = versionapkurl;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Integer getVersionstatus() {
        return versionstatus;
    }

    public void setVersionstatus(Integer versionstatus) {
        this.versionstatus = versionstatus;
    }

    public AppVersion() {
    }

    public AppVersion(String versioncode, Integer infoid, String versionapksize, String versionapkurl, Date createdate, Date modifydate, Integer versionstatus) {
        this.versioncode = versioncode;
        this.infoid = infoid;
        this.versionapksize = versionapksize;
        this.versionapkurl = versionapkurl;
        this.createdate = createdate;
        this.modifydate = modifydate;
        this.versionstatus = versionstatus;
    }

    public AppVersion(Integer id, String versioncode, Integer infoid, String versionapksize, String versionapkurl, Date createdate, Date modifydate, Integer versionstatus) {
        this.id = id;
        this.versioncode = versioncode;
        this.infoid = infoid;
        this.versionapksize = versionapksize;
        this.versionapkurl = versionapkurl;
        this.createdate = createdate;
        this.modifydate = modifydate;
        this.versionstatus = versionstatus;
    }
}