package Pertemuan10.Tugas.Tugas2;

public class NodeFilm {
    int id;
    String judul;
    double rating;
    NodeFilm prev, next;

    public NodeFilm(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }
}