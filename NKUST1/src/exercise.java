import java.util.Random;

public class exercise {
    public static void main(String[] args) {
        int[] player = new int[1];
        Random ran = new Random();
        game Archer = new game("Archer", "箭雨", "獵弓", 15, 30, 10);
        game Berserker = new game("Berserker", "狂爆", "指虎", 20, 15, 5);
        game Mage = new game("Mage", "魔彈", "學徒法杖", 10, 40, 30);


        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 1; i++) {
                player[i] = ran.nextInt(3);
                if (player[i] == 0) {
                    //Archer.show();
                    Archer.turn1();
                    //System.out.print("Archer");
                    Archer.turnhited0();

                }
                if (player[i] == 1) {
                   // Berserker.show();
                    Berserker.turn1();
                    Berserker.turnhited0();

                }
                if (player[i] == 2) {
                  //  Mage.show();
                    Mage.turn1();
                    Mage.turnhited0();

                }
            }
        }

    }
}
      //    game Archer = new game("Archer", "箭雨", "獵弓", 15, 30, 10);
      //    game Berserker = new game("Berserker", "狂爆", "指虎", 20, 15, 5);
      //    game Mage = new game("Mage", "魔彈", "學徒法杖", 10, 40, 30);

      //  random player1 = new random();
      //  System.out.print("第一位玩家是 ");
      //  player1.generatePwd();
      //  random player2 = new random();
      //  System.out.print("第二位玩家是 ");
      //  player2.generatePwd();


        /*System.out.println("第一位玩家是 "+Archer.profession);
        System.out.println("第二位玩家是 "+Berserker.profession);
        for(int i=0;i<1;i++){
            System.out.println(Archer.profession+"使用 "+Archer.Skill);
            int sum=Berserker.HP-Archer.Att;
            System.out.println(Berserker.profession+"受到"+Archer.Att+"的傷害");
            System.out.println("Berserker"+"剩"+sum+"血量");
        }*/

