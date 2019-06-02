import Resource from './Resource'


/**
 * @author  happy 2019-03-17 23:22
 * 商品
*/
interface Goods {

	/**
	 * 品牌Id
	 */
    brandId?:string;

	/**
	 * 封面价
	 */
    coverPrice?:number;

	/**
	 * 创建日期
	 */
    createDate?:Date;

    excess?:string;

    id?:string;

	/**
	 * 商品名称
	 */
    name?:string;

	/**
	 * 优先级
	 */
    priority?:number;

	/**
	 * 商铺Id
	 */
    shopId?:string;

    status?:string;

	/**
	 * 缩略图
	 */
    thumb?:Resource;

	/**
	 * 默认为虚拟商品
	 */
    type?:string;

	/**
	 * 更新日期
	 */
    updateDate?:Date;
}

export default Goods;