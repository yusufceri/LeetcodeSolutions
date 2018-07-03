package com.example.leetcodesolution;


/*
 * 
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves,
 * judge if this robot makes a circle, which means it moves back to the original place.
 * The move sequence is represented by a string. And each move is represent by a character. 
 * The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.
 * 
 */
public class JudgeRouteCircle {

	public static void main(String[] args) {
		String str = "UDLR";
		
		System.out.println(judgeCircle(str));
	}
	
	public static boolean judgeCircle(String moves) {
        int x=0, y=0;
        
        if(moves.length() % 2 != 0)
            return false;
        
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i) == 'U')
                y++;
            else if(moves.charAt(i) == 'D')
                y--;
            else if(moves.charAt(i) == 'L')
                x--;
            else if(moves.charAt(i) == 'R')
                x++;
        }
        return (x==0 && y==0);
    }

}
