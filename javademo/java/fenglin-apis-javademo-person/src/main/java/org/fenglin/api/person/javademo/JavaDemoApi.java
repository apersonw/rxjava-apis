package org.fenglin.api.person.javademo;

import reactor.core.publisher.Mono;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.Future;

import org.rxjava.apikit.client.*;

import org.fenglin.api.person.javademo.form.JavaDemoForm;

public class JavaDemoApi {
	private ClientAdapter clientAdapter;

	public JavaDemoApi() {
	}

	public JavaDemoApi(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public Mono<Integer> testInteger(JavaDemoForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("integer", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("GET", _url, _form, _0Type);
	}

	public Mono<String> testString() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("string", _uriVariables);

		return clientAdapter.request("GET", _url, null, _1Type);
	}

	public void setClientAdapter(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public ClientAdapter getClientAdapter() {
		return clientAdapter;
	}

	private static final ApiType _0Type = ApiUtils.type(Integer.class);
	private static final ApiType _1Type = ApiUtils.type(String.class);
}