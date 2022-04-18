package tugas.pkg2;

/**
 *
 * @author Ni Kadek Dwi Lestari (20103009)
 */
public class volumebalok {
    
    double Pj;
    double Lb;
    double Tg;
    double volumebalok;
    
    /* constructor*/
    public volumebalok (double npj, double nlb, double ntg){
        setPj(npj);
        setLb(nlb);
        setTg(ntg);
    }
    
    /* METHOD  SET PANJANG*/
    public void setPj(double npj){
        this.Pj = npj;
    }
    
    /* METHOD SET LEBAR*/
    public void setLb (double nlb){
        this.Lb = nlb;
    }
    
    /* METHOD SET TINGGI*/
    public void setTg (double ntg){
        this.Tg = ntg;
    }
    
    /*
     Method double HitungVolumeBalok
     */
     private double HitungVolumeBalok(){
         this.volumebalok = Pj*Lb*Tg;
         return this.volumebalok;
     }
     
      /*Method : CetakVolumeBalok */
     public void CetakVolumeBalok(){
         this.HitungVolumeBalok();
         System.out.println("Hitung Volume Balok");
         System.out.println("-----------------------");
         System.out.println("Nilai Panjang   :"+this.Pj+"cm");
         System.out.println("Nilai Lebar     :"+this.Lb+"cm");
         System.out.println("Nilai Tinggi    :"+this.Tg+"cm");
         System.out.println("Jadi Volume Balok :"+this.volumebalok+"cm2");
     
     }
    
  

    }
        
    


    
    
    
        

    

