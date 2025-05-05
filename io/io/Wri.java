package io;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Wri {
    public static void main(String[] args) {
        //声明流
        FileWriter fileWriter = null;
        try{
            //文件名(+charset+append)、file对象(+charset+append)、文件描述符
            fileWriter = new FileWriter("D:/code/java/demo/io/test.txt",true);

            String str = "hello world";
            //写入数据
            fileWriter.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
