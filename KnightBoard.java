public class KnightBoard{
	private int count;
	private int[][] board;
	public KnightBoard(int r, int c){
		count = 1;
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
					str+= "__ ";
				}
				if (board[i][j] <= 9 && board[i][j] > 0){
					str+= " "+board[i][j] +" ";
				}
				if (board[i][j] > 9){
						str+= board[i][j] + " ";
				}
			}
			str+= "\n";
		}
		return str;
	}
	private boolean addNight(int y, int x){
		if (board[y][x] != 0){
			board[y][x] = count++;
			return true;
		}
		return false;
	}
	private boolean removeNight(int y, int x){
		board[y][x] = 0;
		count--;
		return true;
	}
	public static void main(String[] args){
		KnightBoard k = new KnightBoard(5,5);
		System.out.println(k);
	}

}
