package cn.collabtech.service;

import cn.collabtech.bean.CustomerEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Darrick
 * @package cn.collabtech.service
 * @class CSServiceImpl
 * @date 2017/12/1 11:38
 * @description
 * @versions 1.0
 */
@Service
public class CSServiceImpl implements CSService{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveCustomer(CustomerEntity cs) {
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        s.save(cs);
        tx.commit();
    }

    @Override
    public void testAutowired() {
        System.out.println("CSServiceImpl............");
    }


}
