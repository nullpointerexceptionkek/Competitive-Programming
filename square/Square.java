package square;

import java.io.*;
import java.util.Arrays;
import java.lang.Math;

class Square {

  public static void main(String[] args) {
    try {
      FileReader fr = new FileReader("square.in");
      BufferedReader br = new BufferedReader(fr);
      File output = new File("square.out");
      FileWriter aw = new FileWriter(output);
      BufferedWriter w = new BufferedWriter(aw);
      int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] input2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

      int x1 = Math.min(input[0], input2[0]);
      int y1 = Math.min(input[1], input2[1]);
      int x2 = Math.max(input[2], input2[2]);
      int y2 = Math.max(input[3], input2[3]);

      int side = Math.max(x2 - x1, y2 - y1);

      w.write(String.valueOf((int) Math.pow(side, 2)));

      br.close();
      w.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}