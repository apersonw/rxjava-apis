import TestForm from './form/TestForm'
import {AbstractApi} from 'rxjava-api-core'


class TestApi extends AbstractApi {
        
    /**
        * 
     *
        * <div class='http-info'>http 说明<ul>
    * <li><b>Uri:</b>person/testeeee/{id}</li>
    * <li><b>PathVariable:</b> string id</li>
    * <li><b>Form:</b>TestFormtestewwPath</li>
    * <li><b>Model:</b> number</li>
    * <li>需要登录</li>
    * </ul>
    * </div>
    * @see TestForm
     */
    testewwPath = (id, form) => {
        let _path = {};
        _path["id"] = id;
        return super._request("example", "testApi", "GET", "person/testeeee/{id}", _path, form);
    }
}

export { TestApi };
declare const testApi: TestApi;
export default testApi;