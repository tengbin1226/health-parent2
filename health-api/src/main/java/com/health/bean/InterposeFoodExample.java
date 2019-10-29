package com.health.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterposeFoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterposeFoodExample() {
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

        public Criteria andEatTimesIsNull() {
            addCriterion("eat_times is null");
            return (Criteria) this;
        }

        public Criteria andEatTimesIsNotNull() {
            addCriterion("eat_times is not null");
            return (Criteria) this;
        }

        public Criteria andEatTimesEqualTo(Integer value) {
            addCriterion("eat_times =", value, "eatTimes");
            return (Criteria) this;
        }

        public Criteria andEatTimesNotEqualTo(Integer value) {
            addCriterion("eat_times <>", value, "eatTimes");
            return (Criteria) this;
        }

        public Criteria andEatTimesGreaterThan(Integer value) {
            addCriterion("eat_times >", value, "eatTimes");
            return (Criteria) this;
        }

        public Criteria andEatTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("eat_times >=", value, "eatTimes");
            return (Criteria) this;
        }

        public Criteria andEatTimesLessThan(Integer value) {
            addCriterion("eat_times <", value, "eatTimes");
            return (Criteria) this;
        }

        public Criteria andEatTimesLessThanOrEqualTo(Integer value) {
            addCriterion("eat_times <=", value, "eatTimes");
            return (Criteria) this;
        }

        public Criteria andEatTimesIn(List<Integer> values) {
            addCriterion("eat_times in", values, "eatTimes");
            return (Criteria) this;
        }

        public Criteria andEatTimesNotIn(List<Integer> values) {
            addCriterion("eat_times not in", values, "eatTimes");
            return (Criteria) this;
        }

        public Criteria andEatTimesBetween(Integer value1, Integer value2) {
            addCriterion("eat_times between", value1, value2, "eatTimes");
            return (Criteria) this;
        }

        public Criteria andEatTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("eat_times not between", value1, value2, "eatTimes");
            return (Criteria) this;
        }

        public Criteria andRecommendFoodIsNull() {
            addCriterion("recommend_food is null");
            return (Criteria) this;
        }

        public Criteria andRecommendFoodIsNotNull() {
            addCriterion("recommend_food is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendFoodEqualTo(String value) {
            addCriterion("recommend_food =", value, "recommendFood");
            return (Criteria) this;
        }

        public Criteria andRecommendFoodNotEqualTo(String value) {
            addCriterion("recommend_food <>", value, "recommendFood");
            return (Criteria) this;
        }

        public Criteria andRecommendFoodGreaterThan(String value) {
            addCriterion("recommend_food >", value, "recommendFood");
            return (Criteria) this;
        }

        public Criteria andRecommendFoodGreaterThanOrEqualTo(String value) {
            addCriterion("recommend_food >=", value, "recommendFood");
            return (Criteria) this;
        }

        public Criteria andRecommendFoodLessThan(String value) {
            addCriterion("recommend_food <", value, "recommendFood");
            return (Criteria) this;
        }

        public Criteria andRecommendFoodLessThanOrEqualTo(String value) {
            addCriterion("recommend_food <=", value, "recommendFood");
            return (Criteria) this;
        }

        public Criteria andRecommendFoodLike(String value) {
            addCriterion("recommend_food like", value, "recommendFood");
            return (Criteria) this;
        }

        public Criteria andRecommendFoodNotLike(String value) {
            addCriterion("recommend_food not like", value, "recommendFood");
            return (Criteria) this;
        }

        public Criteria andRecommendFoodIn(List<String> values) {
            addCriterion("recommend_food in", values, "recommendFood");
            return (Criteria) this;
        }

        public Criteria andRecommendFoodNotIn(List<String> values) {
            addCriterion("recommend_food not in", values, "recommendFood");
            return (Criteria) this;
        }

        public Criteria andRecommendFoodBetween(String value1, String value2) {
            addCriterion("recommend_food between", value1, value2, "recommendFood");
            return (Criteria) this;
        }

        public Criteria andRecommendFoodNotBetween(String value1, String value2) {
            addCriterion("recommend_food not between", value1, value2, "recommendFood");
            return (Criteria) this;
        }

        public Criteria andFoodQuantityIsNull() {
            addCriterion("food_quantity is null");
            return (Criteria) this;
        }

        public Criteria andFoodQuantityIsNotNull() {
            addCriterion("food_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andFoodQuantityEqualTo(Float value) {
            addCriterion("food_quantity =", value, "foodQuantity");
            return (Criteria) this;
        }

        public Criteria andFoodQuantityNotEqualTo(Float value) {
            addCriterion("food_quantity <>", value, "foodQuantity");
            return (Criteria) this;
        }

        public Criteria andFoodQuantityGreaterThan(Float value) {
            addCriterion("food_quantity >", value, "foodQuantity");
            return (Criteria) this;
        }

        public Criteria andFoodQuantityGreaterThanOrEqualTo(Float value) {
            addCriterion("food_quantity >=", value, "foodQuantity");
            return (Criteria) this;
        }

        public Criteria andFoodQuantityLessThan(Float value) {
            addCriterion("food_quantity <", value, "foodQuantity");
            return (Criteria) this;
        }

        public Criteria andFoodQuantityLessThanOrEqualTo(Float value) {
            addCriterion("food_quantity <=", value, "foodQuantity");
            return (Criteria) this;
        }

        public Criteria andFoodQuantityIn(List<Float> values) {
            addCriterion("food_quantity in", values, "foodQuantity");
            return (Criteria) this;
        }

        public Criteria andFoodQuantityNotIn(List<Float> values) {
            addCriterion("food_quantity not in", values, "foodQuantity");
            return (Criteria) this;
        }

        public Criteria andFoodQuantityBetween(Float value1, Float value2) {
            addCriterion("food_quantity between", value1, value2, "foodQuantity");
            return (Criteria) this;
        }

        public Criteria andFoodQuantityNotBetween(Float value1, Float value2) {
            addCriterion("food_quantity not between", value1, value2, "foodQuantity");
            return (Criteria) this;
        }

        public Criteria andAdiIsNull() {
            addCriterion("adi is null");
            return (Criteria) this;
        }

        public Criteria andAdiIsNotNull() {
            addCriterion("adi is not null");
            return (Criteria) this;
        }

        public Criteria andAdiEqualTo(Float value) {
            addCriterion("adi =", value, "adi");
            return (Criteria) this;
        }

        public Criteria andAdiNotEqualTo(Float value) {
            addCriterion("adi <>", value, "adi");
            return (Criteria) this;
        }

        public Criteria andAdiGreaterThan(Float value) {
            addCriterion("adi >", value, "adi");
            return (Criteria) this;
        }

        public Criteria andAdiGreaterThanOrEqualTo(Float value) {
            addCriterion("adi >=", value, "adi");
            return (Criteria) this;
        }

        public Criteria andAdiLessThan(Float value) {
            addCriterion("adi <", value, "adi");
            return (Criteria) this;
        }

        public Criteria andAdiLessThanOrEqualTo(Float value) {
            addCriterion("adi <=", value, "adi");
            return (Criteria) this;
        }

        public Criteria andAdiIn(List<Float> values) {
            addCriterion("adi in", values, "adi");
            return (Criteria) this;
        }

        public Criteria andAdiNotIn(List<Float> values) {
            addCriterion("adi not in", values, "adi");
            return (Criteria) this;
        }

        public Criteria andAdiBetween(Float value1, Float value2) {
            addCriterion("adi between", value1, value2, "adi");
            return (Criteria) this;
        }

        public Criteria andAdiNotBetween(Float value1, Float value2) {
            addCriterion("adi not between", value1, value2, "adi");
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