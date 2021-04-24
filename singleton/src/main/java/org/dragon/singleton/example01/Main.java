package org.dragon.singleton.example01;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //如果多个线程同时调用改方式，会导致日志被覆盖
        Logger logger = new Logger();
        logger.log("test");
    }
}
