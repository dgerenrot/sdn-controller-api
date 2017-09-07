/*******************************************************************************
 * Copyright (c) Intel Corporation
 * Copyright (c) 2017
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.osc.sdk.controller;

import org.osc.sdk.controller.element.Element;
import org.osc.sdk.controller.element.InspectionPortElement;
import org.osc.sdk.controller.element.NetworkElement;

/**
 * This class represents a default inspection port with inspection port element implementation
 */
public class DefaultInspectionPort implements InspectionPortElement {

    private String elementId;
    private String parentId;
    private NetworkElement ingressPort;
    private NetworkElement egressPort;

    public DefaultInspectionPort() {
    }

    public DefaultInspectionPort(NetworkElement ingressPort,
            NetworkElement egressPort, String elementId, String parentId) {
        this.ingressPort = ingressPort;
        this.egressPort = egressPort;
        this.elementId = elementId;
        this.parentId = parentId;
    }

    public DefaultInspectionPort(NetworkElement ingressPort, NetworkElement egressPort, Element element) {
        this.ingressPort = ingressPort;
        this.egressPort = egressPort;
        this.elementId = (element != null ? element.getElementId() : null);
        this.parentId = (element != null ? element.getParentId() : null);
    }

    @Override
    public String getElementId() {
        return this.elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    @Override
    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public NetworkElement getIngressPort() {
        return this.ingressPort;
    }

    @Override
    public NetworkElement getEgressPort() {
        return this.egressPort;
    }

    @Override
    public String toString() {
        return "DefaultInspectionPort [elementId=" + this.elementId + ", parentId=" + this.parentId + ", ingressPort="
                + this.ingressPort + ", egressPort=" + this.egressPort + "]";
    }
}
