import org.example.jp.ac.uryukyu.ie.e245716.Enemy;
import org.example.jp.ac.uryukyu.ie.e245716.Warrior;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("戦士", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", warrior.getName(), enemy.getName());

        int turn = 0;
        while (!warrior.isDead() && !enemy.isDead()) {
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeponSkill(enemy);
            if (!enemy.isDead()) {
                enemy.attack(warrior);
            }
        }
        System.out.println("戦闘終了");
    }
}
