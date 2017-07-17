/**
 * Copyright (c) 2017-2020, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.kisso.common;

/**
 * <p>
 * SSO 定义常量
 * </p>
 *
 * @author hubin
 * @since 2017-07-17
 */
public interface SSOConstants {

    String TOKEN_USER_ID = "id";
    String TOKEN_USER_IP = "ip";
    String TOKEN_USER_AGENT = "ua";
    String TOKEN_CREATE_TIME = "ct";
    String SCOPES = "scopes";
    int TOKEN_FLAG_NORMAL = 0; // 正常
    int TOKEN_FLAG_CACHE_SHUT = 1; // 缓存宕机


}
