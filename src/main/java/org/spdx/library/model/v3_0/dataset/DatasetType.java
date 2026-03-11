/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0.dataset;

import org.spdx.core.IndividualUriValue;

/**
 * Enumeration of dataset types. 
 */
public enum DatasetType implements IndividualUriValue {

	IMAGE("image"),
	AUDIO("audio"),
	OTHER("other"),
	TIMESTAMP("timestamp"),
	NUMERIC("numeric"),
	GRAPH("graph"),
	SENSOR("sensor"),
	CATEGORICAL("categorical"),
	STRUCTURED("structured"),
	SYNTACTIC("syntactic"),
	TEXT("text"),
	NO_ASSERTION("noAssertion"),
	VIDEO("video"),
	TIMESERIES("timeseries");
	
	private String longName;
	
	private DatasetType(String longName) {
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
		return "https://spdx.org/rdf/3.0.1/terms/Dataset/DatasetType";
	}
}

