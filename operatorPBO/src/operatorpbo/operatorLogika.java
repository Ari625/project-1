//keterangan nama package
package operatorpbo;
//keterangan nama class
public class operatorLogika {
//keterangan method
    public static void main(String[] args) {
        //Deklarasi variabel
        boolean a=true;
        boolean b=false;
        boolean hasil;
        
        //And
        hasil= a&&a;
        hasil= a&&b;
        hasil= b&&b;
        System.out.println("hasil dari a&&a:"+hasil);
        System.out.println("hasil dari a&b:"+hasil);
        System.out.println("hasil dari b&&b:"+hasil);
        
        //or
        hasil= a||b;
        hasil= a||a;
        hasil= b||b;
        System.out.println("hasil dari a||b:"+hasil);
        System.out.println("hasil dari a||a:"+hasil);
        System.out.println("hasil dari b||b:"+hasil);
        
        //Not
        hasil= !a;
        hasil= !b;
        System.out.println("hasil dari !a:"+hasil);
        System.out.println("hasil dari !b:"+hasil);
    }
    
}
