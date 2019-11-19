import java.util.Scanner;

public class ZeroCrossImpl implements ZeroCross {

    int whoPlays;
    public int firstPlayer;
    public int secondPlayer;


    @Override
    public void run() {


        Scanner scanner = new Scanner(System.in);

        int[][] zeroCross = new int[3][3];

        System.out.println("Введите целые числа которыми будете играть в игру Крестик-Нолик" + " " + "роль нолика занимает число" +
                "-" + "x");

        int x = scanner.nextInt();
        firstPlayer = x;

        System.out.println(" А роль крестика занимает число" + "-" + "y");

        int y = scanner.nextInt();
        secondPlayer = y;
        System.out.println("игру начинает:"+ "x");


        while (!(IsWinerZero(zeroCross) || IsWinerCross(zeroCross))) {


            System.out.println("Введите число от 0 до 2 для позиции по горизонтали");
            int line = scanner.nextInt();

            System.out.println("Введите число от 0 до 2 для позиции по вертикали");
            int column = scanner.nextInt();



            if (zeroCross[line][column] == 0) {
                zeroCross[line][column] = whoNext();
            } else {
                System.out.println("Вы не можите играть в этой позиции, введите еще раз");
            }

            System.out.println("Игровое поле:");
            System.out.println(" В игру вступает: "+ whoPlays);

            for (int i = 0; i < zeroCross.length; i++) {
                for (int j = 0; j < zeroCross[i].length; j++) {
                    System.out.print(zeroCross[i][j] + "\t");
                }    // zeroCross[i][j]=(i+1)*(j+1);
                System.out.println();
            }



            if (IsStendoff(zeroCross)) {
                System.out.println("Игра завершенна! У вас Ничья.");
                break;
            }
            else {
            }
            System.out.println("Хороший ход - продолжаем  игру!!!");


        }
        System.out.println("Victory");


    }

    boolean IsStendoff ( int[][] zeroCross){

        int x = firstPlayer;
        int y = secondPlayer;

        return



                               (zeroCross[0][0] == y && zeroCross[0][1] == y && zeroCross[0][2] == x &&
                                zeroCross[1][0] == x && zeroCross[1][1] == y && zeroCross[1][2] == y &&
                                zeroCross[2][0] == y && zeroCross[2][1] == x && zeroCross[2][2] == x) ||

                                      (zeroCross[0][0] == x && zeroCross[1][0] == x && zeroCross[2][0] == y &&
                                       zeroCross[0][1] == y && zeroCross[1][1] == y && zeroCross[2][1] == x &&
                                       zeroCross[0][2] == x && zeroCross[1][2] == y && zeroCross[2][2] == y) ||

                               (zeroCross[0][0] == y && zeroCross[0][1] == y && zeroCross[0][2] == x &&
                                zeroCross[1][0] == x && zeroCross[1][1] == x && zeroCross[1][2] == y &&
                                zeroCross[2][0] == y && zeroCross[2][1] == x && zeroCross[2][2] == x) ||

                                                       (zeroCross[0][0] == x && zeroCross[1][0] == y && zeroCross[2][0] == x &&
                                                        zeroCross[0][1] == y && zeroCross[1][1] == x && zeroCross[2][1] == y &&
                                                        zeroCross[0][2] == y && zeroCross[1][2] == x && zeroCross[2][2] == y) ||

                                (zeroCross[0][0] == y && zeroCross[0][1] == x && zeroCross[0][2] == y &&
                                 zeroCross[1][0] == x && zeroCross[1][1] == y && zeroCross[1][2] == y &&
                                 zeroCross[2][0] == x && zeroCross[2][1] == y && zeroCross[2][2] == x) ||


                                (zeroCross[0][0] == y && zeroCross[1][0] == x && zeroCross[2][0] == x &&
                                 zeroCross[0][1] == x && zeroCross[1][1] == y && zeroCross[2][1] == y &&
                                 zeroCross[0][2] == y && zeroCross[1][2] == x && zeroCross[2][2] == x) ||

                                (zeroCross[0][0] == x && zeroCross[0][1] == y && zeroCross[0][2] == y &&
                                 zeroCross[1][0] == x && zeroCross[1][1] == y && zeroCross[1][2] == y &&
                                 zeroCross[2][0] == x && zeroCross[2][1] == y && zeroCross[2][2] == y) ||


                                (zeroCross[0][0] == y && zeroCross[1][0] == y && zeroCross[2][0] == x &&
                                 zeroCross[0][1] == x && zeroCross[1][1] == x && zeroCross[2][1] == y &&
                                 zeroCross[0][2] == y && zeroCross[1][2] == y && zeroCross[2][2] == x) ||

                                (zeroCross[0][0] == x && zeroCross[0][1] == x && zeroCross[0][2] == y &&
                                 zeroCross[1][0] == y && zeroCross[1][1] == y && zeroCross[1][2] == x &&
                                 zeroCross[2][0] == x && zeroCross[2][1] == x && zeroCross[2][2] == y);


    }
    public boolean IsWinerCross ( int[][] zeroCross){

        int x = firstPlayer;

        return


                (zeroCross[0][0] == x && zeroCross[1][0] == x && zeroCross[2][0] == x) || // 111 - !true = false; 100 - !false = true
                        (zeroCross[0][1] == x && zeroCross[1][1] == x && zeroCross[2][1] == x) ||
                        (zeroCross[0][2] == x && zeroCross[1][2] == x && zeroCross[2][2] == x) ||

                        (zeroCross[0][0] == x && zeroCross[0][1] == x && zeroCross[0][2] == x) ||
                        (zeroCross[1][0] == x && zeroCross[1][1] == x && zeroCross[1][2] == x) ||
                        (zeroCross[2][0] == x && zeroCross[2][1] == x && zeroCross[2][2] == x) ||

                        (zeroCross[0][0] == x && zeroCross[1][1] == x && zeroCross[2][2] == x) ||
                        (zeroCross[0][2] == x && zeroCross[1][1] == x && zeroCross[2][0] == x);


    }
    public boolean IsWinerZero ( int[][] zeroCross){

        int y = secondPlayer;

        return


                (zeroCross[0][0] == y && zeroCross[1][0] == y && zeroCross[2][0] == y) || // 111 - !true = false; 100 - !false = true
                        (zeroCross[0][1] == y && zeroCross[1][1] == y && zeroCross[2][1] == y) ||
                        (zeroCross[0][2] == y && zeroCross[1][2] == y && zeroCross[2][2] == y) ||

                        (zeroCross[0][0] == y && zeroCross[0][1] == y && zeroCross[0][2] == y) ||
                        (zeroCross[1][0] == y && zeroCross[1][1] == y && zeroCross[1][2] == y) ||
                        (zeroCross[2][0] == y && zeroCross[2][1] == y && zeroCross[2][2] == y) ||

                        (zeroCross[0][0] == y && zeroCross[1][1] == y && zeroCross[2][2] == y) ||
                        (zeroCross[0][2] == y && zeroCross[1][1] == y && zeroCross[2][0] == y);


    }
    @Override
    public int whoNext () {
        if (whoPlays == firstPlayer) {
            whoPlays = secondPlayer;
        } else if (whoPlays == secondPlayer) {
            whoPlays = firstPlayer;
        } else {
            whoPlays = firstPlayer;

        }
        return whoPlays;

    }
}