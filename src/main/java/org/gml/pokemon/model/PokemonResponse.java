package org.gml.pokemon.model;

import lombok.Data;
import java.util.List;

@Data
public class PokemonResponse {

    private int count;
    private String next;
    private String previous;
    private List<PokemonResult> results;

    @Data
    public static class PokemonResult {
        private String name;
        private String url;
    }
}