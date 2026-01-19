package frame;

import java.awt.Color;
import java.awt.Graphics;

public class Room {

	int[][][] rooms={
		{{0, 0, 0, 0, 0},
        {0, 1, 1, 1, 0},
        {0, 1, 2, 1, 0},
        {0, 0, 0, 0, 0},},
	
		{{0, 0, 0, 0, 0},
        {0, 1, 1, 1, 0},
        {0, 1, 2, 1, 0},
        {0, 0, 0, 0, 0},},
	};

	/*
	10s Bar
	20s Street
	30s Train Station
	*/

	/*
	..0 floor
	..1 wall
	..2 table
	..3 chair
	..6/7 door +-1
	..8/9 door +-10 
	*/

	int curentRoom=0;
	int[][] room = rooms[0];

    public Room() {
							this.room = room;
							this.curent = curentRoom;
    }

    public boolean inRange(int target, int range, int posx, int posy){
								//suche nur nach einerstelle!
        boolean valid= false;
        for(int i=0,i<2*range+1,i++){
            for(int j=0, j<2*range+1;j++){
                if((room[posx-range+i][posy-range+j])%10==target){
                    valid= true;
                }
            }
        }
        retrun valid;
    }

    public boolean isWalkable(int posx,int posy){
        if(room[posx][posy]==0){
            return true;
        }else{
            return false;
        }
    }

    

    public void draw(Graphics g) {
        for (int i = 0; i < room[0].length; i++) {
            for (int j = 0; j < room.length; j++) {
                switch (room[j][i]) {
                    case 0:
                        g.setColor(Color.red);
                        break;
                    case 1:
                        g.setColor(Color.blue);
                        break;
                    case 2:
                        g.setColor(Color.green);
                        break;
                    default:
                        g.setColor(Color.yellow);
                }
                g.fillRect(i*64+16, j*64, 64, 64);
            }
        }
    }

				public void switchRoom(){
				}
				
				public int[] enterance(){
        for (int i = 0; i < room[0].length; i++) {
            for (int j = 0; j < room.length; j++) {
																if (room[i][j]==6){ return {i,j};
													
												}
								}
				//gibt die positon der Eingangstür wieder
								return {0,0} ;
				}

			public boolean inside(){
							if(curent==0||curent==1||){return true}else{return false}
			} 
}
