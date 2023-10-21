package attacks;

import ru.ifmo.se.pokemon.*;

public class DrainingKiss extends SpecialMove {
    public DrainingKiss(){
        this.type = Type.FAIRY;
        this.power = 50;
        this.accuracy = 100;
    }

    @Override
    protected java.lang.String describe(){
        return "применяет атаку Draining Kiss";
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, (int) (0.75*(p.getHP()-p.getStat(Stat.HP))));
    }
}
