package com.example.apolloclient.controller;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.example.apolloclient.config.MyApolloConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    //@ApolloConfig
    //private MyApolloConfig myApolloConfig;

    @GetMapping("t")
    public String test(){

        Config config = ConfigService.getAppConfig(); //config instance is singleton for each namespace and is never null
        String someKey = "portal.elastic.cluster.name";
        String someDefaultValue = "default_value";
        String value = config.getProperty(someKey, someDefaultValue);
        return value;

        //return myApolloConfig.getSs();

    }

}
