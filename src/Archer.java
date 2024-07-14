/**
 * Лучник
 */
public class Archer extends Personage {
    public Archer(String name) { super (name);
    }

    public void PrizelniyVistrelIzLuka(Personage target) {
        System.out.println("<< Персонаж " + this.Name + " совершает прицельный выстрел из лука в персонажа " + target.Name + "!");
        target.DodgeAttack(20);
    }
}