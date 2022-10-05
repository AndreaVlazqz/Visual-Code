package Java8;
import java.util.Arrays;
import java.util.stream.Stream;

public class MapFilterReduceWithArrayList {
    public static void main(String[] args){
        //A simple array
        String[] players = new String[]{"sam","peter","billy","lilly"};
        //Stream
        //A sequence of elements supporting sequential and parallel aggregate operations

        Stream<String> playersStream = Arrays.stream(players);
        // Returns a sequential Stream with the specified array as its source

        //Arrays
        //This class contains various methods for manipulating arrays (such as sorting and searching)
        //This class also contains a static factory that allows arrays to be viewed as lists


        //.toUpperCase is an intermediate operation
        //performs an action for each element of this stream with lambda
        Stream<String> upperCaseStream = playersStream.map(player -> player.toUpperCase());

        //.forEach is a terminal operation
        //performs an action for each element of this stream
        upperCaseStream.forEach(System.out::println);

        //concise
        System.out.println("Concise format");
        Arrays.stream(players)
                .map(player -> player.toUpperCase())
                .filter(player -> player.length() == 5)
                .forEach(System.out::println);

        long count = Arrays.stream(players)
                .map(player -> player.toUpperCase())
                .filter(player -> player.length() == 5)
                .count();
        System.out.println(count);

        //.parallelStream is just telling the system to work with multiple cores
        //to resolve the instructions quickly (divide and concrete)
        long count2 = Arrays.asList(players)
                .parallelStream()
                .map(player -> player.toUpperCase())
                .filter(player -> player.length() == 5)
                .count();
        System.out.println(count2);


    }
}
