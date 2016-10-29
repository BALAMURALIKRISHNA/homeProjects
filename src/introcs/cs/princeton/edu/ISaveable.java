package introcs.cs.princeton.edu;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
	
	List<String> write();
	void read (List<String> saveValues);
	

}
