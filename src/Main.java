import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] zeroCross = new int[3][3];


        while (!(zeroCross[0][0] == 1 && zeroCross[1][0] == 1 && zeroCross[2][0] == 1)) {
            while (!(zeroCross[0][1] == 1 && zeroCross[1][1] == 1 && zeroCross[2][1] == 1)) {


                int horizontal = scanner.nextInt();
                int vertical = scanner.nextInt();

                zeroCross[horizontal][vertical] = 1;


                for (int i = 0; i < zeroCross.length; i++) {
                    for (int j = 0; j < zeroCross[i].length; j++) {
                        // zeroCross[i][j]=(i+1)*(j+1);
                        System.out.print(zeroCross[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println("Victory");


    }
}
