package com.github.jeredm.wicketsandbox;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

import com.github.jeredm.wicketsandbox.lambda.LambdaPage;

/**
 * Tests for the home page
 * 
 * @author Jered Myers
 * @since May 11, 2017
 */
public class HomePageTest
{
	private WicketTester tester;

	@Before
	public void setUp()
	{
		tester = new WicketTester(new WicketApplication());
	}

	@Test
	public void homepageRenders()
	{
		tester.startPage(HomePage.class);
		tester.assertRenderedPage(HomePage.class);
	}

	@Test
	public void lambdaLinkRenders()
	{
		tester.startPage(HomePage.class);
		tester.assertComponent("lambdaLink", BookmarkablePageLink.class);
	}

	@Test
	public void lambdaLinkRedirects()
	{
		tester.startPage(HomePage.class);
		tester.clickLink("lambdaLink");
		tester.assertRenderedPage(LambdaPage.class);
	}
}
