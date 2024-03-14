package ru.mts.buy_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mts.buy_service.dto.BuyDTO;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;
@Service
public class BuyService {

    @Autowired
    NotifyService notifyService;

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
     * @param buyDTO, количество
     * @return Уведомление о покупки
     */
    public String buy(BuyDTO buyDTO){
        String type = buyDTO.getType();
        int count = buyDTO.getCount();
        try {
            Thread.sleep((long) timeMap.get(type) * count * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        notifyService.notify(buyDTO);
        return "Bought " + type + " " + count + "шт.";

    }
}
