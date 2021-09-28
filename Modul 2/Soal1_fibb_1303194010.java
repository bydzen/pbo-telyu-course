package soal1_fibb_1303194010;

public class Soal1_fibb_1303194010 {

    public static void main(String[] args) {
        int n, fn_1303194010, fn1_1303194010, fn2_1303194010;
        
        n = 10;
        
        fn2_1303194010 = 0;
        fn1_1303194010 = 1;
        fn_1303194010 = 1;
        
        for(int i = 1; i <= n; i++) {
            System.out.print(fn_1303194010 + " ");
            fn_1303194010 = fn1_1303194010 + fn2_1303194010;
            fn2_1303194010 = fn1_1303194010;
            fn1_1303194010 = fn_1303194010;
        }
        
    }
    
}
