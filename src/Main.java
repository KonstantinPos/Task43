public class Main {
    public static void main(String[] args) {
        int arr[] = new int[11];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = (int) (Math.random() * 3) - 1;
            arr[i] = a;
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                count1++;
            }
            if (arr[i] == 0) {
                count2++;
            }
            if (arr[i] == 1) {
                count3++;
            }
        }
        System.out.println();
        if ((count1 > count2 && count1 > count3) && !(count2 == count3)) {
            System.out.println("Чаще встречается -1 " + count1 + " раз");
        }
        if ((count2 > count1 && count2 > count3) && !(count1 == count3)) {
            System.out.println("Чаще встречается -0 " + count2 + " раз");
        }
        if ((count3 > count1 && count3 > count2) && !(count1 == count2)) {
            System.out.println("Чаще встречается -1 " + count3 + " раз");
        } else if (count1 == count2 || count1 == count3 || count2 == count3) {

        }
    }
}
