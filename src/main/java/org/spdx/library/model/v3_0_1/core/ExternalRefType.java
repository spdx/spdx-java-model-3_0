/**
 * SPDX-FileCopyrightText: Copyright (c) 2025 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_0_1.core;

import org.spdx.core.IndividualUriValue;

/**
 * Specifies the type of an external reference. 
 */
public enum ExternalRefType implements IndividualUriValue {

	SECURITY_FIX("securityFix"),
	SUPPORT("support"),
	OTHER("other"),
	SOURCE_ARTIFACT("sourceArtifact"),
	CWE("cwe"),
	SECURE_SOFTWARE_ATTESTATION("secureSoftwareAttestation"),
	SOCIAL_MEDIA("socialMedia"),
	PURCHASE_ORDER("purchaseOrder"),
	VCS("vcs"),
	CERTIFICATION_REPORT("certificationReport"),
	PRODUCT_METADATA("productMetadata"),
	ALT_DOWNLOAD_LOCATION("altDownloadLocation"),
	ALT_WEB_PAGE("altWebPage"),
	BUILD_SYSTEM("buildSystem"),
	SECURITY_ADVERSARY_MODEL("securityAdversaryModel"),
	DOCUMENTATION("documentation"),
	DYNAMIC_ANALYSIS_REPORT("dynamicAnalysisReport"),
	QUALITY_ASSESSMENT_REPORT("qualityAssessmentReport"),
	METRICS("metrics"),
	BOWER("bower"),
	VULNERABILITY_EXPLOITABILITY_ASSESSMENT("vulnerabilityExploitabilityAssessment"),
	STATIC_ANALYSIS_REPORT("staticAnalysisReport"),
	SECURITY_PEN_TEST_REPORT("securityPenTestReport"),
	SECURITY_ADVISORY("securityAdvisory"),
	SECURITY_OTHER("securityOther"),
	RELEASE_NOTES("releaseNotes"),
	EOL_NOTICE("eolNotice"),
	VULNERABILITY_DISCLOSURE_REPORT("vulnerabilityDisclosureReport"),
	CHAT("chat"),
	BINARY_ARTIFACT("binaryArtifact"),
	SECURITY_THREAT_MODEL("securityThreatModel"),
	EXPORT_CONTROL_ASSESSMENT("exportControlAssessment"),
	RUNTIME_ANALYSIS_REPORT("runtimeAnalysisReport"),
	ISSUE_TRACKER("issueTracker"),
	COMPONENT_ANALYSIS_REPORT("componentAnalysisReport"),
	RELEASE_HISTORY("releaseHistory"),
	LICENSE("license"),
	NPM("npm"),
	FUNDING("funding"),
	RISK_ASSESSMENT("riskAssessment"),
	SECURITY_POLICY("securityPolicy"),
	PRIVACY_ASSESSMENT("privacyAssessment"),
	MAVEN_CENTRAL("mavenCentral"),
	BUILD_META("buildMeta"),
	NUGET("nuget"),
	MAILING_LIST("mailingList");
	
	private String longName;
	
	private ExternalRefType(String longName) {
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
		return "https://spdx.org/rdf/3.0.1/terms/Core/ExternalRefType";
	}
}

