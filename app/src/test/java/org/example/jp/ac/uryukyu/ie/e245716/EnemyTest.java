package org.example.jp.ac.uryukyu.ie.e245716;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnemyTest {
    /**
     * 倒れたはずの敵は攻撃できないことを検証。
     * 検証手順
     *  (1) ヒーローと敵を準備。ヒーローの攻撃力は敵を一撃で倒せるほど強い状態とする。
     *  (2) ヒーローが殴り、敵も殴る。敵は一撃で倒されていることを期待。
     *  (3) 敵が死んだ状態ならば攻撃できないはず。
     * 　　つまり攻撃実行してもヒーローのHPは減っていないことを期待。これを検証する。
     */
    @Test
    void attackTest() {
        int defaultHeroHp = 100; // ヒーローの初期HP
        Hero demoHero = new Hero("デモ勇者", defaultHeroHp, 100); // ヒーローを準備
        Enemy slime = new Enemy("スライムもどき", 10, 100); // 敵を準備

        // (2) ヒーローが攻撃して敵を一撃で倒す
        demoHero.attack(slime);

        // (3) 倒れた敵が攻撃を試みる
        slime.attack(demoHero);

        // ヒーローのHPが減っていないことを確認
        assertEquals(defaultHeroHp, demoHero.getHitPoint());
    }
}
