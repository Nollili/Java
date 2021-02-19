package matrix;

import java.util.Random;


public class Matrix {


    public static void main(String[] args) {
        Random r = new Random();
        
        //Matrix feltoltese
        int matrix[][] = {{3,6},
                          {7,9}};
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                matrix[i][j] = r.nextInt(10);   //i a sor, j az oszlop
            }
        }
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println("sor index : " + i + "; osztlop index: " + j + "; tomb eleme: " + matrix[i][j]);  //i a sor, j az oszlop
            }
        }
    }
    
}
