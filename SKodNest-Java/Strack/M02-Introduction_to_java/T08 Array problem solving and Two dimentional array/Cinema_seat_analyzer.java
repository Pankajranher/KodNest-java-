import java.util.Scanner;

class Cinema_seat_analyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] seats = new int[row][col];
        int available = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                seats[i][j] = sc.nextInt();

                if (seats[i][j] == 0) {
                    available++;
                }
            }
        }
        System.out.println("Available seats:" + available);

        sc.close();
    }
}