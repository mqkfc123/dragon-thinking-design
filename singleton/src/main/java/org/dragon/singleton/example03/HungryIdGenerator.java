package org.dragon.singleton.example03;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 饿汉式
 */
public class HungryIdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static final HungryIdGenerator instance = new HungryIdGenerator();

    private HungryIdGenerator() {
    }

    public static HungryIdGenerator getInstance() {
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
