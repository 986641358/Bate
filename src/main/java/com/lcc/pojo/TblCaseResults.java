package com.lcc.pojo;

import java.util.Date;

public class TblCaseResults {
    private Integer id;

    private Integer cid;

    private String issuccess;

    private String actualresults;

    private String expectedresults;

    private String isadopt;

    private Date starttime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getIssuccess() {
        return issuccess;
    }

    public void setIssuccess(String issuccess) {
        this.issuccess = issuccess == null ? null : issuccess.trim();
    }

    public String getActualresults() {
        return actualresults;
    }

    public void setActualresults(String actualresults) {
        this.actualresults = actualresults == null ? null : actualresults.trim();
    }

    public String getExpectedresults() {
        return expectedresults;
    }

    public void setExpectedresults(String expectedresults) {
        this.expectedresults = expectedresults == null ? null : expectedresults.trim();
    }

    public String getIsadopt() {
        return isadopt;
    }

    public void setIsadopt(String isadopt) {
        this.isadopt = isadopt == null ? null : isadopt.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }
}