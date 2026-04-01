import java.util.Scanner;

public class LAB5 {
    int N;

    boolean isSafe(int board[][], int row, int col) {
        for (int i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 1)
                return false;
        return true;
    }

    boolean solveNQUtil(int board[][], int row) {
        if (row == N)
            return true;
        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                if (solveNQUtil(board, row + 1))
                    return true;
                board[row][col] = 0; // Backtracking
            }
        }
        return false;
    }

    void solveNQ() {
        int board[][] = new int[N][N];
        if (!solveNQUtil(board, 0)) {
            System.out.println("No solution exists");
            return;
        }
        printSolution(board);
    }

    void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        LAB5 obj = new LAB5();
        obj.N = n;
        obj.solveNQ();
        sc.close();
    }
}
