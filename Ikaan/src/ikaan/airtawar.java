package ikaan;
public class airtawar extends Ikaan {

    private String ikan = "Ikan Air Tawar"; //modifier
    private String contoh="Ikan Koi, Ikan Arwana, Ikan Cupang, dsb";
    private String hidup = "Perairan air tawar seperti danau, sungai, rawa rawa, dsb";
    
    public void setikan(String ikan){ //setter //overriding
    this.ikan = ikan; //this
    }
   
   public void cetak (){ //overriding
       System.out.println("jenis "+ikan);
       System.out.println("bergerak dengan cara "+super.bergerak);
       System.out.println("bernafas menggunakan "+super.bernafas);
       super.jenis();
       System.out.println("Contoh ikan air tawar = "+contoh);
       System.out.println("habitat nya berada "+hidup);
   } 
}
