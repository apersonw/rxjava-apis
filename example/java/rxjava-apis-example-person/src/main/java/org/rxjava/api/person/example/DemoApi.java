package org.rxjava.api.person.example;

import reactor.core.publisher.Mono;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.Future;

import org.rxjava.apikit.client.*;

public class DemoApi {
	private ClientAdapter clientAdapter;

	public DemoApi() {
	}

	public DemoApi(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public Mono<String> hello() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("demo/hello", _uriVariables);

		return clientAdapter.request("GET", _url, null, _0Type);
	}

	public void setclientAdapter(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public ClientAdapter getclientAdapter() {
		return clientAdapter;
	}

	private static final ApiType _0Type = ApiUtils.type(String.class);
}