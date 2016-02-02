package com.elite.cirworld.persist.mapper;

import com.elite.cirworld.persist.model.CyclingTotal;
import com.elite.cirworld.persist.model.CyclingTotalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CyclingTotalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_total
     *
     * @mbggenerated
     */
    int countByExample(CyclingTotalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_total
     *
     * @mbggenerated
     */
    int deleteByExample(CyclingTotalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_total
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_total
     *
     * @mbggenerated
     */
    int insert(CyclingTotal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_total
     *
     * @mbggenerated
     */
    int insertSelective(CyclingTotal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_total
     *
     * @mbggenerated
     */
    List<CyclingTotal> selectByExample(CyclingTotalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_total
     *
     * @mbggenerated
     */
    CyclingTotal selectByPrimaryKey(Long uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_total
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CyclingTotal record, @Param("example") CyclingTotalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_total
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CyclingTotal record, @Param("example") CyclingTotalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_total
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CyclingTotal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_total
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CyclingTotal record);
}