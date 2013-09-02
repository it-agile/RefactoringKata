package de.itagile.refactoring.gymnastik;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class RefactorExtractTest {
	private RefactorExtract refactorExtract;

	@Before
	public void setUp() {
		refactorExtract = new RefactorExtract();
	}

	@Test
	public void methodReturns1() throws Exception {
		assertThat(refactorExtract.extractMeAsInterface(), is(1));
	}

	@Test
	public void methodReturns2() throws Exception {
		assertThat(refactorExtract.extractMeAsSuperClass(), is(2));
	}
}
