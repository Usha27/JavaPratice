import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class removeAllDup {

	public removeAllDup(String str) {
		// Convert the original string to lower case
		str = str.toLowerCase();
		
		// Create a ordered Char hash set
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		List<Character>ls = new ArrayList<Character>();
		
		// loop original string
		for(int i=0;i<str.length();i++) {
			// pick up all the chars which can't be added to hash char set
			// into another char array list for duplicates
			if(!	lhs.add(str.charAt(i)))
				ls.add(str.charAt(i));
			
			// iterate hash char set and compare with char array list of duplicates
			for (Iterator<Character> it = lhs.iterator(); it.hasNext();) {
				// if a char is contained in duplicate char array then 
				// delete from hash char set
				if(ls.contains(it.next())){
					it.remove();
				}
			}
		}

		// Print hash char set
		for(Character ch : lhs)
			System.out.print(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strWithDup = "Usha a Shingade";
		removeAllDup oRemoveAllDup = new removeAllDup(strWithDup);
	}

}
