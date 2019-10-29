package com.health.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MenuPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuPermissionExample() {
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

        public Criteria andTMenuIdIsNull() {
            addCriterion("t_menu_id is null");
            return (Criteria) this;
        }

        public Criteria andTMenuIdIsNotNull() {
            addCriterion("t_menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andTMenuIdEqualTo(Integer value) {
            addCriterion("t_menu_id =", value, "tMenuId");
            return (Criteria) this;
        }

        public Criteria andTMenuIdNotEqualTo(Integer value) {
            addCriterion("t_menu_id <>", value, "tMenuId");
            return (Criteria) this;
        }

        public Criteria andTMenuIdGreaterThan(Integer value) {
            addCriterion("t_menu_id >", value, "tMenuId");
            return (Criteria) this;
        }

        public Criteria andTMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_menu_id >=", value, "tMenuId");
            return (Criteria) this;
        }

        public Criteria andTMenuIdLessThan(Integer value) {
            addCriterion("t_menu_id <", value, "tMenuId");
            return (Criteria) this;
        }

        public Criteria andTMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_menu_id <=", value, "tMenuId");
            return (Criteria) this;
        }

        public Criteria andTMenuIdIn(List<Integer> values) {
            addCriterion("t_menu_id in", values, "tMenuId");
            return (Criteria) this;
        }

        public Criteria andTMenuIdNotIn(List<Integer> values) {
            addCriterion("t_menu_id not in", values, "tMenuId");
            return (Criteria) this;
        }

        public Criteria andTMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("t_menu_id between", value1, value2, "tMenuId");
            return (Criteria) this;
        }

        public Criteria andTMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_menu_id not between", value1, value2, "tMenuId");
            return (Criteria) this;
        }

        public Criteria andTPermissionIdIsNull() {
            addCriterion("t_permission_id is null");
            return (Criteria) this;
        }

        public Criteria andTPermissionIdIsNotNull() {
            addCriterion("t_permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andTPermissionIdEqualTo(Integer value) {
            addCriterion("t_permission_id =", value, "tPermissionId");
            return (Criteria) this;
        }

        public Criteria andTPermissionIdNotEqualTo(Integer value) {
            addCriterion("t_permission_id <>", value, "tPermissionId");
            return (Criteria) this;
        }

        public Criteria andTPermissionIdGreaterThan(Integer value) {
            addCriterion("t_permission_id >", value, "tPermissionId");
            return (Criteria) this;
        }

        public Criteria andTPermissionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_permission_id >=", value, "tPermissionId");
            return (Criteria) this;
        }

        public Criteria andTPermissionIdLessThan(Integer value) {
            addCriterion("t_permission_id <", value, "tPermissionId");
            return (Criteria) this;
        }

        public Criteria andTPermissionIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_permission_id <=", value, "tPermissionId");
            return (Criteria) this;
        }

        public Criteria andTPermissionIdIn(List<Integer> values) {
            addCriterion("t_permission_id in", values, "tPermissionId");
            return (Criteria) this;
        }

        public Criteria andTPermissionIdNotIn(List<Integer> values) {
            addCriterion("t_permission_id not in", values, "tPermissionId");
            return (Criteria) this;
        }

        public Criteria andTPermissionIdBetween(Integer value1, Integer value2) {
            addCriterion("t_permission_id between", value1, value2, "tPermissionId");
            return (Criteria) this;
        }

        public Criteria andTPermissionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_permission_id not between", value1, value2, "tPermissionId");
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