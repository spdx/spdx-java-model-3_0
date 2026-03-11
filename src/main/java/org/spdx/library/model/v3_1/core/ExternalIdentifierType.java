/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.core;

import org.spdx.core.IndividualUriValue;

/**
 * Specifies the type of an external identifier. 
 */
public enum ExternalIdentifierType implements IndividualUriValue {

	VERIFICATION_U_U_I_D("verificationUUID"),
	EVIDENCE_U_U_I_D("evidenceUUID"),
	CPE23("cpe23"),
	HS_CODES("hsCodes"),
	CPE22("cpe22"),
	SWHID("swhid"),
	GTIN("gtin"),
	REQUIREMENT_U_U_I_D("requirementUUID"),
	WEBPAGE("webpage"),
	SECURITY_OTHER("securityOther"),
	GITOID("gitoid"),
	CVE("cve"),
	LEI("lei"),
	PHONE_NUMBER("phoneNumber"),
	PACKAGE_URL("packageUrl"),
	URL_SCHEME("urlScheme"),
	EMAIL("email"),
	SWID("swid"),
	GLUE("glue"),
	OTHER("other"),
	DUNS("duns"),
	GLN("gln");
	
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
		return "https://spdx.org/rdf/3.1/terms/Core/ExternalIdentifierType";
	}
}

