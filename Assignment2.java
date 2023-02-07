import java.util.*;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PATTERN - 1..................
        // int n = sc.nextInt();
        // String s = "";
        // if (n > 0) {
        //     s = "*";
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.println(s);
        //     s += "\t*";
        // }


        // PATTERN - 2...................
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n - i; j++) {
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }


        // PATTERN - 3...................
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n - i - 1; j++) {
        //         System.out.print(" \t");
        //     }
        //     for (int k = 0; k <= i; k++) {
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }


        // PATTERN - 4....................
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        //     for (int k = 0; k < i; k++) {
        //         System.out.print(" \t");
        //     }
        //     for (int j = 0; j < n - i; j++) {
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }


        // PATTERN - 5....................
        // int num = sc.nextInt();
        // int n = num / 2 + 1;
        // int k = 1;
        // for (int i = 0; i < n; i++) {
        //   for (int j = n - i - 1; j > 0; j--) {
        //     System.out.print(" \t");
        //   }
        //   for (int j = 0; j < k; j++) {
        //     System.out.print("*\t");
        //   }
        //   for (int j = n - i - 1; j > 0; j--) {
        //     System.out.print(" \t");
        //   }
        //   k = k + 2;
        //   System.out.println();
        // }

        // n = num - n;
        // k = num - 2;
        // for (int i = 0; i < n; i++) {
        //   for (int j = 0; j <= i; j++) {
        //     System.out.print(" \t");
        //   }
        //   for (int j = 0; j < k; j++) {
        //     System.out.print("*\t");
        //   }
        //   for (int j = 0; j <= i; j++) {
        //     System.out.print(" \t");
        //   }
        //   k = k - 2;
        //   System.out.println();
        // }


        // PATTERN - 6 .......................
        // int n = sc.nextInt();
        // int k = 1;
        // for (int i = n/2 + 1; i > 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*\t");
        //     }
        //     for (int j = 0; j < k; j++) {
        //         System.out.print(" \t");
        //     }
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*\t");
        //     }
        //     k = k + 2;
        //     System.out.println();
        // }
        // k = n - 2;
        // int num = 1;
        // for (int i = n/2; i > 0; i--) {
        //     for (int j = 0; j <= num; j++) {
        //         System.out.print("*\t");
        //     }
        //     for (int j = 0; j < k; j++)  {
        //         System.out.print(" \t");
        //     }
        //     k = k - 2;
        //     for (int j = 0; j <= num; j++) {
        //         System.out.print("*\t");
        //     }
        //     num++;
        //     System.out.println();
        // }


        // PATTERN - 7........................
        // int n = sc.nextInt();
        // for (int row = 0; row < n; row++) {
        //     for (int col = 0; col < n; col++) {
        //         if (row == col)
        //             System.out.print("* ");
        //         else
        //             System.out.print("   ");
        //     }
        //     System.out.println();
        // }


        // PATTERN - 8.......................
        // int n = sc.nextInt();
        // for (int row = n; row >= 0; row--) {
        //     for (int col = 0; col < n; col++) {
        //         if (row == col)
        //             System.out.print("* ");
        //         else
        //             System.out.print("   ");
        //     }
        //     System.out.println();
        // }


        // PATTERN - 9 .........................
        // int n = sc.nextInt();
        // int i = 0;
        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= n; col++) {
        //         if (row == col || col == n + i) {
        //             System.out.print("*\t");
        //         } else {
        //             System.out.print(" \t");
        //         }
        //     }
        //     System.out.println();
        //     i--;
        // }


        // PATTERN - 10.........................
        // int n = sc.nextInt();
        // int k = 1;
        // for (int i = 0; i < n; i++) {
        //      for (int j = 0; j < n; j++) {
        //          if (i == 0 || i == n - 1) {
        //             if (j == n/2) {
        //                 System.out.print("*\t");
        //             } else {
        //                 System.out.print(" \t");
        //             }
        //         }
        //         else if (i == n/2) {
        //             if (j == 0 || j == n - 1) {
        //                 System.out.print("*\t");
        //             } else {
        //                 System.out.print(" \t");
        //             }
        //         }
        //         else {
        //             if (j == n/2 - k|| j == n/2 + k) {
        //                 System.out.print("*\t");
        //             }
        //             else {
        //                 System.out.print(" \t");
        //             }
        //         }
        //     }
        //     System.out.println();
        //     if (i != 0 && i < n/2 - 1) {
        //         k++;
        //     } else if (i > n/2) {
        //         k--;
        //     } 
        // }


        // PATTERN - 11 ........................
        // int n = sc.nextInt();
        // int i = 0;
        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= row; col++) {
        //         i++;
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }


        // PATTERN - 12.........................
        // int n = sc.nextInt();
        // int i = 0;
        // int first = 0, second = 1, third = first + second;
        // System.out.println(first);
        // for (i = 2; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if (i == 2 && j == 1) {
        //             System.out.print(second + "\t");
        //             continue;
        //         }
        //         System.out.print(third + "\t");
        //         first = second;
        //         second = third;
        //         third = first + second;
        //     }
        //     System.out.println();
        // }


        // PATTERN - 13...........................
        // int n = sc.nextInt();
        // for (int row = 0; row < n; row++) {
        //     int i = 1;
        //     for (int col = 0; col <= row; col++) {
        //         System.out.print(i + " ");
        //         int io = i * (row - col) / (col + 1);
        //         i = io;
        //     }
        //     System.out.println();
        // }


        // PATTERN - 14..........................
        // System.out.println("enter a number");
        // int n = sc.nextInt();
        // System.out.printf("Table of %d is\n", n);
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(n + "*" + i + "=" + n * i);
        // }


        // PATTERN - 15.........................
        // int n = sc.nextInt();
        // int i = 0, p = -2 * n, j = 2 * n - 2;
        // for (int row = 1; row <= 2 * n - 1; row++) {
        //     p += 2;
        //     int columns_are = row > n ? (2 * n - row) + j : row + i;
        //     int spaces_are = row > n ? row - n : n - row;
        //     for (int spaces = 1; spaces <= spaces_are; spaces++) {
        //         System.out.print("\t");
        //     }
        //     int q = 0, r = 2, row1 = 0;
        //     for (int col = 0; col < columns_are; col++) {
        //         if (col <= columns_are / 2 && row <= n) {
        //             System.out.print(row + q + "\t");
        //             q++;
        //             row1 = row + q;
        //         } else if (col <= columns_are / 2 && row > n) {
        //             System.out.print(row - p + q + "\t");
        //             q++;
        //             row1 = row - p + q;
        //         } else {
        //             System.out.print(row1 - r + "\t");
        //             row1++;
        //             r += 2;
        //         }
        //     }
        //     System.out.println();
        //     i++;
        //     j--;
        // }


        // PATTERN - 16.........................
        // int n = sc.nextInt();
        // int q = 0;
        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= row; col++) {
        //         if (col == n)
        //             break;
        //         System.out.print(col + "\t");
        //     }
        //     for (int col = n + 1 - q; col > 0; col--) {
        //         System.out.print("\t");

        //     }
        //     q += 2;
        //     for (int col = row; col <= row; col--) {
        //         if (col == 0)
        //             break;
        //         System.out.print(col + "\t");
        //     }
        //     System.out.println();
        // }


        // PATTERN - 17.............................
        // int n = sc.nextInt();
        // String s = "";
        // String space = "";
        // int k = 0;
        // for (int i = 0; i < n; i++) {
        //     s += "*\t";
        // }
        // for (int i = 0; i < n/2; i++) {
        //     space += " \t";
        // }
        // for (int i = 0; i < n; i++) {
        //     if (i == n/2) {
        //         System.out.println(s);
        //         continue;
        //     }
        //     System.out.print(space);
        //     if (i > n/2) {
        //         for (int j = n/2 - k; j > 0; j--) {
        //             //System.out.print(n/2 - k + " ");
        //             System.out.print("*\t");
        //         }
        //         k++;
        //     } else {
        //         for (int j = 0; j <= i; j++) {
        //             System.out.print("*\t");
        //         }
        //     }
        //     System.out.println();
        // }


        // PATTERN - 18...............................
        // int n = sc.nextInt();
        // int k = 1;
        // for (int i = 0; i < n; i++) {
        //     System.out.print("*\t");
        // }
        // System.out.println();
        // for (int i = 1; i <= n/2 - 1; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (j == i || j == n - i - 1) {
        //             System.out.print("*\t");
        //         } else {
        //             System.out.print(" \t");
        //         }
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i <= n/2; i++) {
        //     for (int j = n/2 - i; j > 0; j--) {
        //         System.out.print(" \t");
        //     }
        //     for (int j = 0; j < k; j++) {
        //         System.out.print("*\t");
        //     }
        //     k = k + 2;
        //     System.out.println();
        // }


        // PATTERN - 19................................
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i == 1) {
        //             if (j == n || j <= n / 2 + 1)
        //                 System.out.print("*\t");
        //             else
        //                 System.out.print("\t");
        //         } else if (i <= n / 2) {
        //             if (j == n || j == n / 2 + 1)
        //                 System.out.print("*\t");
        //             else
        //                 System.out.print("\t");

        //         } else if (i == n / 2 + 1) {
        //             System.out.print("*\t");

        //         } else if (i < n) {
        //             if (j == 1 || j == n / 2 + 1)
        //                 System.out.print("*\t");
        //             else
        //                 System.out.print("\t");

        //         } else {
        //             if (j == 1 || j >= n / 2 + 1)
        //                 System.out.print("*\t");
        //             else
        //                 System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }


        // PATTERN - 20..............................
        // int n = sc.nextInt();
        // int k = -(n/2);
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (i == n || i <= n / 2) {
        //             if (j == n || j == 1)
        //                 System.out.print("*\t");
        //             else
        //                 System.out.print(" \t");
        //         } else if (i == n / 2 + 1) {
        //             if (j == n || j == 1 || j == n / 2 + 1) {
        //                 System.out.print("*\t");
        //             } else {
        //                 System.out.print(" \t");
        //             }
        //         } else {
        //         //System.out.print((n/2 - k) + " " + (n/2 + k) + " " + k + " ");
        //             if (j == 1 || j == n || j == n/2 - k + 1|| j == n/2 + k + 1) {
        //                 System.out.print("*\t");
        //             }
        //             else {
        //                 System.out.print(" \t");
        //             }
        //         }
        //     }
        //     k++;
        //     System.out.println();
        // }
    }
}
