package abc;

import java.util.Arrays;
import java.util.Scanner;

class ABC {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
      int [] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();    
      Arrays.sort(input);
      int abc = input[input.length-1];
      int a = input[0];
      int b = input[1];
      int c = abc-a-b;
      System.out.println(a + " " + b+ " " + c);
      
  }
}