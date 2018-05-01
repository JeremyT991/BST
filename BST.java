import java.util.*;

public class BST {
  int value = -1;
  BST left = null;
  BST right = null;

  static Queue<Integer> l = new LinkedList();


  void insert(int i) {
    if (value == -1) value = i;

    else if (value < i) {
      if (right == null) right = new BST();
      right.insert(i);
    }
    else {
      if (left == null) left = new BST();
      left.insert(i);
    }
  }
  
  boolean contains(int i) {
    System.out.print("current value: " + value);

    if (value == i) {
      System.out.println(" is equal to " + value);
      return true;
    }
    else if (value > i && left != null) {
      System.out.println(" is greater than " + i + " moving left.");
      return left.contains(i);
    }
    else if (right != null) {
      System.out.println(" is less than " + i + " moving right.");
      return right.contains(i);
    }
    System.out.println(" is not equal to " + i + " and there are no more values.");
    return false;
  }

  void printDFS() {
    if (left != null)
      left.printDFS();
    System.out.print(value + " ");
    if (right != null)
      right.printDFS();
  } 

  void printBFS() {
    int v;
    l.add(value);

    while(l.size() != 0) {
      v = l.poll();
      getChild(v);
      System.out.print(v + " ");
      
    }

  }
  
  void getChild(int i) {
    if (value > i && left != null)
      left.getChild(i);
    else if (value < i && right != null)
      right.getChild(i);
    else if (value == i) {
        if (left != null) 
          l.add(left.value);
        if (right != null)
          l.add(right.value);
    }
  }
}
