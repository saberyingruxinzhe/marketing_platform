package com.ztf.infrastructure.persistent.dao;

import com.ztf.infrastructure.persistent.po.RaffleActivityPO;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;



@Mapper
public interface IRaffleActivityDao {
    List<RaffleActivityPO> queryRaffleActivityList();
}
