package Pertemuan11.Praktikum1;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }
    
    public boolean isEmpty() {
        return root == null;
    }

    public void add(int data) {
        if(isEmpty()) {
            root = new Node(data);
        } else {
            Node current = root;
            while(true) {
                if(data < current.data) {
                    if(current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node(data);
                        break;
                    }
                } else if(data > current.data) {
                    if(current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public boolean find(int data) {
        boolean found = false;
        Node current = root;
        while(current != null) {
            if(current.data == data) {
                found = true;
                break;
            } else if(current.data > data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return found;
    }

    public void traversePreOrder(Node node) {
        if(node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    public void traversePostOrder(Node node) {
        if(node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    
    public void traverseInOrder(Node node) {
        if(node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    public Node getSuccessor(Node del) {
        Node successor = del.right;
        Node successorParent = del;
        while(successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(int data) {
        // Pengecekan tree
        if(isEmpty()) {
            System.out.println("Tree masih kosong!");
            return;
        }
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current != null) {
            if(current.data == data) {
                break;
            } else if(current.data > data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
    
        // Proses penghapusan
        if(current==null) {
            System.out.println("Data tidak ditemukan!");
            return;
        } else {
            // Jika tidak ada child
            if(current.left==null && current.right==null) {
                if(current==root) {
                    root = null;
                } else {
                    if(isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if(current.left==null) { // Jika tidak ada child kiri
                if(current==root) {
                    root = current.right;
                } else {
                    if(isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if(current.right==null) { // Jika tidak ada child kanan
                if(current==root) {
                    root = current.left;
                } else {
                    if(isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { // Jika memiliki 2 child
                Node successor = getSuccessor(current);
                if(current==root) {
                    root = successor;
                } else {
                    if(isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    // Tugas 1 menambahkan node dengan cara rekursif
    public void addRekursif(int data) {
        root = addRekursif(root, data);
    }
    
    public Node addRekursif(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
    
        if (data < current.data) {
            current.left = addRekursif(current.left, data);
        } else if (data > current.data) {
            current.right = addRekursif(current.right, data);
        }
    
        return current;
    }

    // Tugas 2 menambahkan method untuk menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree
    public int findMinimum() {
        if (root == null) {
            System.out.println("Tree masih kosong!");
            return Integer.MIN_VALUE;
        }
        Node current = root;
        while(current.left != null){
            current = current.left;
        }
        return current.data;
    }

    public int findMaximum() {
        if (root == null) {
            System.out.println("Tree masih kosong!");
            return Integer.MAX_VALUE;
        }
        Node current = root;
        while(current.right != null){
            current = current.right;
        }
        return current.data;
    }

    // Tugas 3 menambahkan method untuk menampilkan data yang ada di leaf
    void printLeaf(Node root) {
        if (isEmpty())
        return;
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
            return;
        }
        if (root.left != null)
        printLeaf(root.left);
        if (root.right != null)
        printLeaf(root.right);
    }

    // Tugas 4 menambahkan method untuk menampilkan berapa jumlah leaf yang ada di dalam tree
    public int countLeaf(){
        return countLeaf(root);
    }

    public int countLeaf(Node current){
        if(current == null){
            return 0;
        }
        if(current.left == null && current.right == null){
            return 1;
        }
        return countLeaf(current.left)+countLeaf(current.right);
    }
}