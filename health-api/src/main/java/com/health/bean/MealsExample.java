package com.health.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MealsExample implements Serializable {

    private static final long serialVersionUID = 404863335631247737L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MealsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(String value) {
            addCriterion("typeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(String value) {
            addCriterion("typeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(String value) {
            addCriterion("typeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(String value) {
            addCriterion("typeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(String value) {
            addCriterion("typeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(String value) {
            addCriterion("typeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLike(String value) {
            addCriterion("typeId like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotLike(String value) {
            addCriterion("typeId not like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<String> values) {
            addCriterion("typeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<String> values) {
            addCriterion("typeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(String value1, String value2) {
            addCriterion("typeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(String value1, String value2) {
            addCriterion("typeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andEnergyIsNull() {
            addCriterion("energy is null");
            return (Criteria) this;
        }

        public Criteria andEnergyIsNotNull() {
            addCriterion("energy is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyEqualTo(Integer value) {
            addCriterion("energy =", value, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyNotEqualTo(Integer value) {
            addCriterion("energy <>", value, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyGreaterThan(Integer value) {
            addCriterion("energy >", value, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyGreaterThanOrEqualTo(Integer value) {
            addCriterion("energy >=", value, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyLessThan(Integer value) {
            addCriterion("energy <", value, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyLessThanOrEqualTo(Integer value) {
            addCriterion("energy <=", value, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyIn(List<Integer> values) {
            addCriterion("energy in", values, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyNotIn(List<Integer> values) {
            addCriterion("energy not in", values, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyBetween(Integer value1, Integer value2) {
            addCriterion("energy between", value1, value2, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyNotBetween(Integer value1, Integer value2) {
            addCriterion("energy not between", value1, value2, "energy");
            return (Criteria) this;
        }

        public Criteria andProteinIsNull() {
            addCriterion("protein is null");
            return (Criteria) this;
        }

        public Criteria andProteinIsNotNull() {
            addCriterion("protein is not null");
            return (Criteria) this;
        }

        public Criteria andProteinEqualTo(Integer value) {
            addCriterion("protein =", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinNotEqualTo(Integer value) {
            addCriterion("protein <>", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinGreaterThan(Integer value) {
            addCriterion("protein >", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinGreaterThanOrEqualTo(Integer value) {
            addCriterion("protein >=", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinLessThan(Integer value) {
            addCriterion("protein <", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinLessThanOrEqualTo(Integer value) {
            addCriterion("protein <=", value, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinIn(List<Integer> values) {
            addCriterion("protein in", values, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinNotIn(List<Integer> values) {
            addCriterion("protein not in", values, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinBetween(Integer value1, Integer value2) {
            addCriterion("protein between", value1, value2, "protein");
            return (Criteria) this;
        }

        public Criteria andProteinNotBetween(Integer value1, Integer value2) {
            addCriterion("protein not between", value1, value2, "protein");
            return (Criteria) this;
        }

        public Criteria andFatIsNull() {
            addCriterion("fat is null");
            return (Criteria) this;
        }

        public Criteria andFatIsNotNull() {
            addCriterion("fat is not null");
            return (Criteria) this;
        }

        public Criteria andFatEqualTo(Integer value) {
            addCriterion("fat =", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatNotEqualTo(Integer value) {
            addCriterion("fat <>", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatGreaterThan(Integer value) {
            addCriterion("fat >", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatGreaterThanOrEqualTo(Integer value) {
            addCriterion("fat >=", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatLessThan(Integer value) {
            addCriterion("fat <", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatLessThanOrEqualTo(Integer value) {
            addCriterion("fat <=", value, "fat");
            return (Criteria) this;
        }

        public Criteria andFatIn(List<Integer> values) {
            addCriterion("fat in", values, "fat");
            return (Criteria) this;
        }

        public Criteria andFatNotIn(List<Integer> values) {
            addCriterion("fat not in", values, "fat");
            return (Criteria) this;
        }

        public Criteria andFatBetween(Integer value1, Integer value2) {
            addCriterion("fat between", value1, value2, "fat");
            return (Criteria) this;
        }

        public Criteria andFatNotBetween(Integer value1, Integer value2) {
            addCriterion("fat not between", value1, value2, "fat");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateIsNull() {
            addCriterion("carbohydrate is null");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateIsNotNull() {
            addCriterion("carbohydrate is not null");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateEqualTo(Integer value) {
            addCriterion("carbohydrate =", value, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateNotEqualTo(Integer value) {
            addCriterion("carbohydrate <>", value, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateGreaterThan(Integer value) {
            addCriterion("carbohydrate >", value, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("carbohydrate >=", value, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateLessThan(Integer value) {
            addCriterion("carbohydrate <", value, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateLessThanOrEqualTo(Integer value) {
            addCriterion("carbohydrate <=", value, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateIn(List<Integer> values) {
            addCriterion("carbohydrate in", values, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateNotIn(List<Integer> values) {
            addCriterion("carbohydrate not in", values, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateBetween(Integer value1, Integer value2) {
            addCriterion("carbohydrate between", value1, value2, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andCarbohydrateNotBetween(Integer value1, Integer value2) {
            addCriterion("carbohydrate not between", value1, value2, "carbohydrate");
            return (Criteria) this;
        }

        public Criteria andKcalIsNull() {
            addCriterion("kcal is null");
            return (Criteria) this;
        }

        public Criteria andKcalIsNotNull() {
            addCriterion("kcal is not null");
            return (Criteria) this;
        }

        public Criteria andKcalEqualTo(Integer value) {
            addCriterion("kcal =", value, "kcal");
            return (Criteria) this;
        }

        public Criteria andKcalNotEqualTo(Integer value) {
            addCriterion("kcal <>", value, "kcal");
            return (Criteria) this;
        }

        public Criteria andKcalGreaterThan(Integer value) {
            addCriterion("kcal >", value, "kcal");
            return (Criteria) this;
        }

        public Criteria andKcalGreaterThanOrEqualTo(Integer value) {
            addCriterion("kcal >=", value, "kcal");
            return (Criteria) this;
        }

        public Criteria andKcalLessThan(Integer value) {
            addCriterion("kcal <", value, "kcal");
            return (Criteria) this;
        }

        public Criteria andKcalLessThanOrEqualTo(Integer value) {
            addCriterion("kcal <=", value, "kcal");
            return (Criteria) this;
        }

        public Criteria andKcalIn(List<Integer> values) {
            addCriterion("kcal in", values, "kcal");
            return (Criteria) this;
        }

        public Criteria andKcalNotIn(List<Integer> values) {
            addCriterion("kcal not in", values, "kcal");
            return (Criteria) this;
        }

        public Criteria andKcalBetween(Integer value1, Integer value2) {
            addCriterion("kcal between", value1, value2, "kcal");
            return (Criteria) this;
        }

        public Criteria andKcalNotBetween(Integer value1, Integer value2) {
            addCriterion("kcal not between", value1, value2, "kcal");
            return (Criteria) this;
        }

        public Criteria andKjIsNull() {
            addCriterion("kj is null");
            return (Criteria) this;
        }

        public Criteria andKjIsNotNull() {
            addCriterion("kj is not null");
            return (Criteria) this;
        }

        public Criteria andKjEqualTo(Integer value) {
            addCriterion("kj =", value, "kj");
            return (Criteria) this;
        }

        public Criteria andKjNotEqualTo(Integer value) {
            addCriterion("kj <>", value, "kj");
            return (Criteria) this;
        }

        public Criteria andKjGreaterThan(Integer value) {
            addCriterion("kj >", value, "kj");
            return (Criteria) this;
        }

        public Criteria andKjGreaterThanOrEqualTo(Integer value) {
            addCriterion("kj >=", value, "kj");
            return (Criteria) this;
        }

        public Criteria andKjLessThan(Integer value) {
            addCriterion("kj <", value, "kj");
            return (Criteria) this;
        }

        public Criteria andKjLessThanOrEqualTo(Integer value) {
            addCriterion("kj <=", value, "kj");
            return (Criteria) this;
        }

        public Criteria andKjIn(List<Integer> values) {
            addCriterion("kj in", values, "kj");
            return (Criteria) this;
        }

        public Criteria andKjNotIn(List<Integer> values) {
            addCriterion("kj not in", values, "kj");
            return (Criteria) this;
        }

        public Criteria andKjBetween(Integer value1, Integer value2) {
            addCriterion("kj between", value1, value2, "kj");
            return (Criteria) this;
        }

        public Criteria andKjNotBetween(Integer value1, Integer value2) {
            addCriterion("kj not between", value1, value2, "kj");
            return (Criteria) this;
        }

        public Criteria andHbpIsNull() {
            addCriterion("hbp is null");
            return (Criteria) this;
        }

        public Criteria andHbpIsNotNull() {
            addCriterion("hbp is not null");
            return (Criteria) this;
        }

        public Criteria andHbpEqualTo(Integer value) {
            addCriterion("hbp =", value, "hbp");
            return (Criteria) this;
        }

        public Criteria andHbpNotEqualTo(Integer value) {
            addCriterion("hbp <>", value, "hbp");
            return (Criteria) this;
        }

        public Criteria andHbpGreaterThan(Integer value) {
            addCriterion("hbp >", value, "hbp");
            return (Criteria) this;
        }

        public Criteria andHbpGreaterThanOrEqualTo(Integer value) {
            addCriterion("hbp >=", value, "hbp");
            return (Criteria) this;
        }

        public Criteria andHbpLessThan(Integer value) {
            addCriterion("hbp <", value, "hbp");
            return (Criteria) this;
        }

        public Criteria andHbpLessThanOrEqualTo(Integer value) {
            addCriterion("hbp <=", value, "hbp");
            return (Criteria) this;
        }

        public Criteria andHbpIn(List<Integer> values) {
            addCriterion("hbp in", values, "hbp");
            return (Criteria) this;
        }

        public Criteria andHbpNotIn(List<Integer> values) {
            addCriterion("hbp not in", values, "hbp");
            return (Criteria) this;
        }

        public Criteria andHbpBetween(Integer value1, Integer value2) {
            addCriterion("hbp between", value1, value2, "hbp");
            return (Criteria) this;
        }

        public Criteria andHbpNotBetween(Integer value1, Integer value2) {
            addCriterion("hbp not between", value1, value2, "hbp");
            return (Criteria) this;
        }

        public Criteria andDiabetesIsNull() {
            addCriterion("diabetes is null");
            return (Criteria) this;
        }

        public Criteria andDiabetesIsNotNull() {
            addCriterion("diabetes is not null");
            return (Criteria) this;
        }

        public Criteria andDiabetesEqualTo(Integer value) {
            addCriterion("diabetes =", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesNotEqualTo(Integer value) {
            addCriterion("diabetes <>", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesGreaterThan(Integer value) {
            addCriterion("diabetes >", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesGreaterThanOrEqualTo(Integer value) {
            addCriterion("diabetes >=", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesLessThan(Integer value) {
            addCriterion("diabetes <", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesLessThanOrEqualTo(Integer value) {
            addCriterion("diabetes <=", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesIn(List<Integer> values) {
            addCriterion("diabetes in", values, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesNotIn(List<Integer> values) {
            addCriterion("diabetes not in", values, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesBetween(Integer value1, Integer value2) {
            addCriterion("diabetes between", value1, value2, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesNotBetween(Integer value1, Integer value2) {
            addCriterion("diabetes not between", value1, value2, "diabetes");
            return (Criteria) this;
        }

        public Criteria andChdIsNull() {
            addCriterion("chd is null");
            return (Criteria) this;
        }

        public Criteria andChdIsNotNull() {
            addCriterion("chd is not null");
            return (Criteria) this;
        }

        public Criteria andChdEqualTo(Integer value) {
            addCriterion("chd =", value, "chd");
            return (Criteria) this;
        }

        public Criteria andChdNotEqualTo(Integer value) {
            addCriterion("chd <>", value, "chd");
            return (Criteria) this;
        }

        public Criteria andChdGreaterThan(Integer value) {
            addCriterion("chd >", value, "chd");
            return (Criteria) this;
        }

        public Criteria andChdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chd >=", value, "chd");
            return (Criteria) this;
        }

        public Criteria andChdLessThan(Integer value) {
            addCriterion("chd <", value, "chd");
            return (Criteria) this;
        }

        public Criteria andChdLessThanOrEqualTo(Integer value) {
            addCriterion("chd <=", value, "chd");
            return (Criteria) this;
        }

        public Criteria andChdIn(List<Integer> values) {
            addCriterion("chd in", values, "chd");
            return (Criteria) this;
        }

        public Criteria andChdNotIn(List<Integer> values) {
            addCriterion("chd not in", values, "chd");
            return (Criteria) this;
        }

        public Criteria andChdBetween(Integer value1, Integer value2) {
            addCriterion("chd between", value1, value2, "chd");
            return (Criteria) this;
        }

        public Criteria andChdNotBetween(Integer value1, Integer value2) {
            addCriterion("chd not between", value1, value2, "chd");
            return (Criteria) this;
        }

        public Criteria andStrokeIsNull() {
            addCriterion("stroke is null");
            return (Criteria) this;
        }

        public Criteria andStrokeIsNotNull() {
            addCriterion("stroke is not null");
            return (Criteria) this;
        }

        public Criteria andStrokeEqualTo(Integer value) {
            addCriterion("stroke =", value, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeNotEqualTo(Integer value) {
            addCriterion("stroke <>", value, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeGreaterThan(Integer value) {
            addCriterion("stroke >", value, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stroke >=", value, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeLessThan(Integer value) {
            addCriterion("stroke <", value, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeLessThanOrEqualTo(Integer value) {
            addCriterion("stroke <=", value, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeIn(List<Integer> values) {
            addCriterion("stroke in", values, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeNotIn(List<Integer> values) {
            addCriterion("stroke not in", values, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeBetween(Integer value1, Integer value2) {
            addCriterion("stroke between", value1, value2, "stroke");
            return (Criteria) this;
        }

        public Criteria andStrokeNotBetween(Integer value1, Integer value2) {
            addCriterion("stroke not between", value1, value2, "stroke");
            return (Criteria) this;
        }

        public Criteria andCacdIsNull() {
            addCriterion("cacd is null");
            return (Criteria) this;
        }

        public Criteria andCacdIsNotNull() {
            addCriterion("cacd is not null");
            return (Criteria) this;
        }

        public Criteria andCacdEqualTo(Integer value) {
            addCriterion("cacd =", value, "cacd");
            return (Criteria) this;
        }

        public Criteria andCacdNotEqualTo(Integer value) {
            addCriterion("cacd <>", value, "cacd");
            return (Criteria) this;
        }

        public Criteria andCacdGreaterThan(Integer value) {
            addCriterion("cacd >", value, "cacd");
            return (Criteria) this;
        }

        public Criteria andCacdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cacd >=", value, "cacd");
            return (Criteria) this;
        }

        public Criteria andCacdLessThan(Integer value) {
            addCriterion("cacd <", value, "cacd");
            return (Criteria) this;
        }

        public Criteria andCacdLessThanOrEqualTo(Integer value) {
            addCriterion("cacd <=", value, "cacd");
            return (Criteria) this;
        }

        public Criteria andCacdIn(List<Integer> values) {
            addCriterion("cacd in", values, "cacd");
            return (Criteria) this;
        }

        public Criteria andCacdNotIn(List<Integer> values) {
            addCriterion("cacd not in", values, "cacd");
            return (Criteria) this;
        }

        public Criteria andCacdBetween(Integer value1, Integer value2) {
            addCriterion("cacd between", value1, value2, "cacd");
            return (Criteria) this;
        }

        public Criteria andCacdNotBetween(Integer value1, Integer value2) {
            addCriterion("cacd not between", value1, value2, "cacd");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaIsNull() {
            addCriterion("hyperlipidemia is null");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaIsNotNull() {
            addCriterion("hyperlipidemia is not null");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaEqualTo(Integer value) {
            addCriterion("hyperlipidemia =", value, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaNotEqualTo(Integer value) {
            addCriterion("hyperlipidemia <>", value, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaGreaterThan(Integer value) {
            addCriterion("hyperlipidemia >", value, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaGreaterThanOrEqualTo(Integer value) {
            addCriterion("hyperlipidemia >=", value, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaLessThan(Integer value) {
            addCriterion("hyperlipidemia <", value, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaLessThanOrEqualTo(Integer value) {
            addCriterion("hyperlipidemia <=", value, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaIn(List<Integer> values) {
            addCriterion("hyperlipidemia in", values, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaNotIn(List<Integer> values) {
            addCriterion("hyperlipidemia not in", values, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaBetween(Integer value1, Integer value2) {
            addCriterion("hyperlipidemia between", value1, value2, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andHyperlipidemiaNotBetween(Integer value1, Integer value2) {
            addCriterion("hyperlipidemia not between", value1, value2, "hyperlipidemia");
            return (Criteria) this;
        }

        public Criteria andObesityIsNull() {
            addCriterion("obesity is null");
            return (Criteria) this;
        }

        public Criteria andObesityIsNotNull() {
            addCriterion("obesity is not null");
            return (Criteria) this;
        }

        public Criteria andObesityEqualTo(Integer value) {
            addCriterion("obesity =", value, "obesity");
            return (Criteria) this;
        }

        public Criteria andObesityNotEqualTo(Integer value) {
            addCriterion("obesity <>", value, "obesity");
            return (Criteria) this;
        }

        public Criteria andObesityGreaterThan(Integer value) {
            addCriterion("obesity >", value, "obesity");
            return (Criteria) this;
        }

        public Criteria andObesityGreaterThanOrEqualTo(Integer value) {
            addCriterion("obesity >=", value, "obesity");
            return (Criteria) this;
        }

        public Criteria andObesityLessThan(Integer value) {
            addCriterion("obesity <", value, "obesity");
            return (Criteria) this;
        }

        public Criteria andObesityLessThanOrEqualTo(Integer value) {
            addCriterion("obesity <=", value, "obesity");
            return (Criteria) this;
        }

        public Criteria andObesityIn(List<Integer> values) {
            addCriterion("obesity in", values, "obesity");
            return (Criteria) this;
        }

        public Criteria andObesityNotIn(List<Integer> values) {
            addCriterion("obesity not in", values, "obesity");
            return (Criteria) this;
        }

        public Criteria andObesityBetween(Integer value1, Integer value2) {
            addCriterion("obesity between", value1, value2, "obesity");
            return (Criteria) this;
        }

        public Criteria andObesityNotBetween(Integer value1, Integer value2) {
            addCriterion("obesity not between", value1, value2, "obesity");
            return (Criteria) this;
        }

        public Criteria andVentilateIsNull() {
            addCriterion("ventilate is null");
            return (Criteria) this;
        }

        public Criteria andVentilateIsNotNull() {
            addCriterion("ventilate is not null");
            return (Criteria) this;
        }

        public Criteria andVentilateEqualTo(Integer value) {
            addCriterion("ventilate =", value, "ventilate");
            return (Criteria) this;
        }

        public Criteria andVentilateNotEqualTo(Integer value) {
            addCriterion("ventilate <>", value, "ventilate");
            return (Criteria) this;
        }

        public Criteria andVentilateGreaterThan(Integer value) {
            addCriterion("ventilate >", value, "ventilate");
            return (Criteria) this;
        }

        public Criteria andVentilateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ventilate >=", value, "ventilate");
            return (Criteria) this;
        }

        public Criteria andVentilateLessThan(Integer value) {
            addCriterion("ventilate <", value, "ventilate");
            return (Criteria) this;
        }

        public Criteria andVentilateLessThanOrEqualTo(Integer value) {
            addCriterion("ventilate <=", value, "ventilate");
            return (Criteria) this;
        }

        public Criteria andVentilateIn(List<Integer> values) {
            addCriterion("ventilate in", values, "ventilate");
            return (Criteria) this;
        }

        public Criteria andVentilateNotIn(List<Integer> values) {
            addCriterion("ventilate not in", values, "ventilate");
            return (Criteria) this;
        }

        public Criteria andVentilateBetween(Integer value1, Integer value2) {
            addCriterion("ventilate between", value1, value2, "ventilate");
            return (Criteria) this;
        }

        public Criteria andVentilateNotBetween(Integer value1, Integer value2) {
            addCriterion("ventilate not between", value1, value2, "ventilate");
            return (Criteria) this;
        }

        public Criteria andExplainIsNull() {
            addCriterion("explain is null");
            return (Criteria) this;
        }

        public Criteria andExplainIsNotNull() {
            addCriterion("explain is not null");
            return (Criteria) this;
        }

        public Criteria andExplainEqualTo(String value) {
            addCriterion("explain =", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotEqualTo(String value) {
            addCriterion("explain <>", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainGreaterThan(String value) {
            addCriterion("explain >", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainGreaterThanOrEqualTo(String value) {
            addCriterion("explain >=", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLessThan(String value) {
            addCriterion("explain <", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLessThanOrEqualTo(String value) {
            addCriterion("explain <=", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLike(String value) {
            addCriterion("explain like", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotLike(String value) {
            addCriterion("explain not like", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainIn(List<String> values) {
            addCriterion("explain in", values, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotIn(List<String> values) {
            addCriterion("explain not in", values, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainBetween(String value1, String value2) {
            addCriterion("explain between", value1, value2, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotBetween(String value1, String value2) {
            addCriterion("explain not between", value1, value2, "explain");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}