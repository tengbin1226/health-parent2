package com.health.bean;

import java.util.Date;

public class MentalityResult {
    private Integer id;

    private Integer tMemberId;

    private Integer tOcd;

    private Integer tAnxiety;

    private Integer tTerror;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer gettMemberId() {
        return tMemberId;
    }

    public void settMemberId(Integer tMemberId) {
        this.tMemberId = tMemberId;
    }

    public Integer gettOcd() {
        return tOcd;
    }

    public void settOcd(Integer tOcd) {
        this.tOcd = tOcd;
    }

    public Integer gettAnxiety() {
        return tAnxiety;
    }

    public void settAnxiety(Integer tAnxiety) {
        this.tAnxiety = tAnxiety;
    }

    public Integer gettTerror() {
        return tTerror;
    }

    public void settTerror(Integer tTerror) {
        this.tTerror = tTerror;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}