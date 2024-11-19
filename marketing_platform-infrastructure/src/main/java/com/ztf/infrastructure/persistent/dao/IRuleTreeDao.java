package com.ztf.infrastructure.persistent.dao;

import com.ztf.infrastructure.persistent.po.RuleTreePO;
import org.apache.ibatis.annotations.Mapper;




@Mapper
public interface IRuleTreeDao {
    RuleTreePO queryRuleTreeByTreeId(String treeId);
}
