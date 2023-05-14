package front_office.task1;

import java.util.Map;

public class Performansist extends Thread {

    private Map<Integer, String> phrases;

    private static volatile int counter = 1;

    public static int getPhrasesCount() {
        return phrasesCount;
    }

    private static int phrasesCount;
    private String name;

    public Performansist(Map<Integer, String> phrases, String name) {
        this.phrases = phrases;
        phrasesCount = phrasesCount + phrases.size();
        this.name = name;
    }

    private void sayPhrase(Integer n) {
        System.out.println(name + ": " + phrases.get(n));
    }

    private void incCounter() {
        counter++;
    }

    @Override
    public void run() {
        while (true) {
            if (phrases.containsKey(counter)) {
                sayPhrase(counter);
                incCounter();
            }
            if (counter > phrasesCount)
                return;
        }
    }


}
