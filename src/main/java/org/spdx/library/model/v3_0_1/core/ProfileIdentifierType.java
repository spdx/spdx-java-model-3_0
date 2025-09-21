/**
 * SPDX-FileCopyrightText: Copyright (c) 2025 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0_1.core;

import org.spdx.core.IndividualUriValue;

/**
 * Enumeration of the valid profiles. 
 */
public enum ProfileIdentifierType implements IndividualUriValue {

	EXTENSION("extension"),
	SIMPLE_LICENSING("simpleLicensing"),
	EXPANDED_LICENSING("expandedLicensing"),
	AI("ai"),
	LITE("lite"),
	CORE("core"),
	BUILD("build"),
	SOFTWARE("software"),
	SECURITY("security"),
	DATASET("dataset");
	
	private String longName;
	
	private ProfileIdentifierType(String longName) {
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
		return "https://spdx.org/rdf/3.0.1/terms/Core/ProfileIdentifierType";
	}
}

