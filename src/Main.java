import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int[] test= {0,21,1,3,4,5,8,6,8,9,23,4,32,32,4,14,24,2,435,3,53,423,423,4,24,24,23,42,4,25,235,234,325,4,53,53,53,5,45,35,34,6,5,74};
        sort(test);

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }
    private static void sort(int[] input) {
        int size = input.length;
        for (int i = 1; i < size; i++) {
            for (int j = i; j >0; j--) {
                if(input[j]<input[j-1]){
                    int temp = input[j-1];
                    input[j-1]=input[j];
                    input[j]=temp;
                }
            }
        }
    }
}