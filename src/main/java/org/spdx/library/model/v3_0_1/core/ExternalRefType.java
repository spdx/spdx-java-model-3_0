/**
 * Copyright (c) 2024 Source Auditor Inc.
 *
 * SPDX-License-Identifier: Apache-2.0
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
 
package org.spdx.library.model.v3_0_1.core;

import org.spdx.core.IndividualUriValue;

/**
 * DO NOT EDIT - this file is generated by the Owl to Java Utility 
 * See: https://github.com/spdx/tools-java 
 * 
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
