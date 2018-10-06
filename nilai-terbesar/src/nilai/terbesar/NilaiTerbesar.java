/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai.terbesar;

/**
 *
 * @author dharyl
 */
public class NilaiTerbesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int p1 = 10, p2 = 23, p3 = 5, nmax;
        System.out.println("number 1\t= "+p1);
        System.out.println("number 1\t= "+p2);
        System.out.println("number 1\t= "+p3);
        nmax = (p2>p3)?(p2>p1)? p2:p1:p3;
        System.out.println("nilai tertingginya adalah\t= "+nmax);// TODO code application logic here
    }
    
}
