public class game {
    String profession;
    String Skill;
    String wear;
    int HP, Att, MP;


    game(String gameprofession, String gameSkill, String gamewear, int gameHP, int gameAtt, int gameMP) {
       // System.out.println("i am " + gameprofession);
       // System.out.println("HP:" + gameHP);
       // System.out.println("Att:" + gameAtt);
       // System.out.println("MP:" + gameMP);
       // System.out.println(gameprofession + "詠唱...施放" + gameSkill);
       // System.out.println("穿戴: " + gamewear);
       // System.out.println("--------------------------------------");
        profession = gameprofession;
        Skill = gameSkill;
        wear = gamewear;
        HP = gameHP;
        Att = gameAtt;
        MP = gameMP;
    }
    void show(){
        System.out.println("我是 " + profession +" 技能 "+Skill +" 裝備 " +wear + " 血量 "+HP +" 攻擊 "+ Att +" 魔力 "+MP);
    }
    void turn1(){
        System.out.println(profession+"發動技能 "+Skill+"造成"+Att+"傷害");
    }
    void turnhited0(){
        System.out.println("另一方受到"+Att+"傷害");
    }

     void show1(){
        HP=HP-30;
        System.out.println(profession+"血量 "+HP);
    }
    void show2(){
        HP=HP-15;
        System.out.println(profession+"血量 "+HP);
    }
    void show3(){
        HP=HP-40;
        System.out.println(profession+"血量 "+HP);
    }

//   String getSkill() {
//      return this.Skill;
//  }

//   int getHP() {
//       return this.HP;
//   }

//   int getAtt() {
//       return this.Att;
//   }

//   int getMP() {
//       return this.MP;
//   }

//   String getWear() {
//       return this.wear;
//   }

}
