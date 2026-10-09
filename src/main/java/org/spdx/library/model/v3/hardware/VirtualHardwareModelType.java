/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.hardware;

import org.spdx.core.IndividualUriValue;

/**
 * VirtualHardwareModelType sets the VirtualHardware Model Type. 
 */
public enum VirtualHardwareModelType implements IndividualUriValue {

	OTHER("other"),
	FUNCTION("function"),
	CYCLE("cycle");
	
	private String longName;
	
	private VirtualHardwareModelType(String longName) {
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
		return "https://spdx.org/rdf/3.1/terms/Hardware/VirtualHardwareModelType";
	}
}

