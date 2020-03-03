package org.fenglin.api.person.order.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;
import org.fenglin.api.person.order.types.ObjectId;

@Getter
@Setter
public class BaseEntity {

	private Date createDate;
	private ObjectId id;
	private Date updateDate;
	private long version;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (createDate != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "createDate", createDate));
		}

		if (id != null) {
			id.encode($parent + "id.", $list);
		}

		if (updateDate != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "updateDate", updateDate));
		}

		$list.add(new SimpleImmutableEntry<>($parent + "version", version));
		return $list;
	}
}