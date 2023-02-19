import java.util.*;


class QueueGenerator {
    public static ArrayDeque<String> generate() {
        ArrayDeque<String> queue = new ArrayDeque<>();

        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int repeatCount = random.nextInt(50) + 1;

            StringBuilder stringA = new StringBuilder();
            for (int j = 0; j < repeatCount; j++) {
                stringA.append('a');
            }

            String generatedString = stringA.toString();
            queue.add(generatedString);
        }
        System.out.println("Queue: " + queue);
        return queue;
    }
}

class QueueSplitter {
    public static void split(ArrayDeque<String> queue) {
        ArrayList<String> evenList = new ArrayList<>();
        ArrayList<String> oddList = new ArrayList<>();

        for (String string : queue) {
            int aCount = string.length();
            if (aCount % 2 == 0) {
                evenList.add(string);
            } else {
                oddList.add(string);
            }
        }

        System.out.println("Even list: " + evenList);
        System.out.println("Odd list: " + oddList);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> queue = QueueGenerator.generate();
        QueueSplitter.split(queue);
    }
}