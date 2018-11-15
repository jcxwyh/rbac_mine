package pro.onlyou.rbac.mine.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class HttpRequestInterceptor extends HandlerInterceptorAdapter {

    private long startTime;
    private long endTime;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        startTime = System.currentTimeMillis();

        log.info("uri:" + uri+" :request start");

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        String uri = request.getRequestURI();
        endTime = System.currentTimeMillis();

        log.info("uri:" + uri + " :request end");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        String uri = request.getRequestURI();
        endTime = System.currentTimeMillis();

        log.info("uri:" + uri + " :request completion : time:"+(endTime-startTime));
    }

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("afterConcurrentHandlingStarted");
    }
}
