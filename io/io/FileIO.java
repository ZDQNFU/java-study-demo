package io;

import java.io.File;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {

        // 创建文件
        File file = new File("D:/code/java/demo/io/test.txt");
        // 如果文件不存在则创建文件
        if(!file.exists()) {
            try {
                boolean result = file.createNewFile();
                System.out.println("文件创建结果：" + result);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
         //如果文件存在则重命名
        if(file.exists()) {
            File newFile = new File("D:\\code\\java\\demo\\test\\test_2.txt");
            boolean result = file.renameTo(newFile);
            System.out.println("文件重命名结果：" + result);
        }
        // 如果文件存在则删除文件
        if(file.exists()) {
            boolean result = file.delete();
            System.out.println("文件删除结果：" + result);
        }
        // 创建文件夹与创建文件基本相同

        //文件不为空时，采用递归删除
        deleteFile(file);

    }
    //文件不为空时，采用递归删除
    public static boolean deleteFile(File file) {
        if(file.isDirectory()&&file.exists()) {
            //列出所有文件
            File[] files = file.listFiles();
            for(File f : files) {
                deleteFile(f);
            }
        }
        return file.delete();
    }

    //缺少文件路径中的文件夹
    //常用于创建未知文件
    public static void createFile() {
        File file = new File("D:/code/java/demo/io/test.txt");
        if(!file.exists()) {
            //创建目录
            if(!file.getParentFile().mkdirs()){
                System.out.println("创建目录失败");
            }
        }
    }
}
