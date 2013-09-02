package de.itagile.refactoring.gymnastik;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RefactorMoveTypeToNewFileTest {
	@Test
	public void methodReturnsFooBar() throws Exception {
		assertThat(new RefactorMoveTypeToNewFile().new MoveThisInnerClassToNewFile().foobar(), is("foobar"));
	}
}
