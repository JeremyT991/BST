import java.util.*;
import java.io.*;

public class BSTTest {
  public static void main(String[] args) {
    BST b = new BST();

/*
    b.insert(7);
    b.insert(3);
    b.insert(4);
    b.insert(2);
    b.insert(9);

    System.out.println(b.contains(7));
    System.out.println(b.contains(4));
    System.out.println(b.contains(11));
*/

    ArrayList<Integer> nums = new ArrayList<Integer>();
    Random rand = new Random();

    for (int i = 0; i < 10; i++) {
      nums.add(i);
    }
    
    while (nums.size() > 0) {
      int n = rand.nextInt(nums.size());
      b.insert(nums.get(n));
      nums.remove(n);
    }
    System.out.println("\nDFS");

    b.printDFS();

    System.out.println("\n\nBFS");

    b.printBFS();

    System.out.println();

  }
}
