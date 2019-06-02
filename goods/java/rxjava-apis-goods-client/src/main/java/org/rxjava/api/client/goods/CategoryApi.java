package org.rxjava.api.client.goods;

import reactor.core.publisher.Mono;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.Future;

import org.rxjava.apikit.client.*;

import org.rxjava.api.client.goods.form.CategoryListForm;
import org.rxjava.api.client.goods.model.CategoryModel;

public class CategoryApi {
	private ClientAdapter clientAdapter;

	public CategoryApi() {
	}

	public CategoryApi(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public Mono<java.util.ArrayList<CategoryModel>> getList(CategoryListForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("categories", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("GET", _url, _form, _0Type);
	}

	public void setclientAdapter(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public ClientAdapter getclientAdapter() {
		return clientAdapter;
	}

	private static final ApiType _0Type = ApiUtils.type(java.util.ArrayList.class, CategoryModel.class);
}