package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public class Facade extends PhysicalMove {
    public Facade(){
        this.type = Type.NORMAL;
        this.power = 70;
        this.accuracy = 100;
    }
    @Override
    protected java.lang.String describe(){
        return "применяет атаку attacks.Facade";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        if (p.getCondition() == Status.BURN | p.getCondition() == Status.POISON | p.getCondition() == Status.PARALYZE) {
            Effect e = new Effect().turns(0).stat(Stat.ATTACK, 3);
            p.addEffect(e);
        }
    }
}
