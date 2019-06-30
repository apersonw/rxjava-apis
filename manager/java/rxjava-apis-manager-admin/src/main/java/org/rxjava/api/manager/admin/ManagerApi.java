package org.rxjava.api.manager.admin;

import reactor.core.publisher.Mono;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.Future;

import org.rxjava.apikit.client.*;

import org.rxjava.api.manager.admin.entity.Manager;
import org.rxjava.api.manager.admin.entity.ManagerPermission;
import org.rxjava.api.manager.admin.form.ManagerLoginForm;
import org.rxjava.api.manager.admin.form.ManagerPageForm;
import org.rxjava.api.manager.admin.form.ManagerSaveForm;
import org.rxjava.api.manager.admin.form.PermissionSaveForm;
import org.rxjava.api.manager.admin.form.PermissionToRoleForm;
import org.rxjava.api.manager.admin.form.RoleSaveForm;
import org.rxjava.api.manager.admin.form.RoleToManagerForm;
import org.rxjava.api.manager.admin.domain.Page;

public class ManagerApi {
	private ClientAdapter clientAdapter;

	public ManagerApi() {
	}

	public ManagerApi(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public Mono<Manager> getManager() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("admin/manager", _uriVariables);

		return clientAdapter.request("GET", _url, null, _0Type);
	}

	public Mono<Page<Manager>> getManagerPage(ManagerPageForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("admin/managers", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("GET", _url, _form, _1Type);
	}

	public Mono<java.util.ArrayList<ManagerPermission>> getManagerPermissions() {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("admin/manager/permissions", _uriVariables);

		return clientAdapter.request("GET", _url, null, _2Type);
	}

	public Mono<String> login(ManagerLoginForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("admin/login/password", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("POST", _url, _form, _3Type);
	}

	public Mono<Void> saveManager(ManagerSaveForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("admin/manager", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("POST", _url, _form, _4Type);
	}

	public Mono<Void> savePermission(PermissionSaveForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("admin/permission", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("POST", _url, _form, _5Type);
	}

	public Mono<Void> savePermissionToRole(PermissionToRoleForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("admin/manager/role/permissions", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("POST", _url, _form, _6Type);
	}

	public Mono<Void> saveRole(RoleSaveForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("admin/role", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("POST", _url, _form, _7Type);
	}

	public Mono<Void> saveRoleToManager(RoleToManagerForm form) {
		Map<String, Object> _uriVariables = new HashMap<>();
		String _url = ApiUtils.expandUriComponent("admin/manager/role", _uriVariables);

		List<Entry<String, Object>> _form = form.encode("", new ArrayList<>());
		return clientAdapter.request("POST", _url, _form, _8Type);
	}

	public void setclientAdapter(ClientAdapter clientAdapter) {
		this.clientAdapter = clientAdapter;
	}

	public ClientAdapter getclientAdapter() {
		return clientAdapter;
	}

	private static final ApiType _0Type = ApiUtils.type(Manager.class);
	private static final ApiType _1Type = ApiUtils.type(Page.class, ApiUtils.type(Manager.class));
	private static final ApiType _2Type = ApiUtils.type(java.util.ArrayList.class, ManagerPermission.class);
	private static final ApiType _3Type = ApiUtils.type(String.class);
	private static final ApiType _4Type = ApiUtils.type(Void.class);
	private static final ApiType _5Type = ApiUtils.type(Void.class);
	private static final ApiType _6Type = ApiUtils.type(Void.class);
	private static final ApiType _7Type = ApiUtils.type(Void.class);
	private static final ApiType _8Type = ApiUtils.type(Void.class);
}