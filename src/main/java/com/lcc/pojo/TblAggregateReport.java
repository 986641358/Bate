package com.lcc.pojo;

import java.util.Date;

public class TblAggregateReport {
    private Integer id;

    private Integer batchnum;

    private Integer successnum;

    private Integer failurenum;

    private Date ctime;

    private Date utime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBatchnum() {
        return batchnum;
    }

    public void setBatchnum(Integer batchnum) {
        this.batchnum = batchnum;
    }

    public Integer getSuccessnum() {
        return successnum;
    }

    public void setSuccessnum(Integer successnum) {
        this.successnum = successnum;
    }

    public Integer getFailurenum() {
        return failurenum;
    }

    public void setFailurenum(Integer failurenum) {
        this.failurenum = failurenum;
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