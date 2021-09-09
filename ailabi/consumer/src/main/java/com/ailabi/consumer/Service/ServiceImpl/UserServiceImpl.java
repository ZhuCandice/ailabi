package com.ailabi.consumer.Service.ServiceImpl;

import com.ailabi.consumer.Feign.ProducerClient;
import com.ailabi.consumer.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.concurrent.Future;

@Service
@Slf4j
public class UserServiceImpl implements UserService {


    @Resource
    private RestTemplate restTemplate;

    @Autowired
    private ProducerClient producerClient;

    @Async
    @Override
    public Future<String> testAsync() {
        System.out.println(Thread.currentThread().getName()+":Hello!");
        log.info("你好");
        return new AsyncResult<>("ok");
    }

    @Override
    public String getNameNew() {

        return producerClient.getName();
    }
}
