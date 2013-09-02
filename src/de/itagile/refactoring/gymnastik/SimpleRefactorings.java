package de.itagile.refactoring.gymnastik;

public class SimpleRefactorings {
	public String rename() {
		String renameBothOccurencesAtTheSameTime = "foo";
		renameBothOccurencesAtTheSameTime = "bar";

		return renameBothOccurencesAtTheSameTime;
	}

	public int inline() {
		int inlineMe = 2;
		return inlineMe;
	}

	public int convertToField() {
		int convertMeToField = 1;
		return convertMeToField;
	}

	public String assignStatementToLocalVariable() {
		assignThisStatementToANewVariable();
		// return the new Variable
		return "Hello";
	}

	public String extractToConstant() {
		return "CONST";
	}

	public String extractMethodAndIntroduceParametern() {
		return "extract this" + "whole concatinated String to a" + "method" + "and then introduce parameters";
		// Extracted method should look like something this:
		// private String extracted(String string, String string2, String string3, String string4) {
		//    return string + string2 + string3 + string4;
		// }
	}

	public String extractStringsThenExtractMethodAndInlineParameters() {
		return "extract all" + "strings to local variables" + "THEN" + "extract the method" + "and inline the extracted variables again";
		// Before inlining the parameters this method should look something like this:
		// String string = "extract all";
		// String string2 = "strings to local variables";
		// String string3 = "THEN";
		// String string4 = "extract the method";
		// String string5 = "and inline the extracted variables again";
		// return extracted2(string, string2, string3, string4, string5);
	}

	// ignore
	protected String assignThisStatementToANewVariable() {
		return "Hello!";
	}
}
