/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.ai;

import org.spdx.core.IndividualUriValue;

/**
 * Safety risk level. 
 */
public enum SafetyRiskAssessmentType implements IndividualUriValue {

	HIGH("high"),
	MEDIUM("medium"),
	LOW("low"),
	SERIOUS("serious");
	
	private String longName;
	
	private SafetyRiskAssessmentType(String longName) {
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
		return "https://spdx.org/rdf/3.1/terms/AI/SafetyRiskAssessmentType";
	}
}

