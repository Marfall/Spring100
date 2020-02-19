package com.spring100.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.spring100.spring.aop.springaop.dao.*.*(..))")
    public void dataLayerExecution() {}

    @Pointcut("execution(* com.spring100.spring.aop.springaop.business.*.*(..))")
    public void businessLayerExecution() {}

    @Pointcut("com.spring100.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution() && com.spring100.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public  void allLayerExecution() {}

    @Pointcut("bean(*dao*)")
    public void beanStartingWithDao() {}


    @Pointcut("@annotation(com.spring100.spring.aop.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation() {}
}
