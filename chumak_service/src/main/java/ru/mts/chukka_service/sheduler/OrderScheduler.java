package ru.mts.chukka_service.sheduler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.mts.chukka_service.random.RandomGenerator;
import ru.mts.chukka_service.service.Order;

@Component
public class OrderScheduler {

    @Scheduled(fixedDelay = 60 * 1000)
    public Order OrderSheduller{
        RandomGenerator randomGenerator = new RandomGenerator();
        String selectedProduct = randomGenerator.generateRandomSelectedProduct();
        int count = randomGenerator.generateCount();
        String dateOrder = randomGenerator.generateRandomDateOrder();
        String typeDelivery = randomGenerator.generateTypeDelivery();
        String city = randomGenerator.generateRandomCity();

        return new Order(selectedProduct, count, dateOrder, typeDelivery, city);
    }
}
