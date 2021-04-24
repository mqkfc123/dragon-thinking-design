package org.dragon.singleton.example02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Logger 单例类的实现
 */
public class Logger {
    private FileWriter writer;
    private static final Logger instance = new Logger();

    private Logger() {
        try {
            File file = new File("/Users/log.txt");
            writer = new FileWriter(file, true); //true表示追加写入
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static Logger getInstance() {
        return instance;
    }

    public void log(String message) throws IOException {
        writer.write(message);
    }

}
