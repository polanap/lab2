package attacks;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        this.type = Type.NORMAL;
        this.accuracy = 85;
    }

    @Override
    protected java.lang.String describe() {
        return "применяет атаку attacks.Swagger (фуфырится)";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
        p.confuse();
    }
}
