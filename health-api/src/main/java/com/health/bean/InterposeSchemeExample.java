package com.health.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterposeSchemeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterposeSchemeExample() {
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

        public Criteria andSchemeTittleIsNull() {
            addCriterion("scheme_tittle is null");
            return (Criteria) this;
        }

        public Criteria andSchemeTittleIsNotNull() {
            addCriterion("scheme_tittle is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeTittleEqualTo(String value) {
            addCriterion("scheme_tittle =", value, "schemeTittle");
            return (Criteria) this;
        }

        public Criteria andSchemeTittleNotEqualTo(String value) {
            addCriterion("scheme_tittle <>", value, "schemeTittle");
            return (Criteria) this;
        }

        public Criteria andSchemeTittleGreaterThan(String value) {
            addCriterion("scheme_tittle >", value, "schemeTittle");
            return (Criteria) this;
        }

        public Criteria andSchemeTittleGreaterThanOrEqualTo(String value) {
            addCriterion("scheme_tittle >=", value, "schemeTittle");
            return (Criteria) this;
        }

        public Criteria andSchemeTittleLessThan(String value) {
            addCriterion("scheme_tittle <", value, "schemeTittle");
            return (Criteria) this;
        }

        public Criteria andSchemeTittleLessThanOrEqualTo(String value) {
            addCriterion("scheme_tittle <=", value, "schemeTittle");
            return (Criteria) this;
        }

        public Criteria andSchemeTittleLike(String value) {
            addCriterion("scheme_tittle like", value, "schemeTittle");
            return (Criteria) this;
        }

        public Criteria andSchemeTittleNotLike(String value) {
            addCriterion("scheme_tittle not like", value, "schemeTittle");
            return (Criteria) this;
        }

        public Criteria andSchemeTittleIn(List<String> values) {
            addCriterion("scheme_tittle in", values, "schemeTittle");
            return (Criteria) this;
        }

        public Criteria andSchemeTittleNotIn(List<String> values) {
            addCriterion("scheme_tittle not in", values, "schemeTittle");
            return (Criteria) this;
        }

        public Criteria andSchemeTittleBetween(String value1, String value2) {
            addCriterion("scheme_tittle between", value1, value2, "schemeTittle");
            return (Criteria) this;
        }

        public Criteria andSchemeTittleNotBetween(String value1, String value2) {
            addCriterion("scheme_tittle not between", value1, value2, "schemeTittle");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Integer value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Integer value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Integer value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Integer value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Integer> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Integer> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Integer value1, Integer value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andSchemeTargetIsNull() {
            addCriterion("scheme_target is null");
            return (Criteria) this;
        }

        public Criteria andSchemeTargetIsNotNull() {
            addCriterion("scheme_target is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeTargetEqualTo(String value) {
            addCriterion("scheme_target =", value, "schemeTarget");
            return (Criteria) this;
        }

        public Criteria andSchemeTargetNotEqualTo(String value) {
            addCriterion("scheme_target <>", value, "schemeTarget");
            return (Criteria) this;
        }

        public Criteria andSchemeTargetGreaterThan(String value) {
            addCriterion("scheme_target >", value, "schemeTarget");
            return (Criteria) this;
        }

        public Criteria andSchemeTargetGreaterThanOrEqualTo(String value) {
            addCriterion("scheme_target >=", value, "schemeTarget");
            return (Criteria) this;
        }

        public Criteria andSchemeTargetLessThan(String value) {
            addCriterion("scheme_target <", value, "schemeTarget");
            return (Criteria) this;
        }

        public Criteria andSchemeTargetLessThanOrEqualTo(String value) {
            addCriterion("scheme_target <=", value, "schemeTarget");
            return (Criteria) this;
        }

        public Criteria andSchemeTargetLike(String value) {
            addCriterion("scheme_target like", value, "schemeTarget");
            return (Criteria) this;
        }

        public Criteria andSchemeTargetNotLike(String value) {
            addCriterion("scheme_target not like", value, "schemeTarget");
            return (Criteria) this;
        }

        public Criteria andSchemeTargetIn(List<String> values) {
            addCriterion("scheme_target in", values, "schemeTarget");
            return (Criteria) this;
        }

        public Criteria andSchemeTargetNotIn(List<String> values) {
            addCriterion("scheme_target not in", values, "schemeTarget");
            return (Criteria) this;
        }

        public Criteria andSchemeTargetBetween(String value1, String value2) {
            addCriterion("scheme_target between", value1, value2, "schemeTarget");
            return (Criteria) this;
        }

        public Criteria andSchemeTargetNotBetween(String value1, String value2) {
            addCriterion("scheme_target not between", value1, value2, "schemeTarget");
            return (Criteria) this;
        }

        public Criteria andHealthMgrIdIsNull() {
            addCriterion("health_mgr_id is null");
            return (Criteria) this;
        }

        public Criteria andHealthMgrIdIsNotNull() {
            addCriterion("health_mgr_id is not null");
            return (Criteria) this;
        }

        public Criteria andHealthMgrIdEqualTo(Integer value) {
            addCriterion("health_mgr_id =", value, "healthMgrId");
            return (Criteria) this;
        }

        public Criteria andHealthMgrIdNotEqualTo(Integer value) {
            addCriterion("health_mgr_id <>", value, "healthMgrId");
            return (Criteria) this;
        }

        public Criteria andHealthMgrIdGreaterThan(Integer value) {
            addCriterion("health_mgr_id >", value, "healthMgrId");
            return (Criteria) this;
        }

        public Criteria andHealthMgrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("health_mgr_id >=", value, "healthMgrId");
            return (Criteria) this;
        }

        public Criteria andHealthMgrIdLessThan(Integer value) {
            addCriterion("health_mgr_id <", value, "healthMgrId");
            return (Criteria) this;
        }

        public Criteria andHealthMgrIdLessThanOrEqualTo(Integer value) {
            addCriterion("health_mgr_id <=", value, "healthMgrId");
            return (Criteria) this;
        }

        public Criteria andHealthMgrIdIn(List<Integer> values) {
            addCriterion("health_mgr_id in", values, "healthMgrId");
            return (Criteria) this;
        }

        public Criteria andHealthMgrIdNotIn(List<Integer> values) {
            addCriterion("health_mgr_id not in", values, "healthMgrId");
            return (Criteria) this;
        }

        public Criteria andHealthMgrIdBetween(Integer value1, Integer value2) {
            addCriterion("health_mgr_id between", value1, value2, "healthMgrId");
            return (Criteria) this;
        }

        public Criteria andHealthMgrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("health_mgr_id not between", value1, value2, "healthMgrId");
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