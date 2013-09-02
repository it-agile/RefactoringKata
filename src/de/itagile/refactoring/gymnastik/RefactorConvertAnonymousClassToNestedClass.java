package de.itagile.refactoring.gymnastik;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RefactorConvertAnonymousClassToNestedClass {
	public List<Integer> convertAnonymousComparatorToNestedClass() {
		List<Integer> list = Arrays.asList(1, 2, 3);
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2.compareTo(i1);
			}
		});
		return list;
	}
}
