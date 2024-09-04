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

import org.spdx.core.IModelCopyManager;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.library.model.v3_0_1.core.CreationInfo;
import org.spdx.storage.IModelStore;
import org.spdx.storage.IModelStore.IdType;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import javax.annotation.Nullable;


/**
 * Factory class for creating model classes.
 * 
 * The <code>getModelObject</code> method will fetch or create a model object based on the URI for the class
 * 
 * @author Gary O'Neall
 *
 */
public class SpdxModelClassFactoryV3 {

	public static Map<String, Class<?>> SPDX_TYPE_TO_CLASS_V3;
	public static Map<Class<?>, String> SPDX_CLASS_TO_TYPE;
	static {
		Map<String, Class<?>> typeToClassV3 = new HashMap<>();
		
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_IDENTIFIER_TYPE, org.spdx.library.model.v3_0_1.core.ExternalIdentifierType.class);
		typeToClassV3.put(SpdxConstantsV3.A_I_ENERGY_UNIT_TYPE, org.spdx.library.model.v3_0_1.ai.EnergyUnitType.class);
		typeToClassV3.put(SpdxConstantsV3.EXTENSION_CDX_PROPERTIES_EXTENSION, org.spdx.library.model.v3_0_1.extension.CdxPropertiesExtension.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_LICENSE, org.spdx.library.model.v3_0_1.expandedlicensing.License.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_LICENSE, org.spdx.library.model.v3_0_1.expandedlicensing.ExternalLicense.class);
		typeToClassV3.put(SpdxConstantsV3.DATASET_DATASET_PACKAGE, org.spdx.library.model.v3_0_1.dataset.DatasetPackage.class);
		typeToClassV3.put(SpdxConstantsV3.DATASET_EXTERNAL_DATASET_PACKAGE, org.spdx.library.model.v3_0_1.dataset.ExternalDatasetPackage.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_ELEMENT_COLLECTION, org.spdx.library.model.v3_0_1.core.ElementCollection.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_ELEMENT_COLLECTION, org.spdx.library.model.v3_0_1.core.ExternalElementCollection.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_VEX_JUSTIFICATION_TYPE, org.spdx.library.model.v3_0_1.security.VexJustificationType.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_INTEGRITY_METHOD, org.spdx.library.model.v3_0_1.core.IntegrityMethod.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_IDENTIFIER, org.spdx.library.model.v3_0_1.core.ExternalIdentifier.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_DICTIONARY_ENTRY, org.spdx.library.model.v3_0_1.core.DictionaryEntry.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_POSITIVE_INTEGER_RANGE, org.spdx.library.model.v3_0_1.core.PositiveIntegerRange.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_VEX_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_VEX_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.ExternalVexAffectedVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_CVSS_V4_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_CVSS_V4_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.ExternalCvssV4VulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.DATASET_DATASET_AVAILABILITY_TYPE, org.spdx.library.model.v3_0_1.dataset.DatasetAvailabilityType.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_CUSTOM_LICENSE_ADDITION, org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_CUSTOM_LICENSE_ADDITION, org.spdx.library.model.v3_0_1.expandedlicensing.ExternalCustomLicenseAddition.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_HASH_ALGORITHM, org.spdx.library.model.v3_0_1.core.HashAlgorithm.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_DISJUNCTIVE_LICENSE_SET, org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_DISJUNCTIVE_LICENSE_SET, org.spdx.library.model.v3_0_1.expandedlicensing.ExternalDisjunctiveLicenseSet.class);
		typeToClassV3.put(SpdxConstantsV3.A_I_A_I_PACKAGE, org.spdx.library.model.v3_0_1.ai.AIPackage.class);
		typeToClassV3.put(SpdxConstantsV3.A_I_EXTERNAL_A_I_PACKAGE, org.spdx.library.model.v3_0_1.ai.ExternalAIPackage.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_SPDX_FILE, org.spdx.library.model.v3_0_1.software.SpdxFile.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_EXTERNAL_SPDX_FILE, org.spdx.library.model.v3_0_1.software.ExternalSpdxFile.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_PERSON, org.spdx.library.model.v3_0_1.core.Person.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_PERSON, org.spdx.library.model.v3_0_1.core.ExternalPerson.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_CVSS_SEVERITY_TYPE, org.spdx.library.model.v3_0_1.security.CvssSeverityType.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_CREATION_INFO, org.spdx.library.model.v3_0_1.core.CreationInfo.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_BUNDLE, org.spdx.library.model.v3_0_1.core.Bundle.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_BUNDLE, org.spdx.library.model.v3_0_1.core.ExternalBundle.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXPLOIT_CATALOG_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.ExploitCatalogVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_EXPLOIT_CATALOG_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.ExternalExploitCatalogVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_PRESENCE_TYPE, org.spdx.library.model.v3_0_1.core.PresenceType.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXPLOIT_CATALOG_TYPE, org.spdx.library.model.v3_0_1.security.ExploitCatalogType.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.VulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.ExternalVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_ORGANIZATION, org.spdx.library.model.v3_0_1.core.Organization.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_ORGANIZATION, org.spdx.library.model.v3_0_1.core.ExternalOrganization.class);
		typeToClassV3.put(SpdxConstantsV3.A_I_SAFETY_RISK_ASSESSMENT_TYPE, org.spdx.library.model.v3_0_1.ai.SafetyRiskAssessmentType.class);
		typeToClassV3.put(SpdxConstantsV3.EXTENSION_EXTENSION, org.spdx.library.model.v3_0_1.extension.Extension.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_SBOM, org.spdx.library.model.v3_0_1.software.Sbom.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_EXTERNAL_SBOM, org.spdx.library.model.v3_0_1.software.ExternalSbom.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_WITH_ADDITION_OPERATOR, org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_WITH_ADDITION_OPERATOR, org.spdx.library.model.v3_0_1.expandedlicensing.ExternalWithAdditionOperator.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_FILE_KIND_TYPE, org.spdx.library.model.v3_0_1.software.FileKindType.class);
		typeToClassV3.put(SpdxConstantsV3.EXTENSION_CDX_PROPERTY_ENTRY, org.spdx.library.model.v3_0_1.extension.CdxPropertyEntry.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_CONTENT_IDENTIFIER_TYPE, org.spdx.library.model.v3_0_1.software.ContentIdentifierType.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EPSS_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_EPSS_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.ExternalEpssVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_ANNOTATION, org.spdx.library.model.v3_0_1.core.Annotation.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_ANNOTATION, org.spdx.library.model.v3_0_1.core.ExternalAnnotation.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_RELATIONSHIP, org.spdx.library.model.v3_0_1.core.Relationship.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_RELATIONSHIP, org.spdx.library.model.v3_0_1.core.ExternalRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_LIFECYCLE_SCOPED_RELATIONSHIP, org.spdx.library.model.v3_0_1.core.LifecycleScopedRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_LIFECYCLE_SCOPED_RELATIONSHIP, org.spdx.library.model.v3_0_1.core.ExternalLifecycleScopedRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_CONTENT_IDENTIFIER, org.spdx.library.model.v3_0_1.software.ContentIdentifier.class);
		typeToClassV3.put(SpdxConstantsV3.SIMPLE_LICENSING_LICENSE_EXPRESSION, org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression.class);
		typeToClassV3.put(SpdxConstantsV3.SIMPLE_LICENSING_EXTERNAL_LICENSE_EXPRESSION, org.spdx.library.model.v3_0_1.simplelicensing.ExternalLicenseExpression.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_VEX_UNDER_INVESTIGATION_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.VexUnderInvestigationVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_VEX_UNDER_INVESTIGATION_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.ExternalVexUnderInvestigationVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SIMPLE_LICENSING_SIMPLE_LICENSING_TEXT, org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText.class);
		typeToClassV3.put(SpdxConstantsV3.SIMPLE_LICENSING_EXTERNAL_SIMPLE_LICENSING_TEXT, org.spdx.library.model.v3_0_1.simplelicensing.ExternalSimpleLicensingText.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_LISTED_LICENSE_EXCEPTION, org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_LISTED_LICENSE_EXCEPTION, org.spdx.library.model.v3_0_1.expandedlicensing.ExternalListedLicenseException.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_AGENT, org.spdx.library.model.v3_0_1.core.Agent.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_AGENT, org.spdx.library.model.v3_0_1.core.ExternalAgent.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_RELATIONSHIP_COMPLETENESS, org.spdx.library.model.v3_0_1.core.RelationshipCompleteness.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_REF_TYPE, org.spdx.library.model.v3_0_1.core.ExternalRefType.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_MAP, org.spdx.library.model.v3_0_1.core.ExternalMap.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_LIFECYCLE_SCOPE_TYPE, org.spdx.library.model.v3_0_1.core.LifecycleScopeType.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_CVSS_V2_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_CVSS_V2_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.ExternalCvssV2VulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_VEX_FIXED_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_VEX_FIXED_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.ExternalVexFixedVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.A_I_ENERGY_CONSUMPTION, org.spdx.library.model.v3_0_1.ai.EnergyConsumption.class);
		typeToClassV3.put(SpdxConstantsV3.BUILD_BUILD, org.spdx.library.model.v3_0_1.build.Build.class);
		typeToClassV3.put(SpdxConstantsV3.BUILD_EXTERNAL_BUILD, org.spdx.library.model.v3_0_1.build.ExternalBuild.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_SNIPPET, org.spdx.library.model.v3_0_1.software.Snippet.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_EXTERNAL_SNIPPET, org.spdx.library.model.v3_0_1.software.ExternalSnippet.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_SOFTWARE_AGENT, org.spdx.library.model.v3_0_1.core.SoftwareAgent.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_SOFTWARE_AGENT, org.spdx.library.model.v3_0_1.core.ExternalSoftwareAgent.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_SOFTWARE_PURPOSE, org.spdx.library.model.v3_0_1.software.SoftwarePurpose.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_SBOM_TYPE, org.spdx.library.model.v3_0_1.software.SbomType.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_OR_LATER_OPERATOR, org.spdx.library.model.v3_0_1.expandedlicensing.OrLaterOperator.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_OR_LATER_OPERATOR, org.spdx.library.model.v3_0_1.expandedlicensing.ExternalOrLaterOperator.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_VULNERABILITY, org.spdx.library.model.v3_0_1.security.Vulnerability.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_VULNERABILITY, org.spdx.library.model.v3_0_1.security.ExternalVulnerability.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_VEX_NOT_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_VEX_NOT_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.ExternalVexNotAffectedVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_SSVC_DECISION_TYPE, org.spdx.library.model.v3_0_1.security.SsvcDecisionType.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_LICENSE_ADDITION, org.spdx.library.model.v3_0_1.expandedlicensing.LicenseAddition.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_LICENSE_ADDITION, org.spdx.library.model.v3_0_1.expandedlicensing.ExternalLicenseAddition.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_NAMESPACE_MAP, org.spdx.library.model.v3_0_1.core.NamespaceMap.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_PACKAGE_VERIFICATION_CODE, org.spdx.library.model.v3_0_1.core.PackageVerificationCode.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_REF, org.spdx.library.model.v3_0_1.core.ExternalRef.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_RELATIONSHIP_TYPE, org.spdx.library.model.v3_0_1.core.RelationshipType.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_LISTED_LICENSE, org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_LISTED_LICENSE, org.spdx.library.model.v3_0_1.expandedlicensing.ExternalListedLicense.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_CONJUNCTIVE_LICENSE_SET, org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_CONJUNCTIVE_LICENSE_SET, org.spdx.library.model.v3_0_1.expandedlicensing.ExternalConjunctiveLicenseSet.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_SPDX_PACKAGE, org.spdx.library.model.v3_0_1.software.SpdxPackage.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_EXTERNAL_SPDX_PACKAGE, org.spdx.library.model.v3_0_1.software.ExternalSpdxPackage.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTENDABLE_LICENSE, org.spdx.library.model.v3_0_1.expandedlicensing.ExtendableLicense.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_EXTENDABLE_LICENSE, org.spdx.library.model.v3_0_1.expandedlicensing.ExternalExtendableLicense.class);
		typeToClassV3.put(SpdxConstantsV3.DATASET_DATASET_TYPE, org.spdx.library.model.v3_0_1.dataset.DatasetType.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_INDIVIDUAL_LICENSING_INFO, org.spdx.library.model.v3_0_1.expandedlicensing.IndividualLicensingInfo.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_INDIVIDUAL_LICENSING_INFO, org.spdx.library.model.v3_0_1.expandedlicensing.ExternalIndividualLicensingInfo.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_ELEMENT, org.spdx.library.model.v3_0_1.core.Element.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_ELEMENT, org.spdx.library.model.v3_0_1.core.ExternalElement.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_SOFTWARE_ARTIFACT, org.spdx.library.model.v3_0_1.software.SoftwareArtifact.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_EXTERNAL_SOFTWARE_ARTIFACT, org.spdx.library.model.v3_0_1.software.ExternalSoftwareArtifact.class);
		typeToClassV3.put(SpdxConstantsV3.DATASET_CONFIDENTIALITY_LEVEL_TYPE, org.spdx.library.model.v3_0_1.dataset.ConfidentialityLevelType.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_BOM, org.spdx.library.model.v3_0_1.core.Bom.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_BOM, org.spdx.library.model.v3_0_1.core.ExternalBom.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_SUPPORT_TYPE, org.spdx.library.model.v3_0_1.core.SupportType.class);
		typeToClassV3.put(SpdxConstantsV3.SIMPLE_LICENSING_ANY_LICENSE_INFO, org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo.class);
		typeToClassV3.put(SpdxConstantsV3.SIMPLE_LICENSING_EXTERNAL_ANY_LICENSE_INFO, org.spdx.library.model.v3_0_1.simplelicensing.ExternalAnyLicenseInfo.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_SPDX_DOCUMENT, org.spdx.library.model.v3_0_1.core.SpdxDocument.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_SPDX_DOCUMENT, org.spdx.library.model.v3_0_1.core.ExternalSpdxDocument.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_SSVC_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_SSVC_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.ExternalSsvcVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_ARTIFACT, org.spdx.library.model.v3_0_1.core.Artifact.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_ARTIFACT, org.spdx.library.model.v3_0_1.core.ExternalArtifact.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_PROFILE_IDENTIFIER_TYPE, org.spdx.library.model.v3_0_1.core.ProfileIdentifierType.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_VEX_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.VexVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_VEX_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.ExternalVexVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_CVSS_V3_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.CvssV3VulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_CVSS_V3_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3_0_1.security.ExternalCvssV3VulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_ANNOTATION_TYPE, org.spdx.library.model.v3_0_1.core.AnnotationType.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_CUSTOM_LICENSE, org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicense.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_CUSTOM_LICENSE, org.spdx.library.model.v3_0_1.expandedlicensing.ExternalCustomLicense.class);
		typeToClassV3.put(SpdxConstantsV3.A_I_ENERGY_CONSUMPTION_DESCRIPTION, org.spdx.library.model.v3_0_1.ai.EnergyConsumptionDescription.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_HASH, org.spdx.library.model.v3_0_1.core.Hash.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_TOOL, org.spdx.library.model.v3_0_1.core.Tool.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_TOOL, org.spdx.library.model.v3_0_1.core.ExternalTool.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_NO_ASSERTION_ELEMENT, org.spdx.library.model.v3_0_1.core.NoAssertionElement.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_NONE_ELEMENT, org.spdx.library.model.v3_0_1.core.NoneElement.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_NO_ASSERTION_LICENSE, org.spdx.library.model.v3_0_1.expandedlicensing.NoAssertionLicense.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_NONE_LICENSE, org.spdx.library.model.v3_0_1.expandedlicensing.NoneLicense.class);
		
