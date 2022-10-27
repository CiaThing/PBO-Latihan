public class Main {
    public static void main(String[] args) {
        double r = 10;
        Lingkaran lingkaran = new Lingkaran(r);
        System.out.println("Luas lingkaran : " + lingkaran.luas());
        System.out.println("Keliling lingkaran : " + lingkaran.keliling());

        double alas = 10;
        double tinggi = 20;
        Segitiga segitiga = new Segitiga(alas, tinggi);
        System.out.println("Luas segitiga : " + segitiga.luas());
        System.out.println("Keliling segitiga : " + segitiga.keliling());
    }
}
