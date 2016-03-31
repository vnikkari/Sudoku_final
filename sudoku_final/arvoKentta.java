package sudoku_final;
import java.util.*;

/**
 *
 * @author villenikkari & Marko Silander
 */
 public class arvoKentta {
     
    /**
     * Arpoo valmiiksi tehdyistä kentistä yhden pelaajan pelattavaksi.
     * @return palauttaa kentan, jonka pelaaja saa pelattavakseen.
     */
    public static int[][] arvoKentta(){
        
       Random rdm = new Random();   
        int kentannumero =0;
       // 0 tarkoittaa tyhjää ruutua, jonka pelaaja täyttää
      int[][] k1 = {
        {0,0,0,0,6,0,0,0,0},
        {0,5,0,0,0,0,0,7,0},
        {6,9,2,0,0,0,1,3,4},
        {0,6,1,9,0,2,4,8,0},
        {2,0,0,6,5,8,0,0,1},
        {0,8,5,7,0,4,3,6,0},
        {5,3,9,0,0,0,6,2,8},
        {0,1,0,0,0,0,0,4,0},
        {0,0,0,0,9,0,0,0,0}};
      int[][] k2 = {
        {2,5,0,0,7,0,0,6,1},
        {0,0,6,1,0,5,8,0,0},
        {0,0,0,0,3,0,0,0,0},
        {4,0,5,0,0,0,9,0,8},
        {9,0,2,6,5,1,4,0,7},
        {1,0,3,0,0,0,5,0,6},
        {0,0,0,0,6,0,0,0,0},
        {0,0,9,5,0,3,1,0,0},
        {5,4,0,0,1,0,0,8,3}};
      int[][] k3 = {
        {5,0,8,0,1,0,7,0,2},
        {4,0,0,2,0,3,0,0,5},
        {9,6,0,0,0,0,0,3,1},
        {0,0,0,0,3,0,0,0,0},
        {1,4,6,7,0,2,9,5,3},
        {0,0,0,0,4,0,0,0,0},
        {6,9,0,0,0,0,0,1,7},
        {8,0,0,5,0,9,0,0,4},
        {3,0,4,0,6,0,5,0,9}};
      int[][] k4 = {
        {4,0,0,0,3,0,0,0,5},
        {0,6,2,0,0,0,8,9,0},
        {0,0,0,6,0,5,0,0,0},
        {2,0,5,0,0,0,6,0,8},
        {6,0,0,5,0,2,0,0,9},
        {7,0,3,0,0,0,5,0,1},
        {0,0,0,1,0,7,0,0,0},
        {0,2,7,0,0,0,3,1,0},
        {9,0,0,0,4,0,0,0,2}}; 
        
    
        kentannumero = 1+rdm.nextInt(4);
        
        if(kentannumero == 1){
                 return k1;               
         }
        else if(kentannumero == 2){
                 return k2;
         }
        else if(kentannumero == 3){
                return k3;
        }
        else{
                return k4;
        }
    }   
  
     
}
