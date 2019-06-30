package org.rxjava.api.manager.admin.form;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;

@Getter
@Setter
public class PermissionToRoleForm {

	private List<String> permissionIds;
	private String roleId;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (permissionIds != null && (!permissionIds.isEmpty())) {
			for (int i = 0; i < permissionIds.size(); i++) {
				$list.add(new SimpleImmutableEntry<>($parent + "permissionIds", permissionIds.get(i)));
			}
		}

		if (roleId != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "roleId", roleId));
		}
		return $list;
	}
}