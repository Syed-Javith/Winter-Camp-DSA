package Hashing.ClassProblems;

import java.util.Scanner;

public class SumWithTragetBruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0 ;i<n;i++){
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            for(int j = i +1; j<n;j++){
                if(i!=j && a[i] + a[j] == target){
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
        System.out.println("-1 -1");
        return;
    }
}
