package org.fenglin.api.person.order;

import reactor.core.publisher.Mono;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.Future;

import org.rxjava.apikit.client.*;

import org.fenglin.api.person.order.entity.LoginInfo;
import org.fenglin.api.person.order.entity.Order;
import org.fenglin.api.person.order.form.OrderListForm;
import org.fenglin.api.person.order.domain.Page;

public class DemoApi {
	private ClientAdapter clientAdapter;

	public DemoApi() {
	}

	public DemoApi(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public Mono<java.util.ArrayList<Order>> test() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("demo/test", _uriVariables);

		return clientAdapter.request("GET", _url, null, _0Type);
	}

	public Mono<Page<Order>> testException() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("demo/testException", _uriVariables);

		return clientAdapter.request("GET", _url, null, _1Type);
	}

	public Mono<LoginInfo> testFormError(OrderListForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("demo/testFormError", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("GET", _url, _form, _2Type);
	}

	public Mono<LoginInfo> testMockLogin() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("demo/testMockLogin", _uriVariables);

		return clientAdapter.request("GET", _url, null, _3Type);
	}

	public Mono<Page<Order>> testMonoException() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("demo/testMonoException", _uriVariables);

		return clientAdapter.request("GET", _url, null, _4Type);
	}

	public Mono<java.util.ArrayList<Order>> testOne() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("demo/testOne", _uriVariables);

		return clientAdapter.request("GET", _url, null, _5Type);
	}

	public Mono<Page<Order>> testPage() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("demo/testPage", _uriVariables);

		return clientAdapter.request("GET", _url, null, _6Type);
	}

	public void setclientAdapter(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public ClientAdapter getclientAdapter() {
		return clientAdapter;
	}

	private static final ApiType _0Type = ApiUtils.type(java.util.ArrayList.class, Order.class);
	private static final ApiType _1Type = ApiUtils.type(Page.class, ApiUtils.type(Order.class));
	private static final ApiType _2Type = ApiUtils.type(LoginInfo.class);
	private static final ApiType _3Type = ApiUtils.type(LoginInfo.class);
	private static final ApiType _4Type = ApiUtils.type(Page.class, ApiUtils.type(Order.class));
	private static final ApiType _5Type = ApiUtils.type(java.util.ArrayList.class, Order.class);
	private static final ApiType _6Type = ApiUtils.type(Page.class, ApiUtils.type(Order.class));
}