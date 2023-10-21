import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Lapras("Lapras", 1);
        Pokemon p2 = new Gorebyss("Gorebyss", 1);
        Pokemon p3 = new Clamperl("Clamperl", 1);
        Pokemon p4 = new Pichu("Pichu", 1);
        Pokemon p5 = new Pikachu("Pikachu", 1);
        Pokemon p6 = new Raichu("Raichu", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
}
}