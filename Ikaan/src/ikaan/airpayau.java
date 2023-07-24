package ikaan;
public class airpayau extends Ikaan{
   private String ikan = "Ikan Air Payau"; //modifier
    private String contoh="Ikan Nila, Ikan Bandeng, Ikan Mujaer, dsb";
    private String hidup = "Perairan yang memiliki campuran air tawar dan air asin seperti muara sungai";
    
    public void setikan(String ikan){ //setter //overriding
    this.ikan = ikan; //this
    }
   public void cetak (){ //overriding
       System.out.println("jenis  "+ikan);
       System.out.println("bergerak dengan cara "+super.bergerak);
       System.out.println("bernafas menggunakan "+super.bernafas);
       super.jenis();
       System.out.println("Contoh ikan air payau = "+contoh);
       System.out.println("habitat nya berada "+hidup);
   } 
  
}

