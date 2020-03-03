package org.fenglin.api.person.order.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;
import org.fenglin.api.person.order.types.ObjectId;

@Getter
@Setter
public class Order extends BaseEntity {

	private ObjectId appId;
	private ObjectId appOrderId;
	private Date closeTime;
	private Date deliverTime;
	private ObjectId merchantId;
	private Date payTime;
	private ObjectId shopId;
	private String status;
	private ObjectId userId;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (appId != null) {
			appId.encode($parent + "appId.", $list);
		}

		if (appOrderId != null) {
			appOrderId.encode($parent + "appOrderId.", $list);
		}

		if (closeTime != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "closeTime", closeTime));
		}

		if (deliverTime != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "deliverTime", deliverTime));
		}

		if (merchantId != null) {
			merchantId.encode($parent + "merchantId.", $list);
		}

		if (payTime != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "payTime", payTime));
		}

		if (shopId != null) {
			shopId.encode($parent + "shopId.", $list);
		}

		if (status != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "status", status));
		}

		if (userId != null) {
			userId.encode($parent + "userId.", $list);
		}
		return $list;
	}
}