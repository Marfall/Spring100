package com.spring100.spring.aop.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AfterAopAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @AfterReturning(
            value = "execution(* com.spring100.spring.aop.springaop.business.*.*(..))",
            returning = "result"
    )
    public void after(JoinPoint joinPoint, Object result) {
        // Advice
        logger.info("Check for user access");
        logger.info("{} returned value {}", joinPoint,result);
    }

    @AfterThrowing(
            value = "execution(* com.spring100.spring.aop.springaop.business.*.*(..))",
            throwing = "exception"
    )
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        // Advice
        logger.info("Check for user access");
        logger.info("{} throw exception {}", joinPoint, exception);
    }

    @After(
            value = "execution(* com.spring100.spring.aop.springaop.business.*.*(..))")
    public void after(JoinPoint joinPoint) {
        // Advice
        logger.info("Check for user access");
        logger.info("after execution of {}", joinPoint);
    }
}
