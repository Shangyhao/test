package lifegame;

import javax.swing.*;
import java.awt.*;

public class LifeGame {
	JFrame jf;
	JPanel[][] jp;
	static int map[][];
	int row;
	int col;
	public LifeGame(int r,int c) {
		row=r;
		col=c;
		map=new int[r][c];
		jf=new JFrame("LifeGame");
		jp=new JPanel[row][col];
		jf.setSize(1000,1000);
		jf.setLayout(new GridLayout(r,c,2,2));
		for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                jp[i][j] = new JPanel();
                jp[i][j].setBackground(Color.white);
                jf.add(jp[i][j]);
                
            }
	}
	public void Init() {
		
		for(int i=0;i<col;i++)
			for(int j=0;j<row;j++)
			{
				if(Math.random()<0.5)
					map[i][j]=0;
				else map[i][j]=1;
			}
		update();
		jf.setVisible(true);
	}
	public void update() {
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (map[i][j]==1) {
                    jp[i][j].setBackground(Color.blue);
                } else {
                    jp[i][j].setBackground(Color.white);
                }
            }
        }
    }
	public void GameCycle() {
		GameMap gm=new GameMap();
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++) {
				gm.GetNeighborCount(i, j, map);
				gm.SetMap(i, j, map);
			}
		update();
	}
	
}
