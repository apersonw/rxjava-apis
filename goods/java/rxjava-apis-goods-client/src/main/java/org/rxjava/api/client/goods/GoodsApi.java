package org.rxjava.api.client.goods;

import reactor.core.publisher.Mono;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.Future;

import org.rxjava.apikit.client.*;

import org.rxjava.api.client.goods.form.GoodsListForm;
import org.rxjava.api.client.goods.model.GoodsModel;

public class GoodsApi {
	private ClientAdapter clientAdapter;

	public GoodsApi() {
	}

	public GoodsApi(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public Mono<GoodsModel> getByGoodsId(String goodsId) {
		Map<String, Object> _uriVariables = new HashMap<>();
		_uriVariables.put("goodsId", goodsId);
		String _url = ApiUtils.expandUriComponent("goods/{goodsId}", _uriVariables);

		return clientAdapter.request("GET", _url, null, _0Type);
	}

	public Mono<java.util.ArrayList<GoodsModel>> getList(int page, int pageSize, GoodsListForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		_uriVariables.put("page", page);
		_uriVariables.put("pageSize", pageSize);
		String _url = ApiUtils.expandUriComponent("goodsList/{page}-{pageSize}", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("GET", _url, _form, _1Type);
	}

	public void setclientAdapter(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public ClientAdapter getclientAdapter() {
		return clientAdapter;
	}

	private static final ApiType _0Type = ApiUtils.type(GoodsModel.class);
	private static final ApiType _1Type = ApiUtils.type(java.util.ArrayList.class, GoodsModel.class);
}