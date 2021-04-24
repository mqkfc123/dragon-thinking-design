package org.dragon.singleton.example01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private FileWriter writer;

    public Logger() throws IOException {
        File file = new File("/Users/log.txt");
        //FileWriter 本身就是线程安全的
        writer = new FileWriter(file, true);  //true表示追加写入
    }

    public void log(String message) throws IOException {
        //加锁是无法解决该问题的，不同对象之间不共享同一个锁，
        //在不同线程下通过不同的对象调用log函数，锁并不会起作用
        synchronized (this) {
            writer.write(message);
        }

    }

}
