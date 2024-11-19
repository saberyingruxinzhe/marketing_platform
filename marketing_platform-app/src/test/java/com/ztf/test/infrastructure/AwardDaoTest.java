package com.ztf.test.infrastructure;

import com.alibaba.fastjson.JSON;
import com.ztf.infrastructure.persistent.dao.IAwardDao;
import com.ztf.infrastructure.persistent.po.AwardPO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.annotation.Resource;
import java.util.List;

/**
 * @author Tao
 * @description 奖品持久化单元测试
 * @create 2024-02-24 20:36
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AwardDaoTest {

    @Resource
    private IAwardDao awardDao;

    @Test
    public void test_queryAwardList() {
        List<AwardPO> awards = awardDao.queryAwardList();
        log.info("测试结果：{}", JSON.toJSONString(awards));
    }

}