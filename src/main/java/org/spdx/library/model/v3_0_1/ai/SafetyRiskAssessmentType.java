/**
 * SPDX-FileCopyrightText: Copyright (c) 2025 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0_1.ai;

import org.spdx.core.IndividualUriValue;

/**
 * Specifies the safety risk level. 
 */
public enum SafetyRiskAssessmentType implements IndividualUriValue {

	MEDIUM("medium"),
	SERIOUS("serious"),
	LOW("low"),
	HIGH("high");
	
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
		return "https://spdx.org/rdf/3.0.1/terms/AI/SafetyRiskAssessmentType";
	}
}

