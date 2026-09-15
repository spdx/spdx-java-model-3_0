/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.dataset;

import org.spdx.core.IndividualUriValue;

/**
 * Confidentiality level. 
 */
public enum ConfidentialityLevelType implements IndividualUriValue {

	AMBER("amber"),
	RED("red"),
	GREEN("green"),
	CLEAR("clear");
	
	private String longName;
	
	private ConfidentialityLevelType(String longName) {
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
		return "https://spdx.org/rdf/3.1/terms/Dataset/ConfidentialityLevelType";
	}
}

