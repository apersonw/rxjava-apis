import KeyValue from '../core/KeyValue'
import Resource from '../entity/Resource'


/**
 * @author  happy 2019-03-21 22:46
 * 商品Sku
*/
interface SkuModel {

	/**
	 * ID
	 */
    id?:string;

	/**
	 * SKU属性列表
	 */
    params?:KeyValue[];

	/**
	 * 销售价
	 */
    price?:number;

	/**
	 * SKU图片
	 */
    skuImg?:Resource;

	/**
	 * SKU库存
	 */
    stockNum?:number;
}

export default SkuModel;