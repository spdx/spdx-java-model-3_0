/**
 * SPDX-FileCopyrightText: Copyright (c) 2025 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0_1.software;

import org.spdx.core.IndividualUriValue;

/**
 * Provides information about the primary purpose of an Element. 
 */
public enum SoftwarePurpose implements IndividualUriValue {

	MODULE("module"),
	TEST("test"),
	PATCH("patch"),
	SPECIFICATION("specification"),
	SOURCE("source"),
	CONFIGURATION("configuration"),
	EVIDENCE("evidence"),
	INSTALL("install"),
	ARCHIVE("archive"),
	MODEL("model"),
	DATA("data"),
	EXECUTABLE("executable"),
	DISK_IMAGE("diskImage"),
	APPLICATION("application"),
	OPERATING_SYSTEM("operatingSystem"),
	FILE("file"),
	REQUIREMENT("requirement"),
	PLATFORM("platform"),
	BOM("bom"),
	DEVICE_DRIVER("deviceDriver"),
	OTHER("other"),
	CONTAINER("container"),
	MANIFEST("manifest"),
	FILESYSTEM_IMAGE("filesystemImage"),
	DEVICE("device"),
	DOCUMENTATION("documentation"),
	LIBRARY("library"),
	FIRMWARE("firmware"),
	FRAMEWORK("framework");
	
	private String longName;
	
	private SoftwarePurpose(String longName) {
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
		return "https://spdx.org/rdf/3.0.1/terms/Software/SoftwarePurpose";
	}
}

