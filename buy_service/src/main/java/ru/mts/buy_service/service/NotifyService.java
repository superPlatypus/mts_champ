package ru.mts.buy_service.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.mts.buy_service.dto.BuyDTO;

@Service
public class NotifyService {

    /**
     * Отправка запроса к системе истории
     * @param requestBody
     */
    public void notify(BuyDTO requestBody) {
        // Создание экземпляра RestTemplate
        RestTemplate restTemplate = new RestTemplate();
        String url = "localhost:8081//history-api/v1/resource";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<BuyDTO> request = new HttpEntity<>(requestBody, headers);

        restTemplate.postForEntity(url, request, Void.class);
    }
}
