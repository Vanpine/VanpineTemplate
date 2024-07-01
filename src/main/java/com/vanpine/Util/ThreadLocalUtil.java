package com.vanpine.Util;

import org.springframework.stereotype.Component;

@Component
public class ThreadLocalUtil<User> {

    private final ThreadLocal<User> threadLocal = new ThreadLocal<>();

    /*
     *  设置set方法
     * */
    private void set(User user) {
        threadLocal.set(user);
    }

    private User get() {
        return threadLocal.get();
    }

    private void delete() {
        threadLocal.remove();
    }

}
