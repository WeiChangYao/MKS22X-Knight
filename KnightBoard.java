public class KnightBoard{
	private int[][] board;
	public KnightBoard(int r, int c){
		board = new int[r][c];
		for (int i = 0; i < r; i++){
			for (int j = 0; j < c; j++){
				board[i][j] = 0;
			}
		}
	}
	public String toString(){
		String str = "";
		for (int i = 0; i < board.length; i++){
			for (int j = 0; j < board[i].length; j++){
				if (board[i][j] == 0){
					str+= "__";
				}
				if (board[i][j] <= 9){
					str+= " "+board[i][j];
				}
				else{
					str+= board[i][j];
				}
			}
		}
		return str;
	}
}
