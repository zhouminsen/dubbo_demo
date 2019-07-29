package com.zjw.provider.service;

/**
 * dubbo服务接口
 */
public class ProviderServiceMock implements ProviderService {
    public Integer add(Integer a, Integer b) {
        return 100 + 100;
    }
}
