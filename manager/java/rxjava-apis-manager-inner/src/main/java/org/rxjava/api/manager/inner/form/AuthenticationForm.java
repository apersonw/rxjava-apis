package org.rxjava.api.manager.inner.form;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;

@Getter
@Setter
public class AuthenticationForm {

	private String method;
	private String path;
	private String token;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (method != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "method", method));
		}

		if (path != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "path", path));
		}

		if (token != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "token", token));
		}
		return $list;
	}
}