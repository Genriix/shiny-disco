public class Main {
    public static void main(String[] args) {
        Mage gnx = new Mage("gnx");
        Warrior ar3mith = new Warrior("ar3mith");
        Archer archer = new Archer("archer");

        ShortSword shortSword = new ShortSword();
        ar3mith.LiteAttack(gnx, shortSword);
    }
}
