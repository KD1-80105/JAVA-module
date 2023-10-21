package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Scanner;

public class BufferWriter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try (FileWriter fw = new FileWriter("file.txt")) {
			try (BufferedWriter bw = new BufferedWriter(fw)) {
				for (int i = 1; i <= 4; i++) {
					System.out.println("Enter the line :");
					String line = sc.nextLine();
					bw.write(line);
					bw.newLine(); // adds new line
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("File saved.");
	}
}
