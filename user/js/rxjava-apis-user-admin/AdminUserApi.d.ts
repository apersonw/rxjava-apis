import User from './entity/User'
import UserPageForm from './form/UserPageForm'
import Page from './domain/Page'
import {AbstractApi} from 'rxjava-api-core'


/**
 * 
*/
declare class AdminUserApi extends AbstractApi {


   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/userPage</li>
     * <li><b>Form:</b>UserPageFormgetPage</li>
     * <li><b>Model:</b> Page</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see Page
     * @see User
     * @see UserPageForm
    */
    getPage(form:UserPageForm):Promise<Page>;

}
export { AdminUserApi };
declare const adminUserApi: AdminUserApi;
export default adminUserApi;