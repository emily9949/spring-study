package com.sumin.section02.annotation.subsection03.collection;

import com.sumin.section02.annotation.common.Pokemon;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("pokemonServiceResource")
public class PokemonService {

    @Resource(name = "pikachu")
    private Pokemon pokemon;

    public void pokemonAttack() {
        pokemon.attack();
    }
}
