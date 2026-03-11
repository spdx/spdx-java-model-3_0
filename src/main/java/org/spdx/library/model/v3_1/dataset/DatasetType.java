/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.dataset;

import org.spdx.core.IndividualUriValue;

/**
 * Enumeration of dataset types. 
 */
public enum DatasetType implements IndividualUriValue {

	SENSOR("sensor"),
	NO_ASSERTION("noAssertion"),
	AUDIO("audio"),
	NUMERIC("numeric"),
	OTHER("other"),
	TIMESERIES("timeseries"),
	GRAPH("graph"),
	VIDEO("video"),
	STRUCTURED("structured"),
	CATEGORICAL("categorical"),
	TEXT("text"),
	TIMESTAMP("timestamp"),
	SYNTACTIC("syntactic"),
	IMAGE("image");
	
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
		return "https://spdx.org/rdf/3.1/terms/Dataset/DatasetType";
	}
}

