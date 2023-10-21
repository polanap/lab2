package pokemons;

import attacks.DragonDance;
import attacks.DragonPulse;
import attacks.HydroPump;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.*;
public class Lapras extends Pokemon {
    public Lapras(String name, int level){
        super(name, level);
        this.setType(Type.WATER, Type.ICE);
        this.setStats(130.0,85.0,80.0,85.0,95.0, 60.0); // hp, att, def, spAtt, spDef, speed
        this.setMove(new DragonDance(), new HydroPump(), new DragonPulse(), new Waterfall());
    }
}
