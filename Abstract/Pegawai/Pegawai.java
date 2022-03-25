public abstract class Pegawai{

  protected int nip = 0;
  
  public abstract int getGaji();
  public abstract void sarapan();
  
  public void kerja(){
    System.out.println("Sedang bekerja");
  }
}