package Pertemuan8.kode;

public class SingleLinkedList {
    Node head;
    Node tail;

    public boolean isEmpety(){
        return head == null;
    }

    public void print(){
        if (!isEmpety()){
            Node tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println(" ");
        } else{
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(String input){
        Node ndInput = new Node(input, null);
        if (isEmpety()){ //jika linked list kosong
            head = ndInput; //head dan tail sama dengan node input
            tail = ndInput;
        } else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(String input){
        Node ndInput = new Node(input, null);
        if (isEmpety()){
            head = ndInput;
            tail = ndInput;
        } else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, String input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, String input){
        if(index < 0){
            System.out.println("Indeks salah");
        } else if(index == 0){
            addFirst(input);
        } else{
            Node temp = head;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next == null) tail =temp.next;
        }
    }

    public String getData(int index){
        Node tmp = head;
        for(int i=0; i<index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int indexOf(String key){
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }

        if(tmp == null){
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst(){
        if (isEmpety()){
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail){
            head = tail = null;
        } else{
            head = head.next;
        }
    }

    public void removeLast(){
        if (isEmpety()){
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail){
            head = tail = null;
        } else{
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key){
        if (isEmpety()){
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else{
            Node temp = head;
            while (temp != null){
                if((temp.data == key) && (temp == head)){
                    this.removeFirst();
                    break;
                } else if (temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt( int index){
        if(index == 0){
            removeFirst();
        } else{
            Node temp = head;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
        }
    }

    // Membuat method insertBefore untuk menambahkan node sebelum keyword yang diinginkan
    public void insertBefore(String key, String input) {
        Node ndInput = new Node(input, null);
    
        if (isEmpety()) {
            System.out.println("Linked List masih kosong, tidak dapat menambahkan sebelum keyword.");
            return;
        }
    
        if (head.data == key) {
            addFirst(input);
            return;
        }
    
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                return;
            }
            temp = temp.next;
        }
    
        System.out.println("Keyword tidak ditemukan dalam Linked List.");
    }
    
}
