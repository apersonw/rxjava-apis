

/**
 * @author  happy 2019-05-08 16:01
 * 新建/编辑权限
*/
interface PermissionSaveForm {

	/**
	 * 请求方法
	 */
    method?:string;

	/**
	 * 权限名称
	 */
    name?:string;

	/**
	 * 权限路径
	 */
    path?:string;
}

export default PermissionSaveForm;