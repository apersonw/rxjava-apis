package org.rxjava.api.goods.dashboard;

import reactor.core.publisher.Mono;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.Future;

import org.rxjava.apikit.client.*;

import org.rxjava.api.goods.dashboard.entity.Brand;
import org.rxjava.api.goods.dashboard.form.BrandPageForm;
import org.rxjava.api.goods.dashboard.domain.Page;

public class AdminBrandApi {
	private ClientAdapter clientAdapter;

	public AdminBrandApi() {
	}

	public AdminBrandApi(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public Mono<Page<Brand>> getPage(BrandPageForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("admin/brandPage", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("GET", _url, _form, _0Type);
	}

	public void setclientAdapter(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public ClientAdapter getclientAdapter() {
		return clientAdapter;
	}

	private static final ApiType _0Type = ApiUtils.type(Page.class, ApiUtils.type(Brand.class));
}