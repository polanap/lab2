package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Growl extends StatusMove {
    public Growl (){
        this.type = Type.NORMAL;
        this.accuracy = 100;
    }
    @Override
    protected java.lang.String describe(){
        return "применяет атаку attacks.Growl (рычит)";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
    }
}
