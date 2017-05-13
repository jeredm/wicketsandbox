package com.github.jeredm.wicketsandbox.obj;

/**
 * An object that holds a user.
 * 
 * @author Jered Myers
 * @since May 11, 2017
 */
public class User
{
	private String userId;
	private Person person;

	/**
	 * @return the userId
	 */
	public String getUserId()
	{
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	/**
	 * @return the person
	 */
	public Person getPerson()
	{
		if (person == null)
			return null;
		
		Person defCopy = new Person();
		defCopy.setFirstNm(person.getFirstNm());
		defCopy.setLastNm(person.getLastNm());
		return defCopy;
	}

	/**
	 * @param person
	 *            the person to set
	 */
	public void setPerson(Person person)
	{
		Person defCopy = new Person();
		defCopy.setFirstNm(person.getFirstNm());
		defCopy.setLastNm(person.getLastNm());
		this.person = defCopy;
	}
}
