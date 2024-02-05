package com.ohgiraffers.practice;

import javax.management.loading.MLet;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        int[] arr = new int[6];
        boolean isTrue;
        int random = 0;
        int temp;

        for(int i=0; i<arr.length; i++){
            isTrue = true;

            while(isTrue){
                random = (int)((Math.random()*46)+1);
                isTrue = false;

                for(int a=0; a<i; a++){
                    if(arr[a] == random){
                        isTrue = true;
                        break;
                    }
                }
            }

            arr[i] = random;
        }

        for(int i=1; i<arr.length; i++){
            for(int a=0; a<i; a++){
                if(arr[a]>arr[i]){
                    temp = arr[a];
                    arr[a] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
