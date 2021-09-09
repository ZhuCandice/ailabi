package com.ailabi.consumer.Service;

import org.springframework.stereotype.Service;

import java.util.concurrent.Future;


public interface UserService {
    Future<String> testAsync();

    String getNameNew();
}
