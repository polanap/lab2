package attacks;

import ru.ifmo.se.pokemon.*;

public class Waterfall extends PhysicalMove {
    public Waterfall() {
        this.type = Type.WATER;
        this.power = 80;
        this.accuracy = 100;
    }

    @Override
    protected java.lang.String describe() {
        return "применяет атаку attacks.Waterfall";
    }
}
