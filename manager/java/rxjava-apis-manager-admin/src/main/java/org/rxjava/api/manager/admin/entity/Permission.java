package org.rxjava.api.manager.admin.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;

@Getter
@Setter
public class Permission {

	private String id;
	private String method;
	private String name;
	private String path;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (id != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "id", id));
		}

		if (method != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "method", method));
		}

		if (name != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "name", name));
		}

		if (path != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "path", path));
		}
		return $list;
	}
}