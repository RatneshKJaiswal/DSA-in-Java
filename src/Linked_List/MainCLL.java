package Linked_List;

public class MainCLL {

    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(12);
        list.insert(13);
        list.insert(14);
        list.insert(15);
        list.display();

        list.delete(1);
        list.display();
    }

}
