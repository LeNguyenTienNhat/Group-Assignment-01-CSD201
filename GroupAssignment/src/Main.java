
public class Main {

    public static void main(String[] args) {
        List list = new List(addPhone(0, "Nokia", 40, 35, 2021));
        list.addLast(addPhone(1, "Thanh", 20, 1, 2013));
        list.addLast(addPhone(2, "Vinh", 20, 3, 2014));
        list.addLast(addPhone(3, "Nhat", 7, 7, 2015));
        list.addLast(addPhone(4, "Xavier", 50, 9, 2023));
        list.addLast(addPhone(5, "Vladimir", 45, 2, 2017));
        list.addFirst(addPhone(9, "HuTao", 78, 65, 2022));
        list.addLast(addPhone(6, "HuTao", 78, 65, 2022));
        list.addLast(addPhone(12, "HuTao", 78, 65, 2022));
        list.addLast(addPhone(43, "HuTao", 78, 65, 2022));

        System.out.println("Running show()"); list.show();
        System.out.println("Running show2()"); list.show2();
        System.out.println("Running deleteFirst()"); list.deleteFirst(); 
        list.show();
        System.out.println("Running deleteLast()"); list.deleteLast(); 
        list.show();
        System.out.println("Size of List: "+list.size);
        System.out.println("The result of checking whether the Node with PhoneID=3 exists or not is: "+list.isExisting(3));
        System.out.println("Running addNode()"); list.addNode(addPhone(8, "Yanfei", 69, 5, 2024), 5);
        list.show();
        System.out.println("Running deleteNode"); list.deleteNode(4); 
        list.show();
        System.out.println("The result of search('HuTao') is: "+list.search("HuTao")); 
        System.out.println("The node having max value is: "+list.maxValue().p_data.id
        +" with the value: "+list.maxValue().p_data.amount*list.maxValue().p_data.price); 
    }

    public static Node addPhone(int id, String name, int price, int amount, int year) {
        Phone phone = new Phone(id, name, price, amount, year);
        Node node = new Node(phone, null);
        return node;
    }


}
