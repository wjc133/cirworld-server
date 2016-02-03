package com.elite.cirworld.admin.service;

import com.elite.cirworld.persist.mapper.CyclingPlanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wjc133
 * Date: 2016/2/3
 * Time: 18:19
 */
@Service
public class CyclingPlanService {
    @Autowired
    private CyclingPlanMapper cyclingPlanMapper;
}
