/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.supplychain;

import org.spdx.core.IndividualUriValue;

/**
 * These categories help define sets Responsibility Type. 
 */
public enum ResponsibilityType implements IndividualUriValue {

	OWNERSHIP("ownership"),
	CUSTODY("custody");
	
	private String longName;
	
	private ResponsibilityType(String longName) {
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
		return "https://spdx.org/rdf/3.1/terms/SupplyChain/ResponsibilityType";
	}
}

