package de.itagile.refactoring.gymnastik;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import de.itagile.refactoring.gymnastik.helper.Foo;

public class MoveTest {

	private RefactorMove refactorMove;

	@Before
	public void setUp() {
		refactorMove = new RefactorMove();
	}

	@Test
	public void methodReturnsNameOfClass() throws Exception {
		assertThat(refactorMove.moveMeToFoo(), is("RefactorMove"));
	}

	@Test
	public void methodReturnsHelloIAmFoo() throws Exception {
		assertThat(refactorMove.moveMeAlsoToFoo(new Foo()), is("Hello, I am Foo"));
	}

}
