package com.ztf.infrastructure.persistent.dao;

import com.ztf.infrastructure.persistent.po.StrategyPO;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface IStrategyDao {
    List<StrategyPO> queryStrategyList();

    /**
     * 根据id进行查询
     * @param strategyId
     * @return
     */
    StrategyPO queryStrategyById(Long strategyId);
}
