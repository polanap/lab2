package pokemons;

import attacks.Growl;
import attacks.*;

public class Pikachu extends Pichu {
    public Pikachu(String name, int level){
        super(name, level);
        this.setStats(35.0,55.0,40.0,50.0,50.0,90.0); // hp, att, def, spAtt, spDef, speed
        this.setMove(new Growl(), new ThunderShock(), new ThunderWave());
    }
}
