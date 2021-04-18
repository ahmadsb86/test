/*
ID: ahmadsa3
LANG: JAVA
TASK: gift1
*/

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {

		final String probName = "gift1";
		File myObj = new File(probName + ".in");
		if (myObj.createNewFile()) {
			System.out.println("File created: " + myObj.getName());
		}
		BufferedReader in = new BufferedReader(new FileReader(probName + ".in"));
		String[] inputs = in.lines().collect(Collectors.joining(System.lineSeparator())).split("\\r?\\n");

		//TODO Code Here.

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(probName + ".out")));
		out.write("Output!");
		out.write("\n");
		System.out.println("Output Saved.");
		out.close();
		in.close();
		System.exit(0);
	}

}