package org.rxjava.api.manager.inner.model;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;

@Getter
@Setter
public class ManagerModel {

	private String id;
	private String name;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (id != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "id", id));
		}

		if (name != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "name", name));
		}
		return $list;
	}
}