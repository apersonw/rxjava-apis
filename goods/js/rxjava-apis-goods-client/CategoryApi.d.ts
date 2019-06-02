import CategoryListForm from './form/CategoryListForm'
import CategoryModel from './model/CategoryModel'
import {AbstractApi} from 'rxjava-api-core'


/**
 * 
*/
declare class CategoryApi extends AbstractApi {


   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>categories</li>
     * <li><b>Form:</b>CategoryListFormgetList</li>
     * <li><b>Model:</b> CategoryModel[]</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
     * @see CategoryModel[]
     * @see CategoryListForm
    */
    getList(form:CategoryListForm):Promise<CategoryModel[]>;

}
export { CategoryApi };
declare const categoryApi: CategoryApi;
export default categoryApi;