import Permission from './entity/Permission'
import Role from './entity/Role'
import ManagerModel from './model/ManagerModel'
import {AbstractApi} from 'rxjava-api-core'


/**
 * 
*/
declare class AdminManagerApi extends AbstractApi {


   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/permissions</li>
     * <li><b>Model:</b> Permission[]</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see Permission[]
    */
    getPermissionList():Promise<Permission[]>;
   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/token/manager</li>
     * <li><b>Model:</b> ManagerModel</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see ManagerModel
    */
    getTokenManager():Promise<ManagerModel>;
   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/token/permissions</li>
     * <li><b>Model:</b> Permission[]</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see Permission[]
    */
    getTokenPermissionList():Promise<Permission[]>;
   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/token/roles</li>
     * <li><b>Model:</b> Role[]</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see Role[]
    */
    getTokenRoleList():Promise<Role[]>;

}
export { AdminManagerApi };
declare const adminManagerApi: AdminManagerApi;
export default adminManagerApi;