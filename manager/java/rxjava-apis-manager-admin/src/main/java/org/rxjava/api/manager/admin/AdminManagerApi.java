package org.rxjava.api.manager.admin;

import reactor.core.publisher.Mono;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.Future;

import org.rxjava.apikit.client.*;

import org.rxjava.api.manager.admin.entity.Permission;
import org.rxjava.api.manager.admin.entity.Role;
import org.rxjava.api.manager.admin.model.ManagerModel;

public class AdminManagerApi {
	private ClientAdapter clientAdapter;

	public AdminManagerApi() {
	}

	public AdminManagerApi(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public Mono<java.util.ArrayList<Permission>> getPermissionList() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("admin/permissions", _uriVariables);

		return clientAdapter.request("GET", _url, null, _0Type);
	}

	public Mono<ManagerModel> getTokenManager() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("admin/token/manager", _uriVariables);

		return clientAdapter.request("GET", _url, null, _1Type);
	}

	public Mono<java.util.ArrayList<Permission>> getTokenPermissionList() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("admin/token/permissions", _uriVariables);

		return clientAdapter.request("GET", _url, null, _2Type);
	}

	public Mono<java.util.ArrayList<Role>> getTokenRoleList() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("admin/token/roles", _uriVariables);

		return clientAdapter.request("GET", _url, null, _3Type);
	}

	public void setclientAdapter(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public ClientAdapter getclientAdapter() {
		return clientAdapter;
	}

	private static final ApiType _0Type = ApiUtils.type(java.util.ArrayList.class, Permission.class);
	private static final ApiType _1Type = ApiUtils.type(ManagerModel.class);
	private static final ApiType _2Type = ApiUtils.type(java.util.ArrayList.class, Permission.class);
	private static final ApiType _3Type = ApiUtils.type(java.util.ArrayList.class, Role.class);
}