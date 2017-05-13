package com.github.jeredm.wicketsandbox.nav;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

import com.github.jeredm.wicketsandbox.nav.lambda.LambdaPage;
import com.github.jeredm.wicketsandbox.nav.optional.OptionalPage;

/**
 * The main page for the application.
 * 
 * @author Jered Myers
 * @since May 11, 2017
 */
public class HomePage extends WebPage
{
	private static final long serialVersionUID = 1L;
	
	/** {@inheritDoc} */
	@Override
	public void onInitialize()
	{
		super.onInitialize();
		add(new BookmarkablePageLink<Void>("lambdaLink", LambdaPage.class));
		add(new BookmarkablePageLink<Void>("optionalLink", OptionalPage.class));
	}
}
