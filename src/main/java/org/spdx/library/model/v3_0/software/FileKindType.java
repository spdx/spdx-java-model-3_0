/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0.software;

import org.spdx.core.IndividualUriValue;

/**
 * Enumeration of the different kinds of SPDX file. 
 */
public enum FileKindType implements IndividualUriValue {

	DIRECTORY("directory"),
	FILE("file");
	
	private String longName;
	
	private FileKindType(String longName) {
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
		return "https://spdx.org/rdf/3.0.1/terms/Software/FileKindType";
	}
}

