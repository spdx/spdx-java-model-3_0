/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.core;

import org.spdx.core.IndividualUriValue;

/**
 * Defines the level of automation a system possesses. 
 */
public enum IsoAutomationLevel implements IndividualUriValue {

	HIGH_AUTOMATION("highAutomation"),
	PARTIAL_AUTOMATION("partialAutomation"),
	CONDITIONAL_AUTOMATION("conditionalAutomation"),
	ASSISTIVE_AUTOMATION("assistiveAutomation"),
	NOT_AUTOMATED("notAutomated"),
	AUTONOMOUS("autonomous"),
	FULL_AUTOMATION("fullAutomation");
	
	private String longName;
	
	private IsoAutomationLevel(String longName) {
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
		return "https://spdx.org/rdf/3.1/terms/Core/IsoAutomationLevel";
	}
}

