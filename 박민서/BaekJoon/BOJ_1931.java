package 박민서.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int [n][2];
        for(int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }
        Arrays.sort(arr, (a, b) -> {
            if(a[1] == b[1]){
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        int count = 0;
        int end = 0;
        for(int i = 0; i < n; i++){
            if(end <= arr[i][0]){
                count++;
                end = arr[i][1];
            }
        }
        System.out.println(count);
    }
    
}
