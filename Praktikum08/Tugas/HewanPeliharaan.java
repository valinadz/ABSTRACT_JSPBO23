package Praktikum08.Tugas;

abstract class HewanPeliharaan {
    String nama;  // Name
    int umur;     // Age
    String jenisMakanan;  // Type of food

    // Abstract method makan
    abstract void makan();

    // Abstract method displayInfo
    abstract void displayInfo();
}