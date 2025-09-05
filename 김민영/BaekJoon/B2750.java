///**
// * 문제 링크: https://www.acmicpc.net/status?user_id=lucy9150&problem_id=2750&from_mine=1
// * 메모리: 22072KB
// * 시간: 280ms
// */
//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//
//        for(int i=0; i<size; i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i=1; i<arr.length; i++){
//            int key = arr[i];
//            int j = i-1;
//
//            while(j>=0 && arr[j]>key){
//                arr[j+1]=arr[j];
//                j--;
//            }
//            arr[j+1] = key;
//        }
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
//    }
//}