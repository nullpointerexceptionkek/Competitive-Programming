package clockwisefence;

import java.util.Scanner;

public class ClockwiseFence {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    var smth = Integer.parseInt(sc.nextLine());
    for (var i = 0; i < smth; i++) {
      var cw = 0;
      var ccw = 0;
      var input = sc.nextLine();
      for (var i2 = 0; i2 < input.length() - 1; i2++) {
        StringBuilder sb = new StringBuilder();
        sb.append(input.charAt(i2));
        sb.append(input.charAt(i2 + 1));
        switch (sb.toString()) {
          case "WN":
          case "NE":
          case "SW":
          case "ES":
            cw++;
            break;
          case "EN":
          case "SE":
          case "NW":
          case "WS": 
            ccw++;
            break;
        }
      }
      if (cw > ccw) {
        System.out.println("CW");
      } else {
        System.out.println("CCW");
      }

    }

  }

}