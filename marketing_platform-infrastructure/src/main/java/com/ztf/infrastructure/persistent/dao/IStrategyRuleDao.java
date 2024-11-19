package com.ztf.infrastructure.persistent.dao;

import com.ztf.infrastructure.persistent.po.StrategyRulePO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface IStrategyRuleDao {
    List<StrategyRulePO> queryStrategyRuleList();

    StrategyRulePO queryStrategyRule(StrategyRulePO strategyRuleReq);

    String queryStrategyRuleValue(StrategyRulePO strategyRule);

}
