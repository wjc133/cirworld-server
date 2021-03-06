package com.elite.cirworld.persist.mapper;

import com.elite.cirworld.persist.model.CyclingYear;
import com.elite.cirworld.persist.model.CyclingYearExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CyclingYearMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_year
     *
     * @mbggenerated
     */
    int countByExample(CyclingYearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_year
     *
     * @mbggenerated
     */
    int deleteByExample(CyclingYearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_year
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_year
     *
     * @mbggenerated
     */
    int insert(CyclingYear record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_year
     *
     * @mbggenerated
     */
    int insertSelective(CyclingYear record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_year
     *
     * @mbggenerated
     */
    List<CyclingYear> selectByExample(CyclingYearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_year
     *
     * @mbggenerated
     */
    CyclingYear selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_year
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CyclingYear record, @Param("example") CyclingYearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_year
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CyclingYear record, @Param("example") CyclingYearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_year
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CyclingYear record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cycling_year
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CyclingYear record);
}