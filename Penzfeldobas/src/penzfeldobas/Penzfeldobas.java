/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penzfeldobas;

/**
 *
 * @author gycsaba
 */
enum PENZ {IRAS,FEJ};
public class Penzfeldobas {

    //Pénzfeldobások eredményeit tároló tömb. 1->FEJ 0->IRÁS
    static int[] penzt= {0,0,1,1,1,0,1,1,1,1,0,0,1,0,1,1,0,0,1,1,0,0,1,1,1,0,1,0,1,0,1,0,1,1,1,1,1,1,0,0,1,1,0,1,1,0,1,1,0,0,1};
    
    //Ugyan az a tömb enum tömb elem típussal
    //static PENZ[] penzt= {PENZ.IRAS,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.IRAS,PENZ.FEJ,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.FEJ,PENZ.IRAS,PENZ.FEJ,PENZ.IRAS,PENZ.FEJ,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.FEJ,PENZ.FEJ,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.FEJ,PENZ.FEJ,PENZ.IRAS,PENZ.IRAS,PENZ.FEJ};
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
