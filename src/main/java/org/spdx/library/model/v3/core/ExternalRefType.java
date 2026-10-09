/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.core;

import org.spdx.core.IndividualUriValue;

/**
 * Specifies the type of an external reference. 
 */
public enum ExternalRefType implements IndividualUriValue {

	CERTIFICATION_REPORT("certificationReport"),
	RISK_ASSESSMENT("riskAssessment"),
	BOWER("bower"),
	PURCHASE_ORDER("purchaseOrder"),
	SECURITY_ADVISORY("securityAdvisory"),
	EXPORT_CONTROL_ASSESSMENT("exportControlAssessment"),
	STATIC_ANALYSIS_REPORT("staticAnalysisReport"),
	MAILING_LIST("mailingList"),
	NUGET("nuget"),
	COMPONENT_ANALYSIS_REPORT("componentAnalysisReport"),
	FUNDING("funding"),
	RUNTIME_ANALYSIS_REPORT("runtimeAnalysisReport"),
	NPM("npm"),
	LICENSE("license"),
	SECURITY_FIX("securityFix"),
	SECURITY_OTHER("securityOther"),
	PRIVACY_ASSESSMENT("privacyAssessment"),
	METRICS("metrics"),
	SOURCE_ARTIFACT("sourceArtifact"),
	SECURE_SOFTWARE_ATTESTATION("secureSoftwareAttestation"),
	SOCIAL_MEDIA("socialMedia"),
	QUALITY_ASSESSMENT_REPORT("qualityAssessmentReport"),
	BUILD_META("buildMeta"),
	CWE("cwe"),
	SECURITY_POLICY("securityPolicy"),
	MAVEN_CENTRAL("mavenCentral"),
	SUPPORT("support"),
	SECURITY_ADVERSARY_MODEL("securityAdversaryModel"),
	EOL_NOTICE("eolNotice"),
	DOCUMENTATION("documentation"),
	PRODUCT_METADATA("productMetadata"),
	ALT_WEB_PAGE("altWebPage"),
	VCS("vcs"),
	X509_CERT("x509Cert"),
	CHAT("chat"),
	VULNERABILITY_DISCLOSURE_REPORT("vulnerabilityDisclosureReport"),
	SECURITY_THREAT_MODEL("securityThreatModel"),
	VULNERABILITY_EXPLOITABILITY_ASSESSMENT("vulnerabilityExploitabilityAssessment"),
	RELEASE_HISTORY("releaseHistory"),
	BINARY_ARTIFACT("binaryArtifact"),
	OTHER("other"),
	ISSUE_TRACKER("issueTracker"),
	ALT_DOWNLOAD_LOCATION("altDownloadLocation"),
	RELEASE_NOTES("releaseNotes"),
	BUILD_SYSTEM("buildSystem"),
	DYNAMIC_ANALYSIS_REPORT("dynamicAnalysisReport"),
	SECURITY_PEN_TEST_REPORT("securityPenTestReport");
	
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
		return "https://spdx.org/rdf/3.1/terms/Core/ExternalRefType";
	}
}

