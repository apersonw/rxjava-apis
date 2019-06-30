
"use strict";

Object.defineProperty(exports, "__esModule", {
    value: true
});
exports.default = exports.ManagerApi = void 0;

var _rxjavaApiCore = require("rxjava-api-core");

function _instanceof(left, right) { if (right != null && typeof Symbol !== "undefined" && right[Symbol.hasInstance]) { return right[Symbol.hasInstance](left); } else { return left instanceof right; } }

function _typeof(obj) { if (typeof Symbol === "function" && typeof Symbol.iterator === "symbol") { _typeof = function _typeof(obj) { return typeof obj; }; } else { _typeof = function _typeof(obj) { return obj && typeof Symbol === "function" && obj.constructor === Symbol && obj !== Symbol.prototype ? "symbol" : typeof obj; }; } return _typeof(obj); }

function _classCallCheck(instance, Constructor) { if (!_instanceof(instance, Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

function _defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } }

function _createClass(Constructor, protoProps, staticProps) { if (protoProps) _defineProperties(Constructor.prototype, protoProps); if (staticProps) _defineProperties(Constructor, staticProps); return Constructor; }

function _possibleConstructorReturn(self, call) { if (call && (_typeof(call) === "object" || typeof call === "function")) { return call; } return _assertThisInitialized(self); }

function _assertThisInitialized(self) { if (self === void 0) { throw new ReferenceError("this hasn't been initialised - super() hasn't been called"); } return self; }

function _get(target, property, receiver) { if (typeof Reflect !== "undefined" && Reflect.get) { _get = Reflect.get; } else { _get = function _get(target, property, receiver) { var base = _superPropBase(target, property); if (!base) return; var desc = Object.getOwnPropertyDescriptor(base, property); if (desc.get) { return desc.get.call(receiver); } return desc.value; }; } return _get(target, property, receiver || target); }

function _superPropBase(object, property) { while (!Object.prototype.hasOwnProperty.call(object, property)) { object = _getPrototypeOf(object); if (object === null) break; } return object; }

function _getPrototypeOf(o) { _getPrototypeOf = Object.setPrototypeOf ? Object.getPrototypeOf : function _getPrototypeOf(o) { return o.__proto__ || Object.getPrototypeOf(o); }; return _getPrototypeOf(o); }

function _inherits(subClass, superClass) { if (typeof superClass !== "function" && superClass !== null) { throw new TypeError("Super expression must either be null or a function"); } subClass.prototype = Object.create(superClass && superClass.prototype, { constructor: { value: subClass, writable: true, configurable: true } }); if (superClass) _setPrototypeOf(subClass, superClass); }

function _setPrototypeOf(o, p) { _setPrototypeOf = Object.setPrototypeOf || function _setPrototypeOf(o, p) { o.__proto__ = p; return o; }; return _setPrototypeOf(o, p); }

var ManagerApi =
    /*#__PURE__*/
    function (_AbstractApi) {
        _inherits(ManagerApi, _AbstractApi);

        function ManagerApi() {
            _classCallCheck(this, ManagerApi);

            return _possibleConstructorReturn(this, _getPrototypeOf(ManagerApi).apply(this, arguments));
        }

        _createClass(ManagerApi, [{
            key: "getManager",
            value: function getManager() {
                var _path = null;
                return _get(_getPrototypeOf(ManagerApi.prototype), "_request", this).call(this, "manager", "GET", "admin/manager", _path, null);
            }
        }]);
        _createClass(ManagerApi, [{
            key: "getManagerPage",
            value: function getManagerPage(form) {
                var _path = null;
                return _get(_getPrototypeOf(ManagerApi.prototype), "_request", this).call(this, "manager", "GET", "admin/managers", _path, form);
            }
        }]);
        _createClass(ManagerApi, [{
            key: "getManagerPermissions",
            value: function getManagerPermissions() {
                var _path = null;
                return _get(_getPrototypeOf(ManagerApi.prototype), "_request", this).call(this, "manager", "GET", "admin/manager/permissions", _path, null);
            }
        }]);
        _createClass(ManagerApi, [{
            key: "login",
            value: function login(form) {
                var _path = null;
                return _get(_getPrototypeOf(ManagerApi.prototype), "_request", this).call(this, "manager", "POST", "admin/login/password", _path, form);
            }
        }]);
        _createClass(ManagerApi, [{
            key: "saveManager",
            value: function saveManager(form) {
                var _path = null;
                return _get(_getPrototypeOf(ManagerApi.prototype), "_request", this).call(this, "manager", "POST", "admin/manager", _path, form);
            }
        }]);
        _createClass(ManagerApi, [{
            key: "savePermission",
            value: function savePermission(form) {
                var _path = null;
                return _get(_getPrototypeOf(ManagerApi.prototype), "_request", this).call(this, "manager", "POST", "admin/permission", _path, form);
            }
        }]);
        _createClass(ManagerApi, [{
            key: "savePermissionToRole",
            value: function savePermissionToRole(form) {
                var _path = null;
                return _get(_getPrototypeOf(ManagerApi.prototype), "_request", this).call(this, "manager", "POST", "admin/manager/role/permissions", _path, form);
            }
        }]);
        _createClass(ManagerApi, [{
            key: "saveRole",
            value: function saveRole(form) {
                var _path = null;
                return _get(_getPrototypeOf(ManagerApi.prototype), "_request", this).call(this, "manager", "POST", "admin/role", _path, form);
            }
        }]);
        _createClass(ManagerApi, [{
            key: "saveRoleToManager",
            value: function saveRoleToManager(form) {
                var _path = null;
                return _get(_getPrototypeOf(ManagerApi.prototype), "_request", this).call(this, "manager", "POST", "admin/manager/role", _path, form);
            }
        }]);

        return ManagerApi;
    }(_rxjavaApiCore.AbstractApi);

exports.ManagerApi = ManagerApi;
var managerApi = new ManagerApi();
var _default = managerApi;
exports.default = _default;