//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	String s = str;
    	for (int x = 0; x < m.length; x++){
    		for (int y = 0; y < m[x].length; y++){
    			m[x][y] = s.substring(0, 1);
    			s = s.substring(1);
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	for (int x = 0; x < m.length; x++){
    		for (int y = 0; y < m[x].length; y++){
    			if (checkRight(word, x, y)) return true;
    			if (checkLeft(word, x, y)) return true;
    			if (checkUp(word, x, y)) return true;
    			if (checkDown(word, x, y)) return true;
    			if (checkDiagUpRight(word, x, y)) return true;
    			if (checkDiagUpLeft(word, x, y)) return true;
    			if (checkDiagDownLeft(word, x, y)) return true;
    			if (checkDiagDownRight(word, x, y)) return true;
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		boolean found = false;
		int word = 0;
		if (c <= (m[r].length - w.length())){
			for(int x = 0; x < w.length(); x++){
				if ((w.charAt(x)) == (m[r][c].charAt(0))){
						found = true;
					}
			    else{
						found = false;
						word = 0;
					}

				if (found && (w.charAt(x)) == (m[r][c].charAt(0))) word++;
				c++;
			}
		}
		
		if (word == w.length()) return true;
		
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		boolean found = false;
		int word = 0;
		if (c >= (w.length()))
		{
			for(int x = 0; x < w.length(); x++){
				if ((w.charAt(x)) == (m[r][c].charAt(0))){
						found = true;
					}
			    else{
						found = false;
						word = 0;
					}

				if (found && (w.charAt(x)) == (m[r][c].charAt(0))) word++;
				c--;
			}
		}
		
		if (word == w.length()) return true;
		
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		boolean found = false;
		int word = 0;
		if (r >= (w.length()-1)){
			for(int x = 0; x < w.length(); x++){
				if ((w.charAt(x)) == (m[r][c].charAt(0))){
						found = true;
					}
			    else{
						found = false;
						word = 0;
					}

				if (found && (w.charAt(x)) == (m[r][c].charAt(0))) word++;
				r--;
			}
		}
		
		if (word == w.length()) return true;
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		boolean found = false;
		int word = 0;
		if (r <= (m[c].length - w.length())){
			for(int x = 0; x < w.length(); x++){
				if ((w.charAt(x)) == (m[r][c].charAt(0))){
						found = true;
					}
			    else{
						found = false;
						word = 0;
					}

				if (found && (w.charAt(x)) == (m[r][c].charAt(0))) word++;
				r++;
			}
		}
		
		if (word == w.length()) return true;
		
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		boolean found = false;
		int word = 0;
		if (c <= (m[r].length - w.length()) && r >= (w.length()-1)){
			for(int x = 0; x < w.length(); x++){
				if ((w.charAt(x)) == (m[r][c].charAt(0))){
						found = true;
					}
			    else{
						found = false;
						word = 0;
					}

				if (found && (w.charAt(x)) == (m[r][c].charAt(0))) word++;
					
				c++;
				r--;
			}
		}
		
		if (word == w.length()) return true;
		
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		boolean found = false;
		int word = 0;
		if (c >= (w.length()-1) && (r >= (w.length()-1))){
			for(int x = 0; x < w.length(); x++){
				if ((w.charAt(x)) == (m[r][c].charAt(0))){
						found = true;
					}
			    else{
						found = false;
						word = 0;
					}

				if (found && (w.charAt(x)) == (m[r][c].charAt(0))) word++;
				c--;
				r--;
			}
		}
		
		if (word == w.length()) return true;
		
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		boolean found = false;
		int word = 0;
		if (c >= (w.length()-1) && r <= (m[c].length - w.length())){
			for(int x = 0; x < w.length(); x++){
				if ((w.charAt(x)) == (m[r][c].charAt(0))){
						found = true;
					}
			    else{
						found = false;
						word = 0;
					}

				if (found && (w.charAt(x)) == (m[r][c].charAt(0))) word++;
				c--;
				r++;
			}
		}
		
		if (word == w.length()) return true;
		
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		boolean found = false;
		int word = 0;
		if (c <= (m[r].length - w.length()) && r <= (m[c].length - w.length())){
			for(int x = 0; x < w.length(); x++){
				if ((w.charAt(x)) == (m[r][c].charAt(0))){
						found = true;
					}
			    else{
						found = false;
						word = 0;
					}

				if (found && (w.charAt(x)) == (m[r][c].charAt(0))) word++;
				c++;
				r++;
			}
		}
		
		if (word == w.length()) return true;
		
		return false;
	}

    public String toString()
    {
String output = "";
    	
    	for (String[] s : m)
    	{
    		for (String c : s)
    		{
    			output += (c + " ");
    		}
			output += "\n";
    	}
    	
 		return output;
    }
    }

