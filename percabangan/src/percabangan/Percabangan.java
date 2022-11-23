//keterangan nama package
package percabangan;
import java.util.Scanner;
//keterangan nama class
public class Percabangan {
    //ketrengan Main method
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
     //keterangan nama variabel
     char merksepatu;
        merksepatu = 'A';
     System.out.print("masukan merk sepatu :");
     merksepatu=input.next().charAt(0);
     //percabangan if
     if (merksepatu=='A'){
         System.out.println("puma");}
     //percabangan else if
     else if(merksepatu=='B') {
         System.out.println("Dior");}
     else if(merksepatu=='C') {
         System.out.println("adidas");}
     else if(merksepatu=='D') {
         System.out.println("Nike");}
     //percabangan else
     else{
     System.out.println("merk sepatu tidak di ketahui");}   
     }
}
    
    

