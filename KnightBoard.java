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
      space -= 1;
			return true;
		}
		return false;
	}
	private boolean removeNight(int y, int x){
		board[y][x] = 0;
		count--;
    space++;
		return true;
	}

	public boolean solveH(int y, int x){
		if (space <=0){
			return true;
		}
    if (isPlacable(y+1,x+2)){
      addNight(y+1,x+2);
      if (solveH(y+1,x+2)){
        return true;
      }
      else{
        removeNight(y+1,x+2);
      }
      return false;
    }
    if (isPlacable(y-1,x+2)){
      addNight(y-1,x+2);
      if (solveH(y-1,x+2)){
        return true;
      }
      else{
        removeNight(y-1,x+2);
      }
      return false;
    }
    if (isPlacable(y+2,x+1)){
      addNight(y+2,x+1);
      if (solveH(y+2,x+1)){
        return true;
      }
      else{
        removeNight(y+2,x+1);
      }
      return false;
    }
    if (isPlacable(y+2,x-1)){
      addNight(y+2,x-1);
      if (solveH(y+2,x-1)){
        return true;
      }
      else{
        removeNight(y+2,x-1);
      }
      return false;
    }
    if (isPlacable(y-2,x+1)){
      addNight(y-2,x+1);
      if (solveH(y-2,x+1)){
        return true;
      }
      else{
        removeNight(y-2,x+1);
      }
      return false;
    }
    if (isPlacable(y-2,x-1)){
      addNight(y-2,x-1);
      if (solveH(y-2,x-1)){
        return true;
      }
      else{
        removeNight(y-2,x-1);
      }
      return false;
    }
    if (isPlacable(y+1,x-2)){
      addNight(y+1,x-2);
      if (solveH(y+1,x-2)){
        return true;
      }
      else{
        removeNight(y+1,x-2);
      }
      return false;
    }
    if (isPlacable(y-1,x-2)){
      addNight(y-1,x-2);
      if (solveH(y-1,x-2)){
        return true;
      }
      else{
        removeNight(y-1,x-2);
      }
      return false;
    }
    /*while(isPlacable(y+1,x+2)
         || isPlacable(y-1,x+2)
         || isPlacable(y+2,x+1)
         || isPlacable(y+2,x-1)
         || isPlacable(y-2,x+1)
         || isPlacable(y-2,x-1)
         || isPlacable(y+1,X-2)
         || isPlacable(y-1,x-2)){
    }*/
    return false;
	}

  private boolean isPlacable(int y, int x){
    return ((y>0 && y<board.length) && (x>0 && x<board[y].length) && (board[y][x] == 0));
  }
  
	public boolean solve(int y, int x){
    
                   clearTerminal();
            System.out.println(this);
            wait(20);
    
    return solveH(y,x);
	}
  
      private void wait(int millis){
         try {
             Thread.sleep(millis);
         }
         catch (InterruptedException e) {
         }
     }
     public void clearTerminal(){
        //erase terminal, go to top left of screen.
        System.out.println("\033[2J\033[1;1H");
    }
	public static void main(String[] args){
		KnightBoard k = new KnightBoard(5,5);
		System.out.println(k);
    k.solve(1,1);
   	System.out.println(k);
	}

}
