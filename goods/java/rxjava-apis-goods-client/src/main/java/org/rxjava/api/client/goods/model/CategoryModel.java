package org.rxjava.api.client.goods.model;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;
import org.rxjava.api.client.goods.entity.Resource;

@Getter
@Setter
public class CategoryModel {

	private String id;
	private String name;
	private String parentId;
	private Resource thumb;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (id != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "id", id));
		}

		if (name != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "name", name));
		}

		if (parentId != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "parentId", parentId));
		}

		if (thumb != null) {
			thumb.encode($parent + "thumb.", $list);
		}
		return $list;
	}
}