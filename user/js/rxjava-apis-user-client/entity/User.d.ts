import Resource from './Resource'


/**
 * @author  happy 2019-03-29 13:44
 * 用户基础信息表
*/
interface User {

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

export default User;