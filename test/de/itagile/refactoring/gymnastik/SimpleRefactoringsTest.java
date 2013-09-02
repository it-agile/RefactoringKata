package de.itagile.refactoring.gymnastik;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class SimpleRefactoringsTest {

	private SimpleRefactorings simpleRefactorings;

	@Before
	public void setUp() {
		simpleRefactorings = new SimpleRefactorings();
	}

	@Test
	public void afterRenameingMethodStillReturnsBar() {
		assertThat(simpleRefactorings.rename(), is("bar"));
	}

	@Test
	public void afterInliningMethodStillReturns2() {
		assertThat(simpleRefactorings.inline(), is(2));
	}

	@Test
	public void afterConvertingToFieldMethodStillReturns1() {
		assertThat(simpleRefactorings.convertToField(), is(1));
	}

	@Test
	public void afterAssigningStatementToNewLocalVariableMethodStillReturnsHello() {
		assertThat(simpleRefactorings.assignStatementToLocalVariable(), is("Hello"));
	}

	@Test
	public void afterExtractingToConstantMethodStillReturnsCONST() {
		assertThat(simpleRefactorings.extractToConstant(), is("CONST"));
	}

	@Test
	public void afterExtractingMethodAndIntroducingParatersTheMethodStillReturnsTheString() {
		assertThat(simpleRefactorings.extractMethodAndIntroduceParametern(), is("extract this" + "whole concatinated String to a" + "method"
				+ "and then introduce parameters"));
	}

	@Test
	public void afterExtractingStringThenExtractingTheMethodAndInlineTheParamtersTheMethodStillReturnsTheString() {
		assertThat(simpleRefactorings.extractStringsThenExtractMethodAndInlineParameters(), is("extract all" + "strings to local variables" + "THEN"
				+ "extract the method" + "and inline the extracted variables again"));
	}

}
