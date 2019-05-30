

/**
 * @author  happy 2019-04-15 22:59
*/
interface LoginByPhoneSmsForm {

	/**
	 * 手机号
	 */
    phone?:string;

	/**
	 * 短信验证码
	 */
    sms?:string;
}

export default LoginByPhoneSmsForm;