		SPDX_TYPE_TO_CLASS_V3 = Collections.unmodifiableMap(typeToClassV3);
		
		Map<Class<?>, String> classToType = new HashMap<>();
		for (Entry<String, Class<?>> entry:typeToClassV3.entrySet()) {
			classToType.put(entry.getValue(), entry.getKey());
		}
		
		SPDX_CLASS_TO_TYPE = Collections.unmodifiableMap(classToType);
	}
	
	/**
	 * Create an SPDX spec version 3.0 model object in a model store given the URI for the object
	 * @param modelStore model store where the object is to be created
	 * @param objectUri URI for the object
	 * @param type SPDX class or type
	 * @param copyManager if non-null, allows for copying of properties from other model stores or document URI's when referenced
	 * @param create if true, create the model object if it does not already exist
	 * @param idPrefix optional prefix used for any new object URI's created in support of this model object
	 * @return a ModelObject of type type
	 * @throws InvalidSPDXAnalysisException
	 */
	public static ModelObjectV3 getModelObject(IModelStore modelStore, String objectUri,
			String type, @Nullable IModelCopyManager copyManager, boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(modelStore, "Model store can not be null");
		Objects.requireNonNull(objectUri, "The object URI most not be null");
		
		Class<?> clazz = SPDX_TYPE_TO_CLASS_V3.get(type);
		if (Objects.isNull(clazz)) {
			throw new InvalidSPDXAnalysisException("Unknown SPDX version 3 type: "+type);
		}
		if (Modifier.isAbstract(clazz.getModifiers())) {
			throw new InvalidSPDXAnalysisException("Can not instantiate an abstract class for the SPDX version 3 type: "+type);
		}
		try {
			Constructor<?> con = clazz.getDeclaredConstructor(IModelStore.class, String.class, IModelCopyManager.class, boolean.class, String.class);
			return (ModelObjectV3)con.newInstance(modelStore, objectUri, copyManager, create, idPrefix);
		} catch (NoSuchMethodException e) {
			throw new InvalidSPDXAnalysisException("Could not create the model object SPDX version 3 type: "+type);
		} catch (SecurityException e) {
			throw new InvalidSPDXAnalysisException("Unexpected security exception for SPDX version 3 type: "+type, e);
		} catch (InstantiationException e) {
			throw new InvalidSPDXAnalysisException("Unexpected instantiation exception for SPDX version 3 type: "+type, e);
		} catch (IllegalAccessException e) {
			throw new InvalidSPDXAnalysisException("Unexpected illegal access exception for SPDX version 3 type: "+type, e);
		} catch (IllegalArgumentException e) {
			throw new InvalidSPDXAnalysisException("Unexpected illegal argument exception for SPDX version 3 type: "+type, e);
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof InvalidSPDXAnalysisException) {
				throw (InvalidSPDXAnalysisException)e.getTargetException();
			} else {
				throw new InvalidSPDXAnalysisException("Unexpected invocation target exception for SPDX version 2 type: "+type, e);
			}
		}
	}
	
	/**
	 * Creates a new CreationInfo including a new createdBy Agent - this can be used as a starting point for
	 * building new SPDX data
	 * @param modelStore model store where the creationInfo and Agent is to be created
	 * @param createdByUri The URI for the Agent who is the creator of the SPDX data
	 * @param createdByName The name of the Agent who is the creator of the SPDX data
	 * @param copyManager if non-null, allows for copying of properties from other model stores or document URI's when referenced
	 * @return a new CreationInfo
	 * @throws InvalidSPDXAnalysisException on error
	 */
	public static CreationInfo createCreationInfo(IModelStore modelStore, String createdByUri,
			String createdByName, @Nullable IModelCopyManager copyManager) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(modelStore, "Model store can not be null");
		Objects.requireNonNull(createdByUri, "The Agent object URI most not be null");
		DateFormat format = new SimpleDateFormat(SpdxConstantsV3.SPDX_DATE_FORMAT);
		String now = format.format(new Date());
		CreationInfo retval = new CreationInfo.CreationInfoBuilder(modelStore, modelStore.getNextId(IdType.Anonymous), copyManager)
				.setCreated(now)
				.setSpecVersion(SpdxConstantsV3.MODEL_SPEC_VERSION)
				.build();
		retval.getCreatedBys().add(retval.createAgent(createdByUri)
											.setName(createdByName)
											.build());
		return retval;
	}
}
