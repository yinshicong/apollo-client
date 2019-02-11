package com.example.apolloclient;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApolloClientApplication {

    public static void main(String[] args) {
//        Environment可以通过以下3种方式的任意一个配置：
//
//        通过Java System Property
//
//        可以通过Java的System Property env来指定环境
//        在Java程序启动脚本中，可以指定-Denv=YOUR-ENVIRONMENT
//        如果是运行jar文件，需要注意格式是java -Denv=YOUR-ENVIRONMENT -jar xxx.jar
//                注意key为全小写
//        通过操作系统的System Environment
//
//        还可以通过操作系统的System Environment ENV来指定
//                注意key为全大写
//        通过配置文件
//
//                最后一个推荐的方式是通过配置文件来指定env=YOUR-ENVIRONMENT
//        对于Mac/Linux，文件位置为/opt/settings/server.properties
//        对于Windows，文件位置为C:\opt\settings\server.properties
        System.setProperty("env","pro");
        //设置apollo config service地址。
        System.setProperty("apollo.configService", "http://47.100.188.176:8080/");
        SpringApplication.run(ApolloClientApplication.class, args);
    }

}

