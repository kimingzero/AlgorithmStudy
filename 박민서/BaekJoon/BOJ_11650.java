package 박민서.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;

public class BOJ_11650 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        int t = Integer.parseInt(br.readLine());
        int[][] arr = new int[t][2];
        for(int i = 0; i < t; i++){
            String[] str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }
        Arrays.sort(arr, (a, b) ->{
            if(a[0] == b[0]){
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        for(int i = 0; i < t; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
