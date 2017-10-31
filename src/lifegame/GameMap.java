package lifegame;

public class GameMap {
	private int count;
	public GameMap() {
		
	}
	public void GetNeighborCount(int row,int col,int map[][]) {
		count=0;
		for(int i=(row-1);i<(row+2);i++)
			for(int j=(col-1);j<(col+2);j++)
			{
				if(i<0 || j<0 || i>=row || j>=col)
					continue;
				if(map[i][j]==1)
					count++;
			}
		if(map[row][col]==1)
			count--;
	}
	public void SetMap(int row,int col,int map[][]) {
		if(count==0 || count==1 || count>=4)
			map[row][col]=0;
		else if(count==3)
			map[row][col]=1;
	}
	
}
