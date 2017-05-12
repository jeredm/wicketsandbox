package com.github.jeredm.wicketsandbox.lambda;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

import com.github.jeredm.wicketsandbox.WicketApplication;

/**
 * Tests the Lambda Page
 * 
 * @author Jered Myers
 * @since May 11, 2017
 */
public class LambdaPageTest
{
	private WicketTester tester;

	@Before
	public void setUp()
	{
		tester = new WicketTester(new WicketApplication());
	}

	@Test
	public void pageRenders()
	{
		tester.startPage(LambdaPage.class);
		tester.assertRenderedPage(LambdaPage.class);
	}

	@Test
	public void lambdaFirstNameRenders()
	{
		tester.startPage(LambdaPage.class);
		tester.assertLabel("firstNmArrow", "Joe");
	}

	@Test
	public void methodRefLastName()
	{
		tester.startPage(LambdaPage.class);
		tester.assertLabel("lastNmMethodRef", "Smith");
	}

	@Test
	public void lambdaModelFullNameRenders()
	{
		tester.startPage(LambdaPage.class);
		tester.assertLabel("fullNmLambda", "Joe Smith");
	}

	@Test
	public void lambdaNestedFirstNameRenders()
	{
		tester.startPage(LambdaPage.class);
		tester.assertLabel("lastNmMap", "Joe");
	}
}
