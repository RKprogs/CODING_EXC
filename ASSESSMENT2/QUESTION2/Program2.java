package ASSESSMENT2.QUESTION2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        List<String> empNames= new ArrayList<>(Arrays.asList("Alice","Alan","Ben","Andrew","Chad","Zed"));

        List<String> filteredNames = empNames.stream()
                                                .filter(name -> name.startsWith("A"))
                                                .toList();
        System.out.println("Filtered Names: ");
        for(String name : filteredNames)
            System.out.println(name);
    }
}
