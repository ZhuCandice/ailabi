package com.ailabi.consumer.FallBack;

import com.ailabi.consumer.Feign.ProducerClient;
import org.springframework.stereotype.Component;

@Component
public class MyFallBack implements ProducerClient {
    /**
     * 
     * @return
     */
    @Override
    public String getName() {
        return "金金";
    }
}
