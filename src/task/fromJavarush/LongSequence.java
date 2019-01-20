package task.fromJavarush;

import java.io.*;
import java.util.ArrayList;

public class LongSequence {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num);
        }

        int max = 0;
        int min = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i-1))) {
                max++;
            } else {
                if (max > min) {
                    min = max;
                }

                max = 0;
            }

            if  (i + 1  == list.size()) {
                if (max > min){
                    min = max;
                }
            }

        }

        System.out.println(max + 1);

    }
}
