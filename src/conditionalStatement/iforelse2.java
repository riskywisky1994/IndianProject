package conditionalStatement;

public class iforelse2 {
    public static void main(String[] args){

        //SYNTAX: if(condition){} else{}

        String mobile="iphone";
        if (mobile=="android"){
            System.out.println("mobile is android");
        }
        else{
            System.out.println("mobile is not android");
        }
        String brand="vivo";
        if (brand=="vivo"){
            System.out.println("brand is vivo");
        }
        else {
            System.out.println("brand is not vivo");
        }
        int price=25000;
        if (price>24999){
            System.out.println("price is good");
        }
        else{
            System.out.println("price is not good");
        }
        int ram=8;
        if (ram>4){
            System.out.println("ram is good");
        }
        else{
            System.out.println("ram is not good");
        }
    }
}
