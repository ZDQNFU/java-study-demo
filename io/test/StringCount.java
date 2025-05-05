package test;

public class StringCount {
    //统计一个字符串在另一个字符串中出现的次数
    public static void main(String[] args) {
        String str = "hello world hello java hello python";
        String str1 ="hello";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.startsWith(str1,i)){
                count++;
            }
        }
        System.out.println("count = " + count);

    }
}
