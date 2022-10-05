package Java8;
import java.util.ArrayList;
import java.util.List;

public class MethodReference {
    public static void main(String[] args){
        List<String> colorsList = new ArrayList<String>();
        colorsList.add("pink"); colorsList.add("blue"); colorsList.add("green");

        //pre java5 traditional loop
        for (int i=0; i<colorsList.size(); i++){
            System.out.println(colorsList.get(i));
        }
        System.out.println();

        //On java5 enhanced for loop
        for (String color:colorsList) {
            System.out.println(color);
        }
        System.out.println();

        //java8 forEach with lambda
        colorsList.forEach(color -> System.out.println(color));
        System.out.println();

        //java8 forEach with Method Reference
        //which is a simplified form of a Lambda expression
        colorsList.forEach(System.out::println);
    }
}
