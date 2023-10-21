package attacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        this.type = Type.PSYCHIC;
    }

    @Override
    protected java.lang.String describe() {
        return "отдыхает";
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().turns(2).condition(Status.SLEEP);
        p.addEffect(e);
    }
}