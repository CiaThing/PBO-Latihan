public class Anak extends Induk {
    public Anak(){
        super();
        System.out.println("Ini adalah constructor Anak");
    }
    public void informasi(){
        System.out.println("Nama = " + this.nama);
    }
    @Override
    public void makan(){
        super.makan();
        System.out.println("Saya suka makan mie ayam");
    }
}
