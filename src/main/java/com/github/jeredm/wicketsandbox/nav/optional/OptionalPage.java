package com.github.jeredm.wicketsandbox.nav.optional;

import java.util.Optional;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxFallbackLink;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

import com.github.jeredm.wicketsandbox.base.BasePage;

/**
 * Demonstrates Optional with AjaxRequestTarget.
 * 
 * @author Jered Myers
 * @since May 13, 2017
 */
public class OptionalPage extends BasePage
{
	private static final long serialVersionUID = 1L;
	private int counter = 0;

	/** {@inheritDoc} */
	@Override
	public void onInitialize()
	{
		super.onInitialize();
		
		Label counterResults = new Label("counterResults", new Model<String>() {

			private static final long serialVersionUID = 1L;
			
			/** {@inheritDoc} */
			@Override
			public String getObject() {
				return String.valueOf(counter);
			}
		});
		add(counterResults);
		
		add(new AjaxFallbackLink<Void>("increment") {

			private static final long serialVersionUID = 1L;

			@Override
			public void onClick(Optional<AjaxRequestTarget> target)
			{
				counter ++;
				target.ifPresent(t -> t.add(OptionalPage.this));
			}
			
		});
	}
}
