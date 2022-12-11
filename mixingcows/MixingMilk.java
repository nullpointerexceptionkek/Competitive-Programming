import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MixingMilk {

    public static void main(String[] args) throws IOException {


        Scanner in = new Scanner(new File("mixmilk.in"));

        //only 3 bucket
        //total 100 pours
        //pour 1 to 2
        //pour 2 to 3
        //pour 3 to 1
        //pours as much milk as possible util either bucket a is empty or bucket b is full

        //read in the first line
        int[] bucket1 = new int[2];
        bucket1[0] = in.nextInt();
        bucket1[1] = in.nextInt();
        //print
        System.out.println(bucket1[0] + " " + bucket1[1]);

        int[] bucket2 = new int[2];
        bucket2[0] = in.nextInt();
        bucket2[1] = in.nextInt();
        //print
        System.out.println(bucket2[0] + " " + bucket2[1]);


        int[] bucket3 = new int[2];
        bucket3[0] = in.nextInt();
        bucket3[1] = in.nextInt();

        //print
        System.out.println(bucket3[0] + " " + bucket3[1]);

        for(var i = 1; i <= 100; i++) {

            var originalBucket1 = bucket1[1];
            bucket1[1] -= Math.min(bucket1[1], bucket2[0] - bucket2[1]);
            //pour 1 to 2
            bucket2[1] = Math.min(bucket2[0], bucket2[1] + originalBucket1);

            if(i == 100) {
                break;
            }

            //pour 2 to 3
            var originalBucket2 = bucket2[1];
            bucket2[1] -= Math.min(bucket2[1], bucket3[0] - bucket3[1]);
            bucket3[1] = Math.min(bucket3[0], bucket3[1] + originalBucket2);

            //pour 3 to 1
            var originalBucket3 = bucket3[1];
            bucket3[1] -= Math.min(bucket3[1], bucket1[0] - bucket1[1]);
            bucket1[1] = Math.min(bucket1[0], bucket1[1] + originalBucket3);
        }

        //file output to mixmilk.out
        PrintWriter out = new PrintWriter("mixmilk.out");
        out.println(bucket1[1]);
        out.println(bucket2[1]);
        out.println(bucket3[1]);
        out.close();





    }
}
