/*
 Metodo Burbuja
 */
package video89;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Video89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[];
        int nElementos,aux;
        
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));
        arreglo = new int[nElementos];
        
        for (int i=0;i<nElementos;i++) {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = teclado.nextInt();
        }
        
        // Metodo Burbuja
        for (int i=0;i<(nElementos-1);i++){
            for (int j=0;j<(nElementos-1);j++){
                if (arreglo[j] > arreglo[j+1]){
                    aux= arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                    
                }
            }
        }
        
        // Mostrando el arreglo ordenado en forma creciente
        System.out.print("\nArreglo ordenado en forma creciente: ");
        for (int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.print("\nArreglo ordenado en forma decreciente");
        for ( int i=(nElementos-1);i>0;i--){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
        
    }
    
}  
