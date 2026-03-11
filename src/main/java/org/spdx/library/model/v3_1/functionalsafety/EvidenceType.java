/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.functionalsafety;

import org.spdx.core.IndividualUriValue;

/**
 * EvidenceType refers to categories of documented or observable proof used to verify 
 * compliance, qualification, or performance 
 */
public enum EvidenceType implements IndividualUriValue {

	LOG("log"),
	OTHER("other"),
	RECORDING("recording"),
	REPORT("report"),
	OBSERVATION("observation");
	
	private String longName;
	
	private EvidenceType(String longName) {
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
		return "https://spdx.org/rdf/3.1/terms/FunctionalSafety/EvidenceType";
	}
}

