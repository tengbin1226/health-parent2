package com.health.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberDynamicinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberDynamicinfoExample() {
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

        public Criteria andTMemberIdIsNull() {
            addCriterion("t_member_id is null");
            return (Criteria) this;
        }

        public Criteria andTMemberIdIsNotNull() {
            addCriterion("t_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andTMemberIdEqualTo(Integer value) {
            addCriterion("t_member_id =", value, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdNotEqualTo(Integer value) {
            addCriterion("t_member_id <>", value, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdGreaterThan(Integer value) {
            addCriterion("t_member_id >", value, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_member_id >=", value, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdLessThan(Integer value) {
            addCriterion("t_member_id <", value, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_member_id <=", value, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdIn(List<Integer> values) {
            addCriterion("t_member_id in", values, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdNotIn(List<Integer> values) {
            addCriterion("t_member_id not in", values, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("t_member_id between", value1, value2, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andTMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_member_id not between", value1, value2, "tMemberId");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Float value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Float value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Float value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Float value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Float value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Float value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Float> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Float> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Float value1, Float value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Float value1, Float value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Float value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Float value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Float value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Float value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Float value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Float> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Float> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Float value1, Float value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Float value1, Float value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andDbpIsNull() {
            addCriterion("dbp is null");
            return (Criteria) this;
        }

        public Criteria andDbpIsNotNull() {
            addCriterion("dbp is not null");
            return (Criteria) this;
        }

        public Criteria andDbpEqualTo(Float value) {
            addCriterion("dbp =", value, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpNotEqualTo(Float value) {
            addCriterion("dbp <>", value, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpGreaterThan(Float value) {
            addCriterion("dbp >", value, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpGreaterThanOrEqualTo(Float value) {
            addCriterion("dbp >=", value, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpLessThan(Float value) {
            addCriterion("dbp <", value, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpLessThanOrEqualTo(Float value) {
            addCriterion("dbp <=", value, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpIn(List<Float> values) {
            addCriterion("dbp in", values, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpNotIn(List<Float> values) {
            addCriterion("dbp not in", values, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpBetween(Float value1, Float value2) {
            addCriterion("dbp between", value1, value2, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpNotBetween(Float value1, Float value2) {
            addCriterion("dbp not between", value1, value2, "dbp");
            return (Criteria) this;
        }

        public Criteria andSbpIsNull() {
            addCriterion("sbp is null");
            return (Criteria) this;
        }

        public Criteria andSbpIsNotNull() {
            addCriterion("sbp is not null");
            return (Criteria) this;
        }

        public Criteria andSbpEqualTo(Float value) {
            addCriterion("sbp =", value, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpNotEqualTo(Float value) {
            addCriterion("sbp <>", value, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpGreaterThan(Float value) {
            addCriterion("sbp >", value, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpGreaterThanOrEqualTo(Float value) {
            addCriterion("sbp >=", value, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpLessThan(Float value) {
            addCriterion("sbp <", value, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpLessThanOrEqualTo(Float value) {
            addCriterion("sbp <=", value, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpIn(List<Float> values) {
            addCriterion("sbp in", values, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpNotIn(List<Float> values) {
            addCriterion("sbp not in", values, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpBetween(Float value1, Float value2) {
            addCriterion("sbp between", value1, value2, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpNotBetween(Float value1, Float value2) {
            addCriterion("sbp not between", value1, value2, "sbp");
            return (Criteria) this;
        }

        public Criteria andBrethIsNull() {
            addCriterion("breth is null");
            return (Criteria) this;
        }

        public Criteria andBrethIsNotNull() {
            addCriterion("breth is not null");
            return (Criteria) this;
        }

        public Criteria andBrethEqualTo(String value) {
            addCriterion("breth =", value, "breth");
            return (Criteria) this;
        }

        public Criteria andBrethNotEqualTo(String value) {
            addCriterion("breth <>", value, "breth");
            return (Criteria) this;
        }

        public Criteria andBrethGreaterThan(String value) {
            addCriterion("breth >", value, "breth");
            return (Criteria) this;
        }

        public Criteria andBrethGreaterThanOrEqualTo(String value) {
            addCriterion("breth >=", value, "breth");
            return (Criteria) this;
        }

        public Criteria andBrethLessThan(String value) {
            addCriterion("breth <", value, "breth");
            return (Criteria) this;
        }

        public Criteria andBrethLessThanOrEqualTo(String value) {
            addCriterion("breth <=", value, "breth");
            return (Criteria) this;
        }

        public Criteria andBrethLike(String value) {
            addCriterion("breth like", value, "breth");
            return (Criteria) this;
        }

        public Criteria andBrethNotLike(String value) {
            addCriterion("breth not like", value, "breth");
            return (Criteria) this;
        }

        public Criteria andBrethIn(List<String> values) {
            addCriterion("breth in", values, "breth");
            return (Criteria) this;
        }

        public Criteria andBrethNotIn(List<String> values) {
            addCriterion("breth not in", values, "breth");
            return (Criteria) this;
        }

        public Criteria andBrethBetween(String value1, String value2) {
            addCriterion("breth between", value1, value2, "breth");
            return (Criteria) this;
        }

        public Criteria andBrethNotBetween(String value1, String value2) {
            addCriterion("breth not between", value1, value2, "breth");
            return (Criteria) this;
        }

        public Criteria andThermometerIsNull() {
            addCriterion("thermometer is null");
            return (Criteria) this;
        }

        public Criteria andThermometerIsNotNull() {
            addCriterion("thermometer is not null");
            return (Criteria) this;
        }

        public Criteria andThermometerEqualTo(Float value) {
            addCriterion("thermometer =", value, "thermometer");
            return (Criteria) this;
        }

        public Criteria andThermometerNotEqualTo(Float value) {
            addCriterion("thermometer <>", value, "thermometer");
            return (Criteria) this;
        }

        public Criteria andThermometerGreaterThan(Float value) {
            addCriterion("thermometer >", value, "thermometer");
            return (Criteria) this;
        }

        public Criteria andThermometerGreaterThanOrEqualTo(Float value) {
            addCriterion("thermometer >=", value, "thermometer");
            return (Criteria) this;
        }

        public Criteria andThermometerLessThan(Float value) {
            addCriterion("thermometer <", value, "thermometer");
            return (Criteria) this;
        }

        public Criteria andThermometerLessThanOrEqualTo(Float value) {
            addCriterion("thermometer <=", value, "thermometer");
            return (Criteria) this;
        }

        public Criteria andThermometerIn(List<Float> values) {
            addCriterion("thermometer in", values, "thermometer");
            return (Criteria) this;
        }

        public Criteria andThermometerNotIn(List<Float> values) {
            addCriterion("thermometer not in", values, "thermometer");
            return (Criteria) this;
        }

        public Criteria andThermometerBetween(Float value1, Float value2) {
            addCriterion("thermometer between", value1, value2, "thermometer");
            return (Criteria) this;
        }

        public Criteria andThermometerNotBetween(Float value1, Float value2) {
            addCriterion("thermometer not between", value1, value2, "thermometer");
            return (Criteria) this;
        }

        public Criteria andWaistlineIsNull() {
            addCriterion("waistline is null");
            return (Criteria) this;
        }

        public Criteria andWaistlineIsNotNull() {
            addCriterion("waistline is not null");
            return (Criteria) this;
        }

        public Criteria andWaistlineEqualTo(Float value) {
            addCriterion("waistline =", value, "waistline");
            return (Criteria) this;
        }

        public Criteria andWaistlineNotEqualTo(Float value) {
            addCriterion("waistline <>", value, "waistline");
            return (Criteria) this;
        }

        public Criteria andWaistlineGreaterThan(Float value) {
            addCriterion("waistline >", value, "waistline");
            return (Criteria) this;
        }

        public Criteria andWaistlineGreaterThanOrEqualTo(Float value) {
            addCriterion("waistline >=", value, "waistline");
            return (Criteria) this;
        }

        public Criteria andWaistlineLessThan(Float value) {
            addCriterion("waistline <", value, "waistline");
            return (Criteria) this;
        }

        public Criteria andWaistlineLessThanOrEqualTo(Float value) {
            addCriterion("waistline <=", value, "waistline");
            return (Criteria) this;
        }

        public Criteria andWaistlineIn(List<Float> values) {
            addCriterion("waistline in", values, "waistline");
            return (Criteria) this;
        }

        public Criteria andWaistlineNotIn(List<Float> values) {
            addCriterion("waistline not in", values, "waistline");
            return (Criteria) this;
        }

        public Criteria andWaistlineBetween(Float value1, Float value2) {
            addCriterion("waistline between", value1, value2, "waistline");
            return (Criteria) this;
        }

        public Criteria andWaistlineNotBetween(Float value1, Float value2) {
            addCriterion("waistline not between", value1, value2, "waistline");
            return (Criteria) this;
        }

        public Criteria andHiplineIsNull() {
            addCriterion("hipline is null");
            return (Criteria) this;
        }

        public Criteria andHiplineIsNotNull() {
            addCriterion("hipline is not null");
            return (Criteria) this;
        }

        public Criteria andHiplineEqualTo(Float value) {
            addCriterion("hipline =", value, "hipline");
            return (Criteria) this;
        }

        public Criteria andHiplineNotEqualTo(Float value) {
            addCriterion("hipline <>", value, "hipline");
            return (Criteria) this;
        }

        public Criteria andHiplineGreaterThan(Float value) {
            addCriterion("hipline >", value, "hipline");
            return (Criteria) this;
        }

        public Criteria andHiplineGreaterThanOrEqualTo(Float value) {
            addCriterion("hipline >=", value, "hipline");
            return (Criteria) this;
        }

        public Criteria andHiplineLessThan(Float value) {
            addCriterion("hipline <", value, "hipline");
            return (Criteria) this;
        }

        public Criteria andHiplineLessThanOrEqualTo(Float value) {
            addCriterion("hipline <=", value, "hipline");
            return (Criteria) this;
        }

        public Criteria andHiplineIn(List<Float> values) {
            addCriterion("hipline in", values, "hipline");
            return (Criteria) this;
        }

        public Criteria andHiplineNotIn(List<Float> values) {
            addCriterion("hipline not in", values, "hipline");
            return (Criteria) this;
        }

        public Criteria andHiplineBetween(Float value1, Float value2) {
            addCriterion("hipline between", value1, value2, "hipline");
            return (Criteria) this;
        }

        public Criteria andHiplineNotBetween(Float value1, Float value2) {
            addCriterion("hipline not between", value1, value2, "hipline");
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