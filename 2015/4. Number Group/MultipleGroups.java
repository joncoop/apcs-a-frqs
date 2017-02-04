import java.util.ArrayList;
import java.util.List;


public class MultipleGroups implements NumberGroup {

	private List<NumberGroup> groupList;
	
	public MultipleGroups() {
		groupList = new ArrayList<NumberGroup>();
	}
	
	public void addGroup(NumberGroup group) {
		groupList.add(group);
	}
	
	public boolean contains(int num) {
		
		for (NumberGroup g: groupList) {
			if (g.contains(num)) {
				return true;
			}
		}
		
		return false;
	}
}
