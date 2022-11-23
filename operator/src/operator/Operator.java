//keterangan nama package
package operator;
import java.util.Scanner;
//keterangan nama class
public class Operator {
//keterangan method main
public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    //deklarasi variabel
    int a,b,x,y,hasil,score;
    boolean jawaban,c,d;
    String jawab;
    
    //operator aritamtika
    System.out.println("=====Operator Aritamtika=====");
    
    //inputan operator aritmatika
    System.out.print("Masukan angka pertama = ");
    a=input.nextInt();
    System.out.print("Masukan angka kedua = ");
    b=input.nextInt();
    
    System.out.println("\n");
    
    hasil=a+b;
    System.out.println("jawaban dari " + a + " + " + b + " = " +hasil);
    hasil=a-b;
    System.out.println("jawaban dari " + a + " - " + b + " = " +hasil);
    hasil=a*b;
    System.out.println("jawaban dari " + a + " * " + b + " = " +hasil);
    hasil=a/b;
    System.out.println("jawaban dari " + a + " / " + b + " = " +hasil);
    hasil=a%b;
    System.out.println("jawaban dari " + a + " % " + b + " = " +hasil);
    
    System.out.println("\n");
    
    //operator pembanding
    System.out.println("====Operator Pembanding====");
    
    //inputan operator pembanding
    System.out.print("Masukan nilai X = ");
    x=input.nextInt();
    System.out.print("Masukan nilai Z = ");
    y=input.nextInt();
    
    System.out.println("\n");
    
    jawaban=x < y;
    System.out.println("x < y = " + jawaban);
    jawaban=x > y;
    System.out.println("x > y = " + jawaban);
    jawaban=x <= y;
    System.out.println("x <= y = " + jawaban);
    jawaban=x >= y;
    System.out.println("x >= y = " + jawaban);
    jawaban=x == y;
    System.out.println("x == y = " + jawaban);
    jawaban=x != y;
    System.out.println("x != y = " + jawaban);
    
    System.out.println("\n");
    
    //operator logika
    System.out.println("====Operator Logika====");
    
    //inputan operator logika
    System.out.print("masukan nilai c = ");
    c=input.nextBoolean();
    System.out.print("masukan nilai d = ");
    d=input.nextBoolean();
    
    System.out.println("\n");
    
    jawaban=c&&d;
    System.out.println("jawaban c && d = " + jawaban);
    jawaban=d&&c;
    System.out.println("jawaban d && c = " + jawaban);
    jawaban=c||d;
    System.out.println("jawaban c || d = " + jawaban);
    jawaban=d||c;
    System.out.println("jawaban d || c = " + jawaban);
    jawaban=!c;
    System.out.println("jawaban !c = " + jawaban);
    jawaban=!d;
    System.out.println("jawaban !d = " + jawaban);
    
     System.out.println("\n");
     
     //operator ternary
     System.out.println("====Operator Ternary====");
     
     //inputan operator ternary
     System.out.print("masukan nilai anda = ");
     score=input.nextInt();
     
     System.out.println("\n");
     
     jawab = score > 78?"Lulus":"Tidak Lulus";
        System.out.println("anda dinyatakan " +jawab);
    } 
}