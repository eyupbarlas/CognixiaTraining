package Week1.day1;

public class Test1 extends Test2{
    String name = "bzz";
    String occupation = "making honey";

    Test2 test2 = new Test2();
    String students = test2.student1 + " " + test2.student2 + " " + test2.life;

    public String myOccupation(){
        return this.occupation;
    }
}
