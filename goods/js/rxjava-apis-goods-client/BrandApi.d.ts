import BrandListForm from './form/BrandListForm'
import BrandModel from './model/BrandModel'
import {AbstractApi} from 'rxjava-api-core'


/**
 * 
*/
declare class BrandApi extends AbstractApi {


   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>brands</li>
     * <li><b>Form:</b>BrandListFormgetList</li>
     * <li><b>Model:</b> BrandModel[]</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see BrandModel[]
     * @see BrandListForm
    */
    getList(form:BrandListForm):Promise<BrandModel[]>;

}
export { BrandApi };
declare const brandApi: BrandApi;
export default brandApi;