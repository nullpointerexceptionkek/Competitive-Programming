package wordproccesor;

import java.io.*;
import java.util.Arrays;
class WordProcessor {

public static void main(String[] args) {
  try{
    FileReader fr = new FileReader("word.in");
    BufferedReader b = new BufferedReader(fr);
    int [] input = Arrays.stream(b.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    String line = line = b.readLine();
    File output = new File("word.out");
    FileWriter w = new FileWriter(output);  
    BufferedWriter bw = new BufferedWriter(w); 
    String [] splited = line.split(" ");
      int totalchar = 0;
      totalchar+= splited[0].length();
        if(totalchar <= input[1]) {
          bw.write(splited[0]);
        } else {
          bw.newLine();
          totalchar = splited[0].length();
          bw.write(splited[0] + " ");
        }
      for (int i = 1; i< splited.length; i++) {
        totalchar+= splited[i].length();
        if(totalchar <= input[1]) {
          bw.write(" " + splited[i]);
        } else {
          bw.newLine();
          totalchar = splited[i].length();
          bw.write(splited[i]);
        }
      }
    
      
    b.close();
    bw.close();
    
  } catch(Exception e) {
  }  
  }

}