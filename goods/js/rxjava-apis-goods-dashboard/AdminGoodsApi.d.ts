import Goods from './entity/Goods'
import GoodsPageForm from './form/GoodsPageForm'
import Page from './domain/Page'
import {AbstractApi} from 'rxjava-api-core'


/**
 * 
*/
declare class AdminGoodsApi extends AbstractApi {


   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/goodsPage</li>
     * <li><b>Form:</b>GoodsPageFormgetPage</li>
     * <li><b>Model:</b> Page</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see Page
     * @see Goods
     * @see GoodsPageForm
    */
    getPage(form:GoodsPageForm):Promise<Page>;
   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>admin/goods</li>
     * <li><b>Model:</b> Goods</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see Goods
    */
    save():Promise<Goods>;

}
export { AdminGoodsApi };
declare const adminGoodsApi: AdminGoodsApi;
export default adminGoodsApi;