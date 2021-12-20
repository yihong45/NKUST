import java.util.Random;

public class random {
    private int[] player = new int[1];

    Random ran = new Random();

    public void generatePwd() {
          for (int i = 0; i < 1; i++) {
                player[i] = ran.nextInt(3);
                if (player[i] == 0) {
                      game Archer = new game("Archer", "箭雨", "獵弓", 15, 30, 10);
                      System.out.println("我是 Archer " + "   血量 " + Archer.HP + " 攻擊力 " + Archer.Att + " 魔力 " + Archer.MP);
                }
                if (player[i] == 1) {
                      game Berserker = new game("Berserker", "狂爆", "指虎", 20, 15, 5);
                      System.out.println("我是 Berserker " + "血量 " + Berserker.HP + " 攻擊力 " + Berserker.Att + " 魔力 " + Berserker.MP);
                }
                if (player[i] == 2) {
                      game Mage = new game("Mage", "魔彈", "學徒法杖", 10, 40, 30);
                      System.out.println("我是 Mage " + "     血量 " + Mage.HP + " 攻擊力 " + Mage.Att + " 魔力 " + Mage.MP);
                }
          }
    } 
}