package Praktikum08.Tugas;

class Cat extends HewanPeliharaan {
    String ras;  // Breed
    String warnaBulu;  // Fur color

    // Constructor for Cat
    public Cat(String nama, int umur, String jenisMakanan, String ras, String warnaBulu) {
        this.nama = nama;
        this.umur = umur;
        this.jenisMakanan = jenisMakanan;
        this.ras = ras;
        this.warnaBulu = warnaBulu;
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
        System.out.println("Ras: " + ras);
        System.out.println("Warna Bulu: " + warnaBulu);
    }
}
