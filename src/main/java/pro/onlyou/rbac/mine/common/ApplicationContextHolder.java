package pro.onlyou.rbac.mine.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Objects;

/**
 * 获取应用的应用上下文
 */

@Slf4j
public class ApplicationContextHolder implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("ApplicationContextHolder initial : " + applicationContext);
        this.context = applicationContext;
    }

    public static <T> T getBean(Class<T> clazz){
        return Objects.isNull(context)?null:context.getBean(clazz);
    }

    public static Object getBean(String beanName){
        return Objects.isNull(context)?null:context.getBean(beanName);
    }

    public static <T> T getBean(String beanName,Class<T> clazz){
        return Objects.isNull(context)?null:context.getBean(beanName,clazz);
    }

}
