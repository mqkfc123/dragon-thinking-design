package org.dragon.singleton.example03;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 懒汉式
 */
public class LazyIdGenerator {

    private AtomicLong id = new AtomicLong(0);
    private static LazyIdGenerator instance;

    private LazyIdGenerator() {
    }

    public static synchronized LazyIdGenerator getInstance() {
        if (instance == null) {
            instance = new LazyIdGenerator();
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

}
