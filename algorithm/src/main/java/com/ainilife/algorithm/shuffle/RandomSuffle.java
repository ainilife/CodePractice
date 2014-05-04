package com.ainilife.algorithm.shuffle;

import java.util.Random;

public class RandomSuffle {
	public void shuffle(int[] data, int len) {
		if (len <= 0) {
			return;
		}
		
		for(int i = 0 ; i < len ; i++){
			int tmp = data[i];
			int swapIndex = random(len - i) + i;
			
			data[i] = data[swapIndex];
			data[swapIndex] = tmp; 
		}
	}
	
	private int random(int n){
		return new Random().nextInt(n);
	}
}
