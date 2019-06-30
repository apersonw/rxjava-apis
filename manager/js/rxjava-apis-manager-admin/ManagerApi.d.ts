import Manager from './entity/Manager'
import ManagerPermission from './entity/ManagerPermission'
import ManagerLoginForm from './form/ManagerLoginForm'
import ManagerPageForm from './form/ManagerPageForm'
import ManagerSaveForm from './form/ManagerSaveForm'
import PermissionSaveForm from './form/PermissionSaveForm'
import PermissionToRoleForm from './form/PermissionToRoleForm'
import RoleSaveForm from './form/RoleSaveForm'
import RoleToManagerForm from './form/RoleToManagerForm'
import Page from './domain/Page'
import {AbstractApi} from 'rxjava-api-core'


/**
 * 
*/
declare class ManagerApi extends AbstractApi {


   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/manager</li>
     * <li><b>Model:</b> Manager</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see Manager
    */
    getManager():Promise<Manager>;
   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/managers</li>
     * <li><b>Form:</b>ManagerPageFormgetManagerPage</li>
     * <li><b>Model:</b> Page</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see Page
     * @see Manager
     * @see ManagerPageForm
    */
    getManagerPage(form:ManagerPageForm):Promise<Page>;
   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/manager/permissions</li>
     * <li><b>Model:</b> ManagerPermission[]</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see ManagerPermission[]
    */
    getManagerPermissions():Promise<ManagerPermission[]>;
   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/login/password</li>
     * <li><b>Form:</b>ManagerLoginFormlogin</li>
     * <li><b>Model:</b> string</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see ManagerLoginForm
    */
    login(form:ManagerLoginForm):Promise<string>;
   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/manager</li>
     * <li><b>Form:</b>ManagerSaveFormsaveManager</li>
     * <li><b>Model:</b> void</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see ManagerSaveForm
    */
    saveManager(form:ManagerSaveForm):Promise<void>;
   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/permission</li>
     * <li><b>Form:</b>PermissionSaveFormsavePermission</li>
     * <li><b>Model:</b> void</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see PermissionSaveForm
    */
    savePermission(form:PermissionSaveForm):Promise<void>;
   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/manager/role/permissions</li>
     * <li><b>Form:</b>PermissionToRoleFormsavePermissionToRole</li>
     * <li><b>Model:</b> void</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see PermissionToRoleForm
    */
    savePermissionToRole(form:PermissionToRoleForm):Promise<void>;
   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/role</li>
     * <li><b>Form:</b>RoleSaveFormsaveRole</li>
     * <li><b>Model:</b> void</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see RoleSaveForm
    */
    saveRole(form:RoleSaveForm):Promise<void>;
   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/manager/role</li>
     * <li><b>Form:</b>RoleToManagerFormsaveRoleToManager</li>
     * <li><b>Model:</b> void</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see RoleToManagerForm
    */
    saveRoleToManager(form:RoleToManagerForm):Promise<void>;

}
export { ManagerApi };
declare const managerApi: ManagerApi;
export default managerApi;