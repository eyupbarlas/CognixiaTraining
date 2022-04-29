package udemy_course_java.basics.oop_examples;

public class Dragon_Beyblade_Example extends Beyblade_Beyblade_Example{
    private String holyMonster;
    private String hiddenSkill;

    public Dragon_Beyblade_Example(String player, int spinSpeed, int attackPower, String holyMonster, String hiddenSkill) {
        super(player, spinSpeed, attackPower);
        this.holyMonster = holyMonster;
        this.hiddenSkill = hiddenSkill;
    }

    @Override
    public void summonHolyMonster() {
        System.out.println(getPlayer() + " summoned the Holy Monster " + holyMonster + "!");
        System.out.println(getPlayer() + "'s attack : Phantom Thunder !");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Holy Monster: " + holyMonster);
        System.out.println("Hidden Skill: " + hiddenSkill);
    }
}
