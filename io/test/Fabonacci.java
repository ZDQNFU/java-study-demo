package test;

public class Fabonacci {
    public static void main(String[] args) {
        fn(30);
        System.out.println(fn(30));
    }

    public static int fn(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fn(n-1) + fn(n-2);
    }
}
