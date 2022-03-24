public class DoraMini extends Robot{
  public void sayDora(){
    System.out.println("Halo, Saya Dora Mini");
  }

  public void setNama(String nama){
    this.nama = nama;
  }
  
  public void displayData(){
    System.out.println(
      "Nama : " + nama +
      "\nPemilik : " + pemilik + 
      "\nTahun pembuatan : " + tahun);
  }
}