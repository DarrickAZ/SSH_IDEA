package cn.collabtech.service;

import cn.collabtech.bean.CustomerEntity;
import org.springframework.stereotype.Service;

/**
 * @author Darrick
 * @package cn.collabtech.CSService
 * @class CSService
 * @date 2017/12/1 11:38
 * @description
 * @versions 1.0
 */
@Service
public interface CSService {

    void saveCustomer(CustomerEntity cs);

    void testAutowired();
}
