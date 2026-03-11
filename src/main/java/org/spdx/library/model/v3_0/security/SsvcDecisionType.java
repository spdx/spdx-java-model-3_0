/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0.security;

import org.spdx.core.IndividualUriValue;

/**
 * Specifies the SSVC decision type. 
 */
public enum SsvcDecisionType implements IndividualUriValue {

	TRACK("track"),
	TRACK_STAR("trackStar"),
	ACT("act"),
	ATTEND("attend");
	
	private String longName;
	
	private SsvcDecisionType(String longName) {
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
		return "https://spdx.org/rdf/3.0.1/terms/Security/SsvcDecisionType";
	}
}

