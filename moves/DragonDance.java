package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DragonDance extends StatusMove {
    public DragonDance(){
        this.type = Type.DRAGON;
    }
    @Override
    protected java.lang.String describe(){
        return "применяет атаку attacks.DragonDance";
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 1);
        p.setMod(Stat.SPEED, 1);
    }
}
