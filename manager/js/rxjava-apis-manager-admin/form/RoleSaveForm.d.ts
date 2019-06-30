

/**
 * @author  happy 2019-05-08 15:51
 * 新建/编辑角色
*/
interface RoleSaveForm {

    name?:string;

	/**
	 * 上级角色Id
	 */
    parentId?:string;
}

export default RoleSaveForm;