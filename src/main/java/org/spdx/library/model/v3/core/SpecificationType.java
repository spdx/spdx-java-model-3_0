/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.core;

import org.spdx.core.IndividualUriValue;

/**
 * A specification type defines the nature of a specification. 
 */
public enum SpecificationType implements IndividualUriValue {

	FORMAL_STANDARD("formalStandard"),
	OTHER("other"),
	SPECIFICATION("specification"),
	REGULATION("regulation");
	
	private String longName;
	
	private SpecificationType(String longName) {
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
		return "https://spdx.org/rdf/3.1/terms/Core/SpecificationType";
	}
}

