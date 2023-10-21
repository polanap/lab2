package pokemons;

import attacks.Blizzard;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.*;
public class Clamperl extends Pokemon {
    public Clamperl(String name, int level) {
        super(name, level);
        this.setType(Type.WATER);
        this.setStats(35.0, 64.0, 85.0, 74.0, 55.0, 32.0); // hp, att, def, spAtt, spDef, speed
        this.setMove(new Rest(), new Swagger(), new Blizzard());
    }
}
