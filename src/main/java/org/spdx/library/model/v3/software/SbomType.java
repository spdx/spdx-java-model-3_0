/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.software;

import org.spdx.core.IndividualUriValue;

/**
 * Provides a set of values to be used to describe the common types of SBOMs that tools 
 * may create. 
 */
public enum SbomType implements IndividualUriValue {

	ANALYZED("analyzed"),
	DEPLOYED("deployed"),
	SOURCE("source"),
	DESIGN("design"),
	BUILD("build"),
	RUNTIME("runtime");
	
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
		return "https://spdx.org/rdf/3.1/terms/Software/SbomType";
	}
}

