/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.core;

import org.spdx.core.IndividualUriValue;

/**
 * The ProcessReadinessType is defined by the enumeration. 
 */
public enum ProcessReadinessType implements IndividualUriValue {

	OTHER("other"),
	ACTIVE("active"),
	DRAFT("draft"),
	OBSOLETE("obsolete");
	
	private String longName;
	
	private ProcessReadinessType(String longName) {
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
		return "https://spdx.org/rdf/3.1/terms/Core/ProcessReadinessType";
	}
}

