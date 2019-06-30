package org.rxjava.api.manager.admin.form;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;

@Getter
@Setter
public class RoleSaveForm {

	private String name;
	private String parentId;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (name != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "name", name));
		}

		if (parentId != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "parentId", parentId));
		}
		return $list;
	}
}