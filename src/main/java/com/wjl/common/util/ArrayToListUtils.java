package com.wjl.common.util;

import java.util.Arrays;
import java.util.List;

public class ArrayToListUtils {
	public static List<Long> arrayToList(String[] ids){
		Long[] longs = new Long[ids.length];
		for (int i = 0; i < longs.length; i++) {
			longs[i] = Long.valueOf(ids[i]);
		}
		List<Long> list = Arrays.asList(longs);
		return list;
	}
}
