package JavaInterviewCheatSheet;

import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        int n;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num :");
        n = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        String name[] = new String[n];
        System.out.println("Enter names: ");

        for(int i=0;i<n;i++) {
            name[i] = sc1.nextLine();
        }

        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if (name[i].compareTo(name[j]) > 0) {
                    temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }

        System.out.println();
        for(String names : name) {
            System.out.println(names);
        }
    }
}
