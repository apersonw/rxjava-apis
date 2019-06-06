import Resource from '../entity/Resource'


/**
 * @author  happy 2019-05-15 21:59
*/
interface UserModel {

	/**
	 * 头像
	 */
    avatar?:Resource;

    id?:string;

	/**
	 * 昵称
	 */
    nickname?:string;
}

export default UserModel;