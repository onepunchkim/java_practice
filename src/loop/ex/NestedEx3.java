package loop.ex;

public class NestedEx3 {
    public static void main(String[] args) {
        int rows = 1;

        for (int i = 0; i <= rows; i++){
            for (int j = 1; j <= rows - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
