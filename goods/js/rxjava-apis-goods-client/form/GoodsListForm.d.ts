

/**
 * @author  happy 2019-03-23 00:21
*/
interface GoodsListForm {

	/**
	 * 品牌Id
	 */
    brandId?:string;

	/**
	 * 类目Id
	 */
    categoryId?:string;

	/**
	 * 商品Ids
	 */
    goodsIds?:string[];
}

export default GoodsListForm;