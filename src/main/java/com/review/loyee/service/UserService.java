package com.review.loyee.service;

import com.review.loyee.utils.RedisLockUtils;
import com.review.loyee.utils.RedisUtils;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    RedisUtils redisUtils = new RedisUtils();
    RedisLockUtils redisLockUtils = new RedisLockUtils();

    public int go() {
        boolean a = redisUtils.set("a", 11);
        if(a){
            return 1;
        }else{
            return 0;
        }
    }
}
