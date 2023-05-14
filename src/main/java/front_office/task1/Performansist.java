package front_office.task1;

import java.util.Map;

public class Performansist extends Thread {

    /**
     * Фразы конкретного актёра с номер в котором он должен их сказать
     */
    private Map<Integer, String> phrases;

    /**
     * Счётчик фраз для всех актеров
     */
    private static volatile int counter = 1;
    /**
     * Общее количество всех враз в сценке
     */
    private static int phrasesCount;
    /**
     * Имя актера
     */
    private String name;

    public Performansist(Map<Integer, String> phrases, String name) {
        this.phrases = phrases;
        phrasesCount = phrasesCount + phrases.size();
        this.name = name;
    }
    /**k;kk
     * Выписывает в косноль фразу
     *
     * @param n номер фразы в сценке
     */
    private void sayPhrase(Integer n) {
        System.out.println(name + ": " + phrases.get(n));
    }
    @Override
    public void run() {
        while (true) {
            if (phrases.containsKey(counter)) {
                sayPhrase(counter);
                counter++;
            }
            if (counter > phrasesCount)
                return;
        }
    }
}
