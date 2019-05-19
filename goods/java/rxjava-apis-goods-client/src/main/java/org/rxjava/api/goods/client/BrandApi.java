package org.rxjava.api.goods.client;

import reactor.core.publisher.Mono;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.Future;

import org.rxjava.apikit.client.*;

import org.rxjava.api.goods.client.form.BrandListForm;
import org.rxjava.api.goods.client.model.BrandModel;

public class BrandApi {
	private ClientAdapter clientAdapter;

	public BrandApi() {
	}

	public BrandApi(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public Mono<java.util.ArrayList<BrandModel>> getList(BrandListForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("brands", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("GET", _url, _form, _0Type);
	}

	public void setclientAdapter(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public ClientAdapter getclientAdapter() {
		return clientAdapter;
	}

	private static final ApiType _0Type = ApiUtils.type(java.util.ArrayList.class, BrandModel.class);
}