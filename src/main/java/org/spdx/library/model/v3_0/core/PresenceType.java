/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0.core;

import org.spdx.core.IndividualUriValue;

/**
 * Categories of presence or absence. 
 */
public enum PresenceType implements IndividualUriValue {

	NO("no"),
	NO_ASSERTION("noAssertion"),
	YES("yes");
	
	private String longName;
	
	private PresenceType(String longName) {
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
		return "https://spdx.org/rdf/3.0.1/terms/Core/PresenceType";
	}
}

