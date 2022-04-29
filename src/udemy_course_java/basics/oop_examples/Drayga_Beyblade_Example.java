package udemy_course_java.basics.oop_examples;

public class Drayga_Beyblade_Example extends Beyblade_Beyblade_Example{

    private String holyMonster;

    public Drayga_Beyblade_Example(String player, int spinSpeed, int attackPower, String holyMonster) {
        super(player, spinSpeed, attackPower);
        this.holyMonster = holyMonster;
    }
    @Override
    public void summonHolyMonster() {
        System.out.println(getPlayer() + " summoned the Holy Monster " + holyMonster + "!");
        System.out.println(getPlayer() + "'s attack : Tiger Fang !");
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Holy Monster: " + holyMonster);
    }
}
