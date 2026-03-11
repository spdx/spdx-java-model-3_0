/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0.software;

import org.spdx.core.IndividualUriValue;

/**
 * Provides a set of values to be used to describe the common types of SBOMs that tools 
 * may create. 
 */
public enum SbomType implements IndividualUriValue {

	SOURCE("source"),
	DEPLOYED("deployed"),
	RUNTIME("runtime"),
	DESIGN("design"),
	ANALYZED("analyzed"),
	BUILD("build");
	
	private String longName;
	
	private SbomType(String longName) {
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
		return "https://spdx.org/rdf/3.0.1/terms/Software/SbomType";
	}
}

