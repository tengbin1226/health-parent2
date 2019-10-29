package com.health.bean;

import java.util.Date;

public class InterposeSprot {
    private Integer id;

    private Integer tMemberId;

    private String sportName;

    private Integer sportTime;

    private String sportCycle;

    private Integer consumeCount;

    private Date createTime;

    private Date updateTime;

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

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName == null ? null : sportName.trim();
    }

    public Integer getSportTime() {
        return sportTime;
    }

    public void setSportTime(Integer sportTime) {
        this.sportTime = sportTime;
    }

    public String getSportCycle() {
        return sportCycle;
    }

    public void setSportCycle(String sportCycle) {
        this.sportCycle = sportCycle == null ? null : sportCycle.trim();
    }

    public Integer getConsumeCount() {
        return consumeCount;
    }

    public void setConsumeCount(Integer consumeCount) {
        this.consumeCount = consumeCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}