package cn.collabtech.action;

import cn.collabtech.bean.CustomerEntity;
import cn.collabtech.service.CSService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.UUID;

@Controller
@Scope("prototype")
public class LoginAction extends ActionSupport {

    private String username;
    private String password;

    @Resource(name = "CSServiceImpl")
    private CSService cs;

    @Override
    public String execute() throws Exception {
        cs.testAutowired();
        CustomerEntity ce = new CustomerEntity();
        ce.setSex("女女");
        ce.setAge(222);
        ce.setAddress("北京朝阳 >>> "+ UUID.randomUUID().toString());
        ce.setName("LiHua");
        cs.saveCustomer(ce);
        if (username.equals("admin") && password.equals("123")) {
            return SUCCESS;
        } else {
            return LOGIN;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}