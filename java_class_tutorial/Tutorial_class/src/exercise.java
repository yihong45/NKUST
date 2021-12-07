public class exercise {
    public static void main(String[] args) {
        game Archer = new game();
        Archer.profession = "Archer";
        Archer.HP = 15;
        Archer.Att = 30;
        Archer.MP = 10;
        Archer.Skill = "箭雨";
        Archer.wear = "獵弓";
        System.out.println("i am " + Archer.profession);
        System.out.println("HP:" + Archer.HP);
        System.out.println("MP:" + Archer.MP);
        System.out.println("Att:" + Archer.Att);
        System.out.println("弓箭手詠唱...施放" + Archer.Skill);
        System.out.println("穿戴: " + Archer.wear);
        System.out.println("--------------------------------------");

        game Berserker = new game();
        Berserker.profession = "Berserker";
        Berserker.HP = 20;
        Berserker.Att = 15;
        Berserker.MP = 5;
        Berserker.Skill = "狂爆";
        Berserker.wear = "指虎";
        System.out.println("i am " + Berserker.profession);
        System.out.println("HP:" + Berserker.HP);
        System.out.println("MP:" + Berserker.MP);
        System.out.println("Att:" + Berserker.Att);
        System.out.println("狂戰士詠唱...施放" + Berserker.Skill);
        System.out.println("穿戴: " + Berserker.wear);
        System.out.println("--------------------------------------");

        game Mage = new game();
        Mage.profession = "Mage";
        Mage.HP = 10;
        Mage.Att = 40;
        Mage.MP = 30;
        Mage.Skill = "魔彈";
        Mage.wear = "學徒法杖";
        System.out.println("i am " + Mage.profession);
        System.out.println("HP:" + Mage.HP);
        System.out.println("MP:" + Mage.MP);
        System.out.println("Att:" + Mage.Att);
        System.out.println("魔法師詠唱...施放" + Mage.Skill);
        System.out.println("穿戴: " + Mage.wear);
        System.out.println("--------------------------------------");
    }





}
