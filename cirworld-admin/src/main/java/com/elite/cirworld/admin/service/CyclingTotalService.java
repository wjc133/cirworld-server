package com.elite.cirworld.admin.service;

import com.elite.cirworld.persist.mapper.CyclingTotalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wjc133
 * Date: 2016/2/3
 * Time: 18:20
 */
@Service
public class CyclingTotalService {
    @Autowired
    private CyclingTotalMapper cyclingTotalMapper;
}
