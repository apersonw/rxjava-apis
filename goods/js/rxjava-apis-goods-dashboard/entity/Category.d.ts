import Resource from './Resource'


/**
 * @author  happy 2019-03-17 23:22
*/
interface Category {

	/**
	 * 创建日期
	 */
    createDate?:Date;

	/**
	 * ID
	 */
    id?:string;

	/**
	 * 名称
	 */
    name?:string;

	/**
	 * 上级Id
	 */
    parentId?:string;

    status?:string;

	/**
	 * 缩略图
	 */
    thumb?:Resource;

	/**
	 * 更新日期
	 */
    updateDate?:Date;
}

export default Category;