package org.rxjava.api.goods.client.form;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;

@Getter
@Setter
public class GoodsListForm {

	private String brandId;
	private String categoryId;
	private List<String> goodsIds;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (brandId != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "brandId", brandId));
		}

		if (categoryId != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "categoryId", categoryId));
		}

		if (goodsIds != null && (!goodsIds.isEmpty())) {
			for (int i = 0; i < goodsIds.size(); i++) {
				$list.add(new SimpleImmutableEntry<>($parent + "goodsIds", goodsIds.get(i)));
			}
		}
		return $list;
	}
}