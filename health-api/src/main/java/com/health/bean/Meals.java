package com.health.bean;

import java.util.Date;

public class Meals {
    private Integer id;

    private String code;

    private String name;

    private String typeid;

    private Integer energy;

    private Integer protein;

    private Integer fat;

    private Integer carbohydrate;

    private Integer kcal;

    private Integer kj;

    private Integer hbp;

    private Integer diabetes;

    private Integer chd;

    private Integer stroke;

    private Integer cacd;

    private Integer hyperlipidemia;

    private Integer obesity;

    private Integer ventilate;

    private String explain;

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

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid == null ? null : typeid.trim();
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Integer getProtein() {
        return protein;
    }

    public void setProtein(Integer protein) {
        this.protein = protein;
    }

    public Integer getFat() {
        return fat;
    }

    public void setFat(Integer fat) {
        this.fat = fat;
    }

    public Integer getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(Integer carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public Integer getKcal() {
        return kcal;
    }

    public void setKcal(Integer kcal) {
        this.kcal = kcal;
    }

    public Integer getKj() {
        return kj;
    }

    public void setKj(Integer kj) {
        this.kj = kj;
    }

    public Integer getHbp() {
        return hbp;
    }

    public void setHbp(Integer hbp) {
        this.hbp = hbp;
    }

    public Integer getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Integer diabetes) {
        this.diabetes = diabetes;
    }

    public Integer getChd() {
        return chd;
    }

    public void setChd(Integer chd) {
        this.chd = chd;
    }

    public Integer getStroke() {
        return stroke;
    }

    public void setStroke(Integer stroke) {
        this.stroke = stroke;
    }

    public Integer getCacd() {
        return cacd;
    }

    public void setCacd(Integer cacd) {
        this.cacd = cacd;
    }

    public Integer getHyperlipidemia() {
        return hyperlipidemia;
    }

    public void setHyperlipidemia(Integer hyperlipidemia) {
        this.hyperlipidemia = hyperlipidemia;
    }

    public Integer getObesity() {
        return obesity;
    }

    public void setObesity(Integer obesity) {
        this.obesity = obesity;
    }

    public Integer getVentilate() {
        return ventilate;
    }

    public void setVentilate(Integer ventilate) {
        this.ventilate = ventilate;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
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