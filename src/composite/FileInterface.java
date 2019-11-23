package composite;

import java.util.List;

public interface FileInterface {
	void defaultMethod(int depth);

	List<FileInterface> getChildren();

	boolean addComponent(FileInterface c);

	boolean removeComponent(FileInterface c);
}