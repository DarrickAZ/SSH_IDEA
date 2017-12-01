package cn.collabtech.ssh;

import cn.collabtech.service.CSService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author Darrick
 * @package cn.collabtech.ssh
 * @class TestAutowired
 * @date 2017/12/1 13:59
 * @description
 * @versions 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAutowired {

    //下面两种方式都是可以按照bean的名称进行装配
    @Autowired()
    @Qualifier("VVServiceImpl")
    //@Resource(name = "VVServiceImpl")
    private CSService cs;

    @Test
    public void testAt(){
        cs.testAutowired();
    }


}
