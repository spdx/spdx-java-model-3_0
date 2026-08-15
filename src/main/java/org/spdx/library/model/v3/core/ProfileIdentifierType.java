/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.core;

import org.spdx.core.IndividualUriValue;

/**
 * Enumeration of the valid profiles. 
 */
public enum ProfileIdentifierType implements IndividualUriValue {

	SUPPLY_CHAIN("supplyChain"),
	SOFTWARE("software"),
	AI("ai"),
	HARDWARE("hardware"),
	FUNCTIONAL_SAFETY("functionalSafety"),
	CORE("core"),
	SECURITY("security"),
	OPERATIONS("operations"),
	SIMPLE_LICENSING("simpleLicensing"),
	EXPANDED_LICENSING("expandedLicensing"),
	DATASET("dataset"),
	LITE("lite"),
	EXTENSION("extension"),
	BUILD("build");
	
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
		return "https://spdx.org/rdf/3.1/terms/Core/ProfileIdentifierType";
	}
}

