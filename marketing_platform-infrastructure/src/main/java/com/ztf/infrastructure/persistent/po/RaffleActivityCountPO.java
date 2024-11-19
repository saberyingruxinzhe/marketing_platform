package com.ztf.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;



@Data
public class RaffleActivityCountPO {
    // 数据库自增ID
    private Long id;
    // 活动次数配置ID
    private Long activityCountId;
    // 总次数
    private Integer totalCount;
    // 日次数
    private Integer dayCount;
    // 月次数
    private Integer monthCount;
    // 创建时间
    private Date createTime;
    // 更新时间
    private Date updateTime;

}
