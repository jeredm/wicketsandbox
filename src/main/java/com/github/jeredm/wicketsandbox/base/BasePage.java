package com.github.jeredm.wicketsandbox.base;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * The default web page for the sandbox.
 * 
 * @author Jered Myers
 * @since May 11, 2017
 */
public class BasePage extends WebPage
{
	private static final long serialVersionUID = 1L;

	/**
	 * No args constructor.
	 */
	public BasePage()
	{
		super();
	}

	/**
	 * Constructor with params
	 * 
	 * @param params
	 *            any PageParameters you want to pass
	 */
	public BasePage(PageParameters params)
	{
		super(params);
	}
}
