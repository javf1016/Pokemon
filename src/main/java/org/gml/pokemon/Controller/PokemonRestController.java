package org.gml.pokemon.Controller;

import org.gml.pokemon.Service.PokemonService;
import org.gml.pokemon.model.PokemonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonRestController {

    final PokemonService pokemonService;
    @Autowired
    public PokemonRestController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }


    @GetMapping("/pokemons")
    public PokemonResponse getPokemons(
            @RequestParam(defaultValue = "0") int offset,
            @RequestParam(defaultValue = "20") int limit) {
        return pokemonService.getPokemons(offset, limit);
    }
}