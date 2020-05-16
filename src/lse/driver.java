package lse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class driver {
	public static void main (String args[]) throws FileNotFoundException {
		
		
		
		LittleSearchEngine a = new LittleSearchEngine();
		
//		System.out.println(a.getKeyword("or"));
		
		a.makeIndex("docs.txt", "noisewords.txt");
		System.out.println(a.top5search("once", "deep"));
		
		
	}
}