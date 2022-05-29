package methodoffunction;

public class InputParameter {

    public void hello(String name){
        System.out.println("welcome to java"+name);

    }
    public void information(String name, int age){
        System.out.println("your name is"+name + "your age is"+age);
    }
    public void makesquare(int number){
        System.out.println("square is"+number*number);

    }
    public void checkage(int age){
        if (age>18){
            System.out.println("eligible for voting");
        }
        else{
            System.out.println("Not eligible for voting");
        }
    }
    public static void main(String[] args) {
        InputParameter obj = new InputParameter();
        obj.hello("Banti");
        obj.information("Veer",27);
        obj.makesquare(7);
        obj.checkage(19);


    }
}
