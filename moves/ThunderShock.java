package attacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderShock extends SpecialMove {
    public ThunderShock (){
        this.type = Type.ELECTRIC;
        this.power = 40;
        this.accuracy = 100;
    }
    @Override
    protected java.lang.String describe(){
        return "применяет атаку attacks.ThunderShock";
    }
}
