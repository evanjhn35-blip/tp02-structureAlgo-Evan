/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02.structuresalgo;
import java.util.Scanner;
/**
 *
 * @author evanj
 */
public class Tp02StructuresAlgo {

    //EXO 7
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   
        int x = 1;
        int n = 0;
        int z;
        while (x > 0){
            System.out.print("Saisir la note " + x + ": " ); //saisir les notes
            z = sc.nextInt(); //prendre la valeur
            if (z < 0){ // si négatif alors arreter
                break;
            }
            n = n + z; //ajouter la valeur au compteur de notes
            x ++; //
            
        }
        System.out.println("La somme est :" +n );
        System.out.print("La moyenne est :" +n / (x - 1) );
    }
        
}
    

