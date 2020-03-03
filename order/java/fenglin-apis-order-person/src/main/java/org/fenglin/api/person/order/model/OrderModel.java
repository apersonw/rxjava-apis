package org.fenglin.api.person.order.model;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;
import org.fenglin.api.person.order.types.ObjectId;
import org.fenglin.api.person.order.entity.OrderGoods;

@Getter
@Setter
public class OrderModel {

	private ObjectId agentId;
	private ObjectId appId;
	private ObjectId appOrderId;
	private Date closeTime;
	private Date createDate;
	private Date deliverTime;
	private ObjectId id;
	private ObjectId merchantId;
	private List<OrderGoods> orderGoodsList;
	private Date payTime;
	private String status;
	private Date updateDate;
	private ObjectId userId;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (agentId != null) {
			agentId.encode($parent + "agentId.", $list);
		}

		if (appId != null) {
			appId.encode($parent + "appId.", $list);
		}

		if (appOrderId != null) {
			appOrderId.encode($parent + "appOrderId.", $list);
		}

		if (closeTime != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "closeTime", closeTime));
		}

		if (createDate != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "createDate", createDate));
		}

		if (deliverTime != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "deliverTime", deliverTime));
		}

		if (id != null) {
			id.encode($parent + "id.", $list);
		}

		if (merchantId != null) {
			merchantId.encode($parent + "merchantId.", $list);
		}

		if (orderGoodsList != null && (!orderGoodsList.isEmpty())) {
			for (int i = 0; i < orderGoodsList.size(); i++) {
				orderGoodsList.get(i).encode($parent + "orderGoodsList" + "[" + i + "].", $list);
			}
		}

		if (payTime != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "payTime", payTime));
		}

		if (status != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "status", status));
		}

		if (updateDate != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "updateDate", updateDate));
		}

		if (userId != null) {
			userId.encode($parent + "userId.", $list);
		}
		return $list;
	}
}