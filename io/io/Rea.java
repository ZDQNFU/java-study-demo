package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//字符流，字符占几个字节，就读几个字节
public class Rea {

    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            //文件名(+CHARSET)、file对象(+CHARSET)、文件描述符
            fileReader = new FileReader("D:/code/java/demo/io/test.txt");
            //读取一个字符,也可以读取字节数组
            int b;
            while ((b = fileReader.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流
            if(fileReader != null) {
                try {
                    fileReader.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
