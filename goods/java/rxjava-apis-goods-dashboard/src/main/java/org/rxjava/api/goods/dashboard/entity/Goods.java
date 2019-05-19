package org.rxjava.api.goods.dashboard.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;

@Getter
@Setter
public class Goods {

	private String brandId;
	private int coverPrice;
	private Date createDate;
	private String excess;
	private String id;
	private String name;
	private int priority;
	private String shopId;
	private String status;
	private Resource thumb;
	private String type;
	private Date updateDate;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (brandId != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "brandId", brandId));
		}

		$list.add(new SimpleImmutableEntry<>($parent + "coverPrice", coverPrice));

		if (createDate != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "createDate", createDate));
		}

		if (excess != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "excess", excess));
		}

		if (id != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "id", id));
		}

		if (name != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "name", name));
		}

		$list.add(new SimpleImmutableEntry<>($parent + "priority", priority));

		if (shopId != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "shopId", shopId));
		}

		if (status != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "status", status));
		}

		if (thumb != null) {
			thumb.encode($parent + "thumb.", $list);
		}

		if (type != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "type", type));
		}

		if (updateDate != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "updateDate", updateDate));
		}
		return $list;
	}
}