public class Main {
    public static void main(String[] args) {
        Mage gnx = new Mage("gnx");
        Warrior ar3mith = new Warrior("ar3mith");
        Archer archer = new Archer("archer");

        ar3mith.ShowStats();
        gnx.Fireball(ar3mith);
        ar3mith.ShowStats();
        ar3mith.Hill();
        ar3mith.ShowStats();
        gnx.Fireball(ar3mith);
        gnx.Fireball(ar3mith);
        gnx.Fireball(ar3mith);
        ar3mith.ShowStats();
        ar3mith.UseLifeCristall();
        ar3mith.ShowStats();
    }
}
