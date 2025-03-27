/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisoresi1157beebrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class DivisoresI1157Beebrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        for (int i = 1; i <= N; i++){
            if (N % i == 0){
                System.out.println(i);
            }
        }
    }
    
}
