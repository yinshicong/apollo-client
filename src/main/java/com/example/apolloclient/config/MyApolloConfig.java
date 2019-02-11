package com.example.apolloclient.config;


import com.ctrip.framework.apollo.internals.ConfigRepository;
import com.ctrip.framework.apollo.internals.DefaultConfig;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.springframework.beans.factory.annotation.Value;


public class MyApolloConfig {

    @Value("$portal.elastic.cluster.name:default_value")
    private String ss;

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    //配置修改监听事件
    @ApolloConfigChangeListener
    private void someKeyChangeValue(ConfigChangeEvent changeEvent) {

        System.out.println("change namespace= " + changeEvent.getNamespace());
        changeEvent.changedKeys().stream().forEach(e -> {
            System.out.println("change key = " + e);
        });

    }

}
