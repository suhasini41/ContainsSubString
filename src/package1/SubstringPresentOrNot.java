package package1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubstringPresentOrNot {

	private boolean findSubstring(String s, String sub)
	{
		Pattern p = Pattern.compile("(.*)"+sub+"(.*)");
		Matcher m = p.matcher(s);
		//System.out.println(m.find());
		
		//count of substrings
		String[] sarr = s.split(sub);
		System.out.println(sarr.length-1);
		boolean flag = m.find();
		return flag;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(findSubstring("yxxyxxy", "xxy"), true);
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(findSubstring("baac", "a"), true);
	}
	
	@Test
	public void testCase3()
	{
		Assert.assertEquals(findSubstring("cgfgfc", "cfg"), false);
	}

}
