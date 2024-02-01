package com.ohgiraffers.section04.sort;

public class Application3 {
    public static void main(String[] args) {
        /* 버블정렬
        *  인접한 두개의 원소를 검사하여 정렬하는 방법
        *  구현이 쉽다는 장점이 있지만, 다른 정렬에 비해 정렬속도가 느리며
        *  역순으로 정렬할 때 가장 느린 속도를 가진다. */

        /* 버블정렬이란?
        *  한개의 올바른 정렬위치(ex. 맨 마지막값)를 찾기 위해서 나머지 값들을 전부 비교
        *  두번째 실행 시, 올바른 정렬위치를 찾은 값을 제외하고 이번에는 바로 앞의 위치에 올바른 값이 오도록 전부 비교
        *  나머지 모든 값이 적합한 위치를 찾을때까지 순서대로 반복
        * */

        int[] arr = {3,7,2,4,1,5};

        int temp;

        /* 인덱스 0부터 큰값 순서로 비교 */
        for(int i=arr.length - 1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        /* 인덱스 큰값부터 0으로 비교 */
        for(int i=0; i<arr.length; i++){
            for(int j=arr.length-1; j>i; j--){
                if(arr[j]<arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}



