package com.example.apolloclient.config;

import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig("application")
public class AppConfig {

    @Bean
    public MyApolloConfig myApolloConfig(){
        return new MyApolloConfig();
    }

}
