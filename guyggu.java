import java.util.LinkedList;

public class guyggu {

    public static void main(String[] args) {
        System.out.println("hello world");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.offer(6);
        System.out.println(list.poll());
    }

}
