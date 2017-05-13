package com.github.jeredm.wicketsandbox.obj;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests the person object
 * 
 * @author Jered Myers
 * @since May 13, 2017
 */
public class PersonTest
{

	@Test
	public void firstName()
	{
		Person person = new Person();
		assertTrue(person.getLastNm() == null);
		person.setFirstNm("First");
		assertThat(person.getFirstNm(), is("First"));
	}
	
	@Test
	public void lastName()
	{
		Person person = new Person();
		assertTrue(person.getLastNm() == null);
		person.setLastNm("Last");
		assertThat(person.getLastNm(), is("Last"));
	}

	@Test
	public void fullName()
	{
		Person person = new Person();
		assertThat(person.getFullNm(), nullValue());
		person.setFirstNm("First");
		assertThat(person.getFullNm(), is("First"));
		person.setLastNm("Last");
		assertThat(person.getFullNm(), is("First Last"));
		
		Person lastPerson = new Person();
		lastPerson.setLastNm("Last");
		assertThat(lastPerson.getFullNm(), is("Last"));
	}
}
