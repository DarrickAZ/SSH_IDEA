package cn.collabtech.test;

import cn.collabtech.bean.CustomerEntity;
import cn.collabtech.service.CSService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Darrick
 * @package cn.collabtech.ssh
 * @class TestDB
 * @date 2017/12/1 11:41
 * @description 采用注解的方式获取容器，从而进行测试
 * @versions 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDB {

    @Autowired
    private CSService csService;

    @Test
    public void testAdd(){
        CustomerEntity cs = new CustomerEntity();
        cs.setName("kaka");
        cs.setAddress("123456123");
        cs.setAge(33);
        cs.setSex("女");
        csService.saveCustomer(cs);
    }


}
