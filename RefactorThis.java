
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class RefactorThis {

	protected final Foo foo = new Foo();

	public void someSimpleRefactorings() {
		String renameBothOccurencesAtTheSameTime = "foo";
		renameBothOccurencesAtTheSameTime = "bar";

		int convertMeToField = 1;

		String extractTheStringToAConstant = "CONST";

		assignThisStatementToANewVariable();

		int inlineMe = 2;
		System.out.println(inlineMe);

		String foobar = "extract this" + "whole concatinated String to a" + "method" + "and then introduce parameters";

		String barfoo = "extract all" + "strings to variables" + "then" + "extract the method" + "and inline the extracted variables again";
	}

	public void moveMeToFoo() {
	}

	public void moveMeAlsoToFoo(Foo foo) {
		foo.toString();
	}

	public void changeMyMethodSignatureReturningStringAndIntroduceIntArgument(String text) {
	}

	protected void userOfChangeMyMethodSinature() {
		changeMyMethodSignatureReturningStringAndIntroduceIntArgument("foo");
	}

	public void extractMeAsInterface() {
	}

	public void extractMeAsSuperClass() {
	}

	public void pullMeUpAndThenPushMeDownAgain() {
	}

	// Extract both attributes as own class named Person
	private String name;
	private String vorname;

	private void userOfPerson() {
		name = "Greyhame";
		vorname = "Gandalf";
		System.out.println(name);
	}

	public void introduceAParameter() {
		String theParameter = "introduceMe";
	}

	protected void userOfIntroduceParameter() {
		introduceAParameter();
	}

	public void convertAnonymousClassToNestedClass() {
		Collections.sort(Arrays.asList(3, 2, 1), new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i1.compareTo(i2);
			}
		});
	}

	public class MoveThisInnerClassToNewFile {
		public void foobar() {

		}
	}

	public class MoveThisInnerClassThatUsesFooToNewFile {
		public void foobar() {
			someSimpleRefactorings();
		}
	}

	protected String assignThisStatementToANewVariable() {
		return null;
	}

}
