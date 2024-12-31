#CHAT GPT
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListOperations {

    // Function to add a number
    public static ArrayList<Integer> addNum(ArrayList<Integer> lst, int num) {
        lst.add(num);
        return lst;
    }

    // Function to remove a number
    public static ArrayList<Integer> removeNum(ArrayList<Integer> lst, int num) {
        if (lst.contains(num)) {
            lst.remove(Integer.valueOf(num));
        } else {
            System.out.println("Element " + num + " is not found in the list.");
        }
        return lst;
    }

    // Function to find maximum number
    public static Integer maxNum(ArrayList<Integer> lst) {
        if (lst.size() > 0) {
            return Collections.max(lst);
        } else {
            return null;
        }
    }

    // Function to find minimum number
    public static Integer minNum(ArrayList<Integer> lst) {
        if (lst.size() > 0) {
            return Collections.min(lst);
        } else {
            return null;
        }
    }

    // Function to calculate the sum
    public static int sumList(ArrayList<Integer> lst) {
        int sum = 0;
        for (int num : lst) {
            sum += num;
        }
        return sum;
    }

    // Function to sort the list in ascending order
    public static ArrayList<Integer> sortList(ArrayList<Integer> lst) {
        Collections.sort(lst);
        return lst;
    }

    // Function to reverse the list
    public static ArrayList<Integer> reverseList(ArrayList<Integer> lst) {
        Collections.reverse(lst);
        return lst;
    }

    // Function to count the occurrences of a number
    public static int count(ArrayList<Integer> lst, int num) {
        int count = 0;
        for (int n : lst) {
            if (n == num) {
                count++;
            }
        }
        return count;
    }

    // Function to find the index of a number
    public static int index(ArrayList<Integer> lst, int num) {
        return lst.indexOf(num);
    }

    // Main Program
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        Collections.addAll(lst, 5, 2, 9, 1, 5, 6, 3, 9, 5, 7);
        
        System.out.println("Original List: " + lst);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number to be added: ");
        int a = scanner.nextInt();
        lst = addNum(lst, a);
        System.out.println("After Adding: " + lst);

        System.out.print("Enter number to be removed: ");
        int b = scanner.nextInt();
        lst = removeNum(lst, b);
        System.out.println("After Removing: " + lst);

        System.out.println("Maximum Number: " + maxNum(lst));
        System.out.println("Minimum Number: " + minNum(lst));
        System.out.println("Sum of Numbers: " + sumList(lst));
        System.out.println("Sorted List in Ascending order: " + sortList(lst));
        System.out.println("Reversed List: " + reverseList(lst));

        System.out.print("Enter number to be counted: ");
        int c = scanner.nextInt();
        System.out.println("Count of " + c + ": " + count(lst, c));

        System.out.print("Enter number index you want to know: ");
        int d = scanner.nextInt();
        int index = index(lst, d);
        if (index != -1) {
            System.out.println("Index of " + d + ": " + index);
        } else {
            System.out.println("Element " + d + " is not found in the list.");
        }

        scanner.close();
    }
}
OUTPUT:
Original List: [5, 2, 9, 1, 5, 6, 3, 9, 5, 7]
Enter number to be added:10
After Adding: [5, 2, 9, 1, 5, 6, 3, 9, 5, 7, 10]
Enter number to be removed:7
After Removing: [5, 2, 9, 1, 5, 6, 3, 9, 5, 10]
Maximum Number: 10
Minimum Number: 1
Sum of Numbers: 55
Sorted List in Ascending order: [1, 2, 3, 5, 5, 5, 6, 9, 9, 10]
Reversed List: [10, 5, 9, 3, 6, 5, 1, 9, 2, 5]
Enter number to be counted:5
Count of 5 : 3
Enter number index you want to know:1
Index of  1 : 3
