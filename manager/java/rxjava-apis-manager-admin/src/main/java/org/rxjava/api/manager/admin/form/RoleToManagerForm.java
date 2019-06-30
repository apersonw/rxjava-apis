package org.rxjava.api.manager.admin.form;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;

@Getter
@Setter
public class RoleToManagerForm {

	private String managerId;
	private List<String> roleIds;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (managerId != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "managerId", managerId));
		}

		if (roleIds != null && (!roleIds.isEmpty())) {
			for (int i = 0; i < roleIds.size(); i++) {
				$list.add(new SimpleImmutableEntry<>($parent + "roleIds", roleIds.get(i)));
			}
		}
		return $list;
	}
}