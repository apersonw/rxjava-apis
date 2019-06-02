import Resource from '../entity/Resource'
import SkuModel from './SkuModel'


/**
 * @author  happy 2019-03-23 00:19
*/
interface GoodsModel {

	/**
	 * 售价
	 */
    coverPrice?:number;

    id?:string;

	/**
	 * 商品名称
	 */
    name?:string;

	/**
	 * 商品Skus列表
	 */
    skus?:SkuModel[];

	/**
	 * 缩略图
	 */
    thumb?:Resource;
}

export default GoodsModel;