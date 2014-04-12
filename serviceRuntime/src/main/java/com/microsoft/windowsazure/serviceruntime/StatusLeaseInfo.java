/**
 * Copyright Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.14 at 04:34:45 PM PST 
//

package com.microsoft.windowsazure.serviceruntime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for StatusLeaseInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="StatusLeaseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Acquire" type="{}AcquireLeaseInfo"/>
 *         &lt;element name="Release">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="ClientId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusLeaseInfo", propOrder = { "acquire", "release" })
class StatusLeaseInfo {

    @XmlElement(name = "Acquire")
    private AcquireLeaseInfo acquire;
    @XmlElement(name = "Release")
    private StatusLeaseInfo.Release release;
    @XmlAttribute(name = "ClientId", required = true)
    private String clientId;

    /**
     * Gets the value of the acquire property.
     * 
     * @return possible object is {@link AcquireLeaseInfo }
     * 
     */
    public AcquireLeaseInfo getAcquire() {
        return acquire;
    }

    /**
     * Sets the value of the acquire property.
     * 
     * @param value
     *            allowed object is {@link AcquireLeaseInfo }
     * 
     */
    public void setAcquire(AcquireLeaseInfo value) {
        this.acquire = value;
    }

    /**
     * Gets the value of the release property.
     * 
     * @return possible object is {@link StatusLeaseInfo.Release }
     * 
     */
    public StatusLeaseInfo.Release getRelease() {
        return release;
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *            allowed object is {@link StatusLeaseInfo.Release }
     * 
     */
    public void setRelease(StatusLeaseInfo.Release value) {
        this.release = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Release {

    }

}
