

/**
 * @author  happy 2019-05-08 15:15
 * 管理者-权限
*/
interface ManagerPermission {

	/**
	 * 创建日期
	 */
    createDate?:Date;

    id?:string;

    managerId?:string;

	/**
	 * 请求方法
	 */
    method?:string;

	/**
	 * 权限路径
	 */
    path?:string;

    permissionId?:string;

	/**
	 * 更新日期
	 */
    updateDate?:Date;
}

export default ManagerPermission;