package com.github.jeredm.wicketsandbox.nav.optional;

import org.apache.wicket.ajax.markup.html.AjaxFallbackLink;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.github.jeredm.wicketsandbox.WicketApplication;

/**
 * Tests the Optional page examples
 * 
 * @author Jered Myers
 * @since May 13, 2017
 */
public class OptionalPageTest
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
	public void pageRenders()
	{
		tester.startPage(OptionalPage.class);
		tester.assertRenderedPage(OptionalPage.class);
	}
	
	@Test
	public void counterRenders()
	{
		tester.startPage(OptionalPage.class);
		tester.assertLabel("counterResults", "0");
	}

	@Test
	public void linkRenders()
	{
		tester.startPage(OptionalPage.class);
		tester.assertComponent("increment", AjaxFallbackLink.class);
	}
	
	@Test
	public void counterIncrements()
	{
		tester.startPage(OptionalPage.class);
		tester.assertLabel("counterResults", "0");
		tester.clickLink("increment");
		tester.assertLabel("counterResults", "1");
	}
}
