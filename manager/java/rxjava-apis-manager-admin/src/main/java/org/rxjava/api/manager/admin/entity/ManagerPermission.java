package org.rxjava.api.manager.admin.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;

@Getter
@Setter
public class ManagerPermission {

	private Date createDate;
	private String id;
	private String managerId;
	private String method;
	private String path;
	private String permissionId;
	private Date updateDate;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (createDate != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "createDate", createDate));
		}

		if (id != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "id", id));
		}

		if (managerId != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "managerId", managerId));
		}

		if (method != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "method", method));
		}

		if (path != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "path", path));
		}

		if (permissionId != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "permissionId", permissionId));
		}

		if (updateDate != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "updateDate", updateDate));
		}
		return $list;
	}
}