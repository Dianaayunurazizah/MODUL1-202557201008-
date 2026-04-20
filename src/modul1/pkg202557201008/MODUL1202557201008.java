/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1.pkg202557201008;
import javax.swing.JOptionPane;
/**
 *
 * @author Acer
 */
public class MODUL1202557201008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [][] data = {{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
    int Rata_rata=0;
    int Banyaknya_elemen=0;
    int Total_array=0;
    for ( int a=0; a<data.length; a++){
        for ( int b=0; b<data[a].length; b++){
            System.out.print(data[a][b]+" ");
            Total_array=Total_array+data[a][b];
            Banyaknya_elemen=data.length*data[0].length;//data.length untuk baris, data[0].length untuk kolom
            Rata_rata=Total_array/Banyaknya_elemen;}
        System.out.println("\n");}
        System.out.println("TOTAL ARRAY :\t"+Total_array);
        System.out.println("BANYAKNYA ELEMEN :\t"+Banyaknya_elemen);
        System.out.println("RATA-RATA :\t"+Rata_rata);
    }
    
}
