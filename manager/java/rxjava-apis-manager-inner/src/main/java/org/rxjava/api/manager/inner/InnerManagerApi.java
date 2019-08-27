package org.rxjava.api.manager.inner;

import reactor.core.publisher.Mono;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.Future;

import org.rxjava.apikit.client.*;

import org.rxjava.api.manager.inner.form.AuthenticationForm;
import org.rxjava.api.manager.inner.model.ManagerModel;

public class InnerManagerApi {
	private ClientAdapter clientAdapter;

	public InnerManagerApi() {
	}

	public InnerManagerApi(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public Mono<ManagerModel> authentication(AuthenticationForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("inner/authentication", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("GET", _url, _form, _0Type);
	}

	public void setclientAdapter(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public ClientAdapter getclientAdapter() {
		return clientAdapter;
	}

	private static final ApiType _0Type = ApiUtils.type(ManagerModel.class);
}