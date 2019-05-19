package org.rxjava.api.goods.dashboard.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;

@Getter
@Setter
public class Category {

	private Date createDate;
	private String id;
	private String name;
	private String parentId;
	private String status;
	private Resource thumb;
	private Date updateDate;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (createDate != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "createDate", createDate));
		}

		if (id != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "id", id));
		}

		if (name != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "name", name));
		}

		if (parentId != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "parentId", parentId));
		}

		if (status != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "status", status));
		}

		if (thumb != null) {
			thumb.encode($parent + "thumb.", $list);
		}

		if (updateDate != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "updateDate", updateDate));
		}
		return $list;
	}
}