package Pertemuan10.Tugas.Tugas2;

public class DoublyLinkedList {
    NodeFilm head;
    int size;

    public DoublyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void addFilm(int id, String judul, double rating) {
        NodeFilm newFilm = new NodeFilm(id, judul, rating);

        if (isEmpty()) {
            head = newFilm;
        } else {
            newFilm.next = head;
            head.prev = newFilm;
            head = newFilm;
        }

        size++;
    }

    public void addLastFilm(int id, String judul, double rating) {
        NodeFilm newFilm = new NodeFilm(id, judul, rating);
    
        if (isEmpty()) {
            head = newFilm;
        } else {
            NodeFilm current = head;
            while (current.next != null) {
                current = current.next;
            }
            newFilm.prev = current;
            current.next = newFilm;
        }
    
        size++;
    }
    

    public void addFilmAtIndex(int index, int id, String judul, double rating) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid.");
            return;
        }

        NodeFilm newFilm = new NodeFilm(id, judul, rating);

        if (index == 0) {
            newFilm.next = head;
            if (head != null) {
                head.prev = newFilm;
            }
            head = newFilm;
        } else {
            NodeFilm current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newFilm.next = current.next;
            if (current.next != null) {
                current.next.prev = newFilm;
            }
            current.next = newFilm;
            newFilm.prev = current;
        }

        size++;
    }

    public void removeFirstFilm() {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
            return;
        }

        if (size == 1) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;

        System.out.println("Film pertama berhasil dihapus.");
    }

    public void removeLastFilm() {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
            return;
        }

        if (size == 1) {
            head = null;
        } else {
            NodeFilm current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }

        size--;

        System.out.println("Film terakhir berhasil dihapus.");
    }

    public void removeFilmById(int id) {
        NodeFilm current = head;
        while (current != null) {
            if (current.id == id) {
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    current.prev.next = current.next;
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                }
                size--;
                System.out.println("Film dengan ID " + id + " berhasil dihapus.");
                return;
            }
            current = current.next;
        }

        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
    }

    public SearchResult searchFilmByIdWithIndex(int id) {
        NodeFilm current = head;
        int index = 0;
        while (current != null) {
            if (current.id == id) {
                SearchResult result = new SearchResult();
                result.film = current;
                result.index = index;
                return result;
            }
            current = current.next;
            index++;
        }
        SearchResult result = new SearchResult();
        result.film = null;
        result.index = -1;
        return result;
    }

    public class SearchResult {
        public NodeFilm film;
        public int index;
    }

    public void sortFilmsByRatingDescending() {
        if (isEmpty() || size == 1) {
            return;
        }

        NodeFilm current = head;
        while (current != null) {
            NodeFilm nextFilm = current.next;
            while (nextFilm != null) {
                if (current.rating < nextFilm.rating) {
                    int tempId = current.id;
                    String tempJudul = current.judul;
                    double tempRating = current.rating;

                    current.id = nextFilm.id;
                    current.judul = nextFilm.judul;
                    current.rating = nextFilm.rating;

                    nextFilm.id = tempId;
                    nextFilm.judul = tempJudul;
                    nextFilm.rating = tempRating;
                }
                nextFilm = nextFilm.next;
            }
            current = current.next;
        }
        System.out.println("Film berhasil diurutkan berdasarkan rating (descending).");
    }

    public void printFilms() {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
            return;
        }

        NodeFilm current = head;
        System.out.println("--------------------------------------------------");
        System.out.println("                     Daftar Film                  ");
        System.out.println("--------------------------------------------------");
        System.out.println("ID   | Judul                           | Rating");
        System.out.println("--------------------------------------------------");
        while (current != null) {
            System.out.printf("%-4d | %-30s | %.2f\n", current.id, current.judul, current.rating);
            current = current.next;
        }
    }
}