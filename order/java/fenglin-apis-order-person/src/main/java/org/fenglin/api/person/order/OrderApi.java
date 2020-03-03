package org.fenglin.api.person.order;

import reactor.core.publisher.Mono;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.Future;

import org.rxjava.apikit.client.*;

import org.fenglin.api.person.order.form.OrderListForm;
import org.fenglin.api.person.order.model.OrderModel;

public class OrderApi {
	private ClientAdapter clientAdapter;

	public OrderApi() {
	}

	public OrderApi(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public Mono<OrderModel> getOrder() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("order", _uriVariables);

		return clientAdapter.request("GET", _url, null, _0Type);
	}

	public Mono<java.util.ArrayList<OrderModel>> getOrderList(OrderListForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("orderList", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("GET", _url, _form, _1Type);
	}

	public void setclientAdapter(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public ClientAdapter getclientAdapter() {
		return clientAdapter;
	}

	private static final ApiType _0Type = ApiUtils.type(OrderModel.class);
	private static final ApiType _1Type = ApiUtils.type(java.util.ArrayList.class, OrderModel.class);
}