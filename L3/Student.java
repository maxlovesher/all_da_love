// Write a program in java to input and display the details of n number of students having roll, 
// name and cgpa as data members. Also display the name of the student having lowest cgpa

import java.util.Scanner;

public class Student {
    int roll;
    String name;
    float cgpa;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] s = new Student[n];
        int min = 0;

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].roll = sc.nextInt();
            s[i].name = sc.next();
            s[i].cgpa = sc.nextFloat();
            if (s[i].cgpa < s[min].cgpa) min = i;
        }

        for (Student x : s)
            System.out.println(x.roll + " " + x.name + " " + x.cgpa);

        System.out.println(s[min].name);
        sc.close();
    }
}
