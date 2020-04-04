package org.fenglin.api.person.javademo.form;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;
import org.bson.types.ObjectId;

@Getter
@Setter
public class JavaDemoForm {
	private ObjectId id;

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {

		if (id != null) {
			$list.add(new SimpleImmutableEntry<>($parent + "id", id));
		}
		return $list;
	}
}