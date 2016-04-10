/**
 * Copyright 2016 Eventsourcing team
 *
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
 */
package com.eventsourcing.graphql;

import graphql.annotations.DefaultTypeFunction;
import org.osgi.framework.BundleContext;

import java.util.UUID;

public class BundleActivator implements org.osgi.framework.BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        DefaultTypeFunction.register(UUID.class, new UUIDFunction());
    }

    @Override
    public void stop(BundleContext context) throws Exception {
    }
}