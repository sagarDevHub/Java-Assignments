import java.util.Scanner;

class AddElementsToArray {
    public static int[] addElement(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = value;
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to add: ");
        int value = scanner.nextInt();
        int[] newArr = addElement(arr, value);
        System.out.println("New Array: " + java.util.Arrays.toString(newArr));
    }
}
