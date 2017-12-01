package cn.collabtech.service;

import cn.collabtech.bean.CustomerEntity;
import org.springframework.stereotype.Service;

/**
 * @author Darrick
 * @package cn.collabtech.service
 * @class VVServiceImpl
 * @date 2017/12/1 13:58
 * @description
 * @versions 1.0
 */
@Service
public class VVServiceImpl implements CSService {
    @Override
    public void saveCustomer(CustomerEntity cs) {

    }

    @Override
    public void testAutowired() {
        System.out.println("VVServiceImpl...............");
    }
}
