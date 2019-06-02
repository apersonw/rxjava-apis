import GoodsListForm from './form/GoodsListForm'
import GoodsModel from './model/GoodsModel'
import {AbstractApi} from 'rxjava-api-core'


/**
 * 
*/
declare class GoodsApi extends AbstractApi {


   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>goods/{goodsId}</li>
     * <li><b>PathVariable:</b> string goodsId</li>
     * <li><b>Model:</b> GoodsModel</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see GoodsModel
    */
    getByGoodsId(goodsId:string):Promise<GoodsModel>;
   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>goodsList/{page}-{pageSize}</li>
     * <li><b>PathVariable:</b> number page</li>
     * <li><b>PathVariable:</b> number pageSize</li>
     * <li><b>Form:</b>GoodsListFormgetList</li>
     * <li><b>Model:</b> GoodsModel[]</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see GoodsModel[]
     * @see GoodsListForm
    */
    getList(page:number, pageSize:number, form:GoodsListForm):Promise<GoodsModel[]>;

}
export { GoodsApi };
declare const goodsApi: GoodsApi;
export default goodsApi;