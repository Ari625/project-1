//keterangan nama package
package operatorpbo;
//keterangan nama class
public class operatorpembanding {
//keterangan method
    public static void main(String[] args) {
        //Deklarasi Variabel
        int NilaiA=10;
        int NilaiD=20;
        boolean hasil;
        
        //Lebih besar
        hasil=NilaiA>NilaiD;
        System.out.println("hasil dari lebih besar:"+hasil);
        
        //lebih kecil
        hasil=NilaiA<NilaiD;
        System.out.println("hasil dari lebih kecil:"+hasil);
        
        //lebih besar sama dengan 
        hasil=NilaiA>=NilaiD;
        System.out.println("hasil dari lebih besar sama dengan:"+hasil);
        
        //lebih kecil sama dengan 
        hasil=NilaiA<=NilaiD;
        System.out.println("hasil dari lebih kecil sama dengan:"+hasil);
        
        //sama dengan
        hasil=NilaiA==NilaiD;
        System.out.println("hasil dari sama dengan:"+hasil);
        
        //tidak sama dengan
        hasil=NilaiA!=NilaiD;
                System.out.println("hasil dari tidak sama dengan:"+hasil);
    }
    
}
