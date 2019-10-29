package com.health.bean;

import java.util.Date;

public class CheckiTem {
    private Integer id;

    private String code;

    private String name;

    private String mnemonicName;

    private String sex;

    private String age;

    private Float price;

    private String affiliationClassify;

    private String type;

    private String remark;

    private String attention;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMnemonicName() {
        return mnemonicName;
    }

    public void setMnemonicName(String mnemonicName) {
        this.mnemonicName = mnemonicName == null ? null : mnemonicName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getAffiliationClassify() {
        return affiliationClassify;
    }

    public void setAffiliationClassify(String affiliationClassify) {
        this.affiliationClassify = affiliationClassify == null ? null : affiliationClassify.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention == null ? null : attention.trim();
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