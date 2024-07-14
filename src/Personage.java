public class Personage {
    protected String Name;

    protected int BaseHealth = 100;
    protected int BaseArmor = 50;
    protected int BaseMana = 50;
    protected int BaseStamina = 100;

    protected int Health = BaseHealth;
    protected int Mana = BaseMana;
    protected int Armor = BaseArmor;
    protected int Stamina = BaseStamina;

    protected int ArmorCoff = 4;

    public Personage(String name) {
        this.Name = name;
    }

    public static Personage Create(String name) {
        return new Personage(name);
    }

    public void Walk(int foot) {
        System.out.println("<< Персонаж " + this.Name + " прошёл " + foot + " футов");
    }

    public void Run(int foot) {
        if (this.Stamina >= foot) {
            this.Stamina -= foot;
            System.out.println("<< Персонаж " + this.Name + " пробежал " + foot + " футов");
        } else Fantasy.WriteStaminaError();
    }

    public void LiteSwordAttack(Personage target) {
        System.out.println("<< Персонаж " + this.Name + " совершает лёгкую атаку мечом на персонажа " + target.Name + "!");
        target.DodgeAttack(25);
    }

    public void DodgeAttack(int attackPower) {
        if (this.Armor <= 0) {
            this.Health -= attackPower;
        } else if (this.Armor < attackPower - attackPower / ArmorCoff) {
            int noArmor = attackPower - this.Armor;
            this.Armor = 0;
            this.Health -= noArmor;
        }
        else {
            this.Armor -= attackPower - attackPower / ArmorCoff;
            this.Health -= attackPower / ArmorCoff;
        }

        if (this.Health <= 0) {
            System.out.println("Персонаж " + this.Name + " отправляется на респавн!");
            this.Health = 0;
        }
        if (this.Armor <= 0) {
            this.Armor = 0;
        }
    }

    private void Hill(int hits) {
        if (this.BaseHealth - this.Health >= hits) {
            this.Health += hits;
        } else {
            this.Health = this.BaseHealth;
        }
    }

    public void Hill() {
        Hill(50);
        System.out.println("<< Персонаж " + this.Name + " выпил зелье жизни!");
    }

    public void UseLifeCristall() {
        this.BaseHealth += 20;
        Hill(20);
        System.out.println("<< Персонаж " + this.Name + " использовал кристалл жизни!");
    }

    public void GetArmor() {
        if (this.BaseArmor - this.Armor >= 25) {
            this.Armor += 50;
        } else {
            this.Armor = this.BaseArmor;
        }
        System.out.println("<< Персонаж " + this.Name + " восстановил броню!");
    }

    public void UseNewArmor() {
        this.BaseArmor += 20;
        this.Armor = this.BaseArmor;
        System.out.println("<<Персонаж " + this.Name + " применил улучшенный комплект брони!");
    }

    public void ShowStats() {
        System.out.println(
                "\n--- Статы персонажа " + this.Name + "---" + "\n" +
                " - Здоровье: ............ " + this.Health + "/" + this.BaseHealth + "\n" +
                " - Защита: .............. " + this.Armor + "/" + this.BaseArmor + "\n" +
                " - Мана: ................ " + this.Mana + "/" + this.BaseMana + "\n" +
                " - Выносливость: ........ " + this.Stamina + "/" + this.BaseStamina + "\n");
    }
}
