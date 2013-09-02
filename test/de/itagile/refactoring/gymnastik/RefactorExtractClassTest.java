package de.itagile.refactoring.gymnastik;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RefactorExtractClassTest {

	@Test
	public void methodReturnsGandalfsName() {
		assertThat(new RefactorExtractClass().getNameFormatted(), is("Greyhame, Gandalf"));
	}
}
