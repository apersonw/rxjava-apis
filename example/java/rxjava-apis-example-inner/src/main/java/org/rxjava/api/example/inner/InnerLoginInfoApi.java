package org.rxjava.api.example.inner;

import reactor.core.publisher.Mono;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.Future;

import org.rxjava.apikit.client.*;

import org.rxjava.api.example.inner.entity.LoginInfo;

public class InnerLoginInfoApi {
	private ClientAdapter clientAdapter;

	public InnerLoginInfoApi() {
	}

	public InnerLoginInfoApi(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public Mono<LoginInfo> checkToken() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("inner/checkToken", _uriVariables);

		return clientAdapter.request("POST", _url, null, _0Type);
	}

	public Mono<String> hello() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("inner/hello", _uriVariables);

		return clientAdapter.request("GET", _url, null, _1Type);
	}

	public void setclientAdapter(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public ClientAdapter getclientAdapter() {
		return clientAdapter;
	}

	private static final ApiType _0Type = ApiUtils.type(LoginInfo.class);
	private static final ApiType _1Type = ApiUtils.type(String.class);
}