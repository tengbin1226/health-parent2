package com.health.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SportsItemLibraryExample implements Serializable {

    private static final long serialVersionUID = 2096332456271554736L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SportsItemLibraryExample() {
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

        public Criteria andStrengthIsNull() {
            addCriterion("strength is null");
            return (Criteria) this;
        }

        public Criteria andStrengthIsNotNull() {
            addCriterion("strength is not null");
            return (Criteria) this;
        }

        public Criteria andStrengthEqualTo(String value) {
            addCriterion("strength =", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthNotEqualTo(String value) {
            addCriterion("strength <>", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthGreaterThan(String value) {
            addCriterion("strength >", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthGreaterThanOrEqualTo(String value) {
            addCriterion("strength >=", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthLessThan(String value) {
            addCriterion("strength <", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthLessThanOrEqualTo(String value) {
            addCriterion("strength <=", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthLike(String value) {
            addCriterion("strength like", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthNotLike(String value) {
            addCriterion("strength not like", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthIn(List<String> values) {
            addCriterion("strength in", values, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthNotIn(List<String> values) {
            addCriterion("strength not in", values, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthBetween(String value1, String value2) {
            addCriterion("strength between", value1, value2, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthNotBetween(String value1, String value2) {
            addCriterion("strength not between", value1, value2, "strength");
            return (Criteria) this;
        }

        public Criteria andThousandStepEquivalentIsNull() {
            addCriterion("thousand_step_equivalent is null");
            return (Criteria) this;
        }

        public Criteria andThousandStepEquivalentIsNotNull() {
            addCriterion("thousand_step_equivalent is not null");
            return (Criteria) this;
        }

        public Criteria andThousandStepEquivalentEqualTo(Integer value) {
            addCriterion("thousand_step_equivalent =", value, "thousandStepEquivalent");
            return (Criteria) this;
        }

        public Criteria andThousandStepEquivalentNotEqualTo(Integer value) {
            addCriterion("thousand_step_equivalent <>", value, "thousandStepEquivalent");
            return (Criteria) this;
        }

        public Criteria andThousandStepEquivalentGreaterThan(Integer value) {
            addCriterion("thousand_step_equivalent >", value, "thousandStepEquivalent");
            return (Criteria) this;
        }

        public Criteria andThousandStepEquivalentGreaterThanOrEqualTo(Integer value) {
            addCriterion("thousand_step_equivalent >=", value, "thousandStepEquivalent");
            return (Criteria) this;
        }

        public Criteria andThousandStepEquivalentLessThan(Integer value) {
            addCriterion("thousand_step_equivalent <", value, "thousandStepEquivalent");
            return (Criteria) this;
        }

        public Criteria andThousandStepEquivalentLessThanOrEqualTo(Integer value) {
            addCriterion("thousand_step_equivalent <=", value, "thousandStepEquivalent");
            return (Criteria) this;
        }

        public Criteria andThousandStepEquivalentIn(List<Integer> values) {
            addCriterion("thousand_step_equivalent in", values, "thousandStepEquivalent");
            return (Criteria) this;
        }

        public Criteria andThousandStepEquivalentNotIn(List<Integer> values) {
            addCriterion("thousand_step_equivalent not in", values, "thousandStepEquivalent");
            return (Criteria) this;
        }

        public Criteria andThousandStepEquivalentBetween(Integer value1, Integer value2) {
            addCriterion("thousand_step_equivalent between", value1, value2, "thousandStepEquivalent");
            return (Criteria) this;
        }

        public Criteria andThousandStepEquivalentNotBetween(Integer value1, Integer value2) {
            addCriterion("thousand_step_equivalent not between", value1, value2, "thousandStepEquivalent");
            return (Criteria) this;
        }

        public Criteria andMovementTimeIsNull() {
            addCriterion("movement_time is null");
            return (Criteria) this;
        }

        public Criteria andMovementTimeIsNotNull() {
            addCriterion("movement_time is not null");
            return (Criteria) this;
        }

        public Criteria andMovementTimeEqualTo(Integer value) {
            addCriterion("movement_time =", value, "movementTime");
            return (Criteria) this;
        }

        public Criteria andMovementTimeNotEqualTo(Integer value) {
            addCriterion("movement_time <>", value, "movementTime");
            return (Criteria) this;
        }

        public Criteria andMovementTimeGreaterThan(Integer value) {
            addCriterion("movement_time >", value, "movementTime");
            return (Criteria) this;
        }

        public Criteria andMovementTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("movement_time >=", value, "movementTime");
            return (Criteria) this;
        }

        public Criteria andMovementTimeLessThan(Integer value) {
            addCriterion("movement_time <", value, "movementTime");
            return (Criteria) this;
        }

        public Criteria andMovementTimeLessThanOrEqualTo(Integer value) {
            addCriterion("movement_time <=", value, "movementTime");
            return (Criteria) this;
        }

        public Criteria andMovementTimeIn(List<Integer> values) {
            addCriterion("movement_time in", values, "movementTime");
            return (Criteria) this;
        }

        public Criteria andMovementTimeNotIn(List<Integer> values) {
            addCriterion("movement_time not in", values, "movementTime");
            return (Criteria) this;
        }

        public Criteria andMovementTimeBetween(Integer value1, Integer value2) {
            addCriterion("movement_time between", value1, value2, "movementTime");
            return (Criteria) this;
        }

        public Criteria andMovementTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("movement_time not between", value1, value2, "movementTime");
            return (Criteria) this;
        }

        public Criteria andMinageIsNull() {
            addCriterion("minAge is null");
            return (Criteria) this;
        }

        public Criteria andMinageIsNotNull() {
            addCriterion("minAge is not null");
            return (Criteria) this;
        }

        public Criteria andMinageEqualTo(Integer value) {
            addCriterion("minAge =", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageNotEqualTo(Integer value) {
            addCriterion("minAge <>", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageGreaterThan(Integer value) {
            addCriterion("minAge >", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageGreaterThanOrEqualTo(Integer value) {
            addCriterion("minAge >=", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageLessThan(Integer value) {
            addCriterion("minAge <", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageLessThanOrEqualTo(Integer value) {
            addCriterion("minAge <=", value, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageIn(List<Integer> values) {
            addCriterion("minAge in", values, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageNotIn(List<Integer> values) {
            addCriterion("minAge not in", values, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageBetween(Integer value1, Integer value2) {
            addCriterion("minAge between", value1, value2, "minage");
            return (Criteria) this;
        }

        public Criteria andMinageNotBetween(Integer value1, Integer value2) {
            addCriterion("minAge not between", value1, value2, "minage");
            return (Criteria) this;
        }

        public Criteria andMaxageIsNull() {
            addCriterion("maxAge is null");
            return (Criteria) this;
        }

        public Criteria andMaxageIsNotNull() {
            addCriterion("maxAge is not null");
            return (Criteria) this;
        }

        public Criteria andMaxageEqualTo(Integer value) {
            addCriterion("maxAge =", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageNotEqualTo(Integer value) {
            addCriterion("maxAge <>", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageGreaterThan(Integer value) {
            addCriterion("maxAge >", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxAge >=", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageLessThan(Integer value) {
            addCriterion("maxAge <", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageLessThanOrEqualTo(Integer value) {
            addCriterion("maxAge <=", value, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageIn(List<Integer> values) {
            addCriterion("maxAge in", values, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageNotIn(List<Integer> values) {
            addCriterion("maxAge not in", values, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageBetween(Integer value1, Integer value2) {
            addCriterion("maxAge between", value1, value2, "maxage");
            return (Criteria) this;
        }

        public Criteria andMaxageNotBetween(Integer value1, Integer value2) {
            addCriterion("maxAge not between", value1, value2, "maxage");
            return (Criteria) this;
        }

        public Criteria andApplyToGenderIsNull() {
            addCriterion("apply_to_gender is null");
            return (Criteria) this;
        }

        public Criteria andApplyToGenderIsNotNull() {
            addCriterion("apply_to_gender is not null");
            return (Criteria) this;
        }

        public Criteria andApplyToGenderEqualTo(Integer value) {
            addCriterion("apply_to_gender =", value, "applyToGender");
            return (Criteria) this;
        }

        public Criteria andApplyToGenderNotEqualTo(Integer value) {
            addCriterion("apply_to_gender <>", value, "applyToGender");
            return (Criteria) this;
        }

        public Criteria andApplyToGenderGreaterThan(Integer value) {
            addCriterion("apply_to_gender >", value, "applyToGender");
            return (Criteria) this;
        }

        public Criteria andApplyToGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_to_gender >=", value, "applyToGender");
            return (Criteria) this;
        }

        public Criteria andApplyToGenderLessThan(Integer value) {
            addCriterion("apply_to_gender <", value, "applyToGender");
            return (Criteria) this;
        }

        public Criteria andApplyToGenderLessThanOrEqualTo(Integer value) {
            addCriterion("apply_to_gender <=", value, "applyToGender");
            return (Criteria) this;
        }

        public Criteria andApplyToGenderIn(List<Integer> values) {
            addCriterion("apply_to_gender in", values, "applyToGender");
            return (Criteria) this;
        }

        public Criteria andApplyToGenderNotIn(List<Integer> values) {
            addCriterion("apply_to_gender not in", values, "applyToGender");
            return (Criteria) this;
        }

        public Criteria andApplyToGenderBetween(Integer value1, Integer value2) {
            addCriterion("apply_to_gender between", value1, value2, "applyToGender");
            return (Criteria) this;
        }

        public Criteria andApplyToGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_to_gender not between", value1, value2, "applyToGender");
            return (Criteria) this;
        }

        public Criteria andTensilePartsIsNull() {
            addCriterion("tensile_parts is null");
            return (Criteria) this;
        }

        public Criteria andTensilePartsIsNotNull() {
            addCriterion("tensile_parts is not null");
            return (Criteria) this;
        }

        public Criteria andTensilePartsEqualTo(String value) {
            addCriterion("tensile_parts =", value, "tensileParts");
            return (Criteria) this;
        }

        public Criteria andTensilePartsNotEqualTo(String value) {
            addCriterion("tensile_parts <>", value, "tensileParts");
            return (Criteria) this;
        }

        public Criteria andTensilePartsGreaterThan(String value) {
            addCriterion("tensile_parts >", value, "tensileParts");
            return (Criteria) this;
        }

        public Criteria andTensilePartsGreaterThanOrEqualTo(String value) {
            addCriterion("tensile_parts >=", value, "tensileParts");
            return (Criteria) this;
        }

        public Criteria andTensilePartsLessThan(String value) {
            addCriterion("tensile_parts <", value, "tensileParts");
            return (Criteria) this;
        }

        public Criteria andTensilePartsLessThanOrEqualTo(String value) {
            addCriterion("tensile_parts <=", value, "tensileParts");
            return (Criteria) this;
        }

        public Criteria andTensilePartsLike(String value) {
            addCriterion("tensile_parts like", value, "tensileParts");
            return (Criteria) this;
        }

        public Criteria andTensilePartsNotLike(String value) {
            addCriterion("tensile_parts not like", value, "tensileParts");
            return (Criteria) this;
        }

        public Criteria andTensilePartsIn(List<String> values) {
            addCriterion("tensile_parts in", values, "tensileParts");
            return (Criteria) this;
        }

        public Criteria andTensilePartsNotIn(List<String> values) {
            addCriterion("tensile_parts not in", values, "tensileParts");
            return (Criteria) this;
        }

        public Criteria andTensilePartsBetween(String value1, String value2) {
            addCriterion("tensile_parts between", value1, value2, "tensileParts");
            return (Criteria) this;
        }

        public Criteria andTensilePartsNotBetween(String value1, String value2) {
            addCriterion("tensile_parts not between", value1, value2, "tensileParts");
            return (Criteria) this;
        }

        public Criteria andActionMethodIsNull() {
            addCriterion("action_method is null");
            return (Criteria) this;
        }

        public Criteria andActionMethodIsNotNull() {
            addCriterion("action_method is not null");
            return (Criteria) this;
        }

        public Criteria andActionMethodEqualTo(String value) {
            addCriterion("action_method =", value, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodNotEqualTo(String value) {
            addCriterion("action_method <>", value, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodGreaterThan(String value) {
            addCriterion("action_method >", value, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodGreaterThanOrEqualTo(String value) {
            addCriterion("action_method >=", value, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodLessThan(String value) {
            addCriterion("action_method <", value, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodLessThanOrEqualTo(String value) {
            addCriterion("action_method <=", value, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodLike(String value) {
            addCriterion("action_method like", value, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodNotLike(String value) {
            addCriterion("action_method not like", value, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodIn(List<String> values) {
            addCriterion("action_method in", values, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodNotIn(List<String> values) {
            addCriterion("action_method not in", values, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodBetween(String value1, String value2) {
            addCriterion("action_method between", value1, value2, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andActionMethodNotBetween(String value1, String value2) {
            addCriterion("action_method not between", value1, value2, "actionMethod");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
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