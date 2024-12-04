package Praktikum08;

public class Kurakura extends HewanPeliharaan {
    private String jenis;
    private double berat;

    public Kurakura(String nama, int umur, String jenisMakanan, String jenis, double berat) {
        super(nama, umur, jenisMakanan);
        this.jenis = jenis;
        this.berat = berat;
    }

    @Override
    public void makan() {
        System.out.println(nama + " sedang makan " + jenisMakanan + ".");
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama       : " + nama);
        System.out.println("Umur       : " + umur + " tahun");
        System.out.println("Jenis      : " + jenis);
        System.out.println("Berat      : " + berat + " kg");
        System.out.println("Makanan    : " + jenisMakanan);
    }
}
