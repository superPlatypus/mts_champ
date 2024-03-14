package ru.mts.buy_service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.mts.buy_service.dto.BuyDTO;
import ru.mts.buy_service.service.BuyService;
import ru.mts.buy_service.service.NotifyService;

@RestController
public class BuyController {

    @Autowired
    BuyService buyService;



    /**
     * Контроллер для покупки
     * @param buyDto
     * @return Уведомление о покупки
     */
    @PostMapping("/buy")
    String buy(@RequestBody BuyDTO buyDto){

        return buyService.buy(buyDto);
    }

}
