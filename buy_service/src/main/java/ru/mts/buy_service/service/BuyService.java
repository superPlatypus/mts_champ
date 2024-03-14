package ru.mts.buy_service.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;
@Service
public class BuyService {
    public final Map<String, Integer> timeMap = Map.ofEntries(
            entry("Dough", 1),
            entry("Meat", 2),
            entry("Cabbage", 2),
            entry("Fish", 3),
            entry("Berry", 5),
            entry("Tea", 2),
            entry("Coffee", 2));
    /**
     * Метод покупки
     * @param type, количество
     * @return Уведомление о покупки
     */
    public String buy(String type,int count){
        try {
            Thread.sleep((long) timeMap.get(type) * count * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Bought " + type + " " + count + "шт.";

    }
}
