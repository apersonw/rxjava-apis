import LoginInfo from './entity/LoginInfo'
import User from './entity/User'
import {AbstractApi} from 'rxjava-api-core'


/**
 * 
*/
declare class InnerUserApi extends AbstractApi {


   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>serve/token/{token}/logininfo</li>
     * <li><b>PathVariable:</b> string token</li>
     * <li><b>Model:</b> LoginInfo</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see LoginInfo
    */
    tokenToLoginInfo(token:string):Promise<LoginInfo>;
   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>serve/token/{token}/user</li>
     * <li><b>PathVariable:</b> string token</li>
     * <li><b>Model:</b> User</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see User
    */
    tokenToUser(token:string):Promise<User>;

}
export { InnerUserApi };
declare const innerUserApi: InnerUserApi;
export default innerUserApi;