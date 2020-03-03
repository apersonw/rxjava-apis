package org.fenglin.api.person.order.types;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;

@Getter
@Setter
public class ObjectId {

	private int counter;
	private Date date;
	private int machineIdentifier;
	private short processIdentifier;
	private long time;
	private int timeSecond;
	private int timestamp;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		$list.add(new SimpleImmutableEntry<>($parent + "counter", counter));

		if (date != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "date", date));
		}

		$list.add(new SimpleImmutableEntry<>($parent + "machineIdentifier", machineIdentifier));

		$list.add(new SimpleImmutableEntry<>($parent + "processIdentifier", processIdentifier));

		$list.add(new SimpleImmutableEntry<>($parent + "time", time));

		$list.add(new SimpleImmutableEntry<>($parent + "timeSecond", timeSecond));

		$list.add(new SimpleImmutableEntry<>($parent + "timestamp", timestamp));
		return $list;
	}
}