import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        //read the file from diamond.in
        var fileReader = new FileReader("diamond.in");
        var bufferedReader = new BufferedReader(fileReader);
        var input = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] diamonds = new int[input[0]];
        for(int i = 0; i < input[0]; i++){
            diamonds[i] = Integer.parseInt(bufferedReader.readLine());
        }
        var sum = 0;
        for(int i = 0; i < diamonds.length; i++){
            var count = 0;
            for(int j = i; j < diamonds.length; j++){
                if(Math.abs(diamonds[i] - diamonds[j]) <= input[1]){
                    count++;
                }
            }
            if(count > sum){
                sum = count;
            }
        }

        //write the result to diamond.out
        var fileWriter = new FileWriter("diamond.out");
        fileWriter.write(String.valueOf(sum));
        fileWriter.close();
    }
}