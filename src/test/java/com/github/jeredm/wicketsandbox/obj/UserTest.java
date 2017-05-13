package com.github.jeredm.wicketsandbox.obj;


import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Tests the user object.
 * 
 * @author Jered Myers
 * @since May 13, 2017
 */
public class UserTest
{
	@Test
	public void userId()
	{
		User user = new User();
		assertThat(user.getUserId(), nullValue());
		user.setUserId("user");
		assertThat(user.getUserId(), is("user"));
	}

	@Test
	public void person()
	{
		User user = new User();
		assertThat(user.getPerson(), nullValue());
		Person person = new Person();
		person.setFirstNm("First");
		person.setLastNm("Last");
		assertThat(person.getFullNm(), is("First Last"));
		user.setPerson(person);
		
		Person checkPerson = user.getPerson();
		assertThat(checkPerson, notNullValue());
		assertThat(checkPerson.getFullNm(), is("First Last"));
		
		checkPerson.setFirstNm("MutateFirst");
		assertThat(user.getPerson().getFirstNm(), is("First"));
		
		user.setPerson(checkPerson);
		assertThat(user.getPerson().getFirstNm(), is("MutateFirst"));
	}
}
