public class WordSearch {
    public static void main(String[] args) {
        String board[][]= {
                {"A","B","C","E"},
                {"S","F","C","S"},
                {"A","D","E","E"}
        };
        String word="ABCCED";
        System.out.println(exist(board,word));
    }
    public static boolean exist(String[][] board, String word) {
        int rows=board.length;
        int cols=board[0].length;
        boolean visited[][]=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(dfs(board,word,0,i,j,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(String[][] board, String word, int index, int row, int col, boolean[][] visited) {
        if (index == word.length()) {
            return true;
        }
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length) {
            return false;
        }
        if (visited[row][col] || !board[row][col].equals(String.valueOf(word.charAt(index)))) {
            return false;
        }
        visited[row][col] = true;
        boolean found = dfs(board, word, index + 1, row + 1, col, visited) ||
                        dfs(board, word, index + 1, row - 1, col, visited) ||
                        dfs(board, word, index + 1, row, col + 1, visited) ||
                        dfs(board, word, index + 1, row, col - 1, visited);
        visited[row][col] = false;
        return found;
    }
}
