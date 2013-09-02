package de.itagile.refactoring.gymnastik.helper;

public class Foo {
	@Override
	public String toString() {
		return "Hello, I am " + this.getClass().getSimpleName();
	}
}
