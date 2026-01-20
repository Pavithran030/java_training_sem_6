/*

    A bus stop queue has 'n' groups of people. The i-th group from the beginning has 'ai' people. Every 30 minutes an empty bus arrives at the bus stop, it can carry atmost 'm' people. Naturally, the people from the first group enter the bus first. Then goes the people from the second group and so on. Note that the order of groups in the queue never changes. Moreover, if some group cannot fit all of its members into the current bus, it waits for the next bus and joins with the other groups standing after them in the queue. Your task is to determine the number of buses needed to transport all 'n' groups to the Jeju Island countryside.

    Input Format
    The first line contains two integers n and m (1 ≤ n, m ≤ 100). The next line contains n integers: a1, a2, ..., an (1 ≤ ai ≤ m).
    Output Format
    Print a single integer — the number of buses needed to transport all n groups to the Jeu Island countryside.

    Sample Input:
    4 3 
    2 3 2 1 
    Sample Output:
    3

 */

import java.util.Scanner;

public class BusCapacity {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Number of Grps : ");
            int n = sc.nextInt();
            System.out.print("Enter the Capacity of Bus : ");
            int m = sc.nextInt();

            if (n < 0 || m > 100) {
                System.out.println("Invalid Input");
                return;
            }

            int[] cap = new int[n];

            for (int i = 0; i < n; i++) {
                cap[i] = sc.nextInt();
                if (cap[i] < 1 && cap[i] > m) {
                    System.out.println("Invalid Group Members...");
                    return;
                }
            }
            // /*

            int count = 1;

            int capcity = 0;
            for (int i = 0; i < n; i++) {
                if (capcity + cap[i] <= m) {
                    capcity += cap[i];
                } else {
                    count++;
                    capcity = cap[i];
                }
            }
            System.out.println("Total Bus Needed : " + count);
        }
    }

}
