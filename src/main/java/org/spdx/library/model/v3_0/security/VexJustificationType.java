/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0.security;

import org.spdx.core.IndividualUriValue;

/**
 * Specifies the VEX justification type. 
 */
public enum VexJustificationType implements IndividualUriValue {

	VULNERABLE_CODE_NOT_IN_EXECUTE_PATH("vulnerableCodeNotInExecutePath"),
	VULNERABLE_CODE_NOT_PRESENT("vulnerableCodeNotPresent"),
	INLINE_MITIGATIONS_ALREADY_EXIST("inlineMitigationsAlreadyExist"),
	VULNERABLE_CODE_CANNOT_BE_CONTROLLED_BY_ADVERSARY("vulnerableCodeCannotBeControlledByAdversary"),
	COMPONENT_NOT_PRESENT("componentNotPresent");
	
	private String longName;
	
	private VexJustificationType(String longName) {
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
		return "https://spdx.org/rdf/3.0.1/terms/Security/VexJustificationType";
	}
}

