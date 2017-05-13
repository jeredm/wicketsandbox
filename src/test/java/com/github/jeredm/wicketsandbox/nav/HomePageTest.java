package com.github.jeredm.wicketsandbox.nav;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.github.jeredm.wicketsandbox.WicketApplication;
import com.github.jeredm.wicketsandbox.nav.lambda.LambdaPage;
import com.github.jeredm.wicketsandbox.nav.optional.OptionalPage;

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
	
	@After
	public void tearDown()
	{
		tester.destroy();
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
	
	@Test
	public void optionalLinkRenders()
	{
		tester.startPage(HomePage.class);
		tester.assertComponent("optionalLink", BookmarkablePageLink.class);
	}

	@Test
	public void optionalLinkRedirects()
	{
		tester.startPage(HomePage.class);
		tester.clickLink("optionalLink");
		tester.assertRenderedPage(OptionalPage.class);
	}
}
