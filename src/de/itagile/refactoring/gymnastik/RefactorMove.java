package de.itagile.refactoring.gymnastik;

import de.itagile.refactoring.gymnastik.helper.Foo;

public class RefactorMove {
	public String moveMeToFoo() {
		return this.getClass().getSimpleName();
	}

	public String moveMeAlsoToFoo(Foo foo) {
		return foo.toString();
	}
}
