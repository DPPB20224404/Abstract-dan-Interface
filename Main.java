import Abstract.Pegawai.*;

class Main {
  public static void main(String[] args) {
    DoraMini dora = new DoraMini();
    dora.setNama("Dora");
    dora.pemilik = "Nobita";
    dora.setTahun(2250);

    dora.sayDora();
    dora.displayData();

    DoraMiniCopy doraMini = new DoraMiniCopy();
    doraMini.setNama("Dora");
    doraMini.setPemilik("Nobita");
    doraMini.setTahunPembuatan(2250);
    doraMini.sayDora();
    doraMini.displayKantongAjaib();
    doraMini.displayData();
  }
}