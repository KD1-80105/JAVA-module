package com.sunbeam;
import java.util.Random;
import java.util.stream.Stream;

public class RandomIntegersSum {

	public static void main(String[] args) {
		Random r=new Random();
		Stream<Integer> smp = Stream.generate(()->r.nextInt(10)).limit(10);
		int rand = smp.reduce(0, (a, e) -> a + e);
		System.out.println(rand);
	}
}

