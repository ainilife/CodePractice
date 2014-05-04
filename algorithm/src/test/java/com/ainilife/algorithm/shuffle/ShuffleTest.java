package com.ainilife.algorithm.shuffle;

import org.junit.Before;
import org.junit.Test;

public class ShuffleTest {

	private int[] data;
	private int len;

	@Before
	public void setup() {
		len = 10;
		data = new int[len];

		for (int i = 0; i < len; i++) {
			data[i] = i;
		}

		printDatas(data, len, true);
	}

	@Test
	public void testRandomShuffle() {
		new RandomSuffle().shuffle(data, len);

		printDatas(data, len, false);
	}

	@Test
	public void testSimulateCardShuffle() {
		printDatas(new SimulateCardShuffle().shuffle(data, len), len, false);
	}

	private void printDatas(int[] data, int len, boolean isInitial) {
		if (isInitial) {
			System.out.print("initial data sets [");
		} else {
			System.out.print("after shuffle [");
		}

		for (int i = 0; i < len; i++) {
			System.out.print(data[i] + " ");
		}

		System.out.println("]");
	}
}
