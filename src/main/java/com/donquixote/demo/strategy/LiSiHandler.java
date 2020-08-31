package com.donquixote.demo.strategy;

import org.springframework.stereotype.Component;

@Component
public class LiSiHandler implements Handler {

    @Override
    public void AAA(String name) {
        // 业务逻辑A
        System.out.println("李四完成任务");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Factory.register("李四", this);
    }
}