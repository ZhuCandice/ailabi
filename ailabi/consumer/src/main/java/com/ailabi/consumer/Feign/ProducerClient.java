package com.ailabi.consumer.Feign;

import com.ailabi.consumer.FallBack.MyFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "producer",fallback = MyFallBack.class, path="/user")
public interface ProducerClient {

    @GetMapping(value = "/getName")
    String getName();

}
