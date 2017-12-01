package cn.collabtech.test;

import cn.collabtech.bean.CustomerEntity;
import cn.collabtech.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by kinthon on 17-3-31.
 */
public class Test {
    public static void main(String[] args)
    {
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        CustomerService ail = (CustomerService) ac.getBean("customerService");
        CustomerEntity al = new CustomerEntity();
        al.setName("kaka");
        al.setAddress("123456123");
        al.setAge(33);
        al.setSex("女");
        ail.add(al);
    }
}
