/**
 * Copyright (c) 2023 Source Auditor Inc.
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
package org.spdx.library.model.v3_0_1;

import org.spdx.storage.PropertyDescriptor;

/**
 * Constants which map to the SPDX specifications
 * @author Gary O'Neall
 *
 */
public class SpdxConstantsV3 {
	
	public enum SpdxMajorVersion {
		VERSION_1,
		VERSION_2,
		VERSION_3;

		public static SpdxMajorVersion latestVersion() {
			return VERSION_3;
		}
	}
	
	public static final String MODEL_SPEC_VERSION = "3.0.1";
	
	// Date format - NOTE: This format does not handle milliseconds.  Use Instant.parse for full ISO 8601 parsing
	public static final String SPDX_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
	
	public static final String SPDX_LISTED_LICENSE_NAMESPACE = "http://spdx.org/licenses/";
	
	
	/**
	 * AI namespace
	 */
	public static final String A_I_NAMESPACE = "https://spdx.org/rdf/3.0.1/terms/AI/";
	public static final PropertyDescriptor PROP_AUTONOMY_TYPE = new PropertyDescriptor("autonomyType", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_DOMAIN = new PropertyDescriptor("domain", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_ENERGY_CONSUMPTION = new PropertyDescriptor("energyConsumption", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_ENERGY_QUANTITY = new PropertyDescriptor("energyQuantity", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_ENERGY_UNIT = new PropertyDescriptor("energyUnit", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_FINETUNING_ENERGY_CONSUMPTION = new PropertyDescriptor("finetuningEnergyConsumption", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_HYPERPARAMETER = new PropertyDescriptor("hyperparameter", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_INFERENCE_ENERGY_CONSUMPTION = new PropertyDescriptor("inferenceEnergyConsumption", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_INFORMATION_ABOUT_APPLICATION = new PropertyDescriptor("informationAboutApplication", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_INFORMATION_ABOUT_TRAINING = new PropertyDescriptor("informationAboutTraining", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_LIMITATION = new PropertyDescriptor("limitation", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_METRIC = new PropertyDescriptor("metric", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_METRIC_DECISION_THRESHOLD = new PropertyDescriptor("metricDecisionThreshold", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_MODEL_DATA_PREPROCESSING = new PropertyDescriptor("modelDataPreprocessing", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_MODEL_EXPLAINABILITY = new PropertyDescriptor("modelExplainability", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_SAFETY_RISK_ASSESSMENT = new PropertyDescriptor("safetyRiskAssessment", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_STANDARD_COMPLIANCE = new PropertyDescriptor("standardCompliance", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_TRAINING_ENERGY_CONSUMPTION = new PropertyDescriptor("trainingEnergyConsumption", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_TYPE_OF_MODEL = new PropertyDescriptor("typeOfModel", A_I_NAMESPACE);
	public static final PropertyDescriptor PROP_USE_SENSITIVE_PERSONAL_INFORMATION = new PropertyDescriptor("useSensitivePersonalInformation", A_I_NAMESPACE);
	
	/**
	 * Build namespace
	 */
	public static final String BUILD_NAMESPACE = "https://spdx.org/rdf/3.0.1/terms/Build/";
	public static final PropertyDescriptor PROP_BUILD_END_TIME = new PropertyDescriptor("buildEndTime", BUILD_NAMESPACE);
	public static final PropertyDescriptor PROP_BUILD_ID = new PropertyDescriptor("buildId", BUILD_NAMESPACE);
	public static final PropertyDescriptor PROP_BUILD_START_TIME = new PropertyDescriptor("buildStartTime", BUILD_NAMESPACE);
	public static final PropertyDescriptor PROP_BUILD_TYPE = new PropertyDescriptor("buildType", BUILD_NAMESPACE);
	public static final PropertyDescriptor PROP_CONFIG_SOURCE_DIGEST = new PropertyDescriptor("configSourceDigest", BUILD_NAMESPACE);
	public static final PropertyDescriptor PROP_CONFIG_SOURCE_ENTRYPOINT = new PropertyDescriptor("configSourceEntrypoint", BUILD_NAMESPACE);
	public static final PropertyDescriptor PROP_CONFIG_SOURCE_URI = new PropertyDescriptor("configSourceUri", BUILD_NAMESPACE);
	public static final PropertyDescriptor PROP_ENVIRONMENT = new PropertyDescriptor("environment", BUILD_NAMESPACE);
	public static final PropertyDescriptor PROP_PARAMETER = new PropertyDescriptor("parameter", BUILD_NAMESPACE);
	
	/**
	 * Core namespace
	 */
	public static final String CORE_NAMESPACE = "https://spdx.org/rdf/3.0.1/terms/Core/";
	public static final PropertyDescriptor PROP_ALGORITHM = new PropertyDescriptor("algorithm", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_ANNOTATION_TYPE = new PropertyDescriptor("annotationType", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_BEGIN_INTEGER_RANGE = new PropertyDescriptor("beginIntegerRange", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_BUILT_TIME = new PropertyDescriptor("builtTime", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_COMMENT = new PropertyDescriptor("comment", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_COMPLETENESS = new PropertyDescriptor("completeness", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_CONTENT_TYPE = new PropertyDescriptor("contentType", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_CONTEXT = new PropertyDescriptor("context", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_CREATED = new PropertyDescriptor("created", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_CREATED_BY = new PropertyDescriptor("createdBy", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_CREATED_USING = new PropertyDescriptor("createdUsing", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_CREATION_INFO = new PropertyDescriptor("creationInfo", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_DATA_LICENSE = new PropertyDescriptor("dataLicense", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_DEFINING_ARTIFACT = new PropertyDescriptor("definingArtifact", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_DESCRIPTION = new PropertyDescriptor("description", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_ELEMENT = new PropertyDescriptor("element", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_END_INTEGER_RANGE = new PropertyDescriptor("endIntegerRange", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_END_TIME = new PropertyDescriptor("endTime", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_EXTENSION = new PropertyDescriptor("extension", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_EXTERNAL_IDENTIFIER = new PropertyDescriptor("externalIdentifier", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_EXTERNAL_IDENTIFIER_TYPE = new PropertyDescriptor("externalIdentifierType", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_EXTERNAL_REF = new PropertyDescriptor("externalRef", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_EXTERNAL_REF_TYPE = new PropertyDescriptor("externalRefType", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_EXTERNAL_SPDX_ID = new PropertyDescriptor("externalSpdxId", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_FROM = new PropertyDescriptor("from", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_HASH_VALUE = new PropertyDescriptor("hashValue", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_IDENTIFIER = new PropertyDescriptor("identifier", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_IDENTIFIER_LOCATOR = new PropertyDescriptor("identifierLocator", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_SPDX_IMPORT = new PropertyDescriptor("spdxImport", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_ISSUING_AUTHORITY = new PropertyDescriptor("issuingAuthority", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_KEY = new PropertyDescriptor("key", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_LOCATION_HINT = new PropertyDescriptor("locationHint", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_LOCATOR = new PropertyDescriptor("locator", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_NAME = new PropertyDescriptor("name", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_NAMESPACE = new PropertyDescriptor("namespace", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_NAMESPACE_MAP = new PropertyDescriptor("namespaceMap", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_ORIGINATED_BY = new PropertyDescriptor("originatedBy", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE = new PropertyDescriptor("packageVerificationCodeExcludedFile", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_PREFIX = new PropertyDescriptor("prefix", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_PROFILE_CONFORMANCE = new PropertyDescriptor("profileConformance", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_RELATIONSHIP_TYPE = new PropertyDescriptor("relationshipType", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_RELEASE_TIME = new PropertyDescriptor("releaseTime", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_ROOT_ELEMENT = new PropertyDescriptor("rootElement", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_SCOPE = new PropertyDescriptor("scope", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_SPEC_VERSION = new PropertyDescriptor("specVersion", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_STANDARD_NAME = new PropertyDescriptor("standardName", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_START_TIME = new PropertyDescriptor("startTime", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_STATEMENT = new PropertyDescriptor("statement", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_SUBJECT = new PropertyDescriptor("subject", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_SUMMARY = new PropertyDescriptor("summary", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_SUPPLIED_BY = new PropertyDescriptor("suppliedBy", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_SUPPORT_LEVEL = new PropertyDescriptor("supportLevel", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_TO = new PropertyDescriptor("to", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_VALID_UNTIL_TIME = new PropertyDescriptor("validUntilTime", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_VALUE = new PropertyDescriptor("value", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_VERIFIED_USING = new PropertyDescriptor("verifiedUsing", CORE_NAMESPACE);
	
	/**
	 * Dataset namespace
	 */
	public static final String DATASET_NAMESPACE = "https://spdx.org/rdf/3.0.1/terms/Dataset/";
	public static final PropertyDescriptor PROP_ANONYMIZATION_METHOD_USED = new PropertyDescriptor("anonymizationMethodUsed", DATASET_NAMESPACE);
	public static final PropertyDescriptor PROP_CONFIDENTIALITY_LEVEL = new PropertyDescriptor("confidentialityLevel", DATASET_NAMESPACE);
	public static final PropertyDescriptor PROP_DATA_COLLECTION_PROCESS = new PropertyDescriptor("dataCollectionProcess", DATASET_NAMESPACE);
	public static final PropertyDescriptor PROP_DATA_PREPROCESSING = new PropertyDescriptor("dataPreprocessing", DATASET_NAMESPACE);
	public static final PropertyDescriptor PROP_DATASET_AVAILABILITY = new PropertyDescriptor("datasetAvailability", DATASET_NAMESPACE);
	public static final PropertyDescriptor PROP_DATASET_NOISE = new PropertyDescriptor("datasetNoise", DATASET_NAMESPACE);
	public static final PropertyDescriptor PROP_DATASET_SIZE = new PropertyDescriptor("datasetSize", DATASET_NAMESPACE);
	public static final PropertyDescriptor PROP_DATASET_TYPE = new PropertyDescriptor("datasetType", DATASET_NAMESPACE);
	public static final PropertyDescriptor PROP_DATASET_UPDATE_MECHANISM = new PropertyDescriptor("datasetUpdateMechanism", DATASET_NAMESPACE);
	public static final PropertyDescriptor PROP_HAS_SENSITIVE_PERSONAL_INFORMATION = new PropertyDescriptor("hasSensitivePersonalInformation", DATASET_NAMESPACE);
	public static final PropertyDescriptor PROP_INTENDED_USE = new PropertyDescriptor("intendedUse", DATASET_NAMESPACE);
	public static final PropertyDescriptor PROP_KNOWN_BIAS = new PropertyDescriptor("knownBias", DATASET_NAMESPACE);
	public static final PropertyDescriptor PROP_SENSOR = new PropertyDescriptor("sensor", DATASET_NAMESPACE);
	
	/**
	 * ExpandedLicensing namespace
	 */
	public static final String EXPANDED_LICENSING_NAMESPACE = "https://spdx.org/rdf/3.0.1/terms/ExpandedLicensing/";
	public static final PropertyDescriptor PROP_ADDITION_TEXT = new PropertyDescriptor("additionText", EXPANDED_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_DEPRECATED_VERSION = new PropertyDescriptor("deprecatedVersion", EXPANDED_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_IS_DEPRECATED_ADDITION_ID = new PropertyDescriptor("isDeprecatedAdditionId", EXPANDED_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_IS_DEPRECATED_LICENSE_ID = new PropertyDescriptor("isDeprecatedLicenseId", EXPANDED_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_IS_FSF_LIBRE = new PropertyDescriptor("isFsfLibre", EXPANDED_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_IS_OSI_APPROVED = new PropertyDescriptor("isOsiApproved", EXPANDED_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_LICENSE_XML = new PropertyDescriptor("licenseXml", EXPANDED_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_LIST_VERSION_ADDED = new PropertyDescriptor("listVersionAdded", EXPANDED_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_MEMBER = new PropertyDescriptor("member", EXPANDED_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_OBSOLETED_BY = new PropertyDescriptor("obsoletedBy", EXPANDED_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_SEE_ALSO = new PropertyDescriptor("seeAlso", EXPANDED_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_STANDARD_ADDITION_TEMPLATE = new PropertyDescriptor("standardAdditionTemplate", EXPANDED_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_STANDARD_LICENSE_HEADER = new PropertyDescriptor("standardLicenseHeader", EXPANDED_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_STANDARD_LICENSE_TEMPLATE = new PropertyDescriptor("standardLicenseTemplate", EXPANDED_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_SUBJECT_ADDITION = new PropertyDescriptor("subjectAddition", EXPANDED_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_SUBJECT_EXTENDABLE_LICENSE = new PropertyDescriptor("subjectExtendableLicense", EXPANDED_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_SUBJECT_LICENSE = new PropertyDescriptor("subjectLicense", EXPANDED_LICENSING_NAMESPACE);
	
	/**
	 * Extension namespace
	 */
	public static final String EXTENSION_NAMESPACE = "https://spdx.org/rdf/3.0.1/terms/Extension/";
	public static final PropertyDescriptor PROP_CDX_PROP_NAME = new PropertyDescriptor("cdxPropName", EXTENSION_NAMESPACE);
	public static final PropertyDescriptor PROP_CDX_PROP_VALUE = new PropertyDescriptor("cdxPropValue", EXTENSION_NAMESPACE);
	public static final PropertyDescriptor PROP_CDX_PROPERTY = new PropertyDescriptor("cdxProperty", EXTENSION_NAMESPACE);
	
	/**
	 * Security namespace
	 */
	public static final String SECURITY_NAMESPACE = "https://spdx.org/rdf/3.0.1/terms/Security/";
	public static final PropertyDescriptor PROP_ACTION_STATEMENT = new PropertyDescriptor("actionStatement", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_ACTION_STATEMENT_TIME = new PropertyDescriptor("actionStatementTime", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_ASSESSED_ELEMENT = new PropertyDescriptor("assessedElement", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_CATALOG_TYPE = new PropertyDescriptor("catalogType", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_DECISION_TYPE = new PropertyDescriptor("decisionType", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_EXPLOITED = new PropertyDescriptor("exploited", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_IMPACT_STATEMENT = new PropertyDescriptor("impactStatement", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_IMPACT_STATEMENT_TIME = new PropertyDescriptor("impactStatementTime", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_JUSTIFICATION_TYPE = new PropertyDescriptor("justificationType", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_SECURITY_LOCATOR = new PropertyDescriptor("SecurityLocator", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_MODIFIED_TIME = new PropertyDescriptor("modifiedTime", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_PERCENTILE = new PropertyDescriptor("percentile", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_PROBABILITY = new PropertyDescriptor("probability", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_PUBLISHED_TIME = new PropertyDescriptor("publishedTime", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_SCORE = new PropertyDescriptor("score", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_SEVERITY = new PropertyDescriptor("severity", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_STATUS_NOTES = new PropertyDescriptor("statusNotes", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_VECTOR_STRING = new PropertyDescriptor("vectorString", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_VEX_VERSION = new PropertyDescriptor("vexVersion", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_WITHDRAWN_TIME = new PropertyDescriptor("withdrawnTime", SECURITY_NAMESPACE);
	
	/**
	 * SimpleLicensing namespace
	 */
	public static final String SIMPLE_LICENSING_NAMESPACE = "https://spdx.org/rdf/3.0.1/terms/SimpleLicensing/";
	public static final PropertyDescriptor PROP_CUSTOM_ID_TO_URI = new PropertyDescriptor("customIdToUri", SIMPLE_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_LICENSE_EXPRESSION = new PropertyDescriptor("licenseExpression", SIMPLE_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_LICENSE_LIST_VERSION = new PropertyDescriptor("licenseListVersion", SIMPLE_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_LICENSE_TEXT = new PropertyDescriptor("licenseText", SIMPLE_LICENSING_NAMESPACE);
	
	/**
	 * Software namespace
	 */
	public static final String SOFTWARE_NAMESPACE = "https://spdx.org/rdf/3.0.1/terms/Software/";
	public static final PropertyDescriptor PROP_ADDITIONAL_PURPOSE = new PropertyDescriptor("additionalPurpose", SOFTWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_ATTRIBUTION_TEXT = new PropertyDescriptor("attributionText", SOFTWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_BYTE_RANGE = new PropertyDescriptor("byteRange", SOFTWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_CONTENT_IDENTIFIER = new PropertyDescriptor("contentIdentifier", SOFTWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_CONTENT_IDENTIFIER_TYPE = new PropertyDescriptor("contentIdentifierType", SOFTWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_CONTENT_IDENTIFIER_VALUE = new PropertyDescriptor("contentIdentifierValue", SOFTWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_COPYRIGHT_TEXT = new PropertyDescriptor("copyrightText", SOFTWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_DOWNLOAD_LOCATION = new PropertyDescriptor("downloadLocation", SOFTWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_FILE_KIND = new PropertyDescriptor("fileKind", SOFTWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_HOME_PAGE = new PropertyDescriptor("homePage", SOFTWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_LINE_RANGE = new PropertyDescriptor("lineRange", SOFTWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_PACKAGE_URL = new PropertyDescriptor("packageUrl", SOFTWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_PACKAGE_VERSION = new PropertyDescriptor("packageVersion", SOFTWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_PRIMARY_PURPOSE = new PropertyDescriptor("primaryPurpose", SOFTWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_SBOM_TYPE = new PropertyDescriptor("sbomType", SOFTWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_SNIPPET_FROM_FILE = new PropertyDescriptor("snippetFromFile", SOFTWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_SOURCE_INFO = new PropertyDescriptor("sourceInfo", SOFTWARE_NAMESPACE);
	
	// class types
	public static final String CORE_EXTERNAL_IDENTIFIER_TYPE = "Core.ExternalIdentifierType";
	public static final String A_I_ENERGY_UNIT_TYPE = "AI.EnergyUnitType";
	public static final String EXTENSION_CDX_PROPERTIES_EXTENSION = "Extension.CdxPropertiesExtension";
	public static final String EXPANDED_LICENSING_LICENSE = "ExpandedLicensing.License";
	public static final String EXPANDED_LICENSING_EXTERNAL_LICENSE = "ExpandedLicensing.ExternalLicense";
	public static final String DATASET_DATASET_PACKAGE = "Dataset.DatasetPackage";
	public static final String DATASET_EXTERNAL_DATASET_PACKAGE = "Dataset.ExternalDatasetPackage";
	public static final String CORE_ELEMENT_COLLECTION = "Core.ElementCollection";
	public static final String CORE_EXTERNAL_ELEMENT_COLLECTION = "Core.ExternalElementCollection";
	public static final String SECURITY_VEX_JUSTIFICATION_TYPE = "Security.VexJustificationType";
	public static final String CORE_INTEGRITY_METHOD = "Core.IntegrityMethod";
	public static final String CORE_EXTERNAL_IDENTIFIER = "Core.ExternalIdentifier";
	public static final String CORE_DICTIONARY_ENTRY = "Core.DictionaryEntry";
	public static final String CORE_POSITIVE_INTEGER_RANGE = "Core.PositiveIntegerRange";
	public static final String SECURITY_VEX_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP = "Security.VexAffectedVulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_VEX_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalVexAffectedVulnAssessmentRelationship";
	public static final String SECURITY_CVSS_V4_VULN_ASSESSMENT_RELATIONSHIP = "Security.CvssV4VulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_CVSS_V4_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalCvssV4VulnAssessmentRelationship";
	public static final String DATASET_DATASET_AVAILABILITY_TYPE = "Dataset.DatasetAvailabilityType";
	public static final String EXPANDED_LICENSING_CUSTOM_LICENSE_ADDITION = "ExpandedLicensing.CustomLicenseAddition";
	public static final String EXPANDED_LICENSING_EXTERNAL_CUSTOM_LICENSE_ADDITION = "ExpandedLicensing.ExternalCustomLicenseAddition";
	public static final String CORE_HASH_ALGORITHM = "Core.HashAlgorithm";
	public static final String EXPANDED_LICENSING_DISJUNCTIVE_LICENSE_SET = "ExpandedLicensing.DisjunctiveLicenseSet";
	public static final String EXPANDED_LICENSING_EXTERNAL_DISJUNCTIVE_LICENSE_SET = "ExpandedLicensing.ExternalDisjunctiveLicenseSet";
	public static final String A_I_A_I_PACKAGE = "AI.AIPackage";
	public static final String A_I_EXTERNAL_A_I_PACKAGE = "AI.ExternalAIPackage";
	public static final String SOFTWARE_SPDX_FILE = "Software.SpdxFile";
	public static final String SOFTWARE_EXTERNAL_SPDX_FILE = "Software.ExternalSpdxFile";
	public static final String CORE_PERSON = "Core.Person";
	public static final String CORE_EXTERNAL_PERSON = "Core.ExternalPerson";
	public static final String SECURITY_CVSS_SEVERITY_TYPE = "Security.CvssSeverityType";
	public static final String CORE_CREATION_INFO = "Core.CreationInfo";
	public static final String CORE_BUNDLE = "Core.Bundle";
	public static final String CORE_EXTERNAL_BUNDLE = "Core.ExternalBundle";
	public static final String SECURITY_EXPLOIT_CATALOG_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExploitCatalogVulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_EXPLOIT_CATALOG_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalExploitCatalogVulnAssessmentRelationship";
	public static final String CORE_PRESENCE_TYPE = "Core.PresenceType";
	public static final String SECURITY_EXPLOIT_CATALOG_TYPE = "Security.ExploitCatalogType";
	public static final String SECURITY_VULN_ASSESSMENT_RELATIONSHIP = "Security.VulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalVulnAssessmentRelationship";
	public static final String CORE_ORGANIZATION = "Core.Organization";
	public static final String CORE_EXTERNAL_ORGANIZATION = "Core.ExternalOrganization";
	public static final String A_I_SAFETY_RISK_ASSESSMENT_TYPE = "AI.SafetyRiskAssessmentType";
	public static final String EXTENSION_EXTENSION = "Extension.Extension";
	public static final String SOFTWARE_SBOM = "Software.Sbom";
	public static final String SOFTWARE_EXTERNAL_SBOM = "Software.ExternalSbom";
	public static final String EXPANDED_LICENSING_WITH_ADDITION_OPERATOR = "ExpandedLicensing.WithAdditionOperator";
	public static final String EXPANDED_LICENSING_EXTERNAL_WITH_ADDITION_OPERATOR = "ExpandedLicensing.ExternalWithAdditionOperator";
	public static final String SOFTWARE_FILE_KIND_TYPE = "Software.FileKindType";
	public static final String EXTENSION_CDX_PROPERTY_ENTRY = "Extension.CdxPropertyEntry";
	public static final String SOFTWARE_CONTENT_IDENTIFIER_TYPE = "Software.ContentIdentifierType";
	public static final String SECURITY_EPSS_VULN_ASSESSMENT_RELATIONSHIP = "Security.EpssVulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_EPSS_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalEpssVulnAssessmentRelationship";
	public static final String CORE_ANNOTATION = "Core.Annotation";
	public static final String CORE_EXTERNAL_ANNOTATION = "Core.ExternalAnnotation";
	public static final String CORE_RELATIONSHIP = "Core.Relationship";
	public static final String CORE_EXTERNAL_RELATIONSHIP = "Core.ExternalRelationship";
	public static final String CORE_LIFECYCLE_SCOPED_RELATIONSHIP = "Core.LifecycleScopedRelationship";
	public static final String CORE_EXTERNAL_LIFECYCLE_SCOPED_RELATIONSHIP = "Core.ExternalLifecycleScopedRelationship";
	public static final String SOFTWARE_CONTENT_IDENTIFIER = "Software.ContentIdentifier";
	public static final String SIMPLE_LICENSING_LICENSE_EXPRESSION = "SimpleLicensing.LicenseExpression";
	public static final String SIMPLE_LICENSING_EXTERNAL_LICENSE_EXPRESSION = "SimpleLicensing.ExternalLicenseExpression";
	public static final String SECURITY_VEX_UNDER_INVESTIGATION_VULN_ASSESSMENT_RELATIONSHIP = "Security.VexUnderInvestigationVulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_VEX_UNDER_INVESTIGATION_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalVexUnderInvestigationVulnAssessmentRelationship";
	public static final String SIMPLE_LICENSING_SIMPLE_LICENSING_TEXT = "SimpleLicensing.SimpleLicensingText";
	public static final String SIMPLE_LICENSING_EXTERNAL_SIMPLE_LICENSING_TEXT = "SimpleLicensing.ExternalSimpleLicensingText";
	public static final String EXPANDED_LICENSING_LISTED_LICENSE_EXCEPTION = "ExpandedLicensing.ListedLicenseException";
	public static final String EXPANDED_LICENSING_EXTERNAL_LISTED_LICENSE_EXCEPTION = "ExpandedLicensing.ExternalListedLicenseException";
	public static final String CORE_AGENT = "Core.Agent";
	public static final String CORE_EXTERNAL_AGENT = "Core.ExternalAgent";
	public static final String CORE_RELATIONSHIP_COMPLETENESS = "Core.RelationshipCompleteness";
	public static final String CORE_EXTERNAL_REF_TYPE = "Core.ExternalRefType";
	public static final String CORE_EXTERNAL_MAP = "Core.ExternalMap";
	public static final String CORE_LIFECYCLE_SCOPE_TYPE = "Core.LifecycleScopeType";
	public static final String SECURITY_CVSS_V2_VULN_ASSESSMENT_RELATIONSHIP = "Security.CvssV2VulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_CVSS_V2_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalCvssV2VulnAssessmentRelationship";
	public static final String SECURITY_VEX_FIXED_VULN_ASSESSMENT_RELATIONSHIP = "Security.VexFixedVulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_VEX_FIXED_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalVexFixedVulnAssessmentRelationship";
	public static final String A_I_ENERGY_CONSUMPTION = "AI.EnergyConsumption";
	public static final String BUILD_BUILD = "Build.Build";
	public static final String BUILD_EXTERNAL_BUILD = "Build.ExternalBuild";
	public static final String SOFTWARE_SNIPPET = "Software.Snippet";
	public static final String SOFTWARE_EXTERNAL_SNIPPET = "Software.ExternalSnippet";
	public static final String CORE_SOFTWARE_AGENT = "Core.SoftwareAgent";
	public static final String CORE_EXTERNAL_SOFTWARE_AGENT = "Core.ExternalSoftwareAgent";
	public static final String SOFTWARE_SOFTWARE_PURPOSE = "Software.SoftwarePurpose";
	public static final String SOFTWARE_SBOM_TYPE = "Software.SbomType";
	public static final String EXPANDED_LICENSING_OR_LATER_OPERATOR = "ExpandedLicensing.OrLaterOperator";
	public static final String EXPANDED_LICENSING_EXTERNAL_OR_LATER_OPERATOR = "ExpandedLicensing.ExternalOrLaterOperator";
	public static final String SECURITY_VULNERABILITY = "Security.Vulnerability";
	public static final String SECURITY_EXTERNAL_VULNERABILITY = "Security.ExternalVulnerability";
	public static final String SECURITY_VEX_NOT_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP = "Security.VexNotAffectedVulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_VEX_NOT_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalVexNotAffectedVulnAssessmentRelationship";
	public static final String SECURITY_SSVC_DECISION_TYPE = "Security.SsvcDecisionType";
	public static final String EXPANDED_LICENSING_LICENSE_ADDITION = "ExpandedLicensing.LicenseAddition";
	public static final String EXPANDED_LICENSING_EXTERNAL_LICENSE_ADDITION = "ExpandedLicensing.ExternalLicenseAddition";
	public static final String CORE_NAMESPACE_MAP = "Core.NamespaceMap";
	public static final String CORE_PACKAGE_VERIFICATION_CODE = "Core.PackageVerificationCode";
	public static final String CORE_EXTERNAL_REF = "Core.ExternalRef";
	public static final String CORE_RELATIONSHIP_TYPE = "Core.RelationshipType";
	public static final String EXPANDED_LICENSING_LISTED_LICENSE = "ExpandedLicensing.ListedLicense";
	public static final String EXPANDED_LICENSING_EXTERNAL_LISTED_LICENSE = "ExpandedLicensing.ExternalListedLicense";
	public static final String EXPANDED_LICENSING_CONJUNCTIVE_LICENSE_SET = "ExpandedLicensing.ConjunctiveLicenseSet";
	public static final String EXPANDED_LICENSING_EXTERNAL_CONJUNCTIVE_LICENSE_SET = "ExpandedLicensing.ExternalConjunctiveLicenseSet";
	public static final String SOFTWARE_SPDX_PACKAGE = "Software.SpdxPackage";
	public static final String SOFTWARE_EXTERNAL_SPDX_PACKAGE = "Software.ExternalSpdxPackage";
	public static final String EXPANDED_LICENSING_EXTENDABLE_LICENSE = "ExpandedLicensing.ExtendableLicense";
	public static final String EXPANDED_LICENSING_EXTERNAL_EXTENDABLE_LICENSE = "ExpandedLicensing.ExternalExtendableLicense";
	public static final String DATASET_DATASET_TYPE = "Dataset.DatasetType";
	public static final String EXPANDED_LICENSING_INDIVIDUAL_LICENSING_INFO = "ExpandedLicensing.IndividualLicensingInfo";
	public static final String EXPANDED_LICENSING_EXTERNAL_INDIVIDUAL_LICENSING_INFO = "ExpandedLicensing.ExternalIndividualLicensingInfo";
	public static final String CORE_ELEMENT = "Core.Element";
	public static final String CORE_EXTERNAL_ELEMENT = "Core.ExternalElement";
	public static final String SOFTWARE_SOFTWARE_ARTIFACT = "Software.SoftwareArtifact";
	public static final String SOFTWARE_EXTERNAL_SOFTWARE_ARTIFACT = "Software.ExternalSoftwareArtifact";
	public static final String DATASET_CONFIDENTIALITY_LEVEL_TYPE = "Dataset.ConfidentialityLevelType";
	public static final String CORE_BOM = "Core.Bom";
	public static final String CORE_EXTERNAL_BOM = "Core.ExternalBom";
	public static final String CORE_SUPPORT_TYPE = "Core.SupportType";
	public static final String SIMPLE_LICENSING_ANY_LICENSE_INFO = "SimpleLicensing.AnyLicenseInfo";
	public static final String SIMPLE_LICENSING_EXTERNAL_ANY_LICENSE_INFO = "SimpleLicensing.ExternalAnyLicenseInfo";
	public static final String CORE_SPDX_DOCUMENT = "Core.SpdxDocument";
	public static final String CORE_EXTERNAL_SPDX_DOCUMENT = "Core.ExternalSpdxDocument";
	public static final String SECURITY_SSVC_VULN_ASSESSMENT_RELATIONSHIP = "Security.SsvcVulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_SSVC_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalSsvcVulnAssessmentRelationship";
	public static final String CORE_ARTIFACT = "Core.Artifact";
	public static final String CORE_EXTERNAL_ARTIFACT = "Core.ExternalArtifact";
	public static final String CORE_PROFILE_IDENTIFIER_TYPE = "Core.ProfileIdentifierType";
	public static final String SECURITY_VEX_VULN_ASSESSMENT_RELATIONSHIP = "Security.VexVulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_VEX_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalVexVulnAssessmentRelationship";
	public static final String SECURITY_CVSS_V3_VULN_ASSESSMENT_RELATIONSHIP = "Security.CvssV3VulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_CVSS_V3_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalCvssV3VulnAssessmentRelationship";
	public static final String CORE_ANNOTATION_TYPE = "Core.AnnotationType";
	public static final String EXPANDED_LICENSING_CUSTOM_LICENSE = "ExpandedLicensing.CustomLicense";
	public static final String EXPANDED_LICENSING_EXTERNAL_CUSTOM_LICENSE = "ExpandedLicensing.ExternalCustomLicense";
	public static final String A_I_ENERGY_CONSUMPTION_DESCRIPTION = "AI.EnergyConsumptionDescription";
	public static final String CORE_HASH = "Core.Hash";
	public static final String CORE_TOOL = "Core.Tool";
	public static final String CORE_EXTERNAL_TOOL = "Core.ExternalTool";
	public static final String CORE_NO_ASSERTION_ELEMENT = "Core.NoAssertionElement";
	public static final String CORE_NONE_ELEMENT = "Core.NoneElement";
	public static final String EXPANDED_LICENSING_NO_ASSERTION_LICENSE = "ExpandedLicensing.NoAssertionLicense";
	public static final String EXPANDED_LICENSING_NONE_LICENSE = "ExpandedLicensing.NoneLicense";
	public static final String EXTERNAL_ELEMENT = "Core.ExternalElement";
	public static final String EXTERNAL_CUSTOM_LICENSE = "ExpandedLicensing.ExternalCustomLicense";
	public static final String EXTERNAL_CUSTOM_LICENSE_ADDITION = "ExpandedLicensing.ExternalCustomLicenseAddition";
	
	public static final String[] ALL_SPDX_CLASSES = {CORE_EXTERNAL_IDENTIFIER_TYPE, A_I_ENERGY_UNIT_TYPE, EXTENSION_CDX_PROPERTIES_EXTENSION, 
			EXPANDED_LICENSING_LICENSE, EXPANDED_LICENSING_EXTERNAL_LICENSE, DATASET_DATASET_PACKAGE, 
			DATASET_EXTERNAL_DATASET_PACKAGE, CORE_ELEMENT_COLLECTION, CORE_EXTERNAL_ELEMENT_COLLECTION, 
			SECURITY_VEX_JUSTIFICATION_TYPE, CORE_INTEGRITY_METHOD, CORE_EXTERNAL_IDENTIFIER, 
			CORE_DICTIONARY_ENTRY, CORE_POSITIVE_INTEGER_RANGE, SECURITY_VEX_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_VEX_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP, SECURITY_CVSS_V4_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_CVSS_V4_VULN_ASSESSMENT_RELATIONSHIP, DATASET_DATASET_AVAILABILITY_TYPE, 
			EXPANDED_LICENSING_CUSTOM_LICENSE_ADDITION, EXPANDED_LICENSING_EXTERNAL_CUSTOM_LICENSE_ADDITION, 
			CORE_HASH_ALGORITHM, EXPANDED_LICENSING_DISJUNCTIVE_LICENSE_SET, EXPANDED_LICENSING_EXTERNAL_DISJUNCTIVE_LICENSE_SET, 
			A_I_A_I_PACKAGE, A_I_EXTERNAL_A_I_PACKAGE, SOFTWARE_SPDX_FILE, SOFTWARE_EXTERNAL_SPDX_FILE, 
			CORE_PERSON, CORE_EXTERNAL_PERSON, SECURITY_CVSS_SEVERITY_TYPE, CORE_CREATION_INFO, 
			CORE_BUNDLE, CORE_EXTERNAL_BUNDLE, SECURITY_EXPLOIT_CATALOG_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_EXPLOIT_CATALOG_VULN_ASSESSMENT_RELATIONSHIP, CORE_PRESENCE_TYPE, 
			SECURITY_EXPLOIT_CATALOG_TYPE, SECURITY_VULN_ASSESSMENT_RELATIONSHIP, SECURITY_EXTERNAL_VULN_ASSESSMENT_RELATIONSHIP, 
			CORE_ORGANIZATION, CORE_EXTERNAL_ORGANIZATION, A_I_SAFETY_RISK_ASSESSMENT_TYPE, 
			EXTENSION_EXTENSION, SOFTWARE_SBOM, SOFTWARE_EXTERNAL_SBOM, EXPANDED_LICENSING_WITH_ADDITION_OPERATOR, 
			EXPANDED_LICENSING_EXTERNAL_WITH_ADDITION_OPERATOR, SOFTWARE_FILE_KIND_TYPE, 
			EXTENSION_CDX_PROPERTY_ENTRY, SOFTWARE_CONTENT_IDENTIFIER_TYPE, SECURITY_EPSS_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_EPSS_VULN_ASSESSMENT_RELATIONSHIP, CORE_ANNOTATION, CORE_EXTERNAL_ANNOTATION, 
			CORE_RELATIONSHIP, CORE_EXTERNAL_RELATIONSHIP, CORE_LIFECYCLE_SCOPED_RELATIONSHIP, 
			CORE_EXTERNAL_LIFECYCLE_SCOPED_RELATIONSHIP, SOFTWARE_CONTENT_IDENTIFIER, 
			SIMPLE_LICENSING_LICENSE_EXPRESSION, SIMPLE_LICENSING_EXTERNAL_LICENSE_EXPRESSION, 
			SECURITY_VEX_UNDER_INVESTIGATION_VULN_ASSESSMENT_RELATIONSHIP, SECURITY_EXTERNAL_VEX_UNDER_INVESTIGATION_VULN_ASSESSMENT_RELATIONSHIP, 
			SIMPLE_LICENSING_SIMPLE_LICENSING_TEXT, SIMPLE_LICENSING_EXTERNAL_SIMPLE_LICENSING_TEXT, 
			EXPANDED_LICENSING_LISTED_LICENSE_EXCEPTION, EXPANDED_LICENSING_EXTERNAL_LISTED_LICENSE_EXCEPTION, 
			CORE_AGENT, CORE_EXTERNAL_AGENT, CORE_RELATIONSHIP_COMPLETENESS, CORE_EXTERNAL_REF_TYPE, 
			CORE_EXTERNAL_MAP, CORE_LIFECYCLE_SCOPE_TYPE, SECURITY_CVSS_V2_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_CVSS_V2_VULN_ASSESSMENT_RELATIONSHIP, SECURITY_VEX_FIXED_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_VEX_FIXED_VULN_ASSESSMENT_RELATIONSHIP, A_I_ENERGY_CONSUMPTION, 
			BUILD_BUILD, BUILD_EXTERNAL_BUILD, SOFTWARE_SNIPPET, SOFTWARE_EXTERNAL_SNIPPET, 
			CORE_SOFTWARE_AGENT, CORE_EXTERNAL_SOFTWARE_AGENT, SOFTWARE_SOFTWARE_PURPOSE, 
			SOFTWARE_SBOM_TYPE, EXPANDED_LICENSING_OR_LATER_OPERATOR, EXPANDED_LICENSING_EXTERNAL_OR_LATER_OPERATOR, 
			SECURITY_VULNERABILITY, SECURITY_EXTERNAL_VULNERABILITY, SECURITY_VEX_NOT_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_VEX_NOT_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP, SECURITY_SSVC_DECISION_TYPE, 
			EXPANDED_LICENSING_LICENSE_ADDITION, EXPANDED_LICENSING_EXTERNAL_LICENSE_ADDITION, 
			CORE_NAMESPACE_MAP, CORE_PACKAGE_VERIFICATION_CODE, CORE_EXTERNAL_REF, 
			CORE_RELATIONSHIP_TYPE, EXPANDED_LICENSING_LISTED_LICENSE, EXPANDED_LICENSING_EXTERNAL_LISTED_LICENSE, 
			EXPANDED_LICENSING_CONJUNCTIVE_LICENSE_SET, EXPANDED_LICENSING_EXTERNAL_CONJUNCTIVE_LICENSE_SET, 
			SOFTWARE_SPDX_PACKAGE, SOFTWARE_EXTERNAL_SPDX_PACKAGE, EXPANDED_LICENSING_EXTENDABLE_LICENSE, 
			EXPANDED_LICENSING_EXTERNAL_EXTENDABLE_LICENSE, DATASET_DATASET_TYPE, EXPANDED_LICENSING_INDIVIDUAL_LICENSING_INFO, 
			EXPANDED_LICENSING_EXTERNAL_INDIVIDUAL_LICENSING_INFO, CORE_ELEMENT, CORE_EXTERNAL_ELEMENT, 
			SOFTWARE_SOFTWARE_ARTIFACT, SOFTWARE_EXTERNAL_SOFTWARE_ARTIFACT, DATASET_CONFIDENTIALITY_LEVEL_TYPE, 
			CORE_BOM, CORE_EXTERNAL_BOM, CORE_SUPPORT_TYPE, SIMPLE_LICENSING_ANY_LICENSE_INFO, 
			SIMPLE_LICENSING_EXTERNAL_ANY_LICENSE_INFO, CORE_SPDX_DOCUMENT, CORE_EXTERNAL_SPDX_DOCUMENT, 
			SECURITY_SSVC_VULN_ASSESSMENT_RELATIONSHIP, SECURITY_EXTERNAL_SSVC_VULN_ASSESSMENT_RELATIONSHIP, 
			CORE_ARTIFACT, CORE_EXTERNAL_ARTIFACT, CORE_PROFILE_IDENTIFIER_TYPE, SECURITY_VEX_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_VEX_VULN_ASSESSMENT_RELATIONSHIP, SECURITY_CVSS_V3_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_CVSS_V3_VULN_ASSESSMENT_RELATIONSHIP, CORE_ANNOTATION_TYPE, 
			EXPANDED_LICENSING_CUSTOM_LICENSE, EXPANDED_LICENSING_EXTERNAL_CUSTOM_LICENSE, 
			A_I_ENERGY_CONSUMPTION_DESCRIPTION, CORE_HASH, CORE_TOOL, CORE_EXTERNAL_TOOL, 
			CORE_NO_ASSERTION_ELEMENT, CORE_NONE_ELEMENT, EXPANDED_LICENSING_NO_ASSERTION_LICENSE, 
			EXPANDED_LICENSING_NONE_LICENSE, EXTERNAL_ELEMENT, EXTERNAL_CUSTOM_LICENSE, 
			EXTERNAL_CUSTOM_LICENSE_ADDITION};
}
