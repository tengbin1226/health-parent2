package com.health.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterposeSprotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterposeSprotExample() {
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

        public Criteria andSportNameIsNull() {
            addCriterion("sport_name is null");
            return (Criteria) this;
        }

        public Criteria andSportNameIsNotNull() {
            addCriterion("sport_name is not null");
            return (Criteria) this;
        }

        public Criteria andSportNameEqualTo(String value) {
            addCriterion("sport_name =", value, "sportName");
            return (Criteria) this;
        }

        public Criteria andSportNameNotEqualTo(String value) {
            addCriterion("sport_name <>", value, "sportName");
            return (Criteria) this;
        }

        public Criteria andSportNameGreaterThan(String value) {
            addCriterion("sport_name >", value, "sportName");
            return (Criteria) this;
        }

        public Criteria andSportNameGreaterThanOrEqualTo(String value) {
            addCriterion("sport_name >=", value, "sportName");
            return (Criteria) this;
        }

        public Criteria andSportNameLessThan(String value) {
            addCriterion("sport_name <", value, "sportName");
            return (Criteria) this;
        }

        public Criteria andSportNameLessThanOrEqualTo(String value) {
            addCriterion("sport_name <=", value, "sportName");
            return (Criteria) this;
        }

        public Criteria andSportNameLike(String value) {
            addCriterion("sport_name like", value, "sportName");
            return (Criteria) this;
        }

        public Criteria andSportNameNotLike(String value) {
            addCriterion("sport_name not like", value, "sportName");
            return (Criteria) this;
        }

        public Criteria andSportNameIn(List<String> values) {
            addCriterion("sport_name in", values, "sportName");
            return (Criteria) this;
        }

        public Criteria andSportNameNotIn(List<String> values) {
            addCriterion("sport_name not in", values, "sportName");
            return (Criteria) this;
        }

        public Criteria andSportNameBetween(String value1, String value2) {
            addCriterion("sport_name between", value1, value2, "sportName");
            return (Criteria) this;
        }

        public Criteria andSportNameNotBetween(String value1, String value2) {
            addCriterion("sport_name not between", value1, value2, "sportName");
            return (Criteria) this;
        }

        public Criteria andSportTimeIsNull() {
            addCriterion("sport_time is null");
            return (Criteria) this;
        }

        public Criteria andSportTimeIsNotNull() {
            addCriterion("sport_time is not null");
            return (Criteria) this;
        }

        public Criteria andSportTimeEqualTo(Integer value) {
            addCriterion("sport_time =", value, "sportTime");
            return (Criteria) this;
        }

        public Criteria andSportTimeNotEqualTo(Integer value) {
            addCriterion("sport_time <>", value, "sportTime");
            return (Criteria) this;
        }

        public Criteria andSportTimeGreaterThan(Integer value) {
            addCriterion("sport_time >", value, "sportTime");
            return (Criteria) this;
        }

        public Criteria andSportTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sport_time >=", value, "sportTime");
            return (Criteria) this;
        }

        public Criteria andSportTimeLessThan(Integer value) {
            addCriterion("sport_time <", value, "sportTime");
            return (Criteria) this;
        }

        public Criteria andSportTimeLessThanOrEqualTo(Integer value) {
            addCriterion("sport_time <=", value, "sportTime");
            return (Criteria) this;
        }

        public Criteria andSportTimeIn(List<Integer> values) {
            addCriterion("sport_time in", values, "sportTime");
            return (Criteria) this;
        }

        public Criteria andSportTimeNotIn(List<Integer> values) {
            addCriterion("sport_time not in", values, "sportTime");
            return (Criteria) this;
        }

        public Criteria andSportTimeBetween(Integer value1, Integer value2) {
            addCriterion("sport_time between", value1, value2, "sportTime");
            return (Criteria) this;
        }

        public Criteria andSportTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("sport_time not between", value1, value2, "sportTime");
            return (Criteria) this;
        }

        public Criteria andSportCycleIsNull() {
            addCriterion("sport_cycle is null");
            return (Criteria) this;
        }

        public Criteria andSportCycleIsNotNull() {
            addCriterion("sport_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andSportCycleEqualTo(String value) {
            addCriterion("sport_cycle =", value, "sportCycle");
            return (Criteria) this;
        }

        public Criteria andSportCycleNotEqualTo(String value) {
            addCriterion("sport_cycle <>", value, "sportCycle");
            return (Criteria) this;
        }

        public Criteria andSportCycleGreaterThan(String value) {
            addCriterion("sport_cycle >", value, "sportCycle");
            return (Criteria) this;
        }

        public Criteria andSportCycleGreaterThanOrEqualTo(String value) {
            addCriterion("sport_cycle >=", value, "sportCycle");
            return (Criteria) this;
        }

        public Criteria andSportCycleLessThan(String value) {
            addCriterion("sport_cycle <", value, "sportCycle");
            return (Criteria) this;
        }

        public Criteria andSportCycleLessThanOrEqualTo(String value) {
            addCriterion("sport_cycle <=", value, "sportCycle");
            return (Criteria) this;
        }

        public Criteria andSportCycleLike(String value) {
            addCriterion("sport_cycle like", value, "sportCycle");
            return (Criteria) this;
        }

        public Criteria andSportCycleNotLike(String value) {
            addCriterion("sport_cycle not like", value, "sportCycle");
            return (Criteria) this;
        }

        public Criteria andSportCycleIn(List<String> values) {
            addCriterion("sport_cycle in", values, "sportCycle");
            return (Criteria) this;
        }

        public Criteria andSportCycleNotIn(List<String> values) {
            addCriterion("sport_cycle not in", values, "sportCycle");
            return (Criteria) this;
        }

        public Criteria andSportCycleBetween(String value1, String value2) {
            addCriterion("sport_cycle between", value1, value2, "sportCycle");
            return (Criteria) this;
        }

        public Criteria andSportCycleNotBetween(String value1, String value2) {
            addCriterion("sport_cycle not between", value1, value2, "sportCycle");
            return (Criteria) this;
        }

        public Criteria andConsumeCountIsNull() {
            addCriterion("consume_count is null");
            return (Criteria) this;
        }

        public Criteria andConsumeCountIsNotNull() {
            addCriterion("consume_count is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeCountEqualTo(Integer value) {
            addCriterion("consume_count =", value, "consumeCount");
            return (Criteria) this;
        }

        public Criteria andConsumeCountNotEqualTo(Integer value) {
            addCriterion("consume_count <>", value, "consumeCount");
            return (Criteria) this;
        }

        public Criteria andConsumeCountGreaterThan(Integer value) {
            addCriterion("consume_count >", value, "consumeCount");
            return (Criteria) this;
        }

        public Criteria andConsumeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("consume_count >=", value, "consumeCount");
            return (Criteria) this;
        }

        public Criteria andConsumeCountLessThan(Integer value) {
            addCriterion("consume_count <", value, "consumeCount");
            return (Criteria) this;
        }

        public Criteria andConsumeCountLessThanOrEqualTo(Integer value) {
            addCriterion("consume_count <=", value, "consumeCount");
            return (Criteria) this;
        }

        public Criteria andConsumeCountIn(List<Integer> values) {
            addCriterion("consume_count in", values, "consumeCount");
            return (Criteria) this;
        }

        public Criteria andConsumeCountNotIn(List<Integer> values) {
            addCriterion("consume_count not in", values, "consumeCount");
            return (Criteria) this;
        }

        public Criteria andConsumeCountBetween(Integer value1, Integer value2) {
            addCriterion("consume_count between", value1, value2, "consumeCount");
            return (Criteria) this;
        }

        public Criteria andConsumeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("consume_count not between", value1, value2, "consumeCount");
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