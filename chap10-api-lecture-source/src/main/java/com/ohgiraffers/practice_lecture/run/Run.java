package com.ohgiraffers.practice_lecture.run;

import com.ohgiraffers.practice_lecture.dto.Employee;
import com.ohgiraffers.practice_lecture.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        // 위의 학생 정보 모두 출력 --> 향상된 for문 이용해서
        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        // 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 한 명씩 추가 될 때마다 카운트함
        // 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
        // 현재 기록된 사원들의 정보를 모두 출력

        Student[] arr = new Student[3];

        arr[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        arr[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        arr[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for(Student i : arr){
            System.out.println(i.information());
        }

        Employee[] employeeArr = new Employee[10];
        boolean isTrue = true;
        Scanner sc = new Scanner(System.in);
        while(isTrue){
            for(int count = 0; count<employeeArr.length; count++){
                System.out.print("사원 이름 입력 : ");
                String employeeName = sc.nextLine();
                System.out.print("사원 나이 입력 : ");
                int employeeAge = sc.nextInt();
                System.out.print("사원 신장 입력 : ");
                double employeeHeight = sc.nextDouble();
                System.out.print("사원 몸무게 입력 : ");
                double employeeWeight = sc.nextDouble();
                System.out.print("사원 급여 입력 : ");
                int employeeSalary = sc.nextInt();
                sc.nextLine();
                System.out.print("사원 부서 입력 : ");
                String employeeDepth = sc.nextLine();

                employeeArr[count] = new Employee(employeeName, employeeAge, employeeHeight, employeeWeight, employeeSalary, employeeDepth);

                System.out.print("계속 추가하시겠습니까? (y/n) : ");
                String keepGoing = sc.nextLine();

                if(keepGoing.equals("y") || keepGoing.equals("Y")){
                    isTrue = true;
                }else{
                    isTrue = false;
                    break;
                }
            }
        }

        // 출력
        for(Employee i : employeeArr){
            if(i != null){
                System.out.println(i.information());
            }
        }
    }
}
