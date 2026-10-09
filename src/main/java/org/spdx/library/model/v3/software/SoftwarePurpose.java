/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.software;

import org.spdx.core.IndividualUriValue;

/**
 * Provides information about the primary purpose of an Element. 
 */
public enum SoftwarePurpose implements IndividualUriValue {

	SPECIFICATION("specification"),
	INSTALL("install"),
	OTHER("other"),
	DISK_IMAGE("diskImage"),
	DEVICE_DRIVER("deviceDriver"),
	APPLICATION("application"),
	FILESYSTEM_IMAGE("filesystemImage"),
	BOM("bom"),
	FRAMEWORK("framework"),
	REQUIREMENT("requirement"),
	EVIDENCE("evidence"),
	CONFIGURATION("configuration"),
	FIRMWARE("firmware"),
	DEVICE("device"),
	PLATFORM("platform"),
	OPERATING_SYSTEM("operatingSystem"),
	DATA("data"),
	CONTAINER("container"),
	LIBRARY("library"),
	MANIFEST("manifest"),
	FILE("file"),
	PATCH("patch"),
	ARCHIVE("archive"),
	MODEL("model"),
	SOURCE("source"),
	MODULE("module"),
	TEST("test"),
	DOCUMENTATION("documentation"),
	EXECUTABLE("executable");
	
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
		return "https://spdx.org/rdf/3.1/terms/Software/SoftwarePurpose";
	}
}

