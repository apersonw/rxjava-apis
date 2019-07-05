package org.rxjava.api.example.inner.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;

@Getter
@Setter
public class LoginInfo {

	private boolean forbidden;
	private String identityType;
	private String loginType;
	private String userAuthId;
	private String userId;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		$list.add(new SimpleImmutableEntry<>($parent + "forbidden", forbidden));

		if (identityType != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "identityType", identityType));
		}

		if (loginType != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "loginType", loginType));
		}

		if (userAuthId != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "userAuthId", userAuthId));
		}

		if (userId != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "userId", userId));
		}
		return $list;
	}
}