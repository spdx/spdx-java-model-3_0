/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.core;

import org.spdx.core.IndividualUriValue;

/**
 * Indicates whether a relationship is known to be complete, incomplete, or if no assertion 
 * is made with respect to relationship completeness. 
 */
public enum RelationshipCompleteness implements IndividualUriValue {

	COMPLETE("complete"),
	NO_ASSERTION("noAssertion"),
	INCOMPLETE("incomplete");
	
	private String longName;
	
	private RelationshipCompleteness(String longName) {
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
		return "https://spdx.org/rdf/3.1/terms/Core/RelationshipCompleteness";
	}
}

