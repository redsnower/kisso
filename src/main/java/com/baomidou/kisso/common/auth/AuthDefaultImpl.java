/**
 * Copyright (c) 2011-2020, hubin (jobob@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.kisso.common.auth;

import com.baomidou.kisso.SSOAuthorization;

/**
 * <p>
 * 用户不自定义权限，默认用此类来代替
 * </p>
 * 
 * @author 441558032@qq.com
 * @Date 2016-12-15
 */
public class AuthDefaultImpl implements SSOAuthorization {

	public boolean isPermitted(Token token, String permission) {
		return true;
	}

}
