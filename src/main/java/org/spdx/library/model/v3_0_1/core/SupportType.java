/**
 * SPDX-FileCopyrightText: Copyright (c) 2025 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0_1.core;

import org.spdx.core.IndividualUriValue;

/**
 * Indicates the type of support that is associated with an artifact. 
 */
public enum SupportType implements IndividualUriValue {

	SUPPORT("support"),
	NO_ASSERTION("noAssertion"),
	END_OF_SUPPORT("endOfSupport"),
	NO_SUPPORT("noSupport"),
	DEPLOYED("deployed"),
	DEVELOPMENT("development"),
	LIMITED_SUPPORT("limitedSupport");
	
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
		return "https://spdx.org/rdf/3.0.1/terms/Core/SupportType";
	}
}

