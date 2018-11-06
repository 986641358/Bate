package com.lcc.pojo;

import java.util.Date;

public class TblPublicParameters {
    private Integer id;

    private String testurl;

    private String appid;

    private String xinyitoken;

    private String version;

    private String secret;

    private String staticsecret;

    private String unidcode;

    private String userkey;

    private Date ctime;

    private Date utime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTesturl() {
        return testurl;
    }

    public void setTesturl(String testurl) {
        this.testurl = testurl == null ? null : testurl.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getXinyitoken() {
        return xinyitoken;
    }

    public void setXinyitoken(String xinyitoken) {
        this.xinyitoken = xinyitoken == null ? null : xinyitoken.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret == null ? null : secret.trim();
    }

    public String getStaticsecret() {
        return staticsecret;
    }

    public void setStaticsecret(String staticsecret) {
        this.staticsecret = staticsecret == null ? null : staticsecret.trim();
    }

    public String getUnidcode() {
        return unidcode;
    }

    public void setUnidcode(String unidcode) {
        this.unidcode = unidcode == null ? null : unidcode.trim();
    }

    public String getUserkey() {
        return userkey;
    }

    public void setUserkey(String userkey) {
        this.userkey = userkey == null ? null : userkey.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }
}