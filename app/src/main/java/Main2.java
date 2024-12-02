import org.example.jp.ac.uryukyu.ie.e245716.Enemy;
import org.example.jp.ac.uryukyu.ie.e245716.Hero;
import org.example.jp.ac.uryukyu.ie.e245716.Warrior;
public class Main2 {
    public static void main(String[] args) {
        Hero hero = new Warrior("勇者", 10, 5); // (a)
        Enemy enemy = new Enemy("スライム", 6, 3);

        // 修正: getName() メソッドを使用して名前を取得
        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        // 修正: isDead() メソッドを使用して生存状態を確認
        while (!hero.isDead() && !enemy.isDead()) {
            turn++;
            System.out.printf("%dターン目開始！\n", turn);

            // (b) Hero 型変数でスーパークラスの attack メソッドを呼び出し
            hero.attack(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");

        // hero オブジェクトの情報を出力
        System.out.println(hero);
    }
}
