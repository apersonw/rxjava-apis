import LoginByPhoneSmsForm from './form/LoginByPhoneSmsForm'
import UserSaveForm from './form/UserSaveForm'
import UserModel from './model/UserModel'
import {AbstractApi} from 'rxjava-api-core'


/**
 * 
*/
declare class UserApi extends AbstractApi {


   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>currentUser</li>
     * <li><b>Model:</b> UserModel</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see UserModel
    */
    getCurrentUser():Promise<UserModel>;
   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>loginByPhoneSms</li>
     * <li><b>Form:</b>LoginByPhoneSmsFormloginByPhoneSms</li>
     * <li><b>Model:</b> string</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see LoginByPhoneSmsForm
    */
    loginByPhoneSms(form:LoginByPhoneSmsForm):Promise<string>;
   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>user</li>
     * <li><b>Form:</b>UserSaveFormsaveUser</li>
     * <li><b>Model:</b> UserModel</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see UserModel
     * @see UserSaveForm
    */
    saveUser(form:UserSaveForm):Promise<UserModel>;
   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b></li>
     * <li><b>Model:</b> string</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
    */
    system():Promise<string>;

}
export { UserApi };
declare const userApi: UserApi;
export default userApi;