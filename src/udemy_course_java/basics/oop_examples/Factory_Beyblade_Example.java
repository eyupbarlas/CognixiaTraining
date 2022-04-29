package udemy_course_java.basics.oop_examples;

public class Factory_Beyblade_Example {
    public Beyblade_Beyblade_Example createBeyblade(String beybladeType){
        if (beybladeType.equals("Dragon")){
            return new Dragon_Beyblade_Example("Takao", 800, 300, "Blue Dragon", "Speaking Holy Monster");
        }
        else if (beybladeType.equals("Dranza")){
            return new Dranza_Beyblade_Example("Kai", 600, 400, "Red Phoenix");
        }
        else if (beybladeType.equals("Drayga")){
            return new Drayga_Beyblade_Example("Rei", 700, 300, "White Tiger");
        }
        else{
            return null;
        }
    }
}
