package org.exercise_1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Aspect
public class AspectMetrics {

    private Map<String, Integer> countMap = new HashMap<>();
    @Before("execution(* org.exercise_1.controller.AuthorController.*(..))")
    public void beforeGetMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        int times = countMap.getOrDefault(methodName, 0);
        countMap.put(methodName,times + 1);
    }
    public void getTimeExecute(){
        for(String methodName : countMap.keySet()){
            System.out.println(methodName + " get call " + countMap.getOrDefault(methodName,0) + "times");
        }
    }
}
