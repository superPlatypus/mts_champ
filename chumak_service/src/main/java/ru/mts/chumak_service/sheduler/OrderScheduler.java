package ru.mts.chumak_service.sheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.mts.chumak_service.random.RandomGenerator;
import ru.mts.chumak_service.service.Order;

@Component
public class OrderScheduler {

    @Scheduled(fixedDelay = 10000) // Для реализации без многопоточности, новый заказ каждые 10 секунд
    public void scheduleOrderWithoutMultithreading() {
        RandomGenerator randomGenerator = new RandomGenerator(false);
        String selectedProduct = randomGenerator.generateRandomSelectedProduct();
        int count = randomGenerator.generateCount();
        String dateOrder = randomGenerator.generateRandomDateOrder();
        String typeDelivery = randomGenerator.generateTypeDelivery();
        String city = randomGenerator.generateRandomCity();

        Order order = new Order(selectedProduct, count, dateOrder, typeDelivery, city);
        System.out.println("Новый заказ" + order);
    }

}