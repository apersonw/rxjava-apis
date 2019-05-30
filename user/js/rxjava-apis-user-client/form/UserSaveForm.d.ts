import Resource from '../entity/Resource'


/**
 * @author  happy 2019-05-15 23:14
*/
interface UserSaveForm {

	/**
	 * 头像
	 */
    avatar?:Resource;

	/**
	 * 昵称
	 */
    nickname?:string;
}

export default UserSaveForm;