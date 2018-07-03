package com.example.leetcodesolution;

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
