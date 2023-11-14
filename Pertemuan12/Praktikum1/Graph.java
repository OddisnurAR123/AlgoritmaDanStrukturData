package Pertemuan12.Praktikum1;

public class Graph <T> {
    // Tugas Nomor 4 mengubah tipe data vertex dari Integer menjadi tipe generic
    T[] vertex;
    /*int vertex;*/
    LinkedList list[];
    // Tugas Nomor 2 menambahkan method graphType dengan tipe boolean yang akan membedakan graph termasuk directed atau undirected graph
    boolean graphType; //true = directed, false = undirected
    public Graph(T[] vertex){
        this.vertex = vertex;
        list = new LinkedList[vertex.length];
        for(int i = 0; i <vertex.length; i++) {
            list[i]=new LinkedList();
        }
    }

    public boolean getGraphType() {
        return this.graphType;
    }

    public void addEdge(int source, int destination) {
        if (getGraphType()) {
             list[source].addFirst(destination);
        } else {
            list[source].addFirst(destination);
            list[destination].addFirst(source);
        }
    }

    public void degree(int source) throws Exception {
        if (getGraphType()) { // Directed Graph
            int totalIn = 0, totalOut = 0;
    
            // Hitung indegree (jumlah incoming edges)
            for(int i = 0; i < vertex.length; i++) {
                for(int j = 0; j < list[i].size(); j++) {
                    if(list[i].get(j) == source) {
                        totalIn++;
                    }
                }
            }
    
            // Hitung outdegree (jumlah outgoing edges)
            totalOut = list[source].size();
            
            System.out.println("Indegree dari vertex " + source + " : " + totalIn);
            System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
            System.out.println("Total degree dari vertex " + source + " : " + (totalIn + totalOut));
        } else { // Undirected Graph
            int degree = list[source].size();
            System.out.println("Degree dari vertex " + source + " : " + degree);
        }
    }    
    
    /*public Graph(int vertex){
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for(int i = 0; i <vertex; i++) {
            list[i]=new LinkedList();
        }
    }
        
    public void addEdge(int source, int destination){
        //add edge
        list[source].addFirst(destination);

        //add back edge(for undirected)
        list[destination].addFirst(source);
    }
        
    public void degree(int source)throws Exception{
        //degree undirected graph
        System.out.println("degree vertex "+source+" : "+list[source].size());
            
        //degree directed graph
            //inDegree
        int k, totalIn = 0, totalOut = 0;
        for(int i=0; i<vertex; i++){
            for(int j=0; j<list[i].size(); j++) {
                if(list[i].get(j)==source) {
                    ++totalIn;
                }
            }
            //OutDegree
            for(k=0; k<list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
            }
            System.out.println("Indegree dari vertex "+source+" : "+totalIn);
            System.out.println("Outdegree dari vertex "+source+" : "+totalOut);
            System.out.println("Degree vertex "+source+" : "+(totalIn+totalOut));
    }*/
    
    // Tugas Nomor 3 modifikasi method removeEdge agar tidak menghasilkan output yang salah untuk path selain path pertama kali
    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < list[source].size(); i++) {
            if (destination == list[source].get(i)) {
                list[source].remove(i);
            }
        }
    }
    
    /*public void removeEdge(int source, int destination)throws Exception{
        for(int i=0; i<vertex; i++){
            if(i==destination){
                list[source].remove(destination);
            }
        }
    }*/
        
    public void removeAllEdges(){
        for(int i=0; i<vertex.length; i++){
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    
    public void printGraph() throws Exception {
        for (int i = 0; i < vertex.length; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + vertex[i] + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(vertex[list[i].get(j)] + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }    
}