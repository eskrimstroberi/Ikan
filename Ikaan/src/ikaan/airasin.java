package ikaan;
public class airasin extends Ikaan {

     String ikan   = "Ikan Air Asin"; //modifier
     String contoh = "Ikan Hiu, Ikan Dori, Ikan Tuna, ikan mataharei. dsb";
     String hidup  = "Perairan yang memiliki kadar garam yang tinggi seperti laut ";
     int jumlahspesies;
    
    
    public void setikan(String ikan){ //setter //overriding
    this.ikan = ikan; //this
    }
    String getikan() { //getter
      return ikan;
    }
   public void cetak (){ //overriding
       System.out.println("jenis  "+ikan);
       System.out.println("bergerak dengan cara "+super.bergerak);
       System.out.println("bernafas menggunakan "+super.bernafas);
       super.jenis();
       System.out.println("Contoh ikan air asin = "+contoh);
       System.out.println("habitat nya berada "+hidup);
   } 
   void jumlahspesies (int jumlahspesies){ //overloading
   jumlahspesies = jumlahspesies;
   System.out.println("memiliki jumlah spesies kurang lebih "+jumlahspesies+" di dunia");
   }
} 
    

