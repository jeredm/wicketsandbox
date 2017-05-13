package com.github.jeredm.wicketsandbox;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

import com.github.jeredm.wicketsandbox.nav.HomePage;
import com.github.jeredm.wicketsandbox.nav.lambda.LambdaPage;
import com.github.jeredm.wicketsandbox.nav.optional.OptionalPage;

/**
 * Application object for your web application. If you want to run this application without
 * deploying, run the Start class.
 * 
 * @see com.github.jeredm.wicketsandbox.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return HomePage.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init()
	{
		super.init();

		mountPage("lambda", LambdaPage.class);
		mountPage("optional", OptionalPage.class);
	}
}
