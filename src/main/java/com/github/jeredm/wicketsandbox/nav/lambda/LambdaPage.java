package com.github.jeredm.wicketsandbox.nav.lambda;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LambdaModel;
import org.apache.wicket.model.PropertyModel;

import com.github.jeredm.wicketsandbox.base.BasePage;
import com.github.jeredm.wicketsandbox.obj.Person;
import com.github.jeredm.wicketsandbox.obj.User;

/**
 * Holds lambda examples
 * 
 * @author Jered Myers
 * @since May 11, 2017
 */
public class LambdaPage extends BasePage
{
	private static final long serialVersionUID = 1L;
	private Person person;
	private User user;

	/** {@inheritDoc} */
	@Override
	public void onInitialize()
	{
		super.onInitialize();

		person = new Person();
		person.setFirstNm("Joe");
		person.setLastNm("Smith");
		IModel<Person> personModel = new PropertyModel<>(this, "person");

		user = new User();
		user.setUserId("JSmith");
		user.setPerson(person);
		IModel<User> userModel = new PropertyModel<>(this, "user");

		add(new Label("firstNmArrow", () -> person.getFirstNm()));
		add(new Label("lastNmMethodRef", person::getLastNm));
		add(new Label("fullNmLambda", LambdaModel.of(personModel, Person::getFullNm)));
		add(new Label("lastNmMap",
			LambdaModel.of(userModel, User::getPerson).map(Person::getFirstNm)));
	}
}
