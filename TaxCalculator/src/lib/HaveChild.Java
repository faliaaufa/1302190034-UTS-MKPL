package lib;

import java.util.List;

public class HaveChild {
    private List<String> childNames;
    private List<String> childIdNumbers;

    public void AddChild(String childName, String childIdNumber) {
        childNames.add(childName);
	    childIdNumbers.add(childIdNumber);
    }

    public List<String> getChildIdNumbers() {
        return childIdNumbers;
    } 
}