import java.util.Arrays;
import java.util.Random;

//
public class Main {
    public static void main(String[] args) {

        LeftTree<Integer> tree = new LeftTree<>();
        for (int i = 0; i<5; i++){
            int k = new Random().nextInt(6);
            tree.add(k);
            System.out.println(k + " ");

        }
        tree.print();

    }
}