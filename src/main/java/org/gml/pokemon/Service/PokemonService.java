package org.gml.pokemon.Service;

import org.gml.pokemon.model.PokemonResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String baseUrl = "https://pokeapi.co/api/v2/pokemon";

    public PokemonResponse getPokemons(int offset, int limit) {
        String url = String.format("%s?offset=%d&limit=%d", baseUrl, offset, limit);
        return restTemplate.getForObject(url, PokemonResponse.class);
    }
}