package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//字节流
public class InS {
    public static void main(String[] args) {
        //声明流
        FileInputStream fileInputStream = null;
        try {
            //文件名、file对象、文件描述符
            fileInputStream = new FileInputStream("D:/code/java/demo/io/test.txt");
            //读取一个字节227
            System.out.println(fileInputStream.read());
            //循环读取,直到读取到-1结束
            int b;
            while((b = fileInputStream.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流
            if(fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    //批量读取字节，最后可能读取不足，导致重复
    public static void readBytes() {
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream("D:/code/java/demo/io/test.txt");
            //字节数组
            byte[] bytes = new byte[4];
            int length;
            //循环读取字节数组
            while((length=fileInputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes,0,length));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
