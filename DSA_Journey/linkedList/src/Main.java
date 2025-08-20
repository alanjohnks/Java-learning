public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(18);
        list.insert(29);
        list.getSize();
        list.show();
        list.insertFirst(71);
        list.show();
        list.getSize();
        list.insertAt(3,41);
        list.getSize();
        list.show();
        list.deleteAt(0);
        list.deleteAt(3);
        list.show();
        list.getSize();
    }
}
