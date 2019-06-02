import Resource from '../entity/Resource'


/**
 * @author  happy 2019-03-25 23:13
*/
interface CategoryModel {

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

	/**
	 * 缩略图
	 */
    thumb?:Resource;
}

export default CategoryModel;