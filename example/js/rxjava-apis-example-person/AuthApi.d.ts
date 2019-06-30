import {AbstractApi} from 'rxjava-api-core'


/**
 * 
*/
declare class AuthApi extends AbstractApi {


   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>auth/login</li>
     * <li><b>Model:</b> string</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
    */
    login():Promise<string>;

}
export { AuthApi };
declare const authApi: AuthApi;
export default authApi;