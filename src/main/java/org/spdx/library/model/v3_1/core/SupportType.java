/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.core;

import org.spdx.core.IndividualUriValue;

/**
 * Type of support that is associated with an artifact. 
 */
public enum SupportType implements IndividualUriValue {

	DEPLOYED("deployed"),
	DEVELOPMENT("development"),
	END_OF_SUPPORT("endOfSupport"),
	LIMITED_SUPPORT("limitedSupport"),
	NO_ASSERTION("noAssertion"),
	NO_SUPPORT("noSupport"),
	SUPPORT("support");
	
	private String longName;
	
	private SupportType(String longName) {
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
		return "https://spdx.org/rdf/3.1/terms/Core/SupportType";
	}
}

