import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

class Scratch {
    private static final List<String> NAMES = List.of("Ваня", "Петя", "Маша", "Аноним", "ДядяБоря", "Люба");
    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 5;
    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();

    }

    private static void add(String name, Queue<String> queue1, Queue<String> queue2){
        if (queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE){
            System.out.println("Гааааааляяяяя!");
            return;
        }
        if (queue1.size() < queue2.size()){
            queue1.offer(name);
        } else {
            queue1.offer(name);
        }
    }
    public static void randomFilling(Queue<String> queue){
        int size = RANDOM.nextInt(6);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }
}