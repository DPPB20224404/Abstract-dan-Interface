
class Main {
  public static void main(String[] args) {
    Manajer adam = new Manajer();
    adam.sarapan();
    adam.nip = 1234;
    System.out.println("Gaji adam adalah : " + adam.getGaji());
  }
}