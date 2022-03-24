public abstract class Robot{
  protected String nama;
  protected String pemilik;
  protected int tahun;

  public abstract void setNama(String nama);
  public abstract void displayData();

  public void setTahun(int tahun){
    this.tahun = tahun;
  }
  
}