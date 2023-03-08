package com.techelevator.gametext.services;

import com.techelevator.gametext.model.Game;
import com.techelevator.gametext.model.Reservation;
import com.techelevator.util.BasicLogger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

public class GameService {

    private static final String API_BASE_URL = "http://localhost:3000/gametext/1";
    private final RestTemplate restTemplate = new RestTemplate();


    public Game[] listTextByChoice (String id) {
        Game[] games = null;
        try {
            games = restTemplate.getForObject(API_BASE_URL + id, Game[].class);
        } catch (RestClientResponseException e) {
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return games;
    }
}
