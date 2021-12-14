public class game {
    String profession;
    String Skill;
    String wear;
    int HP, Att, MP;

    game(String gameprofession,String gameSkill,String gamewear,int gameHP,int gameAtt,int gameMP){
        System.out.println("i am " + gameprofession);
        System.out.println("HP:" + gameHP);
        System.out.println("Att:" + gameAtt);
        System.out.println("MP:" + gameMP);
        System.out.println(gameprofession+"詠唱...施放" + gameSkill);
        System.out.println("穿戴: " + gamewear);
        System.out.println("--------------------------------------");
        profession=gameprofession;
        Skill=gameSkill;
        wear=gamewear;
        HP=gameHP;
        Att=gameAtt;
        MP=gameMP;
    }


/*
    String getProfession() {
        return this.profession;
    }
    String getSkill() {
        return this.Skill;
    }
    int getHP() {
        return this.HP;
    }
    int getAtt() {
        return this.Att;
    }
    int getMP() {
        return this.MP;
    }
    String getWear() {
        return this.wear;
    }
*/

}
