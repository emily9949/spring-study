package com.sumin.section02.annotation.subsection01.primary;

import com.sumin.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pokemonServicePrimary")
public class PokemonService {
    private Pokemon pokemon;

    // 의존성 자동 주입
    @Autowired // 생성자 주입은 @Autowired 생략 가능
    public PokemonService(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void pokemonAttack() {
        pokemon.attack();
    }
}
