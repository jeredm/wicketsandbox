package com.github.jeredm.wicketsandbox.obj;

/**
 * An object that represents a person.
 * 
 * @author Jered Myers
 * @since May 11, 2017
 */
public class Person
{
	private String firstNm;
	private String lastNm;

	/**
	 * @return the firstNm
	 */
	public String getFirstNm()
	{
		return firstNm;
	}

	/**
	 * @param firstNm
	 *            the firstNm to set
	 */
	public void setFirstNm(String firstNm)
	{
		this.firstNm = firstNm;
	}

	/**
	 * @return the lastNm
	 */
	public String getLastNm()
	{
		return lastNm;
	}

	/**
	 * @param lastNm
	 *            the lastNm to set
	 */
	public void setLastNm(String lastNm)
	{
		this.lastNm = lastNm;
	}

	/**
	 * @return the full name
	 */
	public String getFullNm()
	{
		StringBuilder sb = new StringBuilder(10);
		sb.append(this.firstNm);
		sb.append(" ");
		sb.append(this.lastNm);
		return sb.toString();
	}
}
