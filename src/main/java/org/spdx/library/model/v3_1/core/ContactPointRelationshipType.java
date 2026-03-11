/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.core;

import org.spdx.core.IndividualUriValue;

/**
 * Information about the type of contact point for `ContactPointRelationship`s. 
 */
public enum ContactPointRelationshipType implements IndividualUriValue {

	OTHER("other"),
	SECURITY_VULNERABILITY("securityVulnerability"),
	SUPPORT("support"),
	COMPLIANCE("compliance");
	
	private String longName;
	
	private ContactPointRelationshipType(String longName) {
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
		return "https://spdx.org/rdf/3.1/terms/Core/ContactPointRelationshipType";
	}
}

