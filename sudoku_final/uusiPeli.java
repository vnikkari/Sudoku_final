package sudoku_final;

import static sudoku_final.arvoKentta.arvoKentta;
/**
 *
 * @author villenikkari & Marko Silander
 */
// en tiedä onko tarpeellinen koska arvoKentta() tulostaa jo suoraan pelattavan kentän???
public class uusiPeli { 
      /**
     *
     * @return palauttaa satunnaisesti valitun kentän, jonka pelaaja saa pelatakseen.
     */

    public static int[][] uusiPeli(){
        int[][] peli = arvoKentta();
        return peli;
    }
}

