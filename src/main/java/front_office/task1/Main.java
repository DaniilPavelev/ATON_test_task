package front_office.task1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Integer,String> JoeyPhrases = new HashMap<>();
    private static Map<Integer,String> ChandlerPhrases = new HashMap<>();
    private static Map<Integer,String> MonicaPhrases = new HashMap<>();
    private static Map<Integer,String> PhoebePhrases = new HashMap<>();
    private static Map<Integer,String> RachelPhrases = new HashMap<>();
    private static Map<Integer,String> RossPhrases = new HashMap<>();

    public static void main(String[] args) {

        fillPhrases();

        /** Создание 6-ти потоков */
        Performansist Joey = new Performansist(JoeyPhrases,"Joey");
        Performansist Chandler = new Performansist(ChandlerPhrases, "Chandler");
        Performansist Monica = new Performansist(MonicaPhrases, "Monica");
        Performansist Phoebe = new Performansist(PhoebePhrases,"Phoebe");
        Performansist Rachel = new Performansist(RachelPhrases,"Rachel");
        Performansist Ross = new Performansist(RossPhrases,"Ross");

        Joey.start();
        Chandler.start();
        Monica.start();
        Phoebe.start();
        Rachel.start();
        Ross.start();
    }

    /** Заполнение фраз для актёров */
    private static void fillPhrases(){
        JoeyPhrases.put(1,"Hey,hey.");
        ChandlerPhrases.put(2,"Hey.");
        PhoebePhrases.put(3,"Hey.");
        ChandlerPhrases.put(4,"And this from cry-for-help department. Are you wearing makeup?");
        JoeyPhrases.put(5,"Yes, I am. As of today, i am officially Joe Tribbiani, actor slash model.");
        ChandlerPhrases.put(6,"That's so funny, 'cause I was thinking you look more like Joe Tribbiani, man slash woman.");
        PhoebePhrases.put(7,"What were you, modeling for?");
        JoeyPhrases.put(8,"You know those posters for the City Free Clinic?");
        MonicaPhrases.put(9,"Oh, wow, so you're gonna be one of those \"healthy, healthy, healthy guys\"?");
        PhoebePhrases.put(10,"You know, the asthma guy was really cute.");
        ChandlerPhrases.put(11,"Do you know which one you're gonna be?");
        JoeyPhrases.put(12, "No, but you hear lyme disease is open, so...(crosses fingers)");
        ChandlerPhrases.put(13,"Good luck, man. I hope you get it.");
        JoeyPhrases.put(14, "Thanks.");
    }




}
