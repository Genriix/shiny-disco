/**
 * Воин
 */
public class Warrior extends Personage {
    public Warrior(String name) { super (name);
    }

    public void StrongSwordAttck(Personage target) {
        if (this.Stamina >= 15) {
            this.Stamina -=15;
            System.out.println("<< Персонаж " + this.Name + " совершает сильную аттаку мечом на персонажа " + target.Name + "!");
            target.DodgeAttack(30);
        } else Fantasy.WriteStaminaError();
    }
}
