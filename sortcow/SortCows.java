package sortcow;

import java.io.*;
import java.util.Arrays;
import java.lang.Math;
class SortCows {

public static void main(String[] args) {
  try {
    FileReader fr = new FileReader("herding.in");
    BufferedReader b = new BufferedReader(fr);
    File output = new File("herding.out");
    FileWriter w = new FileWriter(output);  
    BufferedWriter bw = new BufferedWriter(w);
    int [] input = Arrays.stream(b.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();    
    Arrays.sort(input);
    if(input[0] + 1 == input[1] ? input[1] + 1 == input[2]: false) {
      bw.write("0");
      bw.newLine();
      bw.write("0");  
      b.close();
      bw.close();
       return;
    }
    if(input[0] + 2 == input[1] || input[1] + 2 == input[2]) {
      bw.write("1");
      bw.newLine();
      bw.write(String.valueOf(Math.max(input[1]-input[0],input[2]-input[1])-1));
      b.close();
      bw.close();
       return;
    }
    bw.write("2");
    bw.newLine();
    bw.write(String.valueOf(Math.max(input[1]-input[0],input[2]-input[1])-1));
          
    b.close();
    bw.close();
    
    
    } catch (Exception e) {
    
    }
  
  }
}