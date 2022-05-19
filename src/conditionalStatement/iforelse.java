package conditionalStatement;

public class iforelse {

    public static void main(String[] args){

        //SYNTAX: if(condition){ } else{}

        int age=17;
        if (age>18){
           System.out.println("person is eligible for voting");
        }
        else{
            System.out.println("person is not eligible for voting");

        }
        String city="Delhi";
        if (city=="Agra"){
            System.out.println("person is in Agra");
        }
        else{
            System.out.println("person is not in Agra");

        }
        double salary=34000.5;
        if (salary>35000){
            System.out.println("good salary");
        }
        else{
            System.out.println("not good salary");

        }

    }

}
