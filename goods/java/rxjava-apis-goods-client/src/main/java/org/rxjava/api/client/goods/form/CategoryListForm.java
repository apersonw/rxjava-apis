package org.rxjava.api.client.goods.form;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;

@Getter
@Setter
public class CategoryListForm {

	private String parentId;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (parentId != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "parentId", parentId));
		}
		return $list;
	}
}