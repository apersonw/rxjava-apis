import Resource from '../entity/Resource'


/**
 * @author  happy 2019-05-08 15:54
 * 新建/编辑管理者
*/
interface ManagerSaveForm {

	/**
	 * 头像
	 */
    avatar?:Resource;

	/**
	 * 昵称
	 */
    nickname?:string;
}

export default ManagerSaveForm;