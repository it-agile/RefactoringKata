package de.itagile.refactoring.gymnastik;

public class RefactorChangeMethodSignature {

	private Object changeMyMethodSignatureReturningStringAndIntroduceIntArgument(String text) {
		return text;
	}

	public Object userOfChangeMyMethodSinature() {
		// do not change but look at the params
		return changeMyMethodSignatureReturningStringAndIntroduceIntArgument("foo");
	}
}
