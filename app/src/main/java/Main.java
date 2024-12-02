import org.example.jp.ac.uryukyu.ie.e245716.Hero;
import org.example.jp.ac.uryukyu.ie.e245716.Enemy;

public class Main {
    public static void main(String[] args) {
        // 勇者と敵を初期化
        Hero hero = new Hero("勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);

        // 対戦開始メッセージ
        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while (!hero.isDead() && !enemy.isDead()) { // 勇者または敵が死ぬまで戦闘を継続
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy); // 勇者が敵を攻撃
            if (!enemy.isDead()) { // 敵が死んでいなければ反撃
                enemy.attack(hero);
            }
        }

        // 戦闘終了メッセージ
        System.out.println("戦闘終了");
    }
}
