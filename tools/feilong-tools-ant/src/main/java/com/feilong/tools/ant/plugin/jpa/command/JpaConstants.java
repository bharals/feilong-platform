/*
 * Copyright (C) 2008 feilong (venusdrogon@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.tools.ant.plugin.jpa.command;

/**
 * 
 * @author <a href="mailto:venusdrogon@163.com">feilong</a>
 * @version 1.0.7 2014年5月27日 下午7:55:20
 * @since 1.0.7
 */
public interface JpaConstants{

	/**
	 * \@Table 捕获的正则表达式
	 */
	String	REGEX_PATTERN_TABLE	= ".*@Table.*name.*\"(.*?)\".*";

	/**
	 * \@Index 捕获的正则表达式
	 */
	String	REGEX_PATTERN_INDEX	= ".*@Index.*name.*\"(.*?)\".*";

}
