package com.health.bean;

import java.io.Serializable;
import java.util.Date;

public class SetMeal implements Serializable {

    private static final long serialVersionUID = 1379817433386232527L;

    private Integer id;

    private String name;

    private String code;

    private String helpcode;

    private String sex;

    private Integer maxage;

    private Integer minage;

    private Float price;

    private String remark;

    private String attention;

    private String img;

    private String status;

    private Date createTime;

    private Date updateTine;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getHelpcode() {
        return helpcode;
    }

    public void setHelpcode(String helpcode) {
        this.helpcode = helpcode == null ? null : helpcode.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getMaxage() {
        return maxage;
    }

    public void setMaxage(Integer maxage) {
        this.maxage = maxage;
    }

    public Integer getMinage() {
        return minage;
    }

    public void setMinage(Integer minage) {
        this.minage = minage;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTine() {
        return updateTine;
    }

    public void setUpdateTine(Date updateTine) {
        this.updateTine = updateTine;
    }
}