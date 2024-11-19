package com.ztf.infrastructure.persistent.dao;

import com.ztf.infrastructure.persistent.po.StrategyAwardPO;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface IStrategyAwardDao {
    List<StrategyAwardPO> queryStrategyAwardList();

    List<StrategyAwardPO> queryStrategyAwardListById(Long strategyId);

    String queryStrategyAwardRuleModels(StrategyAwardPO strategyAwardPO);

    void updateStrategyAwardStock(StrategyAwardPO strategyAwardPO);

    List<StrategyAwardPO> queryStrategyAwardListByStrategyId(Long strategyId);
}
