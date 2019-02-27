public class KnightBoard{
	private int count;
	private int space;
	private int[][] board;
	public KnightBoard(int r, int c){
		count = 1;
		space = r*c;
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
		if (board[y][x] == 0){
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
	public boolean solveH(int y, int x){
		if (space <=0){
			return true;
		}
		
	}

  private boolean isPlacable(int y, int x){
    return ((y>0 && y<board.length) && (x>0 && x<board[y].length) && (board[y][x] == 0));
  }
  
	//public boolean solve(int y, int x){

	//}
	public static void main(String[] args){
		KnightBoard k = new KnightBoard(3,3);
		system.out.println(k);
	}

}
