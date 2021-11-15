/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vucut_kitle_endeksi;
import java.util.Scanner;

/**
 *
 * @author MONSTER
 */
public class Vucut_kitle_endeksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double boy,kilo,endeks;
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz:");
        boy= input.nextDouble();
        
        System.out.print("Lütfen kilonuzu giriniz:");
        kilo= input.nextDouble();
        
        
        endeks= kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz:" +endeks);
        
        
        
        
        
        
    }
    
}
