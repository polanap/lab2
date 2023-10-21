package attacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DragonPulse extends SpecialMove {
    public DragonPulse(){
        this.type = Type.DRAGON;
        this.power = 85;
        this.accuracy = 100;
    }
    @Override
    protected java.lang.String describe(){
        return "применяет атаку attacks.DragonPulse";
    }
}
