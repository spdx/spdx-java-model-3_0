/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.software;

import org.spdx.core.IndividualUriValue;

/**
 * Specifies the type of a content identifier. 
 */
public enum ContentIdentifierType implements IndividualUriValue {

	GITOID("gitoid"),
	SWHID("swhid");
	
	private String longName;
	
	private ContentIdentifierType(String longName) {
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
		return "https://spdx.org/rdf/3.1/terms/Software/ContentIdentifierType";
	}
}

