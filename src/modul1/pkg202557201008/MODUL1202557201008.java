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
        System.out.println("==========SOAL KESATU==========");
    int [][] data = {{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
    //Cari rata-rata
    double Rata_rata=0;
    double Banyaknya_elemen=0;
    double Total_array=0;
    String Arraypertama="ARRAY AWAL :\n";
    for ( int a=0; a<data.length; a++){
        for ( int b=0; b<data[a].length; b++){
            System.out.print(data[a][b]+" ");
            Total_array=Total_array+data[a][b];
            Banyaknya_elemen=data.length*data[0].length;//data.length untuk baris, data[0].length untuk kolom
            Rata_rata=Total_array/Banyaknya_elemen;
            Arraypertama=Arraypertama+" "+data[a][b];}
        System.out.println("\n");// cetak ke baris berikutnya
        Arraypertama=Arraypertama+"\n";}// cetak ke baris berikutnya
        System.out.println("TOTAL ARRAY \t\t:"+Total_array);
        System.out.println("BANYAKNYA ELEMEN \t:"+Banyaknya_elemen);
        System.out.println("RATA-RATA \t\t:"+Rata_rata);
        JOptionPane.showMessageDialog(null,Arraypertama);
        // cari angka
        String Mencari=JOptionPane.showInputDialog("MAU CARI ANGKA APA CINTAKU??");
        int Angkacari = Integer.parseInt(Mencari);
        String Koordinat ="";
        boolean ketemuu=false;
        for(int a=0; a<data.length; a++){
            for(int b=0; b<data[a].length; b++){
                if(data[a][b]==Angkacari){
                    Koordinat=Koordinat+"["+a+"]"+" "+"["+b+"]"+"\n";
                   ketemuu=true;}
            }
        }
        if(ketemuu==true){
        JOptionPane.showMessageDialog(null,"ANGKA"+" "+Angkacari+" "+"SUDAH KETEMU DI INDEKS KE-\n"+Koordinat);
        }else{
            JOptionPane.showMessageDialog(null,"ANGKA YANG DICARI TIDAK KETEMU");
        }
        //ganti angka
        String Angkaganti=JOptionPane.showInputDialog("MAU DIGANTI DENGAN ANGKA APE?");
        int Ganti = Integer.parseInt(Angkaganti);
        String Arrayterbaru ="ARRAY BARU :\n";
        for(int a=0; a<data.length; a++){
            for(int b=0; b<data[a].length; b++){
                if (data[a][b]== Angkacari){
                   data[a][b] = Ganti;
               }
            }
        }
        JOptionPane.showMessageDialog(null,"OKE, MEMASUKKAN ANGKA BARU"+" "+Ganti);// array yang sudah dimasukki array baru
        for(int a=0; a<data.length; a++){
            for(int b=0; b<data[a].length; b++){
                System.out.print(data[a][b]+" ");
                Arrayterbaru=Arrayterbaru+" "+data[a][b];
            }
            System.out.println("\n");
            Arrayterbaru=Arrayterbaru+"\n";}
        JOptionPane.showMessageDialog(null,Arrayterbaru);
        //angka ganjil di array
        int Angkaganjil=0;
        String Ganjil="TOTAL ANGKA GANJIL :\n";
        for(int a=0; a<data.length; a++){
            for(int b=0; b<data[a].length; b++){
                if(b%2!=0){
                    Angkaganjil=Angkaganjil+data[a][b];
                }
            }
        }
        JOptionPane.showMessageDialog(null,Ganjil+Angkaganjil);
        System.out.println("TOTAL ANGKA GANJIL\t:"+Angkaganjil);
        // Soal no 2 
                System.out.println("==========SOAL KE DUA==========");
        String data2[][]={
                {"ABDUL","085646668991","Kediri"},
                {"KUSNO","086546668992","Trenggalek"},
                {"PONIRAN","085646668999","Bojonegro"}
        };
        System.out.println("NAMA\tNOMOR\t\tALAMAT\t");
        for(int d=0; d<data2.length; d++){
            System.out.println(data2[d][0]+"\t"+data2[d][1]+"\t"+data2[d][2]);
        }
    }  
}