package pokemons;

import attacks.Blizzard;
import attacks.DrainingKiss;
import ru.ifmo.se.pokemon.Type;
import attacks.*;
public class Gorebyss extends Clamperl {
    public Gorebyss(String name, int level){
        super(name, level);
        this.setType(Type.WATER);
        this.setStats(55.0, 84.0, 105.0, 	114.0, 75.0, 52.0); // hp, att, def, spAtt, spDef, speed
        this.setMove(new Rest(), new Swagger(), new Blizzard(), new DrainingKiss());
    }
}
