package org.rxjava.api.goods.dashboard;

import reactor.core.publisher.Mono;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.Future;

import org.rxjava.apikit.client.*;

import org.rxjava.api.goods.dashboard.entity.Goods;
import org.rxjava.api.goods.dashboard.form.GoodsPageForm;
import org.rxjava.api.goods.dashboard.domain.Page;

public class AdminGoodsApi {
	private ClientAdapter clientAdapter;

	public AdminGoodsApi() {
	}

	public AdminGoodsApi(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public Mono<Page<Goods>> getPage(GoodsPageForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("admin/goodsPage", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("GET", _url, _form, _0Type);
	}

	public Mono<Goods> save() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("admin/goods", _uriVariables);

		return clientAdapter.request("POST", _url, null, _1Type);
	}

	public void setclientAdapter(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public ClientAdapter getclientAdapter() {
		return clientAdapter;
	}

	private static final ApiType _0Type = ApiUtils.type(Page.class, ApiUtils.type(Goods.class));
	private static final ApiType _1Type = ApiUtils.type(Goods.class);
}