public class List {
    Node p_head;
    int size;

    List() {
    }

    public List(Node n_head) {
        this.p_head = n_head;
        this.size = 1;
    }

    boolean isEmpty() {
        return size==0;
    }

    void clear() {
        p_head=null;
        size=0;
    }
    
    void show() {
        Node node = p_head;
        while (node!=null) {
            System.out.print("   "+node.p_data.id);
            node=node.p_next;
        }
        System.out.println("\n");
    }

    void show2() {
        Node node = p_head;
        while (node!=null) {
            if (node.p_data.year>2020) {
                System.out.print("   "+node.p_data.id);
            }
            node=node.p_next;
        }
        System.out.println("\n");
    }

    void addFirst(Node data) {
        Node node = data;
        node.p_next=p_head;
        p_head=node;
        size++;
    }

    void addLast(Node data) {
        Node node = p_head;
        while (node.p_next!=null) {
            node=node.p_next;
        }
        node.p_next=data;
        size++;
    }

    void addNode(Node data, int PhoneID) {
        Node node = p_head;
        boolean checkFirst=false; 
        /*the checkFirst is to make sure that only the first node with PhoneID 
        is added a new node after itself
        */
        while (node!=null&&checkFirst==false) {
            if (node.p_data.id==PhoneID) {
                data.p_next = node.p_next;
                node.p_next = data;
                checkFirst=true;
            }
            node=node.p_next;
        }
        if (checkFirst==false) addLast(data);
    }

    void deleteFirst() {
        p_head=p_head.p_next;
        size=size-1;
    }

    void deleteLast() {
        int count=1;
        Node node = p_head;
        while (node!=null) {
            if (count==size-1) {
                node.p_next=null;
            }
            node=node.p_next;
            count++;           
        }
        size=size-1;
    }

    boolean isExisting(int PhoneID) {
        Node node = p_head;
        while (node!=null) {
            if (node.p_data.id==PhoneID) {
                return true;
            }
            node=node.p_next;
        }
        return false;
    }

    void deleteNode(int PhoneID) {
        Node node = p_head;
        while (node!=null) {
            if (node.p_data.id==PhoneID) {
                getNodeByNext(node).p_next=node.p_next;
                size=size-1;
            }
            node=node.p_next;
        }
    }

    int search(String name) {
        int count=0;
        Node node = p_head;
        while (node!=null) {
            if (node.p_data.name.equalsIgnoreCase(name)) {
                count++;
            }
            node=node.p_next;
        }
        return count;
    }

    Node maxValue() {
        Node node = p_head;
        Node nodeWithMax = null;
        int max = p_head.p_data.amount*p_head.p_data.price;
        while (node!=null) {
            if (node.p_data.amount*node.p_data.price==max) {
                max=node.p_data.amount*node.p_data.price;
                nodeWithMax = node;
            }
            node=node.p_next;
        }
        return nodeWithMax;
    }
    //CUSTOM METHOD
    Node getNodeByNext(Node inputNode) {
        Node node = p_head;
        while (node!=null) {
            if (node.p_next==inputNode) {
                return node;
            }
            node=node.p_next;
        }
        return null;
    }

}