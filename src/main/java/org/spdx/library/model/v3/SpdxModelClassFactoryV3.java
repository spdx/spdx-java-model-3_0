/**
 * SPDX-FileCopyrightText: Copyright (c)  Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3;

import org.spdx.core.IModelCopyManager;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.library.model.v3.core.CreationInfo;
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
 */
public class SpdxModelClassFactoryV3 {

	public static Map<String, Class<?>> SPDX_TYPE_TO_CLASS_V3;
	public static Map<Class<?>, String> SPDX_CLASS_TO_TYPE;
	static {
		Map<String, Class<?>> typeToClassV3 = new HashMap<>();
		
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_SOFTWARE_ARTIFACT, org.spdx.library.model.v3.software.SoftwareArtifact.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_EXTERNAL_SOFTWARE_ARTIFACT, org.spdx.library.model.v3.software.ExternalSoftwareArtifact.class);
		typeToClassV3.put(SpdxConstantsV3.HARDWARE_DIMENSIONS, org.spdx.library.model.v3.hardware.Dimensions.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_LICENSE_ADDITION, org.spdx.library.model.v3.expandedlicensing.LicenseAddition.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_LICENSE_ADDITION, org.spdx.library.model.v3.expandedlicensing.ExternalLicenseAddition.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_REGULATION, org.spdx.library.model.v3.core.Regulation.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_REGULATION, org.spdx.library.model.v3.core.ExternalRegulation.class);
		typeToClassV3.put(SpdxConstantsV3.A_I_A_I_PACKAGE, org.spdx.library.model.v3.ai.AIPackage.class);
		typeToClassV3.put(SpdxConstantsV3.A_I_EXTERNAL_A_I_PACKAGE, org.spdx.library.model.v3.ai.ExternalAIPackage.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_CHANGE_PROCESS, org.spdx.library.model.v3.supplychain.ChangeProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_CHANGE_PROCESS, org.spdx.library.model.v3.supplychain.ExternalChangeProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_TEST_PROCESS, org.spdx.library.model.v3.supplychain.TestProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_TEST_PROCESS, org.spdx.library.model.v3.supplychain.ExternalTestProcess.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_LISTED_LICENSE_EXCEPTION, org.spdx.library.model.v3.expandedlicensing.ListedLicenseException.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_LISTED_LICENSE_EXCEPTION, org.spdx.library.model.v3.expandedlicensing.ExternalListedLicenseException.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTENDABLE_LICENSE, org.spdx.library.model.v3.expandedlicensing.ExtendableLicense.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_EXTENDABLE_LICENSE, org.spdx.library.model.v3.expandedlicensing.ExternalExtendableLicense.class);
		typeToClassV3.put(SpdxConstantsV3.SERVICE_SOFTWARE_SERVICE, org.spdx.library.model.v3.service.SoftwareService.class);
		typeToClassV3.put(SpdxConstantsV3.SERVICE_EXTERNAL_SOFTWARE_SERVICE, org.spdx.library.model.v3.service.ExternalSoftwareService.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_LISTED_LICENSE, org.spdx.library.model.v3.expandedlicensing.ListedLicense.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_LISTED_LICENSE, org.spdx.library.model.v3.expandedlicensing.ExternalListedLicense.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_CUSTOM_LICENSE, org.spdx.library.model.v3.expandedlicensing.CustomLicense.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_CUSTOM_LICENSE, org.spdx.library.model.v3.expandedlicensing.ExternalCustomLicense.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_SOFTWARE_AGENT, org.spdx.library.model.v3.core.SoftwareAgent.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_SOFTWARE_AGENT, org.spdx.library.model.v3.core.ExternalSoftwareAgent.class);
		typeToClassV3.put(SpdxConstantsV3.FUNCTIONAL_SAFETY_EVALUATION_RESULT_TYPE, org.spdx.library.model.v3.functionalsafety.EvaluationResultType.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_IDENTIFIER_TYPE, org.spdx.library.model.v3.core.ExternalIdentifierType.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_HARVEST_PROCESS, org.spdx.library.model.v3.supplychain.HarvestProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_HARVEST_PROCESS, org.spdx.library.model.v3.supplychain.ExternalHarvestProcess.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_RELATIONSHIP_TYPE, org.spdx.library.model.v3.core.RelationshipType.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_VULNERABILITY, org.spdx.library.model.v3.security.Vulnerability.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_VULNERABILITY, org.spdx.library.model.v3.security.ExternalVulnerability.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_REF, org.spdx.library.model.v3.core.ExternalRef.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_STATE_ACTION, org.spdx.library.model.v3.supplychain.StateAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_STATE_ACTION, org.spdx.library.model.v3.supplychain.ExternalStateAction.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_TOOL, org.spdx.library.model.v3.core.Tool.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_TOOL, org.spdx.library.model.v3.core.ExternalTool.class);
		typeToClassV3.put(SpdxConstantsV3.SIMPLE_LICENSING_ANY_LICENSE_INFO, org.spdx.library.model.v3.simplelicensing.AnyLicenseInfo.class);
		typeToClassV3.put(SpdxConstantsV3.SIMPLE_LICENSING_EXTERNAL_ANY_LICENSE_INFO, org.spdx.library.model.v3.simplelicensing.ExternalAnyLicenseInfo.class);
		typeToClassV3.put(SpdxConstantsV3.FUNCTIONAL_SAFETY_VERIFICATION_TYPE, org.spdx.library.model.v3.functionalsafety.VerificationType.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_ISO_AUTOMATION_LEVEL, org.spdx.library.model.v3.core.IsoAutomationLevel.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_CHANGE_ACTION, org.spdx.library.model.v3.supplychain.ChangeAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_CHANGE_ACTION, org.spdx.library.model.v3.supplychain.ExternalChangeAction.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_MEASURE_OF_MASS, org.spdx.library.model.v3.core.MeasureOfMass.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_CVSS_V4_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.CvssV4VulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_CVSS_V4_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.ExternalCvssV4VulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_RESOLUTION_ACTION, org.spdx.library.model.v3.supplychain.ResolutionAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_RESOLUTION_ACTION, org.spdx.library.model.v3.supplychain.ExternalResolutionAction.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_VEX_FIXED_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.VexFixedVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_VEX_FIXED_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.ExternalVexFixedVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_SPDX_PACKAGE, org.spdx.library.model.v3.software.SpdxPackage.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_EXTERNAL_SPDX_PACKAGE, org.spdx.library.model.v3.software.ExternalSpdxPackage.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_RESPONSIBILITY_CHANGE_PROCESS, org.spdx.library.model.v3.supplychain.ResponsibilityChangeProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_RESPONSIBILITY_CHANGE_PROCESS, org.spdx.library.model.v3.supplychain.ExternalResponsibilityChangeProcess.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_SUPPORT_TYPE, org.spdx.library.model.v3.core.SupportType.class);
		typeToClassV3.put(SpdxConstantsV3.HARDWARE_BULK_HARDWARE, org.spdx.library.model.v3.hardware.BulkHardware.class);
		typeToClassV3.put(SpdxConstantsV3.HARDWARE_EXTERNAL_BULK_HARDWARE, org.spdx.library.model.v3.hardware.ExternalBulkHardware.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_PROCESS_READINESS_TYPE, org.spdx.library.model.v3.core.ProcessReadinessType.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_CREATION_INFO, org.spdx.library.model.v3.core.CreationInfo.class);
		typeToClassV3.put(SpdxConstantsV3.A_I_SAFETY_RISK_ASSESSMENT_TYPE, org.spdx.library.model.v3.ai.SafetyRiskAssessmentType.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_VEX_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.VexVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_VEX_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.ExternalVexVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_CVSS_V3_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_CVSS_V3_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.ExternalCvssV3VulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_INSTANTIATE_VIRTUAL_HARDWARE_PROCESS, org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_INSTANTIATE_VIRTUAL_HARDWARE_PROCESS, org.spdx.library.model.v3.supplychain.ExternalInstantiateVirtualHardwareProcess.class);
		typeToClassV3.put(SpdxConstantsV3.A_I_ENERGY_CONSUMPTION, org.spdx.library.model.v3.ai.EnergyConsumption.class);
		typeToClassV3.put(SpdxConstantsV3.DATASET_CONFIDENTIALITY_LEVEL_TYPE, org.spdx.library.model.v3.dataset.ConfidentialityLevelType.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_CONJUNCTIVE_LICENSE_SET, org.spdx.library.model.v3.expandedlicensing.ConjunctiveLicenseSet.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_CONJUNCTIVE_LICENSE_SET, org.spdx.library.model.v3.expandedlicensing.ExternalConjunctiveLicenseSet.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_HASH, org.spdx.library.model.v3.core.Hash.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_TEST_ACTION, org.spdx.library.model.v3.supplychain.TestAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_TEST_ACTION, org.spdx.library.model.v3.supplychain.ExternalTestAction.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.VulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.ExternalVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_USE_ACTION, org.spdx.library.model.v3.supplychain.UseAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_USE_ACTION, org.spdx.library.model.v3.supplychain.ExternalUseAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_INSPECTION_ACTION, org.spdx.library.model.v3.supplychain.InspectionAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_INSPECTION_ACTION, org.spdx.library.model.v3.supplychain.ExternalInspectionAction.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_AGENT, org.spdx.library.model.v3.core.Agent.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_AGENT, org.spdx.library.model.v3.core.ExternalAgent.class);
		typeToClassV3.put(SpdxConstantsV3.SERVICE_AUTHENTICATION_PROTOCOL_TYPE, org.spdx.library.model.v3.service.AuthenticationProtocolType.class);
		typeToClassV3.put(SpdxConstantsV3.DATASET_DATASET_AVAILABILITY_TYPE, org.spdx.library.model.v3.dataset.DatasetAvailabilityType.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_INSPECTION_PROCESS, org.spdx.library.model.v3.supplychain.InspectionProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_INSPECTION_PROCESS, org.spdx.library.model.v3.supplychain.ExternalInspectionProcess.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_ANNOTATION, org.spdx.library.model.v3.core.Annotation.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_ANNOTATION, org.spdx.library.model.v3.core.ExternalAnnotation.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_ELEMENT, org.spdx.library.model.v3.core.Element.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_ELEMENT, org.spdx.library.model.v3.core.ExternalElement.class);
		typeToClassV3.put(SpdxConstantsV3.HARDWARE_PHYSICAL_HARDWARE, org.spdx.library.model.v3.hardware.PhysicalHardware.class);
		typeToClassV3.put(SpdxConstantsV3.HARDWARE_EXTERNAL_PHYSICAL_HARDWARE, org.spdx.library.model.v3.hardware.ExternalPhysicalHardware.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_STATE, org.spdx.library.model.v3.supplychain.State.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_STATE, org.spdx.library.model.v3.supplychain.ExternalState.class);
		typeToClassV3.put(SpdxConstantsV3.HARDWARE_HARDWARE, org.spdx.library.model.v3.hardware.Hardware.class);
		typeToClassV3.put(SpdxConstantsV3.HARDWARE_EXTERNAL_HARDWARE, org.spdx.library.model.v3.hardware.ExternalHardware.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_BOUNDARY_DEFINITION_ACTION, org.spdx.library.model.v3.supplychain.BoundaryDefinitionAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_BOUNDARY_DEFINITION_ACTION, org.spdx.library.model.v3.supplychain.ExternalBoundaryDefinitionAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_CREATE_PROCESS, org.spdx.library.model.v3.supplychain.CreateProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_CREATE_PROCESS, org.spdx.library.model.v3.supplychain.ExternalCreateProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_PLAN_PROCESS, org.spdx.library.model.v3.supplychain.PlanProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_PLAN_PROCESS, org.spdx.library.model.v3.supplychain.ExternalPlanProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EPSS_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.EpssVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_EPSS_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.ExternalEpssVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_BOUNDARY_DEFINITION_PROCESS, org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_BOUNDARY_DEFINITION_PROCESS, org.spdx.library.model.v3.supplychain.ExternalBoundaryDefinitionProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_TRANSPORT_PROCESS, org.spdx.library.model.v3.supplychain.TransportProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_TRANSPORT_PROCESS, org.spdx.library.model.v3.supplychain.ExternalTransportProcess.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_LOCATION, org.spdx.library.model.v3.core.Location.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_LOCATION, org.spdx.library.model.v3.core.ExternalLocation.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_ACTION, org.spdx.library.model.v3.core.Action.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_ACTION, org.spdx.library.model.v3.core.ExternalAction.class);
		typeToClassV3.put(SpdxConstantsV3.FUNCTIONAL_SAFETY_EVIDENCE_TYPE, org.spdx.library.model.v3.functionalsafety.EvidenceType.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_REPRODUCE_ACTION, org.spdx.library.model.v3.supplychain.ReproduceAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_REPRODUCE_ACTION, org.spdx.library.model.v3.supplychain.ExternalReproduceAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_MANUFACTURE_PROCESS, org.spdx.library.model.v3.supplychain.ManufactureProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_MANUFACTURE_PROCESS, org.spdx.library.model.v3.supplychain.ExternalManufactureProcess.class);
		typeToClassV3.put(SpdxConstantsV3.FUNCTIONAL_SAFETY_EVIDENCE_RELATIONSHIP, org.spdx.library.model.v3.functionalsafety.EvidenceRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.FUNCTIONAL_SAFETY_EXTERNAL_EVIDENCE_RELATIONSHIP, org.spdx.library.model.v3.functionalsafety.ExternalEvidenceRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_SPECIFICATION, org.spdx.library.model.v3.core.Specification.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_SPECIFICATION, org.spdx.library.model.v3.core.ExternalSpecification.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_OR_LATER_OPERATOR, org.spdx.library.model.v3.expandedlicensing.OrLaterOperator.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_OR_LATER_OPERATOR, org.spdx.library.model.v3.expandedlicensing.ExternalOrLaterOperator.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_CONTENT_IDENTIFIER, org.spdx.library.model.v3.software.ContentIdentifier.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_SPDX_FILE, org.spdx.library.model.v3.software.SpdxFile.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_EXTERNAL_SPDX_FILE, org.spdx.library.model.v3.software.ExternalSpdxFile.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_FILE_KIND_TYPE, org.spdx.library.model.v3.software.FileKindType.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXPLOIT_CATALOG_TYPE, org.spdx.library.model.v3.security.ExploitCatalogType.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_DESTROY_PROCESS, org.spdx.library.model.v3.supplychain.DestroyProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_DESTROY_PROCESS, org.spdx.library.model.v3.supplychain.ExternalDestroyProcess.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_REQUIREMENT, org.spdx.library.model.v3.core.Requirement.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_REQUIREMENT, org.spdx.library.model.v3.core.ExternalRequirement.class);
		typeToClassV3.put(SpdxConstantsV3.SIMPLE_LICENSING_SIMPLE_LICENSING_TEXT, org.spdx.library.model.v3.simplelicensing.SimpleLicensingText.class);
		typeToClassV3.put(SpdxConstantsV3.SIMPLE_LICENSING_EXTERNAL_SIMPLE_LICENSING_TEXT, org.spdx.library.model.v3.simplelicensing.ExternalSimpleLicensingText.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_PROFILE_IDENTIFIER_TYPE, org.spdx.library.model.v3.core.ProfileIdentifierType.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_BOM, org.spdx.library.model.v3.core.Bom.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_BOM, org.spdx.library.model.v3.core.ExternalBom.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_DEFINED_STATE_PROCESS, org.spdx.library.model.v3.supplychain.DefinedStateProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_DEFINED_STATE_PROCESS, org.spdx.library.model.v3.supplychain.ExternalDefinedStateProcess.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_PHYSICAL_LOCATION, org.spdx.library.model.v3.core.PhysicalLocation.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_PHYSICAL_LOCATION, org.spdx.library.model.v3.core.ExternalPhysicalLocation.class);
		typeToClassV3.put(SpdxConstantsV3.EXTENSION_CDX_PROPERTIES_EXTENSION, org.spdx.library.model.v3.extension.CdxPropertiesExtension.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_MODIFY_PROCESS, org.spdx.library.model.v3.supplychain.ModifyProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_MODIFY_PROCESS, org.spdx.library.model.v3.supplychain.ExternalModifyProcess.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_RELATIONSHIP, org.spdx.library.model.v3.core.Relationship.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_RELATIONSHIP, org.spdx.library.model.v3.core.ExternalRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_ELEMENT_COLLECTION, org.spdx.library.model.v3.core.ElementCollection.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_ELEMENT_COLLECTION, org.spdx.library.model.v3.core.ExternalElementCollection.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_SSVC_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.SsvcVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_SSVC_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.ExternalSsvcVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_RESPONSIBILITY_CHANGE_ACTION, org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_RESPONSIBILITY_CHANGE_ACTION, org.spdx.library.model.v3.supplychain.ExternalResponsibilityChangeAction.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_ANNOTATION_TYPE, org.spdx.library.model.v3.core.AnnotationType.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_DISJUNCTIVE_LICENSE_SET, org.spdx.library.model.v3.expandedlicensing.DisjunctiveLicenseSet.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_DISJUNCTIVE_LICENSE_SET, org.spdx.library.model.v3.expandedlicensing.ExternalDisjunctiveLicenseSet.class);
		typeToClassV3.put(SpdxConstantsV3.BUILD_BUILD, org.spdx.library.model.v3.build.Build.class);
		typeToClassV3.put(SpdxConstantsV3.BUILD_EXTERNAL_BUILD, org.spdx.library.model.v3.build.ExternalBuild.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_RELATIONSHIP_COMPLETENESS, org.spdx.library.model.v3.core.RelationshipCompleteness.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_DICTIONARY_ENTRY, org.spdx.library.model.v3.core.DictionaryEntry.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_ASSEMBLY_PROCESS, org.spdx.library.model.v3.supplychain.AssemblyProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_ASSEMBLY_PROCESS, org.spdx.library.model.v3.supplychain.ExternalAssemblyProcess.class);
		typeToClassV3.put(SpdxConstantsV3.A_I_ENERGY_CONSUMPTION_DESCRIPTION, org.spdx.library.model.v3.ai.EnergyConsumptionDescription.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_USE_PROCESS, org.spdx.library.model.v3.supplychain.UseProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_USE_PROCESS, org.spdx.library.model.v3.supplychain.ExternalUseProcess.class);
		typeToClassV3.put(SpdxConstantsV3.HARDWARE_VIRTUAL_HARDWARE_MODEL_TYPE, org.spdx.library.model.v3.hardware.VirtualHardwareModelType.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_UNIT_OF_MEASURE, org.spdx.library.model.v3.core.UnitOfMeasure.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_INDIVIDUAL_ELEMENT, org.spdx.library.model.v3.core.IndividualElement.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_INDIVIDUAL_ELEMENT, org.spdx.library.model.v3.core.ExternalIndividualElement.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_RESPONSIBILITY_TYPE, org.spdx.library.model.v3.supplychain.ResponsibilityType.class);
		typeToClassV3.put(SpdxConstantsV3.HARDWARE_VIRTUAL_HARDWARE, org.spdx.library.model.v3.hardware.VirtualHardware.class);
		typeToClassV3.put(SpdxConstantsV3.HARDWARE_EXTERNAL_VIRTUAL_HARDWARE, org.spdx.library.model.v3.hardware.ExternalVirtualHardware.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_BOUNDARY_CROSSING_ACTION, org.spdx.library.model.v3.supplychain.BoundaryCrossingAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_BOUNDARY_CROSSING_ACTION, org.spdx.library.model.v3.supplychain.ExternalBoundaryCrossingAction.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_ELEMENT_MAP, org.spdx.library.model.v3.core.ElementMap.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_CONTENT_IDENTIFIER_TYPE, org.spdx.library.model.v3.software.ContentIdentifierType.class);
		typeToClassV3.put(SpdxConstantsV3.OPERATIONS_EXPORT_CONTROL_CLASSIFICATION, org.spdx.library.model.v3.operations.ExportControlClassification.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_MAP, org.spdx.library.model.v3.core.ExternalMap.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_MODIFY_ACTION, org.spdx.library.model.v3.supplychain.ModifyAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_MODIFY_ACTION, org.spdx.library.model.v3.supplychain.ExternalModifyAction.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_WITH_ADDITION_OPERATOR, org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_WITH_ADDITION_OPERATOR, org.spdx.library.model.v3.expandedlicensing.ExternalWithAdditionOperator.class);
		typeToClassV3.put(SpdxConstantsV3.EXTENSION_CDX_PROPERTY_ENTRY, org.spdx.library.model.v3.extension.CdxPropertyEntry.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_CUSTOM_LICENSE_ADDITION, org.spdx.library.model.v3.expandedlicensing.CustomLicenseAddition.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_CUSTOM_LICENSE_ADDITION, org.spdx.library.model.v3.expandedlicensing.ExternalCustomLicenseAddition.class);
		typeToClassV3.put(SpdxConstantsV3.OPERATIONS_PROJECT, org.spdx.library.model.v3.operations.Project.class);
		typeToClassV3.put(SpdxConstantsV3.OPERATIONS_EXTERNAL_PROJECT, org.spdx.library.model.v3.operations.ExternalProject.class);
		typeToClassV3.put(SpdxConstantsV3.SIMPLE_LICENSING_LICENSE_EXPRESSION, org.spdx.library.model.v3.simplelicensing.LicenseExpression.class);
		typeToClassV3.put(SpdxConstantsV3.SIMPLE_LICENSING_EXTERNAL_LICENSE_EXPRESSION, org.spdx.library.model.v3.simplelicensing.ExternalLicenseExpression.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_LIFECYCLE_SCOPE_TYPE, org.spdx.library.model.v3.core.LifecycleScopeType.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_HARVEST_ACTION, org.spdx.library.model.v3.supplychain.HarvestAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_HARVEST_ACTION, org.spdx.library.model.v3.supplychain.ExternalHarvestAction.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_HASH_ALGORITHM, org.spdx.library.model.v3.core.HashAlgorithm.class);
		typeToClassV3.put(SpdxConstantsV3.FUNCTIONAL_SAFETY_REQUIREMENT_VERIFICATION, org.spdx.library.model.v3.functionalsafety.RequirementVerification.class);
		typeToClassV3.put(SpdxConstantsV3.FUNCTIONAL_SAFETY_EXTERNAL_REQUIREMENT_VERIFICATION, org.spdx.library.model.v3.functionalsafety.ExternalRequirementVerification.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_VEX_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.VexAffectedVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_VEX_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.ExternalVexAffectedVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_SPDX_DOCUMENT, org.spdx.library.model.v3.core.SpdxDocument.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_SPDX_DOCUMENT, org.spdx.library.model.v3.core.ExternalSpdxDocument.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_ARTIFACT, org.spdx.library.model.v3.core.Artifact.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_ARTIFACT, org.spdx.library.model.v3.core.ExternalArtifact.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_INTEGRITY_METHOD, org.spdx.library.model.v3.core.IntegrityMethod.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_PERSON, org.spdx.library.model.v3.core.Person.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_PERSON, org.spdx.library.model.v3.core.ExternalPerson.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_INDIVIDUAL_LICENSING_INFO, org.spdx.library.model.v3.expandedlicensing.IndividualLicensingInfo.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_INDIVIDUAL_LICENSING_INFO, org.spdx.library.model.v3.expandedlicensing.ExternalIndividualLicensingInfo.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_CONTACT_POINT_RELATIONSHIP, org.spdx.library.model.v3.core.ContactPointRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_CONTACT_POINT_RELATIONSHIP, org.spdx.library.model.v3.core.ExternalContactPointRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_LIFECYCLE_SCOPED_RELATIONSHIP, org.spdx.library.model.v3.core.LifecycleScopedRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_LIFECYCLE_SCOPED_RELATIONSHIP, org.spdx.library.model.v3.core.ExternalLifecycleScopedRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_SOFTWARE_PURPOSE, org.spdx.library.model.v3.software.SoftwarePurpose.class);
		typeToClassV3.put(SpdxConstantsV3.DATASET_DATASET_PACKAGE, org.spdx.library.model.v3.dataset.DatasetPackage.class);
		typeToClassV3.put(SpdxConstantsV3.DATASET_EXTERNAL_DATASET_PACKAGE, org.spdx.library.model.v3.dataset.ExternalDatasetPackage.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_SNIPPET, org.spdx.library.model.v3.software.Snippet.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_EXTERNAL_SNIPPET, org.spdx.library.model.v3.software.ExternalSnippet.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_VEX_JUSTIFICATION_TYPE, org.spdx.library.model.v3.security.VexJustificationType.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_CONTACT_POINT_RELATIONSHIP_TYPE, org.spdx.library.model.v3.core.ContactPointRelationshipType.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_VEX_UNDER_INVESTIGATION_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.VexUnderInvestigationVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_VEX_UNDER_INVESTIGATION_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.ExternalVexUnderInvestigationVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_LICENSE, org.spdx.library.model.v3.expandedlicensing.License.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_EXTERNAL_LICENSE, org.spdx.library.model.v3.expandedlicensing.ExternalLicense.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_IDENTIFIER, org.spdx.library.model.v3.core.ExternalIdentifier.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_NAMESPACE_MAP, org.spdx.library.model.v3.core.NamespaceMap.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_STORAGE_PROCESS, org.spdx.library.model.v3.supplychain.StorageProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_STORAGE_PROCESS, org.spdx.library.model.v3.supplychain.ExternalStorageProcess.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_PRESENCE_TYPE, org.spdx.library.model.v3.core.PresenceType.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_SBOM, org.spdx.library.model.v3.software.Sbom.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_EXTERNAL_SBOM, org.spdx.library.model.v3.software.ExternalSbom.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_PACKAGE_VERIFICATION_CODE, org.spdx.library.model.v3.core.PackageVerificationCode.class);
		typeToClassV3.put(SpdxConstantsV3.SOFTWARE_SBOM_TYPE, org.spdx.library.model.v3.software.SbomType.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_OUT_OF_SPEC_ACTION, org.spdx.library.model.v3.supplychain.OutOfSpecAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_OUT_OF_SPEC_ACTION, org.spdx.library.model.v3.supplychain.ExternalOutOfSpecAction.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_VEX_NOT_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.VexNotAffectedVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_VEX_NOT_AFFECTED_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.ExternalVexNotAffectedVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_STORAGE_ACTION, org.spdx.library.model.v3.supplychain.StorageAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_STORAGE_ACTION, org.spdx.library.model.v3.supplychain.ExternalStorageAction.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_SPECIFICATION_TYPE, org.spdx.library.model.v3.core.SpecificationType.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_DESTROY_ACTION, org.spdx.library.model.v3.supplychain.DestroyAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_DESTROY_ACTION, org.spdx.library.model.v3.supplychain.ExternalDestroyAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_REPRODUCE_PROCESS, org.spdx.library.model.v3.supplychain.ReproduceProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_REPRODUCE_PROCESS, org.spdx.library.model.v3.supplychain.ExternalReproduceProcess.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_CVSS_SEVERITY_TYPE, org.spdx.library.model.v3.security.CvssSeverityType.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_ORGANIZATION, org.spdx.library.model.v3.core.Organization.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_ORGANIZATION, org.spdx.library.model.v3.core.ExternalOrganization.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_REF_TYPE, org.spdx.library.model.v3.core.ExternalRefType.class);
		typeToClassV3.put(SpdxConstantsV3.DATASET_DATASET_TYPE, org.spdx.library.model.v3.dataset.DatasetType.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_MANUFACTURE_ACTION, org.spdx.library.model.v3.supplychain.ManufactureAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_MANUFACTURE_ACTION, org.spdx.library.model.v3.supplychain.ExternalManufactureAction.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_POSITIVE_INTEGER_RANGE, org.spdx.library.model.v3.core.PositiveIntegerRange.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_SSVC_DECISION_TYPE, org.spdx.library.model.v3.security.SsvcDecisionType.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_BUNDLE, org.spdx.library.model.v3.core.Bundle.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_BUNDLE, org.spdx.library.model.v3.core.ExternalBundle.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXPLOIT_CATALOG_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.ExploitCatalogVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_EXPLOIT_CATALOG_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.ExternalExploitCatalogVulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_CVSS_V2_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.CvssV2VulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.SECURITY_EXTERNAL_CVSS_V2_VULN_ASSESSMENT_RELATIONSHIP, org.spdx.library.model.v3.security.ExternalCvssV2VulnAssessmentRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.FUNCTIONAL_SAFETY_EVALUATION_RESULT, org.spdx.library.model.v3.functionalsafety.EvaluationResult.class);
		typeToClassV3.put(SpdxConstantsV3.FUNCTIONAL_SAFETY_EXTERNAL_EVALUATION_RESULT, org.spdx.library.model.v3.functionalsafety.ExternalEvaluationResult.class);
		typeToClassV3.put(SpdxConstantsV3.OPERATIONS_EXPORT_CONTROL_CLASSIFICATION_ASSESSMENT, org.spdx.library.model.v3.operations.ExportControlClassificationAssessment.class);
		typeToClassV3.put(SpdxConstantsV3.OPERATIONS_EXTERNAL_EXPORT_CONTROL_CLASSIFICATION_ASSESSMENT, org.spdx.library.model.v3.operations.ExternalExportControlClassificationAssessment.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_ASSEMBLY_ACTION, org.spdx.library.model.v3.supplychain.AssemblyAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_ASSEMBLY_ACTION, org.spdx.library.model.v3.supplychain.ExternalAssemblyAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_TRANSPORT_ACTION, org.spdx.library.model.v3.supplychain.TransportAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_TRANSPORT_ACTION, org.spdx.library.model.v3.supplychain.ExternalTransportAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_CREATE_ACTION, org.spdx.library.model.v3.supplychain.CreateAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_CREATE_ACTION, org.spdx.library.model.v3.supplychain.ExternalCreateAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_PLAN_ACTION, org.spdx.library.model.v3.supplychain.PlanAction.class);
		typeToClassV3.put(SpdxConstantsV3.SUPPLY_CHAIN_EXTERNAL_PLAN_ACTION, org.spdx.library.model.v3.supplychain.ExternalPlanAction.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_DEFINED_TYPE, org.spdx.library.model.v3.core.DefinedType.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_SUPPORT_RELATIONSHIP, org.spdx.library.model.v3.core.SupportRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_SUPPORT_RELATIONSHIP, org.spdx.library.model.v3.core.ExternalSupportRelationship.class);
		typeToClassV3.put(SpdxConstantsV3.HARDWARE_PRODUCT_SPECIFICATION, org.spdx.library.model.v3.hardware.ProductSpecification.class);
		typeToClassV3.put(SpdxConstantsV3.HARDWARE_EXTERNAL_PRODUCT_SPECIFICATION, org.spdx.library.model.v3.hardware.ExternalProductSpecification.class);
		typeToClassV3.put(SpdxConstantsV3.A_I_ENERGY_UNIT_TYPE, org.spdx.library.model.v3.ai.EnergyUnitType.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_MEASURE_OF_LENGTH, org.spdx.library.model.v3.core.MeasureOfLength.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_DEFINED_PROCESS, org.spdx.library.model.v3.core.DefinedProcess.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_EXTERNAL_DEFINED_PROCESS, org.spdx.library.model.v3.core.ExternalDefinedProcess.class);
		typeToClassV3.put(SpdxConstantsV3.EXTENSION_EXTENSION, org.spdx.library.model.v3.extension.Extension.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_SPDX_ORGANIZATION, org.spdx.library.model.v3.core.SpdxOrganization.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_NONE_LICENSE, org.spdx.library.model.v3.expandedlicensing.NoneLicense.class);
		typeToClassV3.put(SpdxConstantsV3.EXPANDED_LICENSING_NO_ASSERTION_LICENSE, org.spdx.library.model.v3.expandedlicensing.NoAssertionLicense.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_NONE_ELEMENT, org.spdx.library.model.v3.core.NoneElement.class);
		typeToClassV3.put(SpdxConstantsV3.CORE_NO_ASSERTION_ELEMENT, org.spdx.library.model.v3.core.NoAssertionElement.class);
		typeToClassV3.put(org.spdx.library.model.v3.simplelicensing.InvalidLicenseExpression.INVALID_LICENSE_EXPRESSION_TYPE, org.spdx.library.model.v3.simplelicensing.InvalidLicenseExpression.class);
		
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
	 * @param specVersion SPDX specification version
	 * @param create if true, create the model object if it does not already exist
	 * @param idPrefix optional prefix used for any new object URI's created in support of this model object
	 * @return a ModelObject of type type
	 * @throws InvalidSPDXAnalysisException
	 */
	public static ModelObjectV3 getModelObject(IModelStore modelStore, String objectUri,
			String type, @Nullable IModelCopyManager copyManager, String specVersion, boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
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
			Constructor<?> con = clazz.getDeclaredConstructor(IModelStore.class, String.class, IModelCopyManager.class, boolean.class, String.class, String.class);
			return (ModelObjectV3)con.newInstance(modelStore, objectUri, copyManager, create, specVersion, idPrefix);
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
				throw new InvalidSPDXAnalysisException("Unexpected invocation target exception for SPDX version 3 type: "+type, e);
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
