package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.*;
public class Pichu extends Pokemon{
    public Pichu(String name, int level){
        super(name, level);
        this.setType(Type.ELECTRIC);
        this.setStats(20.0,40.0,15.0,35.0,35.0,60.0); // hp, att, def, spAtt, spDef, speed
        this.setMove(new ThunderShock(), new ThunderWave());

    }
}