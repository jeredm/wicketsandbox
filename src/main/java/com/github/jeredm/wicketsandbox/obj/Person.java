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
		if (firstNm != null)
			sb.append(firstNm);
		if (sb.length() != 0 && lastNm != null)
			sb.append(" ");
		if (lastNm != null)
			sb.append(lastNm);
		if (sb.length() == 0)
			return null;
		return sb.toString();
	}
}
