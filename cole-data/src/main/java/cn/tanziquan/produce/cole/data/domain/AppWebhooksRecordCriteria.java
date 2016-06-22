package cn.tanziquan.produce.cole.data.domain;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class AppWebhooksRecordCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    public AppWebhooksRecordCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
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
            addCriterion("\" id\" is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("\" id\" is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("\" id\" =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("\" id\" <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("\" id\" >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("\" id\" >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("\" id\" <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("\" id\" <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("\" id\" in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("\" id\" not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("\" id\" between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("\" id\" not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Integer value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Integer value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Integer value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Integer value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Integer> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Integer> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Integer value1, Integer value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("full_name is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("full_name is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("full_name =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("full_name <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("full_name >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("full_name >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("full_name <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("full_name <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("full_name like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("full_name not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("full_name in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("full_name not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("full_name between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("full_name not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andBranchIsNull() {
            addCriterion("branch is null");
            return (Criteria) this;
        }

        public Criteria andBranchIsNotNull() {
            addCriterion("branch is not null");
            return (Criteria) this;
        }

        public Criteria andBranchEqualTo(String value) {
            addCriterion("branch =", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotEqualTo(String value) {
            addCriterion("branch <>", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThan(String value) {
            addCriterion("branch >", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThanOrEqualTo(String value) {
            addCriterion("branch >=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThan(String value) {
            addCriterion("branch <", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThanOrEqualTo(String value) {
            addCriterion("branch <=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLike(String value) {
            addCriterion("branch like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotLike(String value) {
            addCriterion("branch not like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchIn(List<String> values) {
            addCriterion("branch in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotIn(List<String> values) {
            addCriterion("branch not in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchBetween(String value1, String value2) {
            addCriterion("branch between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotBetween(String value1, String value2) {
            addCriterion("branch not between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andCommitDateIsNull() {
            addCriterion("commit_date is null");
            return (Criteria) this;
        }

        public Criteria andCommitDateIsNotNull() {
            addCriterion("commit_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommitDateEqualTo(Timestamp value) {
            addCriterion("commit_date =", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateNotEqualTo(Timestamp value) {
            addCriterion("commit_date <>", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateGreaterThan(Timestamp value) {
            addCriterion("commit_date >", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("commit_date >=", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateLessThan(Timestamp value) {
            addCriterion("commit_date <", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("commit_date <=", value, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateIn(List<Timestamp> values) {
            addCriterion("commit_date in", values, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateNotIn(List<Timestamp> values) {
            addCriterion("commit_date not in", values, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("commit_date between", value1, value2, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("commit_date not between", value1, value2, "commitDate");
            return (Criteria) this;
        }

        public Criteria andCommitMessageIsNull() {
            addCriterion("commit_message is null");
            return (Criteria) this;
        }

        public Criteria andCommitMessageIsNotNull() {
            addCriterion("commit_message is not null");
            return (Criteria) this;
        }

        public Criteria andCommitMessageEqualTo(String value) {
            addCriterion("commit_message =", value, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageNotEqualTo(String value) {
            addCriterion("commit_message <>", value, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageGreaterThan(String value) {
            addCriterion("commit_message >", value, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageGreaterThanOrEqualTo(String value) {
            addCriterion("commit_message >=", value, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageLessThan(String value) {
            addCriterion("commit_message <", value, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageLessThanOrEqualTo(String value) {
            addCriterion("commit_message <=", value, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageLike(String value) {
            addCriterion("commit_message like", value, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageNotLike(String value) {
            addCriterion("commit_message not like", value, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageIn(List<String> values) {
            addCriterion("commit_message in", values, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageNotIn(List<String> values) {
            addCriterion("commit_message not in", values, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageBetween(String value1, String value2) {
            addCriterion("commit_message between", value1, value2, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitMessageNotBetween(String value1, String value2) {
            addCriterion("commit_message not between", value1, value2, "commitMessage");
            return (Criteria) this;
        }

        public Criteria andCommitAuthorIsNull() {
            addCriterion("\"commit_ author\" is null");
            return (Criteria) this;
        }

        public Criteria andCommitAuthorIsNotNull() {
            addCriterion("\"commit_ author\" is not null");
            return (Criteria) this;
        }

        public Criteria andCommitAuthorEqualTo(String value) {
            addCriterion("\"commit_ author\" =", value, "commitAuthor");
            return (Criteria) this;
        }

        public Criteria andCommitAuthorNotEqualTo(String value) {
            addCriterion("\"commit_ author\" <>", value, "commitAuthor");
            return (Criteria) this;
        }

        public Criteria andCommitAuthorGreaterThan(String value) {
            addCriterion("\"commit_ author\" >", value, "commitAuthor");
            return (Criteria) this;
        }

        public Criteria andCommitAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("\"commit_ author\" >=", value, "commitAuthor");
            return (Criteria) this;
        }

        public Criteria andCommitAuthorLessThan(String value) {
            addCriterion("\"commit_ author\" <", value, "commitAuthor");
            return (Criteria) this;
        }

        public Criteria andCommitAuthorLessThanOrEqualTo(String value) {
            addCriterion("\"commit_ author\" <=", value, "commitAuthor");
            return (Criteria) this;
        }

        public Criteria andCommitAuthorLike(String value) {
            addCriterion("\"commit_ author\" like", value, "commitAuthor");
            return (Criteria) this;
        }

        public Criteria andCommitAuthorNotLike(String value) {
            addCriterion("\"commit_ author\" not like", value, "commitAuthor");
            return (Criteria) this;
        }

        public Criteria andCommitAuthorIn(List<String> values) {
            addCriterion("\"commit_ author\" in", values, "commitAuthor");
            return (Criteria) this;
        }

        public Criteria andCommitAuthorNotIn(List<String> values) {
            addCriterion("\"commit_ author\" not in", values, "commitAuthor");
            return (Criteria) this;
        }

        public Criteria andCommitAuthorBetween(String value1, String value2) {
            addCriterion("\"commit_ author\" between", value1, value2, "commitAuthor");
            return (Criteria) this;
        }

        public Criteria andCommitAuthorNotBetween(String value1, String value2) {
            addCriterion("\"commit_ author\" not between", value1, value2, "commitAuthor");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Timestamp value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Timestamp value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Timestamp value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Timestamp value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Timestamp value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Timestamp> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Timestamp> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Timestamp value1, Timestamp value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Timestamp value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Timestamp value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Timestamp value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Timestamp value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Timestamp value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Timestamp> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Timestamp> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Timestamp value1, Timestamp value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_app_webhooks_record
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}