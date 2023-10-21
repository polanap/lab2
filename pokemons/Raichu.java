package pokemons;

import attacks.Facade;
import attacks.Growl;
import attacks.*;
public class Raichu extends Pikachu {
    public Raichu(String name, int level){
        super(name, level);
        this.setStats(60.0,90.0,55.0,90.0,80.0,110.0); // hp, att, def, spAtt, spDef, speed
        this.setMove(new Growl(), new ThunderShock(), new ThunderWave(), new Facade());
    }
}
