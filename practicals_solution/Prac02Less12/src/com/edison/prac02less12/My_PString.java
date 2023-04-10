package com.edison.prac02less12;

public class My_PString implements I_PString {

	private String st;

	public My_PString(String st) {
		this.st = st;
	}

	public My_PString() {
	}

	@Override
	public int CountDigits(String st) {
		int d = 0;
		for (int i = 0; i < st.length(); i++)
			if (Character.isDigit(st.charAt(i)))
				d++;
		return d;
	}

	@Override
	public int CountWords(String st) {
		if (st == null || st.isEmpty()) {
			return 0;
		}
		String[] words = st.split("\\s+");
		return words.length;
	}

	@Override
	public String SearchWord(String fw) {
		String s;
		s = " " + st + " ";
		if (s.contains(" " + fw + " "))
			return "Word '" + fw + "'" + " appears in string '" + st + "'";
		else
			return "Word '" + fw + "'" + " does not appears in string '" + st + "'";
	}

}
