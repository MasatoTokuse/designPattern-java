package flyweight;

import java.util.HashMap;
import java.util.Map;

public class StampFactory {
	// インスタンスの再利用
	Map<Character, Stamp> pool;

	StampFactory() {
		this.pool = new HashMap<Character, Stamp>();
	}

	Stamp get(char type) {
		Stamp stamp = this.pool.get(type);
		if (stamp == null) {
			stamp = new Stamp(type);
			this.pool.put(type, stamp);
		}
		return stamp;
	}
}
