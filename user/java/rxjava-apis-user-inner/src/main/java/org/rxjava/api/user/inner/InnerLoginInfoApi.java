package org.rxjava.api.user.inner;

import reactor.core.publisher.Mono;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.Future;

import org.rxjava.apikit.client.*;

import org.rxjava.api.user.inner.entity.LoginInfo;
import org.rxjava.api.user.inner.form.CheckPermissionForm;

public class InnerLoginInfoApi {
	private ClientAdapter clientAdapter;

	public InnerLoginInfoApi() {
	}

	public InnerLoginInfoApi(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public Mono<Boolean> checkPermission(CheckPermissionForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("inner/checkPermission", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("GET", _url, _form, _0Type);
	}

	public Mono<LoginInfo> checkToken(String token) {
		Map<String, Object> _uriVariables = new HashMap<>();
		_uriVariables.put("token", token);
		String _url = ApiUtils.expandUriComponent("inner/checkToken/{token}", _uriVariables);

		return clientAdapter.request("GET", _url, null, _1Type);
	}

	public void setclientAdapter(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public ClientAdapter getclientAdapter() {
		return clientAdapter;
	}

	private static final ApiType _0Type = ApiUtils.type(Boolean.class);
	private static final ApiType _1Type = ApiUtils.type(LoginInfo.class);
}