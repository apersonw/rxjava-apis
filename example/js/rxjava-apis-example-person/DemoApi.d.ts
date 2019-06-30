import {AbstractApi} from 'rxjava-api-core'


/**
 * 
*/
declare class DemoApi extends AbstractApi {


   /**
     * 
    *
     * <div class='http-info'>http 说明<ul>
     * <li><b>Uri:</b>demo/hello</li>
     * <li><b>Model:</b> string</li>
     * <li>需要登录</li>
     * </ul>
     * </div>
    */
    hello():Promise<string>;

}
export { DemoApi };
declare const demoApi: DemoApi;
export default demoApi;