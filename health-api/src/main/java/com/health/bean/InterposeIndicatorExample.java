package com.health.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterposeIndicatorExample implements Serializable {

    private static final long serialVersionUID = -3328558303806732977L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterposeIndicatorExample() {
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

        public Criteria andSequenceNoIsNull() {
            addCriterion("sequence_no is null");
            return (Criteria) this;
        }

        public Criteria andSequenceNoIsNotNull() {
            addCriterion("sequence_no is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceNoEqualTo(Integer value) {
            addCriterion("sequence_no =", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoNotEqualTo(Integer value) {
            addCriterion("sequence_no <>", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoGreaterThan(Integer value) {
            addCriterion("sequence_no >", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sequence_no >=", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoLessThan(Integer value) {
            addCriterion("sequence_no <", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoLessThanOrEqualTo(Integer value) {
            addCriterion("sequence_no <=", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoIn(List<Integer> values) {
            addCriterion("sequence_no in", values, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoNotIn(List<Integer> values) {
            addCriterion("sequence_no not in", values, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoBetween(Integer value1, Integer value2) {
            addCriterion("sequence_no between", value1, value2, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoNotBetween(Integer value1, Integer value2) {
            addCriterion("sequence_no not between", value1, value2, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andIndicatorNameIsNull() {
            addCriterion("indicator_name is null");
            return (Criteria) this;
        }

        public Criteria andIndicatorNameIsNotNull() {
            addCriterion("indicator_name is not null");
            return (Criteria) this;
        }

        public Criteria andIndicatorNameEqualTo(String value) {
            addCriterion("indicator_name =", value, "indicatorName");
            return (Criteria) this;
        }

        public Criteria andIndicatorNameNotEqualTo(String value) {
            addCriterion("indicator_name <>", value, "indicatorName");
            return (Criteria) this;
        }

        public Criteria andIndicatorNameGreaterThan(String value) {
            addCriterion("indicator_name >", value, "indicatorName");
            return (Criteria) this;
        }

        public Criteria andIndicatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("indicator_name >=", value, "indicatorName");
            return (Criteria) this;
        }

        public Criteria andIndicatorNameLessThan(String value) {
            addCriterion("indicator_name <", value, "indicatorName");
            return (Criteria) this;
        }

        public Criteria andIndicatorNameLessThanOrEqualTo(String value) {
            addCriterion("indicator_name <=", value, "indicatorName");
            return (Criteria) this;
        }

        public Criteria andIndicatorNameLike(String value) {
            addCriterion("indicator_name like", value, "indicatorName");
            return (Criteria) this;
        }

        public Criteria andIndicatorNameNotLike(String value) {
            addCriterion("indicator_name not like", value, "indicatorName");
            return (Criteria) this;
        }

        public Criteria andIndicatorNameIn(List<String> values) {
            addCriterion("indicator_name in", values, "indicatorName");
            return (Criteria) this;
        }

        public Criteria andIndicatorNameNotIn(List<String> values) {
            addCriterion("indicator_name not in", values, "indicatorName");
            return (Criteria) this;
        }

        public Criteria andIndicatorNameBetween(String value1, String value2) {
            addCriterion("indicator_name between", value1, value2, "indicatorName");
            return (Criteria) this;
        }

        public Criteria andIndicatorNameNotBetween(String value1, String value2) {
            addCriterion("indicator_name not between", value1, value2, "indicatorName");
            return (Criteria) this;
        }

        public Criteria andNormalValueIsNull() {
            addCriterion("normal_value is null");
            return (Criteria) this;
        }

        public Criteria andNormalValueIsNotNull() {
            addCriterion("normal_value is not null");
            return (Criteria) this;
        }

        public Criteria andNormalValueEqualTo(String value) {
            addCriterion("normal_value =", value, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueNotEqualTo(String value) {
            addCriterion("normal_value <>", value, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueGreaterThan(String value) {
            addCriterion("normal_value >", value, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueGreaterThanOrEqualTo(String value) {
            addCriterion("normal_value >=", value, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueLessThan(String value) {
            addCriterion("normal_value <", value, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueLessThanOrEqualTo(String value) {
            addCriterion("normal_value <=", value, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueLike(String value) {
            addCriterion("normal_value like", value, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueNotLike(String value) {
            addCriterion("normal_value not like", value, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueIn(List<String> values) {
            addCriterion("normal_value in", values, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueNotIn(List<String> values) {
            addCriterion("normal_value not in", values, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueBetween(String value1, String value2) {
            addCriterion("normal_value between", value1, value2, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueNotBetween(String value1, String value2) {
            addCriterion("normal_value not between", value1, value2, "normalValue");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andLeftCriticalIsNull() {
            addCriterion("left_critical is null");
            return (Criteria) this;
        }

        public Criteria andLeftCriticalIsNotNull() {
            addCriterion("left_critical is not null");
            return (Criteria) this;
        }

        public Criteria andLeftCriticalEqualTo(Float value) {
            addCriterion("left_critical =", value, "leftCritical");
            return (Criteria) this;
        }

        public Criteria andLeftCriticalNotEqualTo(Float value) {
            addCriterion("left_critical <>", value, "leftCritical");
            return (Criteria) this;
        }

        public Criteria andLeftCriticalGreaterThan(Float value) {
            addCriterion("left_critical >", value, "leftCritical");
            return (Criteria) this;
        }

        public Criteria andLeftCriticalGreaterThanOrEqualTo(Float value) {
            addCriterion("left_critical >=", value, "leftCritical");
            return (Criteria) this;
        }

        public Criteria andLeftCriticalLessThan(Float value) {
            addCriterion("left_critical <", value, "leftCritical");
            return (Criteria) this;
        }

        public Criteria andLeftCriticalLessThanOrEqualTo(Float value) {
            addCriterion("left_critical <=", value, "leftCritical");
            return (Criteria) this;
        }

        public Criteria andLeftCriticalIn(List<Float> values) {
            addCriterion("left_critical in", values, "leftCritical");
            return (Criteria) this;
        }

        public Criteria andLeftCriticalNotIn(List<Float> values) {
            addCriterion("left_critical not in", values, "leftCritical");
            return (Criteria) this;
        }

        public Criteria andLeftCriticalBetween(Float value1, Float value2) {
            addCriterion("left_critical between", value1, value2, "leftCritical");
            return (Criteria) this;
        }

        public Criteria andLeftCriticalNotBetween(Float value1, Float value2) {
            addCriterion("left_critical not between", value1, value2, "leftCritical");
            return (Criteria) this;
        }

        public Criteria andRightCriticalIsNull() {
            addCriterion("right_critical is null");
            return (Criteria) this;
        }

        public Criteria andRightCriticalIsNotNull() {
            addCriterion("right_critical is not null");
            return (Criteria) this;
        }

        public Criteria andRightCriticalEqualTo(Float value) {
            addCriterion("right_critical =", value, "rightCritical");
            return (Criteria) this;
        }

        public Criteria andRightCriticalNotEqualTo(Float value) {
            addCriterion("right_critical <>", value, "rightCritical");
            return (Criteria) this;
        }

        public Criteria andRightCriticalGreaterThan(Float value) {
            addCriterion("right_critical >", value, "rightCritical");
            return (Criteria) this;
        }

        public Criteria andRightCriticalGreaterThanOrEqualTo(Float value) {
            addCriterion("right_critical >=", value, "rightCritical");
            return (Criteria) this;
        }

        public Criteria andRightCriticalLessThan(Float value) {
            addCriterion("right_critical <", value, "rightCritical");
            return (Criteria) this;
        }

        public Criteria andRightCriticalLessThanOrEqualTo(Float value) {
            addCriterion("right_critical <=", value, "rightCritical");
            return (Criteria) this;
        }

        public Criteria andRightCriticalIn(List<Float> values) {
            addCriterion("right_critical in", values, "rightCritical");
            return (Criteria) this;
        }

        public Criteria andRightCriticalNotIn(List<Float> values) {
            addCriterion("right_critical not in", values, "rightCritical");
            return (Criteria) this;
        }

        public Criteria andRightCriticalBetween(Float value1, Float value2) {
            addCriterion("right_critical between", value1, value2, "rightCritical");
            return (Criteria) this;
        }

        public Criteria andRightCriticalNotBetween(Float value1, Float value2) {
            addCriterion("right_critical not between", value1, value2, "rightCritical");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
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