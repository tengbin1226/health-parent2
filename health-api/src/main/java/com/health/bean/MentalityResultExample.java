package com.health.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MentalityResultExample implements Serializable {

    private static final long serialVersionUID = -6718755864635905495L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MentalityResultExample() {
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

        public Criteria andTOcdIsNull() {
            addCriterion("t_ocd is null");
            return (Criteria) this;
        }

        public Criteria andTOcdIsNotNull() {
            addCriterion("t_ocd is not null");
            return (Criteria) this;
        }

        public Criteria andTOcdEqualTo(Integer value) {
            addCriterion("t_ocd =", value, "tOcd");
            return (Criteria) this;
        }

        public Criteria andTOcdNotEqualTo(Integer value) {
            addCriterion("t_ocd <>", value, "tOcd");
            return (Criteria) this;
        }

        public Criteria andTOcdGreaterThan(Integer value) {
            addCriterion("t_ocd >", value, "tOcd");
            return (Criteria) this;
        }

        public Criteria andTOcdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_ocd >=", value, "tOcd");
            return (Criteria) this;
        }

        public Criteria andTOcdLessThan(Integer value) {
            addCriterion("t_ocd <", value, "tOcd");
            return (Criteria) this;
        }

        public Criteria andTOcdLessThanOrEqualTo(Integer value) {
            addCriterion("t_ocd <=", value, "tOcd");
            return (Criteria) this;
        }

        public Criteria andTOcdIn(List<Integer> values) {
            addCriterion("t_ocd in", values, "tOcd");
            return (Criteria) this;
        }

        public Criteria andTOcdNotIn(List<Integer> values) {
            addCriterion("t_ocd not in", values, "tOcd");
            return (Criteria) this;
        }

        public Criteria andTOcdBetween(Integer value1, Integer value2) {
            addCriterion("t_ocd between", value1, value2, "tOcd");
            return (Criteria) this;
        }

        public Criteria andTOcdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_ocd not between", value1, value2, "tOcd");
            return (Criteria) this;
        }

        public Criteria andTAnxietyIsNull() {
            addCriterion("t_anxiety is null");
            return (Criteria) this;
        }

        public Criteria andTAnxietyIsNotNull() {
            addCriterion("t_anxiety is not null");
            return (Criteria) this;
        }

        public Criteria andTAnxietyEqualTo(Integer value) {
            addCriterion("t_anxiety =", value, "tAnxiety");
            return (Criteria) this;
        }

        public Criteria andTAnxietyNotEqualTo(Integer value) {
            addCriterion("t_anxiety <>", value, "tAnxiety");
            return (Criteria) this;
        }

        public Criteria andTAnxietyGreaterThan(Integer value) {
            addCriterion("t_anxiety >", value, "tAnxiety");
            return (Criteria) this;
        }

        public Criteria andTAnxietyGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_anxiety >=", value, "tAnxiety");
            return (Criteria) this;
        }

        public Criteria andTAnxietyLessThan(Integer value) {
            addCriterion("t_anxiety <", value, "tAnxiety");
            return (Criteria) this;
        }

        public Criteria andTAnxietyLessThanOrEqualTo(Integer value) {
            addCriterion("t_anxiety <=", value, "tAnxiety");
            return (Criteria) this;
        }

        public Criteria andTAnxietyIn(List<Integer> values) {
            addCriterion("t_anxiety in", values, "tAnxiety");
            return (Criteria) this;
        }

        public Criteria andTAnxietyNotIn(List<Integer> values) {
            addCriterion("t_anxiety not in", values, "tAnxiety");
            return (Criteria) this;
        }

        public Criteria andTAnxietyBetween(Integer value1, Integer value2) {
            addCriterion("t_anxiety between", value1, value2, "tAnxiety");
            return (Criteria) this;
        }

        public Criteria andTAnxietyNotBetween(Integer value1, Integer value2) {
            addCriterion("t_anxiety not between", value1, value2, "tAnxiety");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTTerrorIsNull() {
            addCriterion("t_terror is null");
            return (Criteria) this;
        }

        public Criteria andTTerrorIsNotNull() {
            addCriterion("t_terror is not null");
            return (Criteria) this;
        }

        public Criteria andTTerrorEqualTo(Integer value) {
            addCriterion("t_terror =", value, "tTerror");
            return (Criteria) this;
        }

        public Criteria andTTerrorNotEqualTo(Integer value) {
            addCriterion("t_terror <>", value, "tTerror");
            return (Criteria) this;
        }

        public Criteria andTTerrorGreaterThan(Integer value) {
            addCriterion("t_terror >", value, "tTerror");
            return (Criteria) this;
        }

        public Criteria andTTerrorGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_terror >=", value, "tTerror");
            return (Criteria) this;
        }

        public Criteria andTTerrorLessThan(Integer value) {
            addCriterion("t_terror <", value, "tTerror");
            return (Criteria) this;
        }

        public Criteria andTTerrorLessThanOrEqualTo(Integer value) {
            addCriterion("t_terror <=", value, "tTerror");
            return (Criteria) this;
        }

        public Criteria andTTerrorIn(List<Integer> values) {
            addCriterion("t_terror in", values, "tTerror");
            return (Criteria) this;
        }

        public Criteria andTTerrorNotIn(List<Integer> values) {
            addCriterion("t_terror not in", values, "tTerror");
            return (Criteria) this;
        }

        public Criteria andTTerrorBetween(Integer value1, Integer value2) {
            addCriterion("t_terror between", value1, value2, "tTerror");
            return (Criteria) this;
        }

        public Criteria andTTerrorNotBetween(Integer value1, Integer value2) {
            addCriterion("t_terror not between", value1, value2, "tTerror");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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