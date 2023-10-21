package attacks;

import ru.ifmo.se.pokemon.*;
public class Blizzard extends SpecialMove {
    public Blizzard(){
        this.type = Type.ICE;
        this.power = 110;
        this.accuracy = 70;
    }

    @Override
    protected java.lang.String describe() {
        return "применяет атаку attacks.Blizzard";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.1).condition(Status.FREEZE);
        p.addEffect(e);
    }
}
