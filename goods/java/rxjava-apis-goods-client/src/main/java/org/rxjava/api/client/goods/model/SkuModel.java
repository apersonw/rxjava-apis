package org.rxjava.api.client.goods.model;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;
import org.rxjava.api.client.goods.core.KeyValue;
import org.rxjava.api.client.goods.entity.Resource;

@Getter
@Setter
public class SkuModel {

	private String id;
	private List<KeyValue<String, String>> params;
	private long price;
	private Resource skuImg;
	private long stockNum;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (id != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "id", id));
		}

		if (params != null && (!params.isEmpty())) {
			for (int i = 0; i < params.size(); i++) {
				params.get(i).encode($parent + "params" + "[" + i + "].", $list);
			}
		}

		$list.add(new SimpleImmutableEntry<>($parent + "price", price));

		if (skuImg != null) {
			skuImg.encode($parent + "skuImg.", $list);
		}

		$list.add(new SimpleImmutableEntry<>($parent + "stockNum", stockNum));
		return $list;
	}
}