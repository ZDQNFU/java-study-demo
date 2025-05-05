package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutS {
    public static void main(String[] args) {
        //声明流
        FileOutputStream fileOutputStream = null;
        try{
            //文件名(+append)、file对象(+append)、文件描述符
            fileOutputStream = new FileOutputStream("D:/code/java/demo/io/test.txt",true);
            //写入数据
            String str = "hello world";
            //将字符串转换为字节数组
            byte[] bytes = str.getBytes();
            //写入字节数组
            fileOutputStream.write(bytes);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流
            if(fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
