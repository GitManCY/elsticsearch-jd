package com.cy.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @projectName:elsticsearch-jd
 * @see:com.cy.config
 * @author:chengyang
 * @createTime:2020/5/7 4:55 下午
 * @version:1.0
 */
@Configuration
public class ESConfig {

    @Bean
    public RestHighLevelClient restHighLevelClient() {
        return new RestHighLevelClient(RestClient.builder(new HttpHost("127.0.0.1", 9200, "http")));
    }
}
