/**
 * Licensed to the Austrian Association for Software Tool Integration (AASTI)
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. The AASTI licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openengsb.core.services.internal;

import java.util.List;
import java.util.Map;

import org.openengsb.core.api.model.ConfigItem;
import org.openengsb.core.api.persistence.ConfigPersistenceBackendService;
import org.openengsb.core.api.persistence.InvalidConfigurationException;
import org.openengsb.core.api.persistence.PersistenceException;

/**
 * Implementation of ConnectorConfiguration persistence backend
 */
// TODO: [OPENENGSB-1251] Provide file backend object for connector; dont forget blueprint and cfg file
public class ConnectorFilePersistenceBackendService implements ConfigPersistenceBackendService {

    @Override
    public List<ConfigItem<?>> load(Map<String, String> metadata) throws PersistenceException,
        InvalidConfigurationException {
        return null;
    }

    @Override
    public void persist(ConfigItem<?> config) throws PersistenceException, InvalidConfigurationException {

    }

    @Override
    public boolean supports(Class<? extends ConfigItem<?>> configItemType) {
        return false;
    }

}