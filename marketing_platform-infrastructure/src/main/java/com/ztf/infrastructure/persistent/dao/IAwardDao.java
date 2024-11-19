package com.ztf.infrastructure.persistent.dao;

import com.ztf.infrastructure.persistent.po.AwardPO;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface IAwardDao {

    List<AwardPO> queryAwardList();

}
