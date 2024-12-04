package Praktikum08.Tugas;

public class Kurakura extends HewanPeliharaan {
    String jenis;  // Type of turtle
    double berat;  // Weight

    // Constructor for KuraKura
    public Kurakura(String nama, int umur, String jenisMakanan, String jenis, double berat) {
        this.nama = nama;
        this.umur = umur;
        this.jenisMakanan = jenisMakanan;
        this.jenis = jenis;
        this.berat = berat;
    }

    // Implementation of makan
    @Override
    void makan() {
        System.out.println(nama + " sedang makan " + jenisMakanan);
    }

    // Implementation of displayInfo
    @Override
    void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Jenis Makanan: " + jenisMakanan);
        System.out.println("Jenis Kura-kura: " + jenis);
        System.out.println("Berat: " + berat + " kg");
    }
}