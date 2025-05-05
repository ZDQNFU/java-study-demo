package test;

public class OutResult {
    public static void main(String[] args) {
        String str = "hello world hello java hello python";
        char[] chars = {'h','e','l','l','o'};
        int count = 0;
        change(str, chars, count);
        System.out.println(str);
        System.out.println(chars);
        System.out.println(count);
    }

    public static void change(String str, char[] chars, int count) {
        str = "hello world";
        chars[0] = 'H';
        count = 10;
    }

}
