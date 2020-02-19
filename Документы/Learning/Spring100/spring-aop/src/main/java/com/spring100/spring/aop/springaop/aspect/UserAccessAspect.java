package com.spring100.spring.aop.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class UserAccessAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Before("com.spring100.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void before(JoinPoint joinPoint) {
        // Advice
        logger.info("Check for user access");
        logger.info("Allowed execution for- {}", joinPoint);
    }
}
