/**
 * SPDX-FileCopyrightText: Copyright (c)  Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3;

import org.spdx.storage.PropertyDescriptor;

/**
 * Constants which map to the SPDX specifications
 * @author Gary O'Neall
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
	
	public static final String MODEL_SPEC_VERSION = "3.1.0";
	
	// Date format - NOTE: This format does not handle milliseconds.  Use Instant.parse for full ISO 8601 parsing
	public static final String SPDX_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
	
	public static final String SPDX_LISTED_LICENSE_NAMESPACE = "http://spdx.org/licenses/";
	
	
	/**
	 * AI namespace
	 */
	public static final String A_I_NAMESPACE = "https://spdx.org/rdf/3.1/terms/AI/";
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
	public static final String BUILD_NAMESPACE = "https://spdx.org/rdf/3.1/terms/Build/";
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
	public static final String CORE_NAMESPACE = "https://spdx.org/rdf/3.1/terms/Core/";
	public static final PropertyDescriptor PROP_ACTION_END_TIME = new PropertyDescriptor("actionEndTime", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_ACTION_LOCATION = new PropertyDescriptor("actionLocation", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_ACTION_START_TIME = new PropertyDescriptor("actionStartTime", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_ADDITIONAL_INFORMATION = new PropertyDescriptor("additionalInformation", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_ALGORITHM = new PropertyDescriptor("algorithm", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_ANNOTATION_TYPE = new PropertyDescriptor("annotationType", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_BEGIN_INTEGER_RANGE = new PropertyDescriptor("beginIntegerRange", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_BUILT_TIME = new PropertyDescriptor("builtTime", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_CITY = new PropertyDescriptor("city", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_COMMENT = new PropertyDescriptor("comment", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_COMPLETENESS = new PropertyDescriptor("completeness", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_CONTACT_TYPE = new PropertyDescriptor("contactType", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_CONTENT_TYPE = new PropertyDescriptor("contentType", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_CONTEXT = new PropertyDescriptor("context", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_COUNTRY = new PropertyDescriptor("country", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_COUNTY_CODE = new PropertyDescriptor("countyCode", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_CREATED = new PropertyDescriptor("created", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_CREATED_BY = new PropertyDescriptor("createdBy", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_CREATED_USING = new PropertyDescriptor("createdUsing", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_CREATION_INFO = new PropertyDescriptor("creationInfo", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_DATA_LICENSE = new PropertyDescriptor("dataLicense", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_DEFINING_ARTIFACT = new PropertyDescriptor("definingArtifact", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_DEFINITION_SOURCE = new PropertyDescriptor("definitionSource", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_DESCRIPTION = new PropertyDescriptor("description", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_DEV_LIFECYCLE_STAGE = new PropertyDescriptor("devLifecycleStage", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_ELEMENT = new PropertyDescriptor("element", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_ELEMENT_VALUE = new PropertyDescriptor("elementValue", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_END_INTEGER_RANGE = new PropertyDescriptor("endIntegerRange", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_END_TIME = new PropertyDescriptor("endTime", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_EXTENSION = new PropertyDescriptor("extension", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_EXTERNAL_IDENTIFIER = new PropertyDescriptor("externalIdentifier", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_EXTERNAL_IDENTIFIER_TYPE = new PropertyDescriptor("externalIdentifierType", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_EXTERNAL_REF = new PropertyDescriptor("externalRef", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_EXTERNAL_REF_TYPE = new PropertyDescriptor("externalRefType", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_EXTERNAL_SPDX_ID = new PropertyDescriptor("externalSpdxId", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_FROM = new PropertyDescriptor("from", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_GEOGRAPHIC_POINT_LOCATION = new PropertyDescriptor("geographicPointLocation", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_HASH_VALUE = new PropertyDescriptor("hashValue", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_HEADQUARTERS_LOCATION = new PropertyDescriptor("headquartersLocation", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_IDENTIFIER = new PropertyDescriptor("identifier", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_IDENTIFIER_LOCATOR = new PropertyDescriptor("identifierLocator", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_SPDX_IMPORT = new PropertyDescriptor("import", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_IN_LANGUAGE = new PropertyDescriptor("inLanguage", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_INTENDED_USE = new PropertyDescriptor("intendedUse", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_ISO_AUTOMATION_LEVEL = new PropertyDescriptor("isoAutomationLevel", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_ISSUING_AUTHORITY = new PropertyDescriptor("issuingAuthority", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_KEY = new PropertyDescriptor("key", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_LOCATION_HINT = new PropertyDescriptor("locationHint", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_LOCATION_TIME = new PropertyDescriptor("locationTime", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_LOCATOR = new PropertyDescriptor("locator", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_NAME = new PropertyDescriptor("name", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_NAMESPACE = new PropertyDescriptor("namespace", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_NAMESPACE_MAP = new PropertyDescriptor("namespaceMap", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_ORIGINATED_BY = new PropertyDescriptor("originatedBy", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE = new PropertyDescriptor("packageVerificationCodeExcludedFile", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_POST_OFFICE_BOX_NUMBER = new PropertyDescriptor("postOfficeBoxNumber", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_POSTAL_CODE = new PropertyDescriptor("postalCode", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_POSTAL_NAME = new PropertyDescriptor("postalName", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_PREFIX = new PropertyDescriptor("prefix", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_PROCESS_RATIONALE = new PropertyDescriptor("processRationale", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_PROCESS_READINESS = new PropertyDescriptor("processReadiness", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_PROCESS_VERSION = new PropertyDescriptor("processVersion", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_PROFILE_CONFORMANCE = new PropertyDescriptor("profileConformance", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_PROVINCE_STATE_CODE = new PropertyDescriptor("provinceStateCode", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_QUANTITY = new PropertyDescriptor("quantity", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_RELATIONSHIP_TYPE = new PropertyDescriptor("relationshipType", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_RELEASE_TIME = new PropertyDescriptor("releaseTime", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_REQUIREMENT_RATIONALE = new PropertyDescriptor("requirementRationale", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_REQUIREMENT_STATEMENT = new PropertyDescriptor("requirementStatement", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_REQUIREMENT_U_U_I_D = new PropertyDescriptor("requirementUUID", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_ROOT_ELEMENT = new PropertyDescriptor("rootElement", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_SCOPE = new PropertyDescriptor("scope", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_SPEC_TYPE = new PropertyDescriptor("specType", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_SPEC_VERSION = new PropertyDescriptor("specVersion", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_STANDARD_NAME = new PropertyDescriptor("standardName", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_START_TIME = new PropertyDescriptor("startTime", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_STATEMENT = new PropertyDescriptor("statement", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_STREET_ADDRESS = new PropertyDescriptor("streetAddress", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_SUBJECT = new PropertyDescriptor("subject", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_SUMMARY = new PropertyDescriptor("summary", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_SUPPLIED_BY = new PropertyDescriptor("suppliedBy", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_SUPPORT_LEVEL = new PropertyDescriptor("supportLevel", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_TO = new PropertyDescriptor("to", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_TYPE_FROM_SOURCE = new PropertyDescriptor("typeFromSource", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_UNIT_Q_U_D_T = new PropertyDescriptor("unitQUDT", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_VALID_UNTIL_TIME = new PropertyDescriptor("validUntilTime", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_VALUE = new PropertyDescriptor("value", CORE_NAMESPACE);
	public static final PropertyDescriptor PROP_VERIFIED_USING = new PropertyDescriptor("verifiedUsing", CORE_NAMESPACE);
	
	/**
	 * Dataset namespace
	 */
	public static final String DATASET_NAMESPACE = "https://spdx.org/rdf/3.1/terms/Dataset/";
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
	public static final PropertyDescriptor PROP_DATASET_INTENDED_USE = new PropertyDescriptor("intendedUse", DATASET_NAMESPACE);
	public static final PropertyDescriptor PROP_KNOWN_BIAS = new PropertyDescriptor("knownBias", DATASET_NAMESPACE);
	public static final PropertyDescriptor PROP_SENSOR = new PropertyDescriptor("sensor", DATASET_NAMESPACE);
	
	/**
	 * ExpandedLicensing namespace
	 */
	public static final String EXPANDED_LICENSING_NAMESPACE = "https://spdx.org/rdf/3.1/terms/ExpandedLicensing/";
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
	public static final String EXTENSION_NAMESPACE = "https://spdx.org/rdf/3.1/terms/Extension/";
	public static final PropertyDescriptor PROP_CDX_PROP_NAME = new PropertyDescriptor("cdxPropName", EXTENSION_NAMESPACE);
	public static final PropertyDescriptor PROP_CDX_PROP_VALUE = new PropertyDescriptor("cdxPropValue", EXTENSION_NAMESPACE);
	public static final PropertyDescriptor PROP_CDX_PROPERTY = new PropertyDescriptor("cdxProperty", EXTENSION_NAMESPACE);
	
	/**
	 * FunctionalSafety namespace
	 */
	public static final String FUNCTIONAL_SAFETY_NAMESPACE = "https://spdx.org/rdf/3.1/terms/FunctionalSafety/";
	public static final PropertyDescriptor PROP_EVALUATION = new PropertyDescriptor("evaluation", FUNCTIONAL_SAFETY_NAMESPACE);
	public static final PropertyDescriptor PROP_EVALUATION_BASED_ON = new PropertyDescriptor("evaluationBasedOn", FUNCTIONAL_SAFETY_NAMESPACE);
	public static final PropertyDescriptor PROP_EVALUATION_RATIONALE = new PropertyDescriptor("evaluationRationale", FUNCTIONAL_SAFETY_NAMESPACE);
	public static final PropertyDescriptor PROP_EVIDENCE_CATEGORY = new PropertyDescriptor("evidenceCategory", FUNCTIONAL_SAFETY_NAMESPACE);
	public static final PropertyDescriptor PROP_EVIDENCE_U_U_I_D = new PropertyDescriptor("evidenceUUID", FUNCTIONAL_SAFETY_NAMESPACE);
	public static final PropertyDescriptor PROP_VERIFICATION_METHOD = new PropertyDescriptor("verificationMethod", FUNCTIONAL_SAFETY_NAMESPACE);
	public static final PropertyDescriptor PROP_VERIFICATION_POSTCONDITION = new PropertyDescriptor("verificationPostcondition", FUNCTIONAL_SAFETY_NAMESPACE);
	public static final PropertyDescriptor PROP_VERIFICATION_PRECONDITION = new PropertyDescriptor("verificationPrecondition", FUNCTIONAL_SAFETY_NAMESPACE);
	public static final PropertyDescriptor PROP_VERIFICATION_RATIONALE = new PropertyDescriptor("verificationRationale", FUNCTIONAL_SAFETY_NAMESPACE);
	public static final PropertyDescriptor PROP_VERIFICATION_U_U_I_D = new PropertyDescriptor("verificationUUID", FUNCTIONAL_SAFETY_NAMESPACE);
	
	/**
	 * Hardware namespace
	 */
	public static final String HARDWARE_NAMESPACE = "https://spdx.org/rdf/3.1/terms/Hardware/";
	public static final PropertyDescriptor PROP_HARDWARE_ADDITIONAL_INFORMATION = new PropertyDescriptor("additionalInformation", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_ADDITIONAL_INFORMATION_SPECIFICATION = new PropertyDescriptor("additionalInformationSpecification", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_BATCH_NUMBER = new PropertyDescriptor("batchNumber", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_BULK_QUANTITY = new PropertyDescriptor("bulkQuantity", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_CATEGORY = new PropertyDescriptor("category", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_CENTER_OF_MASS = new PropertyDescriptor("centerOfMass", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_DIMENSIONS = new PropertyDescriptor("dimensions", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_HARDWARE_VERSION = new PropertyDescriptor("hardwareVersion", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_HAZARD = new PropertyDescriptor("hazard", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_ITEM_VERSION = new PropertyDescriptor("itemVersion", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_MASS_OF_HARDWARE = new PropertyDescriptor("massOfHardware", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_PART_NUMBER = new PropertyDescriptor("partNumber", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_PRODUCT_AGENT = new PropertyDescriptor("productAgent", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_RELEASE_DATE = new PropertyDescriptor("releaseDate", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_SERIAL_NUMBER = new PropertyDescriptor("serialNumber", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_VIRTUAL_HARDWARE_MODEL = new PropertyDescriptor("virtualHardwareModel", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_X_AXIS_LENGTH = new PropertyDescriptor("xAxisLength", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_Y_AXIS_LENGTH = new PropertyDescriptor("yAxisLength", HARDWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_Z_AXIS_LENGTH = new PropertyDescriptor("zAxisLength", HARDWARE_NAMESPACE);
	
	/**
	 * Operations namespace
	 */
	public static final String OPERATIONS_NAMESPACE = "https://spdx.org/rdf/3.1/terms/Operations/";
	public static final PropertyDescriptor PROP_ASSESSED_ELEMENT = new PropertyDescriptor("assessedElement", OPERATIONS_NAMESPACE);
	public static final PropertyDescriptor PROP_ASSESSMENT_CONTEXT = new PropertyDescriptor("assessmentContext", OPERATIONS_NAMESPACE);
	public static final PropertyDescriptor PROP_ASSESSMENT_RESULT = new PropertyDescriptor("assessmentResult", OPERATIONS_NAMESPACE);
	public static final PropertyDescriptor PROP_ASSESSMENT_TIMESTAMP = new PropertyDescriptor("assessmentTimestamp", OPERATIONS_NAMESPACE);
	public static final PropertyDescriptor PROP_ASSESSOR = new PropertyDescriptor("assessor", OPERATIONS_NAMESPACE);
	public static final PropertyDescriptor PROP_EXPORT_CLASSIFICATION = new PropertyDescriptor("exportClassification", OPERATIONS_NAMESPACE);
	public static final PropertyDescriptor PROP_EXPORT_CONTROL_SPECIFICATION = new PropertyDescriptor("exportControlSpecification", OPERATIONS_NAMESPACE);
	public static final PropertyDescriptor PROP_EXPORTING_COUNTRY = new PropertyDescriptor("exportingCountry", OPERATIONS_NAMESPACE);
	public static final PropertyDescriptor PROP_PROJECT_CONTRACT = new PropertyDescriptor("projectContract", OPERATIONS_NAMESPACE);
	public static final PropertyDescriptor PROP_PROJECT_END_TIME = new PropertyDescriptor("projectEndTime", OPERATIONS_NAMESPACE);
	public static final PropertyDescriptor PROP_PROJECT_OWNER = new PropertyDescriptor("projectOwner", OPERATIONS_NAMESPACE);
	public static final PropertyDescriptor PROP_PROJECT_SPONSOR = new PropertyDescriptor("projectSponsor", OPERATIONS_NAMESPACE);
	public static final PropertyDescriptor PROP_PROJECT_START_TIME = new PropertyDescriptor("projectStartTime", OPERATIONS_NAMESPACE);
	public static final PropertyDescriptor PROP_PROJECT_TITLE = new PropertyDescriptor("projectTitle", OPERATIONS_NAMESPACE);
	public static final PropertyDescriptor PROP_WEIGHT = new PropertyDescriptor("weight", OPERATIONS_NAMESPACE);
	
	/**
	 * Security namespace
	 */
	public static final String SECURITY_NAMESPACE = "https://spdx.org/rdf/3.1/terms/Security/";
	public static final PropertyDescriptor PROP_ACTION_STATEMENT = new PropertyDescriptor("actionStatement", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_ACTION_STATEMENT_TIME = new PropertyDescriptor("actionStatementTime", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_SECURITY_ASSESSED_ELEMENT = new PropertyDescriptor("assessedElement", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_CATALOG_TYPE = new PropertyDescriptor("catalogType", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_DECISION_TYPE = new PropertyDescriptor("decisionType", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_EXPLOITED = new PropertyDescriptor("exploited", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_IMPACT_STATEMENT = new PropertyDescriptor("impactStatement", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_IMPACT_STATEMENT_TIME = new PropertyDescriptor("impactStatementTime", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_JUSTIFICATION_TYPE = new PropertyDescriptor("justificationType", SECURITY_NAMESPACE);
	public static final PropertyDescriptor PROP_SECURITY_LOCATOR = new PropertyDescriptor("locator", SECURITY_NAMESPACE);
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
	 * Service namespace
	 */
	public static final String SERVICE_NAMESPACE = "https://spdx.org/rdf/3.1/terms/Service/";
	public static final PropertyDescriptor PROP_PROVIDER = new PropertyDescriptor("provider", SERVICE_NAMESPACE);
	public static final PropertyDescriptor PROP_SERVER_AUTHENTICATION_PROTOCOL = new PropertyDescriptor("serverAuthenticationProtocol", SERVICE_NAMESPACE);
	public static final PropertyDescriptor PROP_SERVICE_HOSTING_COUNTRY = new PropertyDescriptor("serviceHostingCountry", SERVICE_NAMESPACE);
	
	/**
	 * SimpleLicensing namespace
	 */
	public static final String SIMPLE_LICENSING_NAMESPACE = "https://spdx.org/rdf/3.1/terms/SimpleLicensing/";
	public static final PropertyDescriptor PROP_CUSTOM_ID_TO_LICENSE = new PropertyDescriptor("customIdToLicense", SIMPLE_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_CUSTOM_ID_TO_URI = new PropertyDescriptor("customIdToUri", SIMPLE_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_LICENSE_EXPRESSION = new PropertyDescriptor("licenseExpression", SIMPLE_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_LICENSE_LIST_VERSION = new PropertyDescriptor("licenseListVersion", SIMPLE_LICENSING_NAMESPACE);
	public static final PropertyDescriptor PROP_LICENSE_TEXT = new PropertyDescriptor("licenseText", SIMPLE_LICENSING_NAMESPACE);
	
	/**
	 * Software namespace
	 */
	public static final String SOFTWARE_NAMESPACE = "https://spdx.org/rdf/3.1/terms/Software/";
	public static final PropertyDescriptor PROP_ADDITIONAL_PURPOSE = new PropertyDescriptor("additionalPurpose", SOFTWARE_NAMESPACE);
	public static final PropertyDescriptor PROP_ARTIFACT_SIZE = new PropertyDescriptor("artifactSize", SOFTWARE_NAMESPACE);
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
	
	/**
	 * SupplyChain namespace
	 */
	public static final String SUPPLY_CHAIN_NAMESPACE = "https://spdx.org/rdf/3.1/terms/SupplyChain/";
	public static final PropertyDescriptor PROP_BOUNDARY_PARAMETER = new PropertyDescriptor("boundaryParameter", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_CURRENT = new PropertyDescriptor("current", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_CURRENT_STATE = new PropertyDescriptor("currentState", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_DECISION_PROCESS = new PropertyDescriptor("decisionProcess", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_DESTRUCTION_PERFORMED_BY = new PropertyDescriptor("destructionPerformedBy", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_DROPOFF_LOCATION = new PropertyDescriptor("dropoffLocation", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_FOR_DROPOFF_LOCATION = new PropertyDescriptor("forDropoffLocation", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_FOR_PICKUP_LOCATION = new PropertyDescriptor("forPickupLocation", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_PICKUP_LOCATION = new PropertyDescriptor("pickupLocation", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_PLANNED_CURRENT = new PropertyDescriptor("plannedCurrent", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_PLANNED_INSPECTION_LOCATION = new PropertyDescriptor("plannedInspectionLocation", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_PLANNED_PREVIOUS = new PropertyDescriptor("plannedPrevious", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_PLANNED_PRODUCT_OF_RESPONSIBILITY_CHANGE = new PropertyDescriptor("plannedProductOfResponsibilityChange", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_PLANNED_STORAGE_LOCATION = new PropertyDescriptor("plannedStorageLocation", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_PLANNED_TRANSPORT_ROUTES = new PropertyDescriptor("plannedTransportRoutes", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_PREVIOUS = new PropertyDescriptor("previous", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_RESPONSIBILITY_CATEGORY = new PropertyDescriptor("responsibilityCategory", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_RESPONSIBILITY_CHANGED_ON = new PropertyDescriptor("responsibilityChangedOn", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_TRANSPORT_ROUTE = new PropertyDescriptor("transportRoute", SUPPLY_CHAIN_NAMESPACE);
	public static final PropertyDescriptor PROP_VALID_STATE = new PropertyDescriptor("validState", SUPPLY_CHAIN_NAMESPACE);
	
	// class types
	public static final String SOFTWARE_SOFTWARE_ARTIFACT = "Software.SoftwareArtifact";
	public static final String SOFTWARE_EXTERNAL_SOFTWARE_ARTIFACT = "Software.ExternalSoftwareArtifact";
	public static final String HARDWARE_DIMENSIONS = "Hardware.Dimensions";
	public static final String EXPANDED_LICENSING_LICENSE_ADDITION = "ExpandedLicensing.LicenseAddition";
	public static final String EXPANDED_LICENSING_EXTERNAL_LICENSE_ADDITION = "ExpandedLicensing.ExternalLicenseAddition";
	public static final String CORE_REGULATION = "Core.Regulation";
	public static final String CORE_EXTERNAL_REGULATION = "Core.ExternalRegulation";
	public static final String A_I_A_I_PACKAGE = "AI.AIPackage";
	public static final String A_I_EXTERNAL_A_I_PACKAGE = "AI.ExternalAIPackage";
	public static final String SUPPLY_CHAIN_CHANGE_PROCESS = "SupplyChain.ChangeProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_CHANGE_PROCESS = "SupplyChain.ExternalChangeProcess";
	public static final String SUPPLY_CHAIN_TEST_PROCESS = "SupplyChain.TestProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_TEST_PROCESS = "SupplyChain.ExternalTestProcess";
	public static final String EXPANDED_LICENSING_LISTED_LICENSE_EXCEPTION = "ExpandedLicensing.ListedLicenseException";
	public static final String EXPANDED_LICENSING_EXTERNAL_LISTED_LICENSE_EXCEPTION = "ExpandedLicensing.ExternalListedLicenseException";
	public static final String EXPANDED_LICENSING_EXTENDABLE_LICENSE = "ExpandedLicensing.ExtendableLicense";
	public static final String EXPANDED_LICENSING_EXTERNAL_EXTENDABLE_LICENSE = "ExpandedLicensing.ExternalExtendableLicense";
	public static final String SERVICE_SOFTWARE_SERVICE = "Service.SoftwareService";
	public static final String SERVICE_EXTERNAL_SOFTWARE_SERVICE = "Service.ExternalSoftwareService";
	public static final String EXPANDED_LICENSING_LISTED_LICENSE = "ExpandedLicensing.ListedLicense";
	public static final String EXPANDED_LICENSING_EXTERNAL_LISTED_LICENSE = "ExpandedLicensing.ExternalListedLicense";
	public static final String EXPANDED_LICENSING_CUSTOM_LICENSE = "ExpandedLicensing.CustomLicense";
	public static final String EXPANDED_LICENSING_EXTERNAL_CUSTOM_LICENSE = "ExpandedLicensing.ExternalCustomLicense";
	public static final String CORE_SOFTWARE_AGENT = "Core.SoftwareAgent";
	public static final String CORE_EXTERNAL_SOFTWARE_AGENT = "Core.ExternalSoftwareAgent";
	public static final String FUNCTIONAL_SAFETY_EVALUATION_RESULT_TYPE = "FunctionalSafety.EvaluationResultType";
	public static final String CORE_EXTERNAL_IDENTIFIER_TYPE = "Core.ExternalIdentifierType";
	public static final String SUPPLY_CHAIN_HARVEST_PROCESS = "SupplyChain.HarvestProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_HARVEST_PROCESS = "SupplyChain.ExternalHarvestProcess";
	public static final String CORE_RELATIONSHIP_TYPE = "Core.RelationshipType";
	public static final String SECURITY_VULNERABILITY = "Security.Vulnerability";
	public static final String SECURITY_EXTERNAL_VULNERABILITY = "Security.ExternalVulnerability";
	public static final String CORE_EXTERNAL_REF = "Core.ExternalRef";
	public static final String SUPPLY_CHAIN_STATE_ACTION = "SupplyChain.StateAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_STATE_ACTION = "SupplyChain.ExternalStateAction";
	public static final String CORE_TOOL = "Core.Tool";
	public static final String CORE_EXTERNAL_TOOL = "Core.ExternalTool";
	public static final String SIMPLE_LICENSING_ANY_LICENSE_INFO = "SimpleLicensing.AnyLicenseInfo";
	public static final String SIMPLE_LICENSING_EXTERNAL_ANY_LICENSE_INFO = "SimpleLicensing.ExternalAnyLicenseInfo";
	public static final String FUNCTIONAL_SAFETY_VERIFICATION_TYPE = "FunctionalSafety.VerificationType";
	public static final String CORE_ISO_AUTOMATION_LEVEL = "Core.IsoAutomationLevel";
	public static final String SUPPLY_CHAIN_CHANGE_ACTION = "SupplyChain.ChangeAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_CHANGE_ACTION = "SupplyChain.ExternalChangeAction";
	public static final String CORE_MEASURE_OF_MASS = "Core.MeasureOfMass";
	public static final String SECURITY_CVSS_V4_VULN_ASSESSMENT_RELATIONSHIP = "Security.CvssV4VulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_CVSS_V4_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalCvssV4VulnAssessmentRelationship";
	public static final String SUPPLY_CHAIN_RESOLUTION_ACTION = "SupplyChain.ResolutionAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_RESOLUTION_ACTION = "SupplyChain.ExternalResolutionAction";
	public static final String SECURITY_VEX_FIXED_VULN_ASSESSMENT_RELATIONSHIP = "Security.VexFixedVulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_VEX_FIXED_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalVexFixedVulnAssessmentRelationship";
	public static final String SOFTWARE_SPDX_PACKAGE = "Software.SpdxPackage";
	public static final String SOFTWARE_EXTERNAL_SPDX_PACKAGE = "Software.ExternalSpdxPackage";
	public static final String SUPPLY_CHAIN_RESPONSIBILITY_CHANGE_PROCESS = "SupplyChain.ResponsibilityChangeProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_RESPONSIBILITY_CHANGE_PROCESS = "SupplyChain.ExternalResponsibilityChangeProcess";
	public static final String CORE_SUPPORT_TYPE = "Core.SupportType";
	public static final String HARDWARE_BULK_HARDWARE = "Hardware.BulkHardware";
	public static final String HARDWARE_EXTERNAL_BULK_HARDWARE = "Hardware.ExternalBulkHardware";
	public static final String CORE_PROCESS_READINESS_TYPE = "Core.ProcessReadinessType";
	public static final String CORE_CREATION_INFO = "Core.CreationInfo";
	public static final String A_I_SAFETY_RISK_ASSESSMENT_TYPE = "AI.SafetyRiskAssessmentType";
	public static final String SECURITY_VEX_VULN_ASSESSMENT_RELATIONSHIP = "Security.VexVulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_VEX_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalVexVulnAssessmentRelationship";
	public static final String SECURITY_CVSS_V3_VULN_ASSESSMENT_RELATIONSHIP = "Security.CvssV3VulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_CVSS_V3_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalCvssV3VulnAssessmentRelationship";
	public static final String SUPPLY_CHAIN_INSTANTIATE_VIRTUAL_HARDWARE_PROCESS = "SupplyChain.InstantiateVirtualHardwareProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_INSTANTIATE_VIRTUAL_HARDWARE_PROCESS = "SupplyChain.ExternalInstantiateVirtualHardwareProcess";
	public static final String A_I_ENERGY_CONSUMPTION = "AI.EnergyConsumption";
	public static final String DATASET_CONFIDENTIALITY_LEVEL_TYPE = "Dataset.ConfidentialityLevelType";
	public static final String EXPANDED_LICENSING_CONJUNCTIVE_LICENSE_SET = "ExpandedLicensing.ConjunctiveLicenseSet";
	public static final String EXPANDED_LICENSING_EXTERNAL_CONJUNCTIVE_LICENSE_SET = "ExpandedLicensing.ExternalConjunctiveLicenseSet";
	public static final String CORE_HASH = "Core.Hash";
	public static final String SUPPLY_CHAIN_TEST_ACTION = "SupplyChain.TestAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_TEST_ACTION = "SupplyChain.ExternalTestAction";
	public static final String SECURITY_VULN_ASSESSMENT_RELATIONSHIP = "Security.VulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalVulnAssessmentRelationship";
	public static final String SUPPLY_CHAIN_USE_ACTION = "SupplyChain.UseAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_USE_ACTION = "SupplyChain.ExternalUseAction";
	public static final String SUPPLY_CHAIN_INSPECTION_ACTION = "SupplyChain.InspectionAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_INSPECTION_ACTION = "SupplyChain.ExternalInspectionAction";
	public static final String CORE_AGENT = "Core.Agent";
	public static final String CORE_EXTERNAL_AGENT = "Core.ExternalAgent";
	public static final String SERVICE_AUTHENTICATION_PROTOCOL_TYPE = "Service.AuthenticationProtocolType";
	public static final String DATASET_DATASET_AVAILABILITY_TYPE = "Dataset.DatasetAvailabilityType";
	public static final String SUPPLY_CHAIN_INSPECTION_PROCESS = "SupplyChain.InspectionProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_INSPECTION_PROCESS = "SupplyChain.ExternalInspectionProcess";
	public static final String CORE_ANNOTATION = "Core.Annotation";
	public static final String CORE_EXTERNAL_ANNOTATION = "Core.ExternalAnnotation";
	public static final String CORE_ELEMENT = "Core.Element";
	public static final String CORE_EXTERNAL_ELEMENT = "Core.ExternalElement";
	public static final String HARDWARE_PHYSICAL_HARDWARE = "Hardware.PhysicalHardware";
	public static final String HARDWARE_EXTERNAL_PHYSICAL_HARDWARE = "Hardware.ExternalPhysicalHardware";
	public static final String SUPPLY_CHAIN_STATE = "SupplyChain.State";
	public static final String SUPPLY_CHAIN_EXTERNAL_STATE = "SupplyChain.ExternalState";
	public static final String HARDWARE_HARDWARE = "Hardware.Hardware";
	public static final String HARDWARE_EXTERNAL_HARDWARE = "Hardware.ExternalHardware";
	public static final String SUPPLY_CHAIN_BOUNDARY_DEFINITION_ACTION = "SupplyChain.BoundaryDefinitionAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_BOUNDARY_DEFINITION_ACTION = "SupplyChain.ExternalBoundaryDefinitionAction";
	public static final String SUPPLY_CHAIN_CREATE_PROCESS = "SupplyChain.CreateProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_CREATE_PROCESS = "SupplyChain.ExternalCreateProcess";
	public static final String SUPPLY_CHAIN_PLAN_PROCESS = "SupplyChain.PlanProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_PLAN_PROCESS = "SupplyChain.ExternalPlanProcess";
	public static final String SECURITY_EPSS_VULN_ASSESSMENT_RELATIONSHIP = "Security.EpssVulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_EPSS_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalEpssVulnAssessmentRelationship";
	public static final String SUPPLY_CHAIN_BOUNDARY_DEFINITION_PROCESS = "SupplyChain.BoundaryDefinitionProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_BOUNDARY_DEFINITION_PROCESS = "SupplyChain.ExternalBoundaryDefinitionProcess";
	public static final String SUPPLY_CHAIN_TRANSPORT_PROCESS = "SupplyChain.TransportProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_TRANSPORT_PROCESS = "SupplyChain.ExternalTransportProcess";
	public static final String CORE_LOCATION = "Core.Location";
	public static final String CORE_EXTERNAL_LOCATION = "Core.ExternalLocation";
	public static final String CORE_ACTION = "Core.Action";
	public static final String CORE_EXTERNAL_ACTION = "Core.ExternalAction";
	public static final String FUNCTIONAL_SAFETY_EVIDENCE_TYPE = "FunctionalSafety.EvidenceType";
	public static final String SUPPLY_CHAIN_REPRODUCE_ACTION = "SupplyChain.ReproduceAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_REPRODUCE_ACTION = "SupplyChain.ExternalReproduceAction";
	public static final String SUPPLY_CHAIN_MANUFACTURE_PROCESS = "SupplyChain.ManufactureProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_MANUFACTURE_PROCESS = "SupplyChain.ExternalManufactureProcess";
	public static final String FUNCTIONAL_SAFETY_EVIDENCE_RELATIONSHIP = "FunctionalSafety.EvidenceRelationship";
	public static final String FUNCTIONAL_SAFETY_EXTERNAL_EVIDENCE_RELATIONSHIP = "FunctionalSafety.ExternalEvidenceRelationship";
	public static final String CORE_SPECIFICATION = "Core.Specification";
	public static final String CORE_EXTERNAL_SPECIFICATION = "Core.ExternalSpecification";
	public static final String EXPANDED_LICENSING_OR_LATER_OPERATOR = "ExpandedLicensing.OrLaterOperator";
	public static final String EXPANDED_LICENSING_EXTERNAL_OR_LATER_OPERATOR = "ExpandedLicensing.ExternalOrLaterOperator";
	public static final String SOFTWARE_CONTENT_IDENTIFIER = "Software.ContentIdentifier";
	public static final String SOFTWARE_SPDX_FILE = "Software.SpdxFile";
	public static final String SOFTWARE_EXTERNAL_SPDX_FILE = "Software.ExternalSpdxFile";
	public static final String SOFTWARE_FILE_KIND_TYPE = "Software.FileKindType";
	public static final String SECURITY_EXPLOIT_CATALOG_TYPE = "Security.ExploitCatalogType";
	public static final String SUPPLY_CHAIN_DESTROY_PROCESS = "SupplyChain.DestroyProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_DESTROY_PROCESS = "SupplyChain.ExternalDestroyProcess";
	public static final String CORE_REQUIREMENT = "Core.Requirement";
	public static final String CORE_EXTERNAL_REQUIREMENT = "Core.ExternalRequirement";
	public static final String SIMPLE_LICENSING_SIMPLE_LICENSING_TEXT = "SimpleLicensing.SimpleLicensingText";
	public static final String SIMPLE_LICENSING_EXTERNAL_SIMPLE_LICENSING_TEXT = "SimpleLicensing.ExternalSimpleLicensingText";
	public static final String CORE_PROFILE_IDENTIFIER_TYPE = "Core.ProfileIdentifierType";
	public static final String CORE_BOM = "Core.Bom";
	public static final String CORE_EXTERNAL_BOM = "Core.ExternalBom";
	public static final String SUPPLY_CHAIN_DEFINED_STATE_PROCESS = "SupplyChain.DefinedStateProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_DEFINED_STATE_PROCESS = "SupplyChain.ExternalDefinedStateProcess";
	public static final String CORE_PHYSICAL_LOCATION = "Core.PhysicalLocation";
	public static final String CORE_EXTERNAL_PHYSICAL_LOCATION = "Core.ExternalPhysicalLocation";
	public static final String EXTENSION_CDX_PROPERTIES_EXTENSION = "Extension.CdxPropertiesExtension";
	public static final String SUPPLY_CHAIN_MODIFY_PROCESS = "SupplyChain.ModifyProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_MODIFY_PROCESS = "SupplyChain.ExternalModifyProcess";
	public static final String CORE_RELATIONSHIP = "Core.Relationship";
	public static final String CORE_EXTERNAL_RELATIONSHIP = "Core.ExternalRelationship";
	public static final String CORE_ELEMENT_COLLECTION = "Core.ElementCollection";
	public static final String CORE_EXTERNAL_ELEMENT_COLLECTION = "Core.ExternalElementCollection";
	public static final String SECURITY_SSVC_VULN_ASSESSMENT_RELATIONSHIP = "Security.SsvcVulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_SSVC_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalSsvcVulnAssessmentRelationship";
	public static final String SUPPLY_CHAIN_RESPONSIBILITY_CHANGE_ACTION = "SupplyChain.ResponsibilityChangeAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_RESPONSIBILITY_CHANGE_ACTION = "SupplyChain.ExternalResponsibilityChangeAction";
	public static final String CORE_ANNOTATION_TYPE = "Core.AnnotationType";
	public static final String EXPANDED_LICENSING_DISJUNCTIVE_LICENSE_SET = "ExpandedLicensing.DisjunctiveLicenseSet";
	public static final String EXPANDED_LICENSING_EXTERNAL_DISJUNCTIVE_LICENSE_SET = "ExpandedLicensing.ExternalDisjunctiveLicenseSet";
	public static final String BUILD_BUILD = "Build.Build";
	public static final String BUILD_EXTERNAL_BUILD = "Build.ExternalBuild";
	public static final String CORE_RELATIONSHIP_COMPLETENESS = "Core.RelationshipCompleteness";
	public static final String CORE_DICTIONARY_ENTRY = "Core.DictionaryEntry";
	public static final String SUPPLY_CHAIN_ASSEMBLY_PROCESS = "SupplyChain.AssemblyProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_ASSEMBLY_PROCESS = "SupplyChain.ExternalAssemblyProcess";
	public static final String A_I_ENERGY_CONSUMPTION_DESCRIPTION = "AI.EnergyConsumptionDescription";
	public static final String SUPPLY_CHAIN_USE_PROCESS = "SupplyChain.UseProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_USE_PROCESS = "SupplyChain.ExternalUseProcess";
	public static final String HARDWARE_VIRTUAL_HARDWARE_MODEL_TYPE = "Hardware.VirtualHardwareModelType";
	public static final String CORE_UNIT_OF_MEASURE = "Core.UnitOfMeasure";
	public static final String CORE_INDIVIDUAL_ELEMENT = "Core.IndividualElement";
	public static final String CORE_EXTERNAL_INDIVIDUAL_ELEMENT = "Core.ExternalIndividualElement";
	public static final String SUPPLY_CHAIN_RESPONSIBILITY_TYPE = "SupplyChain.ResponsibilityType";
	public static final String HARDWARE_VIRTUAL_HARDWARE = "Hardware.VirtualHardware";
	public static final String HARDWARE_EXTERNAL_VIRTUAL_HARDWARE = "Hardware.ExternalVirtualHardware";
	public static final String SUPPLY_CHAIN_BOUNDARY_CROSSING_ACTION = "SupplyChain.BoundaryCrossingAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_BOUNDARY_CROSSING_ACTION = "SupplyChain.ExternalBoundaryCrossingAction";
	public static final String CORE_ELEMENT_MAP = "Core.ElementMap";
	public static final String SOFTWARE_CONTENT_IDENTIFIER_TYPE = "Software.ContentIdentifierType";
	public static final String OPERATIONS_EXPORT_CONTROL_CLASSIFICATION = "Operations.ExportControlClassification";
	public static final String CORE_EXTERNAL_MAP = "Core.ExternalMap";
	public static final String SUPPLY_CHAIN_MODIFY_ACTION = "SupplyChain.ModifyAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_MODIFY_ACTION = "SupplyChain.ExternalModifyAction";
	public static final String EXPANDED_LICENSING_WITH_ADDITION_OPERATOR = "ExpandedLicensing.WithAdditionOperator";
	public static final String EXPANDED_LICENSING_EXTERNAL_WITH_ADDITION_OPERATOR = "ExpandedLicensing.ExternalWithAdditionOperator";
	public static final String EXTENSION_CDX_PROPERTY_ENTRY = "Extension.CdxPropertyEntry";
	public static final String EXPANDED_LICENSING_CUSTOM_LICENSE_ADDITION = "ExpandedLicensing.CustomLicenseAddition";
	public static final String EXPANDED_LICENSING_EXTERNAL_CUSTOM_LICENSE_ADDITION = "ExpandedLicensing.ExternalCustomLicenseAddition";
	public static final String OPERATIONS_PROJECT = "Operations.Project";
	public static final String OPERATIONS_EXTERNAL_PROJECT = "Operations.ExternalProject";
	public static final String SIMPLE_LICENSING_LICENSE_EXPRESSION = "SimpleLicensing.LicenseExpression";
	public static final String SIMPLE_LICENSING_EXTERNAL_LICENSE_EXPRESSION = "SimpleLicensing.ExternalLicenseExpression";
	public static final String CORE_LIFECYCLE_SCOPE_TYPE = "Core.LifecycleScopeType";
	public static final String SUPPLY_CHAIN_HARVEST_ACTION = "SupplyChain.HarvestAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_HARVEST_ACTION = "SupplyChain.ExternalHarvestAction";
	public static final String CORE_HASH_ALGORITHM = "Core.HashAlgorithm";
	public static final String FUNCTIONAL_SAFETY_REQUIREMENT_VERIFICATION = "FunctionalSafety.RequirementVerification";
	public static final String FUNCTIONAL_SAFETY_EXTERNAL_REQUIREMENT_VERIFICATION = "FunctionalSafety.ExternalRequirementVerification";
	public static final String SECURITY_VEX_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP = "Security.VexAffectedVulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_VEX_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalVexAffectedVulnAssessmentRelationship";
	public static final String CORE_SPDX_DOCUMENT = "Core.SpdxDocument";
	public static final String CORE_EXTERNAL_SPDX_DOCUMENT = "Core.ExternalSpdxDocument";
	public static final String CORE_ARTIFACT = "Core.Artifact";
	public static final String CORE_EXTERNAL_ARTIFACT = "Core.ExternalArtifact";
	public static final String CORE_INTEGRITY_METHOD = "Core.IntegrityMethod";
	public static final String CORE_PERSON = "Core.Person";
	public static final String CORE_EXTERNAL_PERSON = "Core.ExternalPerson";
	public static final String EXPANDED_LICENSING_INDIVIDUAL_LICENSING_INFO = "ExpandedLicensing.IndividualLicensingInfo";
	public static final String EXPANDED_LICENSING_EXTERNAL_INDIVIDUAL_LICENSING_INFO = "ExpandedLicensing.ExternalIndividualLicensingInfo";
	public static final String CORE_CONTACT_POINT_RELATIONSHIP = "Core.ContactPointRelationship";
	public static final String CORE_EXTERNAL_CONTACT_POINT_RELATIONSHIP = "Core.ExternalContactPointRelationship";
	public static final String CORE_LIFECYCLE_SCOPED_RELATIONSHIP = "Core.LifecycleScopedRelationship";
	public static final String CORE_EXTERNAL_LIFECYCLE_SCOPED_RELATIONSHIP = "Core.ExternalLifecycleScopedRelationship";
	public static final String SOFTWARE_SOFTWARE_PURPOSE = "Software.SoftwarePurpose";
	public static final String DATASET_DATASET_PACKAGE = "Dataset.DatasetPackage";
	public static final String DATASET_EXTERNAL_DATASET_PACKAGE = "Dataset.ExternalDatasetPackage";
	public static final String SOFTWARE_SNIPPET = "Software.Snippet";
	public static final String SOFTWARE_EXTERNAL_SNIPPET = "Software.ExternalSnippet";
	public static final String SECURITY_VEX_JUSTIFICATION_TYPE = "Security.VexJustificationType";
	public static final String CORE_CONTACT_POINT_RELATIONSHIP_TYPE = "Core.ContactPointRelationshipType";
	public static final String SECURITY_VEX_UNDER_INVESTIGATION_VULN_ASSESSMENT_RELATIONSHIP = "Security.VexUnderInvestigationVulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_VEX_UNDER_INVESTIGATION_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalVexUnderInvestigationVulnAssessmentRelationship";
	public static final String EXPANDED_LICENSING_LICENSE = "ExpandedLicensing.License";
	public static final String EXPANDED_LICENSING_EXTERNAL_LICENSE = "ExpandedLicensing.ExternalLicense";
	public static final String CORE_EXTERNAL_IDENTIFIER = "Core.ExternalIdentifier";
	public static final String CORE_NAMESPACE_MAP = "Core.NamespaceMap";
	public static final String SUPPLY_CHAIN_STORAGE_PROCESS = "SupplyChain.StorageProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_STORAGE_PROCESS = "SupplyChain.ExternalStorageProcess";
	public static final String CORE_PRESENCE_TYPE = "Core.PresenceType";
	public static final String SOFTWARE_SBOM = "Software.Sbom";
	public static final String SOFTWARE_EXTERNAL_SBOM = "Software.ExternalSbom";
	public static final String CORE_PACKAGE_VERIFICATION_CODE = "Core.PackageVerificationCode";
	public static final String SOFTWARE_SBOM_TYPE = "Software.SbomType";
	public static final String SUPPLY_CHAIN_OUT_OF_SPEC_ACTION = "SupplyChain.OutOfSpecAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_OUT_OF_SPEC_ACTION = "SupplyChain.ExternalOutOfSpecAction";
	public static final String SECURITY_VEX_NOT_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP = "Security.VexNotAffectedVulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_VEX_NOT_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalVexNotAffectedVulnAssessmentRelationship";
	public static final String SUPPLY_CHAIN_STORAGE_ACTION = "SupplyChain.StorageAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_STORAGE_ACTION = "SupplyChain.ExternalStorageAction";
	public static final String CORE_SPECIFICATION_TYPE = "Core.SpecificationType";
	public static final String SUPPLY_CHAIN_DESTROY_ACTION = "SupplyChain.DestroyAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_DESTROY_ACTION = "SupplyChain.ExternalDestroyAction";
	public static final String SUPPLY_CHAIN_REPRODUCE_PROCESS = "SupplyChain.ReproduceProcess";
	public static final String SUPPLY_CHAIN_EXTERNAL_REPRODUCE_PROCESS = "SupplyChain.ExternalReproduceProcess";
	public static final String SECURITY_CVSS_SEVERITY_TYPE = "Security.CvssSeverityType";
	public static final String CORE_ORGANIZATION = "Core.Organization";
	public static final String CORE_EXTERNAL_ORGANIZATION = "Core.ExternalOrganization";
	public static final String CORE_EXTERNAL_REF_TYPE = "Core.ExternalRefType";
	public static final String DATASET_DATASET_TYPE = "Dataset.DatasetType";
	public static final String SUPPLY_CHAIN_MANUFACTURE_ACTION = "SupplyChain.ManufactureAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_MANUFACTURE_ACTION = "SupplyChain.ExternalManufactureAction";
	public static final String CORE_POSITIVE_INTEGER_RANGE = "Core.PositiveIntegerRange";
	public static final String SECURITY_SSVC_DECISION_TYPE = "Security.SsvcDecisionType";
	public static final String CORE_BUNDLE = "Core.Bundle";
	public static final String CORE_EXTERNAL_BUNDLE = "Core.ExternalBundle";
	public static final String SECURITY_EXPLOIT_CATALOG_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExploitCatalogVulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_EXPLOIT_CATALOG_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalExploitCatalogVulnAssessmentRelationship";
	public static final String SECURITY_CVSS_V2_VULN_ASSESSMENT_RELATIONSHIP = "Security.CvssV2VulnAssessmentRelationship";
	public static final String SECURITY_EXTERNAL_CVSS_V2_VULN_ASSESSMENT_RELATIONSHIP = "Security.ExternalCvssV2VulnAssessmentRelationship";
	public static final String FUNCTIONAL_SAFETY_EVALUATION_RESULT = "FunctionalSafety.EvaluationResult";
	public static final String FUNCTIONAL_SAFETY_EXTERNAL_EVALUATION_RESULT = "FunctionalSafety.ExternalEvaluationResult";
	public static final String OPERATIONS_EXPORT_CONTROL_CLASSIFICATION_ASSESSMENT = "Operations.ExportControlClassificationAssessment";
	public static final String OPERATIONS_EXTERNAL_EXPORT_CONTROL_CLASSIFICATION_ASSESSMENT = "Operations.ExternalExportControlClassificationAssessment";
	public static final String SUPPLY_CHAIN_ASSEMBLY_ACTION = "SupplyChain.AssemblyAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_ASSEMBLY_ACTION = "SupplyChain.ExternalAssemblyAction";
	public static final String SUPPLY_CHAIN_TRANSPORT_ACTION = "SupplyChain.TransportAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_TRANSPORT_ACTION = "SupplyChain.ExternalTransportAction";
	public static final String SUPPLY_CHAIN_CREATE_ACTION = "SupplyChain.CreateAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_CREATE_ACTION = "SupplyChain.ExternalCreateAction";
	public static final String SUPPLY_CHAIN_PLAN_ACTION = "SupplyChain.PlanAction";
	public static final String SUPPLY_CHAIN_EXTERNAL_PLAN_ACTION = "SupplyChain.ExternalPlanAction";
	public static final String CORE_DEFINED_TYPE = "Core.DefinedType";
	public static final String CORE_SUPPORT_RELATIONSHIP = "Core.SupportRelationship";
	public static final String CORE_EXTERNAL_SUPPORT_RELATIONSHIP = "Core.ExternalSupportRelationship";
	public static final String HARDWARE_PRODUCT_SPECIFICATION = "Hardware.ProductSpecification";
	public static final String HARDWARE_EXTERNAL_PRODUCT_SPECIFICATION = "Hardware.ExternalProductSpecification";
	public static final String A_I_ENERGY_UNIT_TYPE = "AI.EnergyUnitType";
	public static final String CORE_MEASURE_OF_LENGTH = "Core.MeasureOfLength";
	public static final String CORE_DEFINED_PROCESS = "Core.DefinedProcess";
	public static final String CORE_EXTERNAL_DEFINED_PROCESS = "Core.ExternalDefinedProcess";
	public static final String EXTENSION_EXTENSION = "Extension.Extension";
	public static final String CORE_SPDX_ORGANIZATION = "Core.SpdxOrganization";
	public static final String EXPANDED_LICENSING_NONE_LICENSE = "ExpandedLicensing.NoneLicense";
	public static final String EXPANDED_LICENSING_NO_ASSERTION_LICENSE = "ExpandedLicensing.NoAssertionLicense";
	public static final String CORE_NONE_ELEMENT = "Core.NoneElement";
	public static final String CORE_NO_ASSERTION_ELEMENT = "Core.NoAssertionElement";
	public static final String EXTERNAL_ELEMENT = "Core.ExternalElement";
	public static final String EXTERNAL_CUSTOM_LICENSE = "ExpandedLicensing.ExternalCustomLicense";
	public static final String EXTERNAL_CUSTOM_LICENSE_ADDITION = "ExpandedLicensing.ExternalCustomLicenseAddition";
	
	public static final String[] ALL_SPDX_CLASSES = {SOFTWARE_SOFTWARE_ARTIFACT, SOFTWARE_EXTERNAL_SOFTWARE_ARTIFACT, 
			HARDWARE_DIMENSIONS, EXPANDED_LICENSING_LICENSE_ADDITION, EXPANDED_LICENSING_EXTERNAL_LICENSE_ADDITION, 
			CORE_REGULATION, CORE_EXTERNAL_REGULATION, A_I_A_I_PACKAGE, A_I_EXTERNAL_A_I_PACKAGE, 
			SUPPLY_CHAIN_CHANGE_PROCESS, SUPPLY_CHAIN_EXTERNAL_CHANGE_PROCESS, SUPPLY_CHAIN_TEST_PROCESS, 
			SUPPLY_CHAIN_EXTERNAL_TEST_PROCESS, EXPANDED_LICENSING_LISTED_LICENSE_EXCEPTION, 
			EXPANDED_LICENSING_EXTERNAL_LISTED_LICENSE_EXCEPTION, EXPANDED_LICENSING_EXTENDABLE_LICENSE, 
			EXPANDED_LICENSING_EXTERNAL_EXTENDABLE_LICENSE, SERVICE_SOFTWARE_SERVICE, 
			SERVICE_EXTERNAL_SOFTWARE_SERVICE, EXPANDED_LICENSING_LISTED_LICENSE, EXPANDED_LICENSING_EXTERNAL_LISTED_LICENSE, 
			EXPANDED_LICENSING_CUSTOM_LICENSE, EXPANDED_LICENSING_EXTERNAL_CUSTOM_LICENSE, 
			CORE_SOFTWARE_AGENT, CORE_EXTERNAL_SOFTWARE_AGENT, FUNCTIONAL_SAFETY_EVALUATION_RESULT_TYPE, 
			CORE_EXTERNAL_IDENTIFIER_TYPE, SUPPLY_CHAIN_HARVEST_PROCESS, SUPPLY_CHAIN_EXTERNAL_HARVEST_PROCESS, 
			CORE_RELATIONSHIP_TYPE, SECURITY_VULNERABILITY, SECURITY_EXTERNAL_VULNERABILITY, 
			CORE_EXTERNAL_REF, SUPPLY_CHAIN_STATE_ACTION, SUPPLY_CHAIN_EXTERNAL_STATE_ACTION, 
			CORE_TOOL, CORE_EXTERNAL_TOOL, SIMPLE_LICENSING_ANY_LICENSE_INFO, SIMPLE_LICENSING_EXTERNAL_ANY_LICENSE_INFO, 
			FUNCTIONAL_SAFETY_VERIFICATION_TYPE, CORE_ISO_AUTOMATION_LEVEL, SUPPLY_CHAIN_CHANGE_ACTION, 
			SUPPLY_CHAIN_EXTERNAL_CHANGE_ACTION, CORE_MEASURE_OF_MASS, SECURITY_CVSS_V4_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_CVSS_V4_VULN_ASSESSMENT_RELATIONSHIP, SUPPLY_CHAIN_RESOLUTION_ACTION, 
			SUPPLY_CHAIN_EXTERNAL_RESOLUTION_ACTION, SECURITY_VEX_FIXED_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_VEX_FIXED_VULN_ASSESSMENT_RELATIONSHIP, SOFTWARE_SPDX_PACKAGE, 
			SOFTWARE_EXTERNAL_SPDX_PACKAGE, SUPPLY_CHAIN_RESPONSIBILITY_CHANGE_PROCESS, 
			SUPPLY_CHAIN_EXTERNAL_RESPONSIBILITY_CHANGE_PROCESS, CORE_SUPPORT_TYPE, 
			HARDWARE_BULK_HARDWARE, HARDWARE_EXTERNAL_BULK_HARDWARE, CORE_PROCESS_READINESS_TYPE, 
			CORE_CREATION_INFO, A_I_SAFETY_RISK_ASSESSMENT_TYPE, SECURITY_VEX_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_VEX_VULN_ASSESSMENT_RELATIONSHIP, SECURITY_CVSS_V3_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_CVSS_V3_VULN_ASSESSMENT_RELATIONSHIP, SUPPLY_CHAIN_INSTANTIATE_VIRTUAL_HARDWARE_PROCESS, 
			SUPPLY_CHAIN_EXTERNAL_INSTANTIATE_VIRTUAL_HARDWARE_PROCESS, A_I_ENERGY_CONSUMPTION, 
			DATASET_CONFIDENTIALITY_LEVEL_TYPE, EXPANDED_LICENSING_CONJUNCTIVE_LICENSE_SET, 
			EXPANDED_LICENSING_EXTERNAL_CONJUNCTIVE_LICENSE_SET, CORE_HASH, SUPPLY_CHAIN_TEST_ACTION, 
			SUPPLY_CHAIN_EXTERNAL_TEST_ACTION, SECURITY_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_VULN_ASSESSMENT_RELATIONSHIP, SUPPLY_CHAIN_USE_ACTION, 
			SUPPLY_CHAIN_EXTERNAL_USE_ACTION, SUPPLY_CHAIN_INSPECTION_ACTION, SUPPLY_CHAIN_EXTERNAL_INSPECTION_ACTION, 
			CORE_AGENT, CORE_EXTERNAL_AGENT, SERVICE_AUTHENTICATION_PROTOCOL_TYPE, 
			DATASET_DATASET_AVAILABILITY_TYPE, SUPPLY_CHAIN_INSPECTION_PROCESS, SUPPLY_CHAIN_EXTERNAL_INSPECTION_PROCESS, 
			CORE_ANNOTATION, CORE_EXTERNAL_ANNOTATION, CORE_ELEMENT, CORE_EXTERNAL_ELEMENT, 
			HARDWARE_PHYSICAL_HARDWARE, HARDWARE_EXTERNAL_PHYSICAL_HARDWARE, SUPPLY_CHAIN_STATE, 
			SUPPLY_CHAIN_EXTERNAL_STATE, HARDWARE_HARDWARE, HARDWARE_EXTERNAL_HARDWARE, 
			SUPPLY_CHAIN_BOUNDARY_DEFINITION_ACTION, SUPPLY_CHAIN_EXTERNAL_BOUNDARY_DEFINITION_ACTION, 
			SUPPLY_CHAIN_CREATE_PROCESS, SUPPLY_CHAIN_EXTERNAL_CREATE_PROCESS, SUPPLY_CHAIN_PLAN_PROCESS, 
			SUPPLY_CHAIN_EXTERNAL_PLAN_PROCESS, SECURITY_EPSS_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_EPSS_VULN_ASSESSMENT_RELATIONSHIP, SUPPLY_CHAIN_BOUNDARY_DEFINITION_PROCESS, 
			SUPPLY_CHAIN_EXTERNAL_BOUNDARY_DEFINITION_PROCESS, SUPPLY_CHAIN_TRANSPORT_PROCESS, 
			SUPPLY_CHAIN_EXTERNAL_TRANSPORT_PROCESS, CORE_LOCATION, CORE_EXTERNAL_LOCATION, 
			CORE_ACTION, CORE_EXTERNAL_ACTION, FUNCTIONAL_SAFETY_EVIDENCE_TYPE, SUPPLY_CHAIN_REPRODUCE_ACTION, 
			SUPPLY_CHAIN_EXTERNAL_REPRODUCE_ACTION, SUPPLY_CHAIN_MANUFACTURE_PROCESS, 
			SUPPLY_CHAIN_EXTERNAL_MANUFACTURE_PROCESS, FUNCTIONAL_SAFETY_EVIDENCE_RELATIONSHIP, 
			FUNCTIONAL_SAFETY_EXTERNAL_EVIDENCE_RELATIONSHIP, CORE_SPECIFICATION, CORE_EXTERNAL_SPECIFICATION, 
			EXPANDED_LICENSING_OR_LATER_OPERATOR, EXPANDED_LICENSING_EXTERNAL_OR_LATER_OPERATOR, 
			SOFTWARE_CONTENT_IDENTIFIER, SOFTWARE_SPDX_FILE, SOFTWARE_EXTERNAL_SPDX_FILE, 
			SOFTWARE_FILE_KIND_TYPE, SECURITY_EXPLOIT_CATALOG_TYPE, SUPPLY_CHAIN_DESTROY_PROCESS, 
			SUPPLY_CHAIN_EXTERNAL_DESTROY_PROCESS, CORE_REQUIREMENT, CORE_EXTERNAL_REQUIREMENT, 
			SIMPLE_LICENSING_SIMPLE_LICENSING_TEXT, SIMPLE_LICENSING_EXTERNAL_SIMPLE_LICENSING_TEXT, 
			CORE_PROFILE_IDENTIFIER_TYPE, CORE_BOM, CORE_EXTERNAL_BOM, SUPPLY_CHAIN_DEFINED_STATE_PROCESS, 
			SUPPLY_CHAIN_EXTERNAL_DEFINED_STATE_PROCESS, CORE_PHYSICAL_LOCATION, CORE_EXTERNAL_PHYSICAL_LOCATION, 
			EXTENSION_CDX_PROPERTIES_EXTENSION, SUPPLY_CHAIN_MODIFY_PROCESS, SUPPLY_CHAIN_EXTERNAL_MODIFY_PROCESS, 
			CORE_RELATIONSHIP, CORE_EXTERNAL_RELATIONSHIP, CORE_ELEMENT_COLLECTION, 
			CORE_EXTERNAL_ELEMENT_COLLECTION, SECURITY_SSVC_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_SSVC_VULN_ASSESSMENT_RELATIONSHIP, SUPPLY_CHAIN_RESPONSIBILITY_CHANGE_ACTION, 
			SUPPLY_CHAIN_EXTERNAL_RESPONSIBILITY_CHANGE_ACTION, CORE_ANNOTATION_TYPE, 
			EXPANDED_LICENSING_DISJUNCTIVE_LICENSE_SET, EXPANDED_LICENSING_EXTERNAL_DISJUNCTIVE_LICENSE_SET, 
			BUILD_BUILD, BUILD_EXTERNAL_BUILD, CORE_RELATIONSHIP_COMPLETENESS, CORE_DICTIONARY_ENTRY, 
			SUPPLY_CHAIN_ASSEMBLY_PROCESS, SUPPLY_CHAIN_EXTERNAL_ASSEMBLY_PROCESS, 
			A_I_ENERGY_CONSUMPTION_DESCRIPTION, SUPPLY_CHAIN_USE_PROCESS, SUPPLY_CHAIN_EXTERNAL_USE_PROCESS, 
			HARDWARE_VIRTUAL_HARDWARE_MODEL_TYPE, CORE_UNIT_OF_MEASURE, CORE_INDIVIDUAL_ELEMENT, 
			CORE_EXTERNAL_INDIVIDUAL_ELEMENT, SUPPLY_CHAIN_RESPONSIBILITY_TYPE, HARDWARE_VIRTUAL_HARDWARE, 
			HARDWARE_EXTERNAL_VIRTUAL_HARDWARE, SUPPLY_CHAIN_BOUNDARY_CROSSING_ACTION, 
			SUPPLY_CHAIN_EXTERNAL_BOUNDARY_CROSSING_ACTION, CORE_ELEMENT_MAP, SOFTWARE_CONTENT_IDENTIFIER_TYPE, 
			OPERATIONS_EXPORT_CONTROL_CLASSIFICATION, CORE_EXTERNAL_MAP, SUPPLY_CHAIN_MODIFY_ACTION, 
			SUPPLY_CHAIN_EXTERNAL_MODIFY_ACTION, EXPANDED_LICENSING_WITH_ADDITION_OPERATOR, 
			EXPANDED_LICENSING_EXTERNAL_WITH_ADDITION_OPERATOR, EXTENSION_CDX_PROPERTY_ENTRY, 
			EXPANDED_LICENSING_CUSTOM_LICENSE_ADDITION, EXPANDED_LICENSING_EXTERNAL_CUSTOM_LICENSE_ADDITION, 
			OPERATIONS_PROJECT, OPERATIONS_EXTERNAL_PROJECT, SIMPLE_LICENSING_LICENSE_EXPRESSION, 
			SIMPLE_LICENSING_EXTERNAL_LICENSE_EXPRESSION, CORE_LIFECYCLE_SCOPE_TYPE, 
			SUPPLY_CHAIN_HARVEST_ACTION, SUPPLY_CHAIN_EXTERNAL_HARVEST_ACTION, CORE_HASH_ALGORITHM, 
			FUNCTIONAL_SAFETY_REQUIREMENT_VERIFICATION, FUNCTIONAL_SAFETY_EXTERNAL_REQUIREMENT_VERIFICATION, 
			SECURITY_VEX_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP, SECURITY_EXTERNAL_VEX_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP, 
			CORE_SPDX_DOCUMENT, CORE_EXTERNAL_SPDX_DOCUMENT, CORE_ARTIFACT, CORE_EXTERNAL_ARTIFACT, 
			CORE_INTEGRITY_METHOD, CORE_PERSON, CORE_EXTERNAL_PERSON, EXPANDED_LICENSING_INDIVIDUAL_LICENSING_INFO, 
			EXPANDED_LICENSING_EXTERNAL_INDIVIDUAL_LICENSING_INFO, CORE_CONTACT_POINT_RELATIONSHIP, 
			CORE_EXTERNAL_CONTACT_POINT_RELATIONSHIP, CORE_LIFECYCLE_SCOPED_RELATIONSHIP, 
			CORE_EXTERNAL_LIFECYCLE_SCOPED_RELATIONSHIP, SOFTWARE_SOFTWARE_PURPOSE, 
			DATASET_DATASET_PACKAGE, DATASET_EXTERNAL_DATASET_PACKAGE, SOFTWARE_SNIPPET, 
			SOFTWARE_EXTERNAL_SNIPPET, SECURITY_VEX_JUSTIFICATION_TYPE, CORE_CONTACT_POINT_RELATIONSHIP_TYPE, 
			SECURITY_VEX_UNDER_INVESTIGATION_VULN_ASSESSMENT_RELATIONSHIP, SECURITY_EXTERNAL_VEX_UNDER_INVESTIGATION_VULN_ASSESSMENT_RELATIONSHIP, 
			EXPANDED_LICENSING_LICENSE, EXPANDED_LICENSING_EXTERNAL_LICENSE, CORE_EXTERNAL_IDENTIFIER, 
			CORE_NAMESPACE_MAP, SUPPLY_CHAIN_STORAGE_PROCESS, SUPPLY_CHAIN_EXTERNAL_STORAGE_PROCESS, 
			CORE_PRESENCE_TYPE, SOFTWARE_SBOM, SOFTWARE_EXTERNAL_SBOM, CORE_PACKAGE_VERIFICATION_CODE, 
			SOFTWARE_SBOM_TYPE, SUPPLY_CHAIN_OUT_OF_SPEC_ACTION, SUPPLY_CHAIN_EXTERNAL_OUT_OF_SPEC_ACTION, 
			SECURITY_VEX_NOT_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP, SECURITY_EXTERNAL_VEX_NOT_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP, 
			SUPPLY_CHAIN_STORAGE_ACTION, SUPPLY_CHAIN_EXTERNAL_STORAGE_ACTION, CORE_SPECIFICATION_TYPE, 
			SUPPLY_CHAIN_DESTROY_ACTION, SUPPLY_CHAIN_EXTERNAL_DESTROY_ACTION, SUPPLY_CHAIN_REPRODUCE_PROCESS, 
			SUPPLY_CHAIN_EXTERNAL_REPRODUCE_PROCESS, SECURITY_CVSS_SEVERITY_TYPE, CORE_ORGANIZATION, 
			CORE_EXTERNAL_ORGANIZATION, CORE_EXTERNAL_REF_TYPE, DATASET_DATASET_TYPE, 
			SUPPLY_CHAIN_MANUFACTURE_ACTION, SUPPLY_CHAIN_EXTERNAL_MANUFACTURE_ACTION, 
			CORE_POSITIVE_INTEGER_RANGE, SECURITY_SSVC_DECISION_TYPE, CORE_BUNDLE, 
			CORE_EXTERNAL_BUNDLE, SECURITY_EXPLOIT_CATALOG_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_EXPLOIT_CATALOG_VULN_ASSESSMENT_RELATIONSHIP, SECURITY_CVSS_V2_VULN_ASSESSMENT_RELATIONSHIP, 
			SECURITY_EXTERNAL_CVSS_V2_VULN_ASSESSMENT_RELATIONSHIP, FUNCTIONAL_SAFETY_EVALUATION_RESULT, 
			FUNCTIONAL_SAFETY_EXTERNAL_EVALUATION_RESULT, OPERATIONS_EXPORT_CONTROL_CLASSIFICATION_ASSESSMENT, 
			OPERATIONS_EXTERNAL_EXPORT_CONTROL_CLASSIFICATION_ASSESSMENT, SUPPLY_CHAIN_ASSEMBLY_ACTION, 
			SUPPLY_CHAIN_EXTERNAL_ASSEMBLY_ACTION, SUPPLY_CHAIN_TRANSPORT_ACTION, SUPPLY_CHAIN_EXTERNAL_TRANSPORT_ACTION, 
			SUPPLY_CHAIN_CREATE_ACTION, SUPPLY_CHAIN_EXTERNAL_CREATE_ACTION, SUPPLY_CHAIN_PLAN_ACTION, 
			SUPPLY_CHAIN_EXTERNAL_PLAN_ACTION, CORE_DEFINED_TYPE, CORE_SUPPORT_RELATIONSHIP, 
			CORE_EXTERNAL_SUPPORT_RELATIONSHIP, HARDWARE_PRODUCT_SPECIFICATION, HARDWARE_EXTERNAL_PRODUCT_SPECIFICATION, 
			A_I_ENERGY_UNIT_TYPE, CORE_MEASURE_OF_LENGTH, CORE_DEFINED_PROCESS, CORE_EXTERNAL_DEFINED_PROCESS, 
			EXTENSION_EXTENSION, CORE_SPDX_ORGANIZATION, EXPANDED_LICENSING_NONE_LICENSE, 
			EXPANDED_LICENSING_NO_ASSERTION_LICENSE, CORE_NONE_ELEMENT, CORE_NO_ASSERTION_ELEMENT, 
			EXTERNAL_ELEMENT, EXTERNAL_CUSTOM_LICENSE, EXTERNAL_CUSTOM_LICENSE_ADDITION};
}
