package org.fenglin.api.person.order.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;
import org.fenglin.api.person.order.types.ObjectId;

@Getter
@Setter
public class OrderGoods extends BaseEntity {

	private int amount;
	private ObjectId goodsId;
	private long markPrice;
	private ObjectId orderId;
	private long price;
	private ObjectId skuId;
	private Image skuImage;
	private String skuTitle;
	private String title;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		$list.add(new SimpleImmutableEntry<>($parent + "amount", amount));

		if (goodsId != null) {
			goodsId.encode($parent + "goodsId.", $list);
		}

		$list.add(new SimpleImmutableEntry<>($parent + "markPrice", markPrice));

		if (orderId != null) {
			orderId.encode($parent + "orderId.", $list);
		}

		$list.add(new SimpleImmutableEntry<>($parent + "price", price));

		if (skuId != null) {
			skuId.encode($parent + "skuId.", $list);
		}

		if (skuImage != null) {
			skuImage.encode($parent + "skuImage.", $list);
		}

		if (skuTitle != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "skuTitle", skuTitle));
		}

		if (title != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "title", title));
		}
		return $list;
	}
}