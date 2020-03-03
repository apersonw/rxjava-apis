package org.fenglin.api.person.order.status;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleImmutableEntry;

@Getter
@Setter
public class OrderStatus extends Enum<OrderStatus> {

	public List<Entry<String, Object>> encode(String $parent, List<Entry<String, Object>> $list) {
		return $list;
	}
}