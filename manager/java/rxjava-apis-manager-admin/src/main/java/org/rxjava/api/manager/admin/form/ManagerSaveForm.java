package org.rxjava.api.manager.admin.form;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;
import org.rxjava.api.manager.admin.entity.Resource;

@Getter
@Setter
public class ManagerSaveForm {

	private Resource avatar;
	private String nickname;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (avatar != null) {
			avatar.encode($parent + "avatar.", $list);
		}

		if (nickname != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "nickname", nickname));
		}
		return $list;
	}
}