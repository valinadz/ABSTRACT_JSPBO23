package Praktikum08;

public abstract class HewanPeliharaan {
    protected String nama;
    protected int umur;
    protected String jenisMakanan;

    public HewanPeliharaan(String nama, int umur, String jenisMakanan) {
        this.nama = nama;
        this.umur = umur;
        this.jenisMakanan = jenisMakanan;
    }

    public abstract void makan();
    public abstract void displayInfo();
}
