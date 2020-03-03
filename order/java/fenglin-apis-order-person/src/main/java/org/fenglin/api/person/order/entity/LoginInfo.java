package org.fenglin.api.person.order.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;

@Getter
@Setter
public class LoginInfo {

	private Date expireDate;
	private String partnerId;
	private String token;
	private String userId;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (expireDate != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "expireDate", expireDate));
		}

		if (partnerId != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "partnerId", partnerId));
		}

		if (token != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "token", token));
		}

		if (userId != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "userId", userId));
		}
		return $list;
	}
}