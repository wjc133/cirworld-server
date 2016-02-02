package com.elite.cirworld.persist.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CyclingPartExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cycling_part
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cycling_part
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cycling_part
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_part
     *
     * @mbggenerated
     */
    public CyclingPartExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_part
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_part
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_part
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_part
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_part
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_part
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_part
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
     * This method corresponds to the database table cycling_part
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
     * This method corresponds to the database table cycling_part
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_part
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cycling_part
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNull() {
            addCriterion("distance is null");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNotNull() {
            addCriterion("distance is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceEqualTo(Integer value) {
            addCriterion("distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(Integer value) {
            addCriterion("distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(Integer value) {
            addCriterion("distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(Integer value) {
            addCriterion("distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<Integer> values) {
            addCriterion("distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<Integer> values) {
            addCriterion("distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(Integer value1, Integer value2) {
            addCriterion("distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("distance not between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedIsNull() {
            addCriterion("max_speed is null");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedIsNotNull() {
            addCriterion("max_speed is not null");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedEqualTo(Float value) {
            addCriterion("max_speed =", value, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedNotEqualTo(Float value) {
            addCriterion("max_speed <>", value, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedGreaterThan(Float value) {
            addCriterion("max_speed >", value, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedGreaterThanOrEqualTo(Float value) {
            addCriterion("max_speed >=", value, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedLessThan(Float value) {
            addCriterion("max_speed <", value, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedLessThanOrEqualTo(Float value) {
            addCriterion("max_speed <=", value, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedIn(List<Float> values) {
            addCriterion("max_speed in", values, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedNotIn(List<Float> values) {
            addCriterion("max_speed not in", values, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedBetween(Float value1, Float value2) {
            addCriterion("max_speed between", value1, value2, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andMaxSpeedNotBetween(Float value1, Float value2) {
            addCriterion("max_speed not between", value1, value2, "maxSpeed");
            return (Criteria) this;
        }

        public Criteria andAverageSpeedIsNull() {
            addCriterion("average_speed is null");
            return (Criteria) this;
        }

        public Criteria andAverageSpeedIsNotNull() {
            addCriterion("average_speed is not null");
            return (Criteria) this;
        }

        public Criteria andAverageSpeedEqualTo(Float value) {
            addCriterion("average_speed =", value, "averageSpeed");
            return (Criteria) this;
        }

        public Criteria andAverageSpeedNotEqualTo(Float value) {
            addCriterion("average_speed <>", value, "averageSpeed");
            return (Criteria) this;
        }

        public Criteria andAverageSpeedGreaterThan(Float value) {
            addCriterion("average_speed >", value, "averageSpeed");
            return (Criteria) this;
        }

        public Criteria andAverageSpeedGreaterThanOrEqualTo(Float value) {
            addCriterion("average_speed >=", value, "averageSpeed");
            return (Criteria) this;
        }

        public Criteria andAverageSpeedLessThan(Float value) {
            addCriterion("average_speed <", value, "averageSpeed");
            return (Criteria) this;
        }

        public Criteria andAverageSpeedLessThanOrEqualTo(Float value) {
            addCriterion("average_speed <=", value, "averageSpeed");
            return (Criteria) this;
        }

        public Criteria andAverageSpeedIn(List<Float> values) {
            addCriterion("average_speed in", values, "averageSpeed");
            return (Criteria) this;
        }

        public Criteria andAverageSpeedNotIn(List<Float> values) {
            addCriterion("average_speed not in", values, "averageSpeed");
            return (Criteria) this;
        }

        public Criteria andAverageSpeedBetween(Float value1, Float value2) {
            addCriterion("average_speed between", value1, value2, "averageSpeed");
            return (Criteria) this;
        }

        public Criteria andAverageSpeedNotBetween(Float value1, Float value2) {
            addCriterion("average_speed not between", value1, value2, "averageSpeed");
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

        public Criteria andStartLongitudeIsNull() {
            addCriterion("start_longitude is null");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeIsNotNull() {
            addCriterion("start_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeEqualTo(Double value) {
            addCriterion("start_longitude =", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeNotEqualTo(Double value) {
            addCriterion("start_longitude <>", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeGreaterThan(Double value) {
            addCriterion("start_longitude >", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("start_longitude >=", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeLessThan(Double value) {
            addCriterion("start_longitude <", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("start_longitude <=", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeIn(List<Double> values) {
            addCriterion("start_longitude in", values, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeNotIn(List<Double> values) {
            addCriterion("start_longitude not in", values, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeBetween(Double value1, Double value2) {
            addCriterion("start_longitude between", value1, value2, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("start_longitude not between", value1, value2, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeIsNull() {
            addCriterion("end_longitude is null");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeIsNotNull() {
            addCriterion("end_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeEqualTo(Double value) {
            addCriterion("end_longitude =", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeNotEqualTo(Double value) {
            addCriterion("end_longitude <>", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeGreaterThan(Double value) {
            addCriterion("end_longitude >", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("end_longitude >=", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeLessThan(Double value) {
            addCriterion("end_longitude <", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("end_longitude <=", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeIn(List<Double> values) {
            addCriterion("end_longitude in", values, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeNotIn(List<Double> values) {
            addCriterion("end_longitude not in", values, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeBetween(Double value1, Double value2) {
            addCriterion("end_longitude between", value1, value2, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("end_longitude not between", value1, value2, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeIsNull() {
            addCriterion("start_latitude is null");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeIsNotNull() {
            addCriterion("start_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeEqualTo(Double value) {
            addCriterion("start_latitude =", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeNotEqualTo(Double value) {
            addCriterion("start_latitude <>", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeGreaterThan(Double value) {
            addCriterion("start_latitude >", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("start_latitude >=", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeLessThan(Double value) {
            addCriterion("start_latitude <", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("start_latitude <=", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeIn(List<Double> values) {
            addCriterion("start_latitude in", values, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeNotIn(List<Double> values) {
            addCriterion("start_latitude not in", values, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeBetween(Double value1, Double value2) {
            addCriterion("start_latitude between", value1, value2, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("start_latitude not between", value1, value2, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeIsNull() {
            addCriterion("end_latitude is null");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeIsNotNull() {
            addCriterion("end_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeEqualTo(Double value) {
            addCriterion("end_latitude =", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeNotEqualTo(Double value) {
            addCriterion("end_latitude <>", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeGreaterThan(Double value) {
            addCriterion("end_latitude >", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("end_latitude >=", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeLessThan(Double value) {
            addCriterion("end_latitude <", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("end_latitude <=", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeIn(List<Double> values) {
            addCriterion("end_latitude in", values, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeNotIn(List<Double> values) {
            addCriterion("end_latitude not in", values, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeBetween(Double value1, Double value2) {
            addCriterion("end_latitude between", value1, value2, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("end_latitude not between", value1, value2, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andAreasIsNull() {
            addCriterion("areas is null");
            return (Criteria) this;
        }

        public Criteria andAreasIsNotNull() {
            addCriterion("areas is not null");
            return (Criteria) this;
        }

        public Criteria andAreasEqualTo(String value) {
            addCriterion("areas =", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotEqualTo(String value) {
            addCriterion("areas <>", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasGreaterThan(String value) {
            addCriterion("areas >", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasGreaterThanOrEqualTo(String value) {
            addCriterion("areas >=", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasLessThan(String value) {
            addCriterion("areas <", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasLessThanOrEqualTo(String value) {
            addCriterion("areas <=", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasLike(String value) {
            addCriterion("areas like", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotLike(String value) {
            addCriterion("areas not like", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasIn(List<String> values) {
            addCriterion("areas in", values, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotIn(List<String> values) {
            addCriterion("areas not in", values, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasBetween(String value1, String value2) {
            addCriterion("areas between", value1, value2, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotBetween(String value1, String value2) {
            addCriterion("areas not between", value1, value2, "areas");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cycling_part
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
     * This class corresponds to the database table cycling_part
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