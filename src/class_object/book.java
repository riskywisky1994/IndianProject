package class_object;

public class book {
    String name="JAVA";
    int pages=800;
    String writer_name="james bond";
     public static void main(String[] args){
         book obj=new book();
         System.out.println("printing object properties"+obj.name);
         System.out.println("printing object properties"+obj.pages);
         System.out.println("printing object properties"+obj.writer_name);

         book obj2=new book();
         System.out.println("printing object 2 properties"+obj2.name);
         System.out.println("printing object 2 properties"+obj2.pages);
         System.out.println("printing object 2 properties"+obj2.writer_name);




     }


}
