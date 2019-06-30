import Resource from './Resource'


/**
 * @author  happy 2019-04-27 00:05
*/
interface Manager {

	/**
	 * 头像
	 */
    avatar?:Resource;

	/**
	 * 创建日期
	 */
    createDate?:Date;

    id?:string;

	/**
	 * 昵称
	 */
    nickname?:string;

	/**
	 * 更新日期
	 */
    updateDate?:Date;
}

export default Manager;