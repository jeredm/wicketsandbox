package com.github.jeredm.wicketsandbox;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

import com.github.jeredm.wicketsandbox.lambda.LambdaPage;

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
	}
}
