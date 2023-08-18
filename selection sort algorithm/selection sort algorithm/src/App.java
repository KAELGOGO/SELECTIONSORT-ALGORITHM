public class App {
    public static void sortingSort(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            int index = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[index]) {
                    index = j;
                }
            }
            int smaller = ar[index];
            ar[index] = ar[i];
            ar[i] = smaller;
        }
    }

    public static void main(String[] args) {
        int ar[] = { 1, 4, 3, 2 };
        System.out.println("sebelum di urutkan : ");
        for (int i : ar) {
            System.out.print(i + " ");
        }
        sortingSort(ar);
        System.out.println("\nsetelah diurutkan : ");
        for (int i : ar) {
            System.out.print(i + " ");
        }
    }
}