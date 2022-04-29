package udemy_course_java.basics.oop_examples;

public class Beyblade_Beyblade_Example {
    private String player;
    private int spinSpeed;
    private int attackPower;

    public Beyblade_Beyblade_Example(String player, int spinSpeed, int attackPower) {
        this.player = player;
        this.spinSpeed = spinSpeed;
        this.attackPower = attackPower;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void attack(){
        System.out.println(getPlayer() + " attacks with " + attackPower + " Power and " + spinSpeed + "km/h Speed.");
    }

    public void summonHolyMonster(){
        System.out.println("This beyblade doesn't have any Holy Monster.");
    }

    public void showInfo(){
        System.out.println("Player: "+player);
        System.out.println("Attack Power: "+attackPower);
        System.out.println("Spin Speed: "+spinSpeed);
    }
}
