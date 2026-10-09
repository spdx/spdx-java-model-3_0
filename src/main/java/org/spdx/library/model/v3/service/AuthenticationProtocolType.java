/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.service;

import org.spdx.core.IndividualUriValue;

/**
 * Protocols which support authentication. 
 */
public enum AuthenticationProtocolType implements IndividualUriValue {

	TLS("tls"),
	OTHER("other"),
	CRL("crl"),
	OCSP("ocsp");
	
	private String longName;
	
	private AuthenticationProtocolType(String longName) {
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
		return "https://spdx.org/rdf/3.1/terms/Service/AuthenticationProtocolType";
	}
}

