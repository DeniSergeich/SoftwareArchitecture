import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.*;

public class App {
    public static void main(String[] args) throws Exception {

        List<ItemGenerator> generators = new ArrayList<>();

        generators.add(new HorseGenerator());
        generators.add(new MedalGenerator());
        generators.add(new PlatinumGenerator());
        generators.add(new SwordGenerator());
        generators.add(new SilverGenerator());
        generators.add(new GoldGenerator());
        generators.add(new GemGenerator());

        int[] rewardsFrequency = {10, 10, 10, 10, 10, 3, 1}; //Частотность наград
        int totalFrequency = 0;
        for (int frequency : rewardsFrequency) {
            totalFrequency += frequency; // Суммарная частотность
        }

        Random random = new Random();
        for (int i = 0; i < 50; i++) { //Генерируем 50 наград
            int randomNumber = random.nextInt(totalFrequency); // Генерируем случайное число от 0 до суммарной частотности
            int cumulativeFrequency = 0;
            for (int j = 0; j < rewardsFrequency.length; j++) {
                cumulativeFrequency += rewardsFrequency[j];
                if (randomNumber < cumulativeFrequency) {
                    generators.get(j).openReward();
                    ; // Выводим представление награды
                    break;
                }
            }
        }
    }
}