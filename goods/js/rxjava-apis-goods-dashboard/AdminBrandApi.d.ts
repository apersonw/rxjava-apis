import Brand from './entity/Brand'
import BrandPageForm from './form/BrandPageForm'
import Page from './domain/Page'
import {AbstractApi} from 'rxjava-api-core'


/**
 * 
*/
declare class AdminBrandApi extends AbstractApi {


   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/brandPage</li>
     * <li><b>Form:</b>BrandPageFormgetPage</li>
     * <li><b>Model:</b> Page</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see Page
     * @see Brand
     * @see BrandPageForm
    */
    getPage(form:BrandPageForm):Promise<Page>;

}
export { AdminBrandApi };
declare const adminBrandApi: AdminBrandApi;
export default adminBrandApi;