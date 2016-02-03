package com.elite.cirworld.admin.service;

import com.elite.cirworld.persist.mapper.CyclingPartMapper;
import com.elite.cirworld.persist.model.CyclingPart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wjc133
 * Date: 2016/2/3
 * Time: 17:49
 */
@Service
public class CyclingPartService {
    @Autowired
    private CyclingPartMapper cyclingPartMapper;

    public void insert(CyclingPart part) {
        cyclingPartMapper.insert(part);
    }
}
