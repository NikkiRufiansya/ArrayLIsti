package latihanpraktikum21;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author nikki rufiansya
 */

public class Latihanpraktikum21 {

    /**
     * @param args the command line arguments
     */
    static class datamahasiswa{
    String nama;
    int NRP;
    String Alamat;
    public datamahasiswa (String nama, int NRP, String ALamat){
      this.nama = nama;
      this.NRP = NRP;
      this.Alamat = ALamat;
    }
}
    public static void main(String[] args) {
        ArrayList<datamahasiswa> data = new ArrayList<datamahasiswa>();
        data.add(new datamahasiswa("nikki" , 151111035 , "jl.candi"));
        data.add(new datamahasiswa("Arrizky ,", 151111026,"jl. suhat"));
        data.add(new datamahasiswa("dika ,", 151111023,"jl. lawang"));
        data.add(new datamahasiswa("dani ,", 151111021,"jl. tidar"));
        data.add(new datamahasiswa("ilmah ,", 151111056,"jl. suhat"));
        
        for( int i = 0; i<data.size();i++){
                    datamahasiswa anggota = data.get(i);
                    System.out.println(anggota.nama);
                    System.out.println(anggota.NRP);
                    System.out.println(anggota.Alamat);
                }
      
            
                 
          }   
             
        }
    

    
