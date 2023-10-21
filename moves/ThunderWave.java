package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderWave extends StatusMove {
    public ThunderWave (){
        this.type = Type.ELECTRIC;
        this.accuracy = 90;
    }
    @Override
    protected java.lang.String describe(){
        return "применяет атаку attacks.ThunderWave";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.paralyze(p);
    }
}
