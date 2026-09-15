/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.functionalsafety;

import org.spdx.core.IndividualUriValue;

/**
 * Enumeration of verification types. 
 */
public enum VerificationType implements IndividualUriValue {

	INSPECTION("inspection"),
	TEST("test"),
	OTHER("other"),
	REVIEW("review"),
	AUDIT("audit"),
	ANALYSIS("analysis"),
	ASSESSMENT("assessment"),
	DEMONSTRATION("demonstration");
	
	private String longName;
	
	private VerificationType(String longName) {
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
		return "https://spdx.org/rdf/3.1/terms/FunctionalSafety/VerificationType";
	}
}

