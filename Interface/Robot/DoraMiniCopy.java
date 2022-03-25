public class DoraMiniCopy implements Doraemon, RobotCopy{
  private String nama;
  private String pemilik;
  private int tahun;

  public String getPemilik(){
    return this.pemilik;
  }

  public void sayDora(){
    System.out.println("Halo, saya Dora Mini");
  }
  
  public void displayKantongAjaib(){
    System.out.println("Saya juga seperti Doraemon yang memiliki kantung ajaib");
  }

  public void setPemilik(String pemilik){
    this.pemilik = pemilik;
  }
  public void setNama(String nama){
    this.nama = nama;
  }
  public void setTahunPembuatan(int tahun){
    this.tahun = tahun;
  }
  public void displayData(){
    System.out.println(
      "Nama : " + nama +
      "\nPemilik : " + pemilik + 
      "\nTahun pembuatan : " + tahun);
    
  }
}