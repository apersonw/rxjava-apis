package org.rxjava.api.person.example;

import reactor.core.publisher.Mono;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.Future;

import org.rxjava.apikit.client.*;

import org.rxjava.api.person.example.form.TestForm;

public class TestApi {
	private ClientAdapter clientAdapter;

	public TestApi() {
	}

	public TestApi(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public Mono<String> checkTest() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("person/checkTest", _uriVariables);

		return clientAdapter.request("GET", _url, null, _0Type);
	}

	public Mono<Integer> testPath(String id, TestForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		_uriVariables.put("id", id);
		String _url = ApiUtils.expandUriComponent("person/testPath/{id}", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("GET", _url, _form, _1Type);
	}

	public void setclientAdapter(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public ClientAdapter getclientAdapter() {
		return clientAdapter;
	}

	private static final ApiType _0Type = ApiUtils.type(String.class);
	private static final ApiType _1Type = ApiUtils.type(Integer.class);
}