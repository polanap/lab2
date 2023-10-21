package attacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class HydroPump extends SpecialMove {
    public HydroPump(){
        this.type = Type.WATER;
        this.power = 110;
        this.accuracy = 80;
    }
    @Override
    protected java.lang.String describe(){
        return "применяет атаку attacks.HydroPump";
    }
}
