package pro.onlyou.rbac.mine.admin.controller;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pro.onlyou.rbac.mine.common.ApplicationContextHolder;
import pro.onlyou.rbac.mine.entity.SysAcl;
import pro.onlyou.rbac.mine.mapper.SysAclMapper;

@Controller
@RequestMapping("/test")
@Slf4j //自动装载一个Logger实例
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String test() {
        log.debug("request to /test/hello");
        return "hello";
    }

    @RequestMapping("/db")
    @ResponseBody
    public String testDB() {
        log.debug("request to /test/hello");
//        SysAclMapper sysAclMapper = ApplicationContextHolder.getBean(SysAclMapper.class);
//        SysAcl sysAcl = sysAclMapper.selectByPrimaryKey(1);
//        log.info(sysAcl.toString());

        DruidDataSource dataSource = ApplicationContextHolder.getBean("dataSource",DruidDataSource.class);
        log.info(dataSource.toString());
        return "hello";
    }
}
