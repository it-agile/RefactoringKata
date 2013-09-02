package de.itagile.refactoring.gymnastik;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RefactorPullUpPushDownTest {

	@Test
	public void methodReturnsBar() {
		assertThat(new RefactorPullUpPushDown().pullMeUpAndThenPushMeDownAgain(), is("bar"));
	}
}
