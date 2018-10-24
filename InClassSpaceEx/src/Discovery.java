import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Discovery {

    public static void main(String[] args) throws IOException {

        ArrayList<Astronaut> a = new ArrayList<Astronaut>();
        // read from a file
        File file = new File("src/astronauts.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNext()) {
            a.add(new Astronaut(scanner.next(), scanner.next(), scanner.nextInt()));
        }

        Supply[][] s = new Supply[3][2];
        File file2 = new File("src/supplies.txt");
        Scanner scanner2 = new Scanner(file2);
        while(scanner2.hasNext()) {
            for(int i=0; i<s.length; i++) {
                for(int j=0; j<s[i].length; j++) {
                    s[i][j] = new Supply(scanner2.next(), scanner2.nextDouble());
                }
            }
        }

        SpaceShuttle discovery = new SpaceShuttle(a, s);
        System.out.println("Everything in Discovery is : " + discovery.toString());
        System.out.println("The average age on Discovery is : " + discovery.getAverageAge());
        System.out.println("The total weight of Discovery is : " + discovery.getTotalWeight());



    }

}
