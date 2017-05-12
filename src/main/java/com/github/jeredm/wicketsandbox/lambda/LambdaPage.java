package com.github.jeredm.wicketsandbox.lambda;

import org.apache.wicket.markup.html.basic.Label;

import com.github.jeredm.wicketsandbox.base.BasePage;
import com.github.jeredm.wicketsandbox.obj.Person;

/**
 * Holds lambda examples
 * 
 * @author Jered Myers
 * @since May 11, 2017
 */
public class LambdaPage extends BasePage
{
	private static final long serialVersionUID = 1L;

	/** {@inheritDoc} */
	@Override
	public void onInitialize()
	{
		super.onInitialize();
		
		Person person = new Person();
		person.setFirstNm("Joe");
		person.setLastNm("Smith");
		
		add(new Label("firstNmArrow", () -> person.getFirstNm()));
		add(new Label("lastNmMethodRef", person::getLastNm));
	}
}
