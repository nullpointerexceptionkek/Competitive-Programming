import java.io.*;
import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) throws IOException {
       //read file triangles.in
        File file = new File("triangles.in");
        Scanner scanner = new Scanner(file);
        var loop = scanner.nextInt();
        int [][] arr = new int[loop][2];
        for(int i = 0; i < loop; i++){
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        var area = 0;
        for (int[] ints : arr) {
            var a = 0;
            var b = 0;
            for (int[] value : arr) {
                //if it is parallel to the y-axis
                if (ints[0] == value[0]) {
                    a = Math.abs(ints[1] - value[1]);
                    //check b
                    for(int[] value1 : arr){
                        if(value1[1] == ints[1]){
                            b = Math.abs(value[1] - value1[1]);
                            if (a * b > area) {
                                area = a * b;
                                System.out.println(a*b);
                            }
                        }
                    }
                }
            }
        }
        //write to file triangles.out
        FileWriter writer = new FileWriter("triangles.out");
        writer.write(String.valueOf(area));
        writer.close();
    }

}