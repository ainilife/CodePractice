package com.ainilife.algorithm.shuffle;

import java.util.Random;

public class SimulateCardShuffle {

	private final int ROUNDS = 5;

	public int[] shuffle(int data[], int len) {
		if (len <= 1) {
			return null;
		}

		for (int i = 0; i < ROUNDS; i++) {
			int mid = (len - 1) / 2;
			int[] tmpData = new int[len];

			for (int j = 0; j < len; j++) {
				if (j <= mid) {
					tmpData[2 * j] = data[j];
				} else {
					tmpData[2 * j - len + 1] = data[j];
				}
			}

			data = tmpData;
			int splitPos = new Random().nextInt(len);
			tmpData = new int[len];

			for (int j = splitPos; j < len; j++) {
				tmpData[j - splitPos] = data[j];
			}

			for (int j = 0; j < splitPos; j++) {
				tmpData[len - splitPos + j] = data[j];
			}

			data = tmpData;
		}
		
		return data;
	}

}
