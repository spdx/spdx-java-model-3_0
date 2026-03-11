/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.security;

import org.spdx.core.IndividualUriValue;

/**
 * Specifies the CVSS base, temporal, threat, or environmental severity type. 
 */
public enum CvssSeverityType implements IndividualUriValue {

	LOW("low"),
	NONE("none"),
	MEDIUM("medium"),
	CRITICAL("critical"),
	HIGH("high");
	
	private String longName;
	
	private CvssSeverityType(String longName) {
		this.longName = longName;
	}
	
	@Override
	public String getIndividualURI() {
		return getNameSpace() + "/" + getLongName();
	}
	
	public String getLongName() {
		return longName;
	}
	
	public String getNameSpace() {
		return "https://spdx.org/rdf/3.1/terms/Security/CvssSeverityType";
	}
}

