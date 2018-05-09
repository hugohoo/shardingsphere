/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingsphere.core;

import io.shardingsphere.core.api.AllApiTests;
import io.shardingsphere.core.executor.AllExecutorTests;
import io.shardingsphere.core.jdbc.AllJDBCTests;
import io.shardingsphere.core.util.AllUtilTests;
import io.shardingsphere.core.integrate.api.yaml.AllYamlTests;
import io.shardingsphere.core.api.AllApiTests;
import io.shardingsphere.core.executor.AllExecutorTests;
import io.shardingsphere.core.integrate.api.yaml.AllYamlTests;
import io.shardingsphere.core.jdbc.AllJDBCTests;
import io.shardingsphere.core.util.AllUtilTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        AllApiTests.class,
        AllExecutorTests.class, 
        AllJDBCTests.class,
        AllUtilTests.class,
        AllYamlTests.class
    })
public class AllUnitTests {
}
