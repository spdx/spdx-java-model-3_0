/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0_1.core;

import org.spdx.core.IndividualUriValue;

/**
 * Specifies the type of an external identifier. 
 */
public enum ExternalIdentifierType implements IndividualUriValue {

	CPE22("cpe22"),
	CVE("cve"),
	URL_SCHEME("urlScheme"),
	SWHID("swhid"),
	EMAIL("email"),
	CPE23("cpe23"),
	OTHER("other"),
	GITOID("gitoid"),
	SECURITY_OTHER("securityOther"),
	PACKAGE_URL("packageUrl"),
	SWID("swid");
	
	private String longName;
	
	private ExternalIdentifierType(String longName) {
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
		return "https://spdx.org/rdf/3.0.1/terms/Core/ExternalIdentifierType";
	}
}

