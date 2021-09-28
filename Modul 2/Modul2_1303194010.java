package modul2_1303194010;

import java.util.Scanner;

public class Modul2_1303194010 {

    public static void main(String[] args) {
        
        // Soal No. 1
        int mtxAB_1303194010[][] = { {1, 2}, {3, 4}, {5, 6} };
        
        System.out.println("Soal No. 1\nNormal Matrix:");
        for (int[] x : mtxAB_1303194010) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        System.out.println("Transpose Matrix:");
        for(int i = 0; i < 2; i++) {    
            for(int j = 0; j < 3; j++) {    
                System.out.print(mtxAB_1303194010[j][i]+" ");
            }
            System.out.println();
        }
        
        System.out.println("\n------------");
        
        // Soal No. 2
        System.out.println("\nSoal No. 2\nIsi Array:");
        int arr4_1303194010[][] = {
            {0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        
        // 5 10 15
        int five5 = 0;
        for(int i = 0; i <= 2; i++) {
            arr4_1303194010[0][i] = five5 + 5;
            five5 = five5 + 5;
        }
        
        // 2 4 6 8
        int plus2 = 0;
        for(int i = 0; i <= 3; i++) {
            arr4_1303194010[1][i] = plus2 + 2;
            plus2 = plus2 + 2;
        }
        
        // 1 4 9 16 25
        int multiplySame = 1;
        for(int i = 0; i <= 4; i++) {
            arr4_1303194010[2][i] = multiplySame * multiplySame;
            multiplySame++;
        }
        
        // 3 4 5 6 7
        int threeto7 = 3;
        for(int i = 0; i <= 5; i++) {
            arr4_1303194010[3][i] = threeto7;
            threeto7++;
        }
        
        for (int[] x : arr4_1303194010) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Bilangan yang dicari: ");
        int x = sc.nextInt();
        
        for(int i = 0; i <= 3; i++) {
            for(int j = 0; j <= (i + 2); j++) {
                if(x == arr4_1303194010[i][j]) {
                    System.out.println(x + " Berada di baris " + (i + 1) + " kolom " + (j + 1));
                }
            }
        }
        
    }    
    
}
