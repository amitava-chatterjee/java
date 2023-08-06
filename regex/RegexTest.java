/*
A regular expression is a special sequence of characters that helps you match or find other string or sets of string using a specialized syntax held in a pattern.

.				Any single character or digit
\D				Any digit in range a to z or A to Z or any special character
\d				Any digit in range 0 to 9
[abc]			Any single character of a, b or c
[WbY]			Any single character of W, b or Y
(a|b|AA)		Match either a or b or AA
[0-6]			Any digit in range 0 to 6
[a-gA-U0-3] 	Any single character in range a to g or A to U or 0 to 3
a{3}			Exactly 3 of a: aaa
a{3,}			3 or infinity of a
a{2,4}			Between 2 or 4 of a: aa or aaa or aaaa
^				The beginning of a line
$				The end of a line
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String args[]) {
		Pattern pattern = Pattern.compile(".m");
		Matcher matcher = pattern.matcher("Am");
		Boolean ans = matcher.matches();
		System.out.println("First: " + ans);
		
		// shortcut
		// System.out.println(Pattern.matches(".m", "Am"));
		// System.out.println(Pattern.matches("[amn]", "acd"));
		// System.out.println(Pattern.matches("[^amn]", "n"));
		// System.out.println(Pattern.matches("[a-zA-S]", "G"));
		System.out.println(Pattern.matches("(a|A|Aa)gent", "agent"));
	}
}
