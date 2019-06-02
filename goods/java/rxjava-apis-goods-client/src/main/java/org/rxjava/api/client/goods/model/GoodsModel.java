package org.rxjava.api.client.goods.model;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;
import org.rxjava.api.client.goods.entity.Resource;

@Getter
@Setter
public class GoodsModel {

	private int coverPrice;
	private String id;
	private String name;
	private List<SkuModel> skus;
	private Resource thumb;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		$list.add(new SimpleImmutableEntry<>($parent + "coverPrice", coverPrice));

		if (id != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "id", id));
		}

		if (name != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "name", name));
		}

		if (skus != null && (!skus.isEmpty())) {
			for (int i = 0; i < skus.size(); i++) {
				skus.get(i).encode($parent + "skus" + "[" + i + "].", $list);
			}
		}

		if (thumb != null) {
			thumb.encode($parent + "thumb.", $list);
		}
		return $list;
	}
}