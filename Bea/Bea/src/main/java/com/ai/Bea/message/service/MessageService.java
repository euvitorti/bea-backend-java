package com.ai.Bea.message.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class MessageService {

    public String sendMessageToPythonApi(String message) {
        String url = "http://localhost:5000/generate"; // URL do seu serviço Flask

        // Configurando o corpo da requisição JSON
        Map<String, String> body = new HashMap<>();
        body.put("message", message);

        // Criando as cabeçalhos da requisição
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

        // Criando a requisição
        HttpEntity<Map<String, String>> entity = new HttpEntity<>(body, headers);

        // Usando o RestTemplate para enviar a requisição
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Map> response = restTemplate.exchange(url, HttpMethod.POST, entity, Map.class);

        // Processando a resposta
        Map<String, String> responseBody = response.getBody();
        return responseBody != null ? responseBody.get("response") : "Error: No response";
    }
}
