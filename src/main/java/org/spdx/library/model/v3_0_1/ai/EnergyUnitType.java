/**
 * SPDX-FileCopyrightText: Copyright (c) 2025 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0_1.ai;

import org.spdx.core.IndividualUriValue;

/**
 * Specifies the unit of energy consumption. 
 */
public enum EnergyUnitType implements IndividualUriValue {

	OTHER("other"),
	KILOWATT_HOUR("kilowattHour"),
	MEGAJOULE("megajoule");
	
	private String longName;
	
	private EnergyUnitType(String longName) {
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
		return "https://spdx.org/rdf/3.0.1/terms/AI/EnergyUnitType";
	}
}

