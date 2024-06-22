package Linked_List;

public class MainLL {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.display();

        list.insertLast(23);
        list.insertLast(87);
        list.display();

        list.insertIndex(3,45);
        list.display();

        System.out.println(list.deleteFirst()+" Removed ");
        list.display();

        System.out.println(list.deleteLast()+" Removed ");
        list.display();

        System.out.println(list.deleteIndex(2)+" Removed ");
        list.display();
    }
}
