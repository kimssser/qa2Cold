import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ListClassTest {




    @Test
    public void listExamples () {

        List<String> klase = new ArrayList<String>();
        klase.add("Laura");
        klase.add("Sergejs");
        klase.add("Sergejs1");
        klase.add("Sergejs2");
     //   System.out.println("Size of list is: " + klase.size());
      //  System.out.println("Size of list is: " + klase.isEmpty());
      //  System.out.println("2nd one is: " + klase.get(1));



   //     for (int i = 0; i <= klase.size();i++) {
   //         System.out.println(klase.get(i));
        for (String name : klase) {
            System.out.println(name);
        }
    }
}
