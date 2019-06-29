package org.rxjava.api.example.inner.form;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;

@Getter
@Setter
public class CheckPermissionForm {

	private String method;
	private String path;
	private String userAuthId;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (method != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "method", method));
		}

		if (path != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "path", path));
		}

		if (userAuthId != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "userAuthId", userAuthId));
		}
		return $list;
	}
}