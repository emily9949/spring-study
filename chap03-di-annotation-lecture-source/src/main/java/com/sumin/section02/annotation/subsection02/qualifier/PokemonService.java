package com.sumin.section02.annotation.subsection02.qualifier;

import com.sumin.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pokemonServiceQualifier")
public class PokemonService {

    /* 설명. bean애 @Primary가 설정되어 있더라도 주입을 받는 시점에 원하는 bean을 고를 수 있다 */
//    @Autowired
//    @Qualifier("squirtle") // 해당 시점에 빈을 선택하여 주입할 수 있음
    private Pokemon pokemon;

//     의존성 자동 주입
    @Autowired // 생성자 주입은 @Autowired 생략 가능
    public PokemonService(@Qualifier("squirtle") Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void pokemonAttack() {
        pokemon.attack();
    }
}
