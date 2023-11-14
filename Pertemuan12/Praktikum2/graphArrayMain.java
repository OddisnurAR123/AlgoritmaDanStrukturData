package Pertemuan12.Praktikum2;

import java.util.Scanner;

public class graphArrayMain {
    public static void main(String[] args) {  
    int v, e, count = 1, to =0, from=0;
    Scanner oddis = new Scanner(System.in);
    graphArray <String> graph;
    try {
        System.out.print("Masukkan jumlah vertices\t: ");
        v = oddis.nextInt();
        System.out.print("Masukkan jumlah edges\t\t: ");
        e = oddis.nextInt();

        String[] vertexs = new String[v + 1];
        oddis.nextLine();
        for (int i = 1; i <= v; i++) {
            System.out.print(" Masukkan Data Vertex ke-" + i + " : ");
            vertexs[i] = oddis.nextLine();
        }

        graph = new graphArray<String>(vertexs);

        System.out.println("Masukkan edges: <to> <from>");
        while(count<=e){
            to = oddis.nextInt();
            from = oddis.nextInt();

            graph.makeEdge(to, from, 1);
            count++;
        }

        System.out.println("=================================================");
        System.out.println("Array 2D sebagai representasi graph sbb: ");
        System.out.println("=================================================");
        System.out.print("\t ");
        for (int i = 1; i<=v; i++){
            System.out.print(vertexs[i]+"\t");
        }
        System.out.println();

        for(int i=1; i<=v; i++){
            System.out.print(vertexs[i]+"\t");
            for(int j=1; j<=v; j++){
                System.out.print(graph.getEdge(i,j)+"\t");
            }
            System.out.println();
        }
    } catch (Exception E) {
        System.out.println("Error. Silakan cek kenbali\n"+E.getMessage());
    }
    oddis.close();
    }
}