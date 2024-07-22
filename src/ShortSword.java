public class ShortSword extends Weapon{
    public String Name = "Короткий меч";
    public int Weight = 2;
    public int Attack = 20;

    @Override
    public String GetName() {
        return Name;
    }
    public int GetAttack() {
        return Attack;
    }
}
