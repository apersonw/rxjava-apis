package org.rxjava.api.manager.admin.form;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;

@Getter
@Setter
public class ManagerLoginForm {

	private String password;
	private String username;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (password != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "password", password));
		}

		if (username != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "username", username));
		}
		return $list;
	}
}