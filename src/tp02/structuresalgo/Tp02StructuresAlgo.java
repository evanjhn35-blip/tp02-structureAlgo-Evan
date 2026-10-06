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

    //EXO 8
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = (int)(Math.random() * 101);
        int essai = 0;
        int r;
        boolean bon = false;
        for (int t = 1; t <= 10; t++){
            System.out.print("Tentative "+ t + " ,Saisis un nombre : " );
            r = sc.nextInt();
            essai = t;
            if (r == n) {
                bon = true;
                break;
                }
            else if (r > n) {
                System.out.println("Trop grand !");
                }
            else {
                System.out.println("Trop petit !");
            }
        }
        if (bon){
            if(essai == 1){
                System.out.println("C'est de la triche ou de la voyance paranormale ! Va jouer au loto");
            }
            else if(essai >= 2 && essai <= 5){
                System.out.println("Felicitations, tu a trouve le nombre cache !");
            }
            else if(essai >= 6 && essai <= 9){
                System.out.println("Bravo c'est plutot pas mal !");
            }
            else if(essai >= 10){
               System.out.println("Tu as trouve ! C'etait tout juste"); 
            }
            }   
        else{
            System.out.println("Tu es nul au jeu arrete sa, le nombre etait : " +n); 
        }                  
    } 
}
    
        









        //EXO 7
        //int x = 1;
        //int n = 0;
        //int z;
        //while (x > 0){
            //System.out.print("Saisir la note " + x + ": " ); //saisir les notes
            //z = sc.nextInt(); //prendre la valeur
            //if (z < 0){ // si négatif alors arreter
                //break;
            //}
            //n = n + z; //ajouter la valeur au compteur de notes
            //x ++; //
            
        //}
        //System.out.println("La somme est :" +n );
        //System.out.print("La moyenne est :" +n / (x - 1) );
    //}
        
}
    

