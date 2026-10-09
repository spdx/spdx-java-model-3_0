/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.core;

import org.spdx.core.IndividualUriValue;

/**
 * Provide an enumerated set of lifecycle phases that can provide context to relationships. 
 */
public enum LifecycleScopeType implements IndividualUriValue {

	UPDATE("update"),
	BUILD("build"),
	OTHER("other"),
	DECOMMISSION("decommission"),
	TEST("test"),
	DESIGN("design"),
	RUNTIME("runtime"),
	DEVELOPMENT("development");
	
	private String longName;
	
	private LifecycleScopeType(String longName) {
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
		return "https://spdx.org/rdf/3.1/terms/Core/LifecycleScopeType";
	}
}

