package com.wangmou.gmallpublisher.service.impl;

import com.wangmou.gmallpublisher.bean.ProvinceStats;
import com.wangmou.gmallpublisher.mapper.ProvinceStatsMapper;
import com.wangmou.gmallpublisher.service.ProvinceStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc:按照地区统计的业务接口实现类
 */
@Service
public class ProvinceStatsServiceImpl implements ProvinceStatsService {
    //注入mapper
    @Autowired
    ProvinceStatsMapper provinceStatsMapper;

    @Override
    public List<ProvinceStats> getProvinceStats(int date) {
        return provinceStatsMapper.selectProvinceStats(date);
    }
}
