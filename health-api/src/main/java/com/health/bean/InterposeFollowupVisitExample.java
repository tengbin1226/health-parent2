package com.health.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterposeFollowupVisitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterposeFollowupVisitExample() {
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

        public Criteria andInterposeNameIsNull() {
            addCriterion("interpose_name is null");
            return (Criteria) this;
        }

        public Criteria andInterposeNameIsNotNull() {
            addCriterion("interpose_name is not null");
            return (Criteria) this;
        }

        public Criteria andInterposeNameEqualTo(String value) {
            addCriterion("interpose_name =", value, "interposeName");
            return (Criteria) this;
        }

        public Criteria andInterposeNameNotEqualTo(String value) {
            addCriterion("interpose_name <>", value, "interposeName");
            return (Criteria) this;
        }

        public Criteria andInterposeNameGreaterThan(String value) {
            addCriterion("interpose_name >", value, "interposeName");
            return (Criteria) this;
        }

        public Criteria andInterposeNameGreaterThanOrEqualTo(String value) {
            addCriterion("interpose_name >=", value, "interposeName");
            return (Criteria) this;
        }

        public Criteria andInterposeNameLessThan(String value) {
            addCriterion("interpose_name <", value, "interposeName");
            return (Criteria) this;
        }

        public Criteria andInterposeNameLessThanOrEqualTo(String value) {
            addCriterion("interpose_name <=", value, "interposeName");
            return (Criteria) this;
        }

        public Criteria andInterposeNameLike(String value) {
            addCriterion("interpose_name like", value, "interposeName");
            return (Criteria) this;
        }

        public Criteria andInterposeNameNotLike(String value) {
            addCriterion("interpose_name not like", value, "interposeName");
            return (Criteria) this;
        }

        public Criteria andInterposeNameIn(List<String> values) {
            addCriterion("interpose_name in", values, "interposeName");
            return (Criteria) this;
        }

        public Criteria andInterposeNameNotIn(List<String> values) {
            addCriterion("interpose_name not in", values, "interposeName");
            return (Criteria) this;
        }

        public Criteria andInterposeNameBetween(String value1, String value2) {
            addCriterion("interpose_name between", value1, value2, "interposeName");
            return (Criteria) this;
        }

        public Criteria andInterposeNameNotBetween(String value1, String value2) {
            addCriterion("interpose_name not between", value1, value2, "interposeName");
            return (Criteria) this;
        }

        public Criteria andFilenumberIsNull() {
            addCriterion("fileNumber is null");
            return (Criteria) this;
        }

        public Criteria andFilenumberIsNotNull() {
            addCriterion("fileNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFilenumberEqualTo(String value) {
            addCriterion("fileNumber =", value, "filenumber");
            return (Criteria) this;
        }

        public Criteria andFilenumberNotEqualTo(String value) {
            addCriterion("fileNumber <>", value, "filenumber");
            return (Criteria) this;
        }

        public Criteria andFilenumberGreaterThan(String value) {
            addCriterion("fileNumber >", value, "filenumber");
            return (Criteria) this;
        }

        public Criteria andFilenumberGreaterThanOrEqualTo(String value) {
            addCriterion("fileNumber >=", value, "filenumber");
            return (Criteria) this;
        }

        public Criteria andFilenumberLessThan(String value) {
            addCriterion("fileNumber <", value, "filenumber");
            return (Criteria) this;
        }

        public Criteria andFilenumberLessThanOrEqualTo(String value) {
            addCriterion("fileNumber <=", value, "filenumber");
            return (Criteria) this;
        }

        public Criteria andFilenumberLike(String value) {
            addCriterion("fileNumber like", value, "filenumber");
            return (Criteria) this;
        }

        public Criteria andFilenumberNotLike(String value) {
            addCriterion("fileNumber not like", value, "filenumber");
            return (Criteria) this;
        }

        public Criteria andFilenumberIn(List<String> values) {
            addCriterion("fileNumber in", values, "filenumber");
            return (Criteria) this;
        }

        public Criteria andFilenumberNotIn(List<String> values) {
            addCriterion("fileNumber not in", values, "filenumber");
            return (Criteria) this;
        }

        public Criteria andFilenumberBetween(String value1, String value2) {
            addCriterion("fileNumber between", value1, value2, "filenumber");
            return (Criteria) this;
        }

        public Criteria andFilenumberNotBetween(String value1, String value2) {
            addCriterion("fileNumber not between", value1, value2, "filenumber");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNull() {
            addCriterion("return_time is null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNotNull() {
            addCriterion("return_time is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeEqualTo(Date value) {
            addCriterion("return_time =", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotEqualTo(Date value) {
            addCriterion("return_time <>", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThan(Date value) {
            addCriterion("return_time >", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("return_time >=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThan(Date value) {
            addCriterion("return_time <", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("return_time <=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIn(List<Date> values) {
            addCriterion("return_time in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotIn(List<Date> values) {
            addCriterion("return_time not in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeBetween(Date value1, Date value2) {
            addCriterion("return_time between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("return_time not between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeIsNull() {
            addCriterion("specific_time is null");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeIsNotNull() {
            addCriterion("specific_time is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeEqualTo(Date value) {
            addCriterion("specific_time =", value, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeNotEqualTo(Date value) {
            addCriterion("specific_time <>", value, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeGreaterThan(Date value) {
            addCriterion("specific_time >", value, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("specific_time >=", value, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeLessThan(Date value) {
            addCriterion("specific_time <", value, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeLessThanOrEqualTo(Date value) {
            addCriterion("specific_time <=", value, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeIn(List<Date> values) {
            addCriterion("specific_time in", values, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeNotIn(List<Date> values) {
            addCriterion("specific_time not in", values, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeBetween(Date value1, Date value2) {
            addCriterion("specific_time between", value1, value2, "specificTime");
            return (Criteria) this;
        }

        public Criteria andSpecificTimeNotBetween(Date value1, Date value2) {
            addCriterion("specific_time not between", value1, value2, "specificTime");
            return (Criteria) this;
        }

        public Criteria andVisitMethodIsNull() {
            addCriterion("visit_method is null");
            return (Criteria) this;
        }

        public Criteria andVisitMethodIsNotNull() {
            addCriterion("visit_method is not null");
            return (Criteria) this;
        }

        public Criteria andVisitMethodEqualTo(String value) {
            addCriterion("visit_method =", value, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodNotEqualTo(String value) {
            addCriterion("visit_method <>", value, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodGreaterThan(String value) {
            addCriterion("visit_method >", value, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodGreaterThanOrEqualTo(String value) {
            addCriterion("visit_method >=", value, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodLessThan(String value) {
            addCriterion("visit_method <", value, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodLessThanOrEqualTo(String value) {
            addCriterion("visit_method <=", value, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodLike(String value) {
            addCriterion("visit_method like", value, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodNotLike(String value) {
            addCriterion("visit_method not like", value, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodIn(List<String> values) {
            addCriterion("visit_method in", values, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodNotIn(List<String> values) {
            addCriterion("visit_method not in", values, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodBetween(String value1, String value2) {
            addCriterion("visit_method between", value1, value2, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andVisitMethodNotBetween(String value1, String value2) {
            addCriterion("visit_method not between", value1, value2, "visitMethod");
            return (Criteria) this;
        }

        public Criteria andReturnContentIsNull() {
            addCriterion("return_content is null");
            return (Criteria) this;
        }

        public Criteria andReturnContentIsNotNull() {
            addCriterion("return_content is not null");
            return (Criteria) this;
        }

        public Criteria andReturnContentEqualTo(String value) {
            addCriterion("return_content =", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentNotEqualTo(String value) {
            addCriterion("return_content <>", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentGreaterThan(String value) {
            addCriterion("return_content >", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentGreaterThanOrEqualTo(String value) {
            addCriterion("return_content >=", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentLessThan(String value) {
            addCriterion("return_content <", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentLessThanOrEqualTo(String value) {
            addCriterion("return_content <=", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentLike(String value) {
            addCriterion("return_content like", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentNotLike(String value) {
            addCriterion("return_content not like", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentIn(List<String> values) {
            addCriterion("return_content in", values, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentNotIn(List<String> values) {
            addCriterion("return_content not in", values, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentBetween(String value1, String value2) {
            addCriterion("return_content between", value1, value2, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentNotBetween(String value1, String value2) {
            addCriterion("return_content not between", value1, value2, "returnContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoIsNull() {
            addCriterion("feedback_info is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoIsNotNull() {
            addCriterion("feedback_info is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoEqualTo(String value) {
            addCriterion("feedback_info =", value, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoNotEqualTo(String value) {
            addCriterion("feedback_info <>", value, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoGreaterThan(String value) {
            addCriterion("feedback_info >", value, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoGreaterThanOrEqualTo(String value) {
            addCriterion("feedback_info >=", value, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoLessThan(String value) {
            addCriterion("feedback_info <", value, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoLessThanOrEqualTo(String value) {
            addCriterion("feedback_info <=", value, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoLike(String value) {
            addCriterion("feedback_info like", value, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoNotLike(String value) {
            addCriterion("feedback_info not like", value, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoIn(List<String> values) {
            addCriterion("feedback_info in", values, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoNotIn(List<String> values) {
            addCriterion("feedback_info not in", values, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoBetween(String value1, String value2) {
            addCriterion("feedback_info between", value1, value2, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoNotBetween(String value1, String value2) {
            addCriterion("feedback_info not between", value1, value2, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andHandlingResultIsNull() {
            addCriterion("handling_result is null");
            return (Criteria) this;
        }

        public Criteria andHandlingResultIsNotNull() {
            addCriterion("handling_result is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingResultEqualTo(String value) {
            addCriterion("handling_result =", value, "handlingResult");
            return (Criteria) this;
        }

        public Criteria andHandlingResultNotEqualTo(String value) {
            addCriterion("handling_result <>", value, "handlingResult");
            return (Criteria) this;
        }

        public Criteria andHandlingResultGreaterThan(String value) {
            addCriterion("handling_result >", value, "handlingResult");
            return (Criteria) this;
        }

        public Criteria andHandlingResultGreaterThanOrEqualTo(String value) {
            addCriterion("handling_result >=", value, "handlingResult");
            return (Criteria) this;
        }

        public Criteria andHandlingResultLessThan(String value) {
            addCriterion("handling_result <", value, "handlingResult");
            return (Criteria) this;
        }

        public Criteria andHandlingResultLessThanOrEqualTo(String value) {
            addCriterion("handling_result <=", value, "handlingResult");
            return (Criteria) this;
        }

        public Criteria andHandlingResultLike(String value) {
            addCriterion("handling_result like", value, "handlingResult");
            return (Criteria) this;
        }

        public Criteria andHandlingResultNotLike(String value) {
            addCriterion("handling_result not like", value, "handlingResult");
            return (Criteria) this;
        }

        public Criteria andHandlingResultIn(List<String> values) {
            addCriterion("handling_result in", values, "handlingResult");
            return (Criteria) this;
        }

        public Criteria andHandlingResultNotIn(List<String> values) {
            addCriterion("handling_result not in", values, "handlingResult");
            return (Criteria) this;
        }

        public Criteria andHandlingResultBetween(String value1, String value2) {
            addCriterion("handling_result between", value1, value2, "handlingResult");
            return (Criteria) this;
        }

        public Criteria andHandlingResultNotBetween(String value1, String value2) {
            addCriterion("handling_result not between", value1, value2, "handlingResult");
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