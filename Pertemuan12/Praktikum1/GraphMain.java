package Pertemuan12.Praktikum1;

import java.util.Scanner;

public class GraphMain {
    private static boolean graphType;

    public static void main(String[] args) throws Exception {
        /*Graph graph = new Graph(6);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(3,0);
        graph.printGraph();
        graph.degree(2);

        // Penambahan Pemanggilan method removeEdge()
        graph.removeEdge(1,2);
        graph.printGraph();*/

        // Tugas Nomor 1 Mengubah lintasan menjadi inputan
        /*Scanner oddis = new Scanner(System.in);
        Graph graph = new Graph(6);
        int vertex, edge, source, destination;

        System.out.print("Masukkan Vertex\t\t: ");
        vertex = oddis.nextInt();

        System.out.print("Masukkan Edge\t\t: ");
        edge = oddis.nextInt();

        System.out.println("=================================================");

        for(int i = 0; i<edge; i++) {
            System.out.print("Masukkan Source\t\t: ");
            source = oddis.nextInt();
            System.out.print("Masukkan Destination\t: ");
            destination = oddis.nextInt();

            graph.addEdge(source, destination);
        }

        System.out.println("=================================================");
        graph.printGraph();
        graph.degree(2);

        graph.removeEdge(1,2);
        graph.printGraph();*/

        // Tugas Nomor 2 menambahkan method graphType dengan tipe boolean yang akan membedakan graph termasuk directed atau undirected graph
        /*Scanner oddis = new Scanner(System.in);
        Graph graph = new Graph(6);
        int vertex, edge, source, destination;

        boolean graphType = false;

        System.out.println("=================================================");
        System.out.print("Masukkan Vertex\t\t: ");
        vertex = oddis.nextInt();

        System.out.print("Masukkan Edge\t\t: ");
        edge = oddis.nextInt();

        System.out.println("=================================================");
        System.out.println("1. Directed Graph");
        System.out.println("2. Undirected Graph");
        System.out.println("=================================================");
        System.out.print("Pilih Type Graph: ");
        int intGraphType = oddis.nextInt();
        graphType = intGraphType == 1 ? true : false;

        if (graphType) {
            System.out.println("Menggunakan directed graph");
        } else {
            System.out.println("Menggunakan undirected graph");
        }

        System.out.println("=================================================");

        for (int i = 0; i < edge; i++) {
            System.out.print("Masukkan Source\t\t: ");
            source = oddis.nextInt();
            System.out.print("Masukkan Destination\t: ");
            destination = oddis.nextInt();

            if (graphType) {
                graph.addEdge(source, destination);
            } else {
                graph.addEdge(source, destination);
                graph.addEdge(destination, source);
            }
        }

        System.out.println("=================================================");
        graph.printGraph();
        graph.degree(2);

        // Tugas Nomor 3 sudah melakukan modifikasi di class graph maka akan diuji disini saya mencoba source 1, destination 3
        graph.removeEdge(1,2);
        graph.printGraph();*/

        // Tugas Nomor 4 mengubah tipe data vertex dari Integer menjadi tipe generic
        Scanner oddis = new Scanner(System.in);
        System.out.print("Masukkan Vertex\t: ");
        String[] vertex = new String[oddis.nextInt()];
        oddis.nextLine();

        for (int i = 0; i < vertex.length; i++) {
            System.out.print("Masukkan data Vertex ke-" + i + " : ");
            vertex[i] = oddis.nextLine();
        }

        Graph<String> graph = new Graph<>(vertex);

        System.out.print("Masukkan Edge\t\t: ");
        int edge = oddis.nextInt();

        int menu;
        do {
            System.out.println("=================================================");
            System.out.println("                 Pilihan Type Graph              ");
            System.out.println("=================================================");
            System.out.println("1. Directed Graph");
            System.out.println("2. Undirected Graph");
            System.out.println("=================================================");
            System.out.print("Pilih Type Graph: ");
            menu = oddis.nextInt();

            if (menu == 1) {
                System.out.println("Masukkan Edge: <from> <to>");
                for (int i = 0; i < edge; i++) {
                    graph.addEdge(oddis.nextInt(), oddis.nextInt());
                }
                graph.printGraph();
                break;
            } else if (menu == 2) {
                System.out.println("Masukkan Edge: <from> <to>");
                for (int i = 0; i < edge; i++) {
                    graph.addEdge(oddis.nextInt(), oddis.nextInt());
                    graph.addEdge(oddis.nextInt(), oddis.nextInt());
                }
                graph.printGraph();
            }
        } while (menu == 1 || menu == 2);
    }
}