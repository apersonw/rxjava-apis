import Category from './entity/Category'
import CategoryPageForm from './form/CategoryPageForm'
import Page from './domain/Page'
import {AbstractApi} from 'rxjava-api-core'


/**
 * 
*/
declare class AdminCategoryApi extends AbstractApi {


   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/categoryPage</li>
     * <li><b>Form:</b>CategoryPageFormgetPage</li>
     * <li><b>Model:</b> Page</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see Page
     * @see Category
     * @see CategoryPageForm
    */
    getPage(form:CategoryPageForm):Promise<Page>;

}
export { AdminCategoryApi };
declare const adminCategoryApi: AdminCategoryApi;
export default adminCategoryApi;