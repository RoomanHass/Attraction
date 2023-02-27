import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Person> queue = new ArrayDeque<>();
        for (Person q : generateClients()) {
            queue.offer(q);
        }
        System.out.println("Начинаем аттракцион!\n");
        while (!queue.isEmpty()) {
            if (queue.peek().getHowManyTickets() > 0) {
                System.out.println((queue.peek()) + " прокатился на аттракционе!");
                queue.peek().setHowManyTickets(queue.peek().getHowManyTickets() - 1);
                queue.offer(queue.poll());
            } else {
                System.out.println(queue.poll() + " закончились билеты!");
            }
        }
        System.out.println("\nАттракцион завершен!");
    }

    public static List<Person> generateClients() {
        LinkedList<Person> list = new LinkedList<>();
        list.add(new Person("John", "Bukovski", 6));
        list.add(new Person("Петр", "Илов", 4));
        list.add(new Person("Sergey", "Maslov", 8));
        list.add(new Person("Agro", "Romero", 3));
        list.add(new Person("Neill", "Washington", 5));
        return list;
    }
}