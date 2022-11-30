package nolast;

import java.io.*;

class Nolast {

  public static void main(String[] args) {
    try {
      FileReader fr = new FileReader("notlast.in");
      BufferedReader r = new BufferedReader(fr);
      File output = new File("notlast.out");
      FileWriter aw = new FileWriter(output);
      BufferedWriter w = new BufferedWriter(aw);
      int max = Integer.valueOf(r.readLine());
      int[] milk = new int[] { 0, 0, 0, 0, 0, 0, 0 };
      for (int i = 0; i < max; i++) {
        String[] input = r.readLine().split(" ");

        switch (input[0]) {
          case "Bessie":
            milk[0] += Integer.valueOf(input[1]);
            break;
          case "Elsie":
            milk[1] += Integer.valueOf(input[1]);
            break;
          case "Daisy":
            milk[2] += Integer.valueOf(input[1]);
            break;
          case "Gertie":
            milk[3] += Integer.valueOf(input[1]);
            break;
          case "Annabelle":
            milk[4] += Integer.valueOf(input[1]);
            break;
          case "Maggie":
            milk[5] += Integer.valueOf(input[1]);
            break;
          case "Henrietta":
            milk[6] += Integer.valueOf(input[1]);
            break;
        }

      }
      int temp = 1000000;
      for (int i = 0; i < 7; i++) {
        if (temp > milk[i]) {
          temp = milk[i];
        }
      }
      int temp2 = 1000000;
      for (int i = 0; i < 7; i++) {
        if (temp2 > milk[i] && milk[i] != temp) {
          temp2 = milk[i];
        }

      }
      int Tie = 0;
      int savedi = -1;
      for (int i = 0; i < 7; i++) {
        if (milk[i] == temp2) {
          Tie++;
          savedi = i;
        }
      }
      System.out.println(Tie);
      if (Tie > 1 || Tie ==0) {
        w.write("Tie");
        r.close();
        w.close();
        return;
      }

      switch (savedi) {
        case 0:
          w.write("Bessie\n");
          break;
        case 1:
          w.write("Elsie\n");
          break;
        case 2:
          w.write("Daisy\n");
          break;
        case 3:
          w.write("Gertie\n");
          break;
        case 4:
          w.write("Annabelle\n");
          break;
        case 5:
          w.write("Maggie\n");
          break;
        case 6:
          w.write("Henrietta\n");
          break;
      }
      r.close();
      w.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}