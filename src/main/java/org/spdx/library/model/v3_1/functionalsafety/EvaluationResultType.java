/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.functionalsafety;

import org.spdx.core.IndividualUriValue;

/**
 * EvaluationResultType describes the outcome of an evaluation or verification process 
 * with. 
 */
public enum EvaluationResultType implements IndividualUriValue {

	INCONCLUSIVE("inconclusive"),
	FAIL("fail"),
	PASS("pass");
	
	private String longName;
	
	private EvaluationResultType(String longName) {
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
		return "https://spdx.org/rdf/3.1/terms/FunctionalSafety/EvaluationResultType";
	}
}

