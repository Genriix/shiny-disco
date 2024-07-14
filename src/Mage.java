/**
 * Маг
 */
public class Mage extends Personage {
    public Mage(String name) { super (name);
    }

    public void Fireball(Personage target) {
        if (this.Mana >= 10) {
            this.Mana -= 10;
            System.out.println("<< Персонаж " + this.Name + " атаковал файерболом персонажа " + target.Name + "!");
            target.DodgeAttack(35);
        } else Fantasy.WriteManaError();
    }
}
