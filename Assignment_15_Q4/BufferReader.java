package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader {
	public static void main(String[] args) {
		String line;

		try (FileReader fr = new FileReader("file.txt")) {
			try (BufferedReader br = new BufferedReader(fr)) {
				while ((line = br.readLine()) != null) {

					System.out.println(line);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
