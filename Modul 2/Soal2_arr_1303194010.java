package soal2_arr_1303194010;

public class Soal2_arr_1303194010 {

    public static void main(String[] args) {
        
        //int[][] array2D_1303194010 = new int[4][6];
        
        int array2D_1303194010[][] = { {0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0} };
        
        /*int[][] array2D_1303194010 = {
            {3, 6, 9},
            {1, 3, 5, 7},
            {1, 2, 6, 24, 120},
            {1, 2, 3, 4, 5, 6}
        };*/
        int i;
                
        // 3 6 9
        int kel3_1303194010 = 0;
        for(i = 0; i < 3; i++) {
            kel3_1303194010 = kel3_1303194010 + 3;
            array2D_1303194010[0][i] = kel3_1303194010;
            System.out.print(kel3_1303194010 + " ");
        }
        
        System.out.println();
        
        // 1 3 5 7
        int ganjil4_1303194010 = -1;
        for(i = 0; i < 4; i++) {
            ganjil4_1303194010 = ganjil4_1303194010 + 2;
            array2D_1303194010[1][i] = ganjil4_1303194010;
            System.out.print(ganjil4_1303194010 + " ");
        }
        
        System.out.println();
        
        // 1 2 6 24 120
        int fak_1303194010 = 1;
        for(i = 0; i < 5; i++) {
            fak_1303194010 = fak_1303194010 * (i + 1);
            array2D_1303194010[2][i] = fak_1303194010;
            System.out.print(fak_1303194010 + " ");
        }
        
        System.out.println();
        
        // 1 2 3 4 5 6
        int count6_1303194010 = 1;
        for(i = 0; i < 6; i++) {
            count6_1303194010++;
            array2D_1303194010[3][i] = count6_1303194010;
            System.out.print(count6_1303194010 + " ");
        }
        
        System.out.println("\n");
        
        // Print array
        for (int[] baris : array2D_1303194010) {
            for (int j : baris) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
    }
    
}
