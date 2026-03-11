/**
 * SPDX-FileCopyrightText: Copyright (c)  Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import javax.annotation.Nullable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spdx.core.CoreModelObject;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.SimpleUriValue;
import org.spdx.core.SpdxInvalidTypeException;
import org.spdx.library.model.v3.ai.AIPackage;
import org.spdx.library.model.v3.ai.EnergyConsumption;
import org.spdx.library.model.v3.ai.EnergyConsumptionDescription;
import org.spdx.library.model.v3.ai.ExternalAIPackage;
import org.spdx.library.model.v3.build.Build;
import org.spdx.library.model.v3.build.ExternalBuild;
import org.spdx.library.model.v3.core.Action;
import org.spdx.library.model.v3.core.Agent;
import org.spdx.library.model.v3.core.Annotation;
import org.spdx.library.model.v3.core.Artifact;
import org.spdx.library.model.v3.core.Bom;
import org.spdx.library.model.v3.core.Bundle;
import org.spdx.library.model.v3.core.ContactPointRelationship;
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.DefinedProcess;
import org.spdx.library.model.v3.core.DefinedType;
import org.spdx.library.model.v3.core.DictionaryEntry;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.ElementCollection;
import org.spdx.library.model.v3.core.ElementMap;
import org.spdx.library.model.v3.core.ExternalAction;
import org.spdx.library.model.v3.core.ExternalAgent;
import org.spdx.library.model.v3.core.ExternalAnnotation;
import org.spdx.library.model.v3.core.ExternalArtifact;
import org.spdx.library.model.v3.core.ExternalBom;
import org.spdx.library.model.v3.core.ExternalBundle;
import org.spdx.library.model.v3.core.ExternalContactPointRelationship;
import org.spdx.library.model.v3.core.ExternalDefinedProcess;
import org.spdx.library.model.v3.core.ExternalElement;
import org.spdx.library.model.v3.core.ExternalElementCollection;
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalIndividualElement;
import org.spdx.library.model.v3.core.ExternalLifecycleScopedRelationship;
import org.spdx.library.model.v3.core.ExternalLocation;
import org.spdx.library.model.v3.core.ExternalMap;
import org.spdx.library.model.v3.core.ExternalOrganization;
import org.spdx.library.model.v3.core.ExternalPerson;
import org.spdx.library.model.v3.core.ExternalPhysicalLocation;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.ExternalRegulation;
import org.spdx.library.model.v3.core.ExternalRelationship;
import org.spdx.library.model.v3.core.ExternalRequirement;
import org.spdx.library.model.v3.core.ExternalSoftwareAgent;
import org.spdx.library.model.v3.core.ExternalSpdxDocument;
import org.spdx.library.model.v3.core.ExternalSpecification;
import org.spdx.library.model.v3.core.ExternalSupportRelationship;
import org.spdx.library.model.v3.core.ExternalTool;
import org.spdx.library.model.v3.core.Hash;
import org.spdx.library.model.v3.core.IndividualElement;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.LifecycleScopedRelationship;
import org.spdx.library.model.v3.core.Location;
import org.spdx.library.model.v3.core.MeasureOfLength;
import org.spdx.library.model.v3.core.MeasureOfMass;
import org.spdx.library.model.v3.core.NamespaceMap;
import org.spdx.library.model.v3.core.Organization;
import org.spdx.library.model.v3.core.PackageVerificationCode;
import org.spdx.library.model.v3.core.Person;
import org.spdx.library.model.v3.core.PhysicalLocation;
import org.spdx.library.model.v3.core.PositiveIntegerRange;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.core.Regulation;
import org.spdx.library.model.v3.core.Relationship;
import org.spdx.library.model.v3.core.Requirement;
import org.spdx.library.model.v3.core.SoftwareAgent;
import org.spdx.library.model.v3.core.SpdxDocument;
import org.spdx.library.model.v3.core.Specification;
import org.spdx.library.model.v3.core.SupportRelationship;
import org.spdx.library.model.v3.core.Tool;
import org.spdx.library.model.v3.core.UnitOfMeasure;
import org.spdx.library.model.v3.dataset.DatasetPackage;
import org.spdx.library.model.v3.dataset.ExternalDatasetPackage;
import org.spdx.library.model.v3.expandedlicensing.ConjunctiveLicenseSet;
import org.spdx.library.model.v3.expandedlicensing.CustomLicense;
import org.spdx.library.model.v3.expandedlicensing.CustomLicenseAddition;
import org.spdx.library.model.v3.expandedlicensing.DisjunctiveLicenseSet;
import org.spdx.library.model.v3.expandedlicensing.ExtendableLicense;
import org.spdx.library.model.v3.expandedlicensing.ExternalConjunctiveLicenseSet;
import org.spdx.library.model.v3.expandedlicensing.ExternalCustomLicense;
import org.spdx.library.model.v3.expandedlicensing.ExternalCustomLicenseAddition;
import org.spdx.library.model.v3.expandedlicensing.ExternalDisjunctiveLicenseSet;
import org.spdx.library.model.v3.expandedlicensing.ExternalExtendableLicense;
import org.spdx.library.model.v3.expandedlicensing.ExternalIndividualLicensingInfo;
import org.spdx.library.model.v3.expandedlicensing.ExternalLicense;
import org.spdx.library.model.v3.expandedlicensing.ExternalLicenseAddition;
import org.spdx.library.model.v3.expandedlicensing.ExternalListedLicense;
import org.spdx.library.model.v3.expandedlicensing.ExternalListedLicenseException;
import org.spdx.library.model.v3.expandedlicensing.ExternalOrLaterOperator;
import org.spdx.library.model.v3.expandedlicensing.ExternalWithAdditionOperator;
import org.spdx.library.model.v3.expandedlicensing.IndividualLicensingInfo;
import org.spdx.library.model.v3.expandedlicensing.License;
import org.spdx.library.model.v3.expandedlicensing.LicenseAddition;
import org.spdx.library.model.v3.expandedlicensing.ListedLicense;
import org.spdx.library.model.v3.expandedlicensing.ListedLicenseException;
import org.spdx.library.model.v3.expandedlicensing.OrLaterOperator;
import org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator;
import org.spdx.library.model.v3.extension.CdxPropertiesExtension;
import org.spdx.library.model.v3.extension.CdxPropertyEntry;
import org.spdx.library.model.v3.extension.Extension;
import org.spdx.library.model.v3.functionalsafety.EvaluationResult;
import org.spdx.library.model.v3.functionalsafety.EvidenceRelationship;
import org.spdx.library.model.v3.functionalsafety.ExternalEvaluationResult;
import org.spdx.library.model.v3.functionalsafety.ExternalEvidenceRelationship;
import org.spdx.library.model.v3.functionalsafety.ExternalRequirementVerification;
import org.spdx.library.model.v3.functionalsafety.RequirementVerification;
import org.spdx.library.model.v3.hardware.BulkHardware;
import org.spdx.library.model.v3.hardware.Dimensions;
import org.spdx.library.model.v3.hardware.ExternalBulkHardware;
import org.spdx.library.model.v3.hardware.ExternalHardware;
import org.spdx.library.model.v3.hardware.ExternalPhysicalHardware;
import org.spdx.library.model.v3.hardware.ExternalProductSpecification;
import org.spdx.library.model.v3.hardware.ExternalVirtualHardware;
import org.spdx.library.model.v3.hardware.Hardware;
import org.spdx.library.model.v3.hardware.PhysicalHardware;
import org.spdx.library.model.v3.hardware.ProductSpecification;
import org.spdx.library.model.v3.hardware.VirtualHardware;
import org.spdx.library.model.v3.operations.ExportControlClassification;
import org.spdx.library.model.v3.operations.ExportControlClassificationAssessment;
import org.spdx.library.model.v3.operations.ExternalExportControlClassificationAssessment;
import org.spdx.library.model.v3.operations.ExternalProject;
import org.spdx.library.model.v3.operations.Project;
import org.spdx.library.model.v3.security.CvssV2VulnAssessmentRelationship;
import org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship;
import org.spdx.library.model.v3.security.CvssV4VulnAssessmentRelationship;
import org.spdx.library.model.v3.security.EpssVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.ExploitCatalogVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.ExternalCvssV2VulnAssessmentRelationship;
import org.spdx.library.model.v3.security.ExternalCvssV3VulnAssessmentRelationship;
import org.spdx.library.model.v3.security.ExternalCvssV4VulnAssessmentRelationship;
import org.spdx.library.model.v3.security.ExternalEpssVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.ExternalExploitCatalogVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.ExternalSsvcVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.ExternalVexAffectedVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.ExternalVexFixedVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.ExternalVexNotAffectedVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.ExternalVexUnderInvestigationVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.ExternalVexVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.ExternalVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.ExternalVulnerability;
import org.spdx.library.model.v3.security.SsvcVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.VexAffectedVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.VexFixedVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.VexNotAffectedVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.VexUnderInvestigationVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.VexVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.VulnAssessmentRelationship;
import org.spdx.library.model.v3.security.Vulnerability;
import org.spdx.library.model.v3.service.ExternalSoftwareService;
import org.spdx.library.model.v3.service.SoftwareService;
import org.spdx.library.model.v3.simplelicensing.AnyLicenseInfo;
import org.spdx.library.model.v3.simplelicensing.ExternalAnyLicenseInfo;
import org.spdx.library.model.v3.simplelicensing.ExternalLicenseExpression;
import org.spdx.library.model.v3.simplelicensing.ExternalSimpleLicensingText;
import org.spdx.library.model.v3.simplelicensing.LicenseExpression;
import org.spdx.library.model.v3.simplelicensing.SimpleLicensingText;
import org.spdx.library.model.v3.software.ContentIdentifier;
import org.spdx.library.model.v3.software.ExternalSbom;
import org.spdx.library.model.v3.software.ExternalSnippet;
import org.spdx.library.model.v3.software.ExternalSoftwareArtifact;
import org.spdx.library.model.v3.software.ExternalSpdxFile;
import org.spdx.library.model.v3.software.ExternalSpdxPackage;
import org.spdx.library.model.v3.software.Sbom;
import org.spdx.library.model.v3.software.Snippet;
import org.spdx.library.model.v3.software.SoftwareArtifact;
import org.spdx.library.model.v3.software.SpdxFile;
import org.spdx.library.model.v3.software.SpdxPackage;
import org.spdx.library.model.v3.supplychain.AssemblyAction;
import org.spdx.library.model.v3.supplychain.AssemblyProcess;
import org.spdx.library.model.v3.supplychain.BoundaryCrossingAction;
import org.spdx.library.model.v3.supplychain.BoundaryDefinitionAction;
import org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess;
import org.spdx.library.model.v3.supplychain.ChangeAction;
import org.spdx.library.model.v3.supplychain.ChangeProcess;
import org.spdx.library.model.v3.supplychain.CreateAction;
import org.spdx.library.model.v3.supplychain.CreateProcess;
import org.spdx.library.model.v3.supplychain.DefinedStateProcess;
import org.spdx.library.model.v3.supplychain.DestroyAction;
import org.spdx.library.model.v3.supplychain.DestroyProcess;
import org.spdx.library.model.v3.supplychain.ExternalAssemblyAction;
import org.spdx.library.model.v3.supplychain.ExternalAssemblyProcess;
import org.spdx.library.model.v3.supplychain.ExternalBoundaryCrossingAction;
import org.spdx.library.model.v3.supplychain.ExternalBoundaryDefinitionAction;
import org.spdx.library.model.v3.supplychain.ExternalBoundaryDefinitionProcess;
import org.spdx.library.model.v3.supplychain.ExternalChangeAction;
import org.spdx.library.model.v3.supplychain.ExternalChangeProcess;
import org.spdx.library.model.v3.supplychain.ExternalCreateAction;
import org.spdx.library.model.v3.supplychain.ExternalCreateProcess;
import org.spdx.library.model.v3.supplychain.ExternalDefinedStateProcess;
import org.spdx.library.model.v3.supplychain.ExternalDestroyAction;
import org.spdx.library.model.v3.supplychain.ExternalDestroyProcess;
import org.spdx.library.model.v3.supplychain.ExternalHarvestAction;
import org.spdx.library.model.v3.supplychain.ExternalHarvestProcess;
import org.spdx.library.model.v3.supplychain.ExternalInspectionAction;
import org.spdx.library.model.v3.supplychain.ExternalInspectionProcess;
import org.spdx.library.model.v3.supplychain.ExternalInstantiateVirtualHardwareProcess;
import org.spdx.library.model.v3.supplychain.ExternalManufactureAction;
import org.spdx.library.model.v3.supplychain.ExternalManufactureProcess;
import org.spdx.library.model.v3.supplychain.ExternalModifyAction;
import org.spdx.library.model.v3.supplychain.ExternalModifyProcess;
import org.spdx.library.model.v3.supplychain.ExternalOutOfSpecAction;
import org.spdx.library.model.v3.supplychain.ExternalPlanAction;
import org.spdx.library.model.v3.supplychain.ExternalPlanProcess;
import org.spdx.library.model.v3.supplychain.ExternalReproduceAction;
import org.spdx.library.model.v3.supplychain.ExternalReproduceProcess;
import org.spdx.library.model.v3.supplychain.ExternalResolutionAction;
import org.spdx.library.model.v3.supplychain.ExternalResponsibilityChangeAction;
import org.spdx.library.model.v3.supplychain.ExternalResponsibilityChangeProcess;
import org.spdx.library.model.v3.supplychain.ExternalState;
import org.spdx.library.model.v3.supplychain.ExternalStateAction;
import org.spdx.library.model.v3.supplychain.ExternalStorageAction;
import org.spdx.library.model.v3.supplychain.ExternalStorageProcess;
import org.spdx.library.model.v3.supplychain.ExternalTestAction;
import org.spdx.library.model.v3.supplychain.ExternalTestProcess;
import org.spdx.library.model.v3.supplychain.ExternalTransportAction;
import org.spdx.library.model.v3.supplychain.ExternalTransportProcess;
import org.spdx.library.model.v3.supplychain.ExternalUseAction;
import org.spdx.library.model.v3.supplychain.ExternalUseProcess;
import org.spdx.library.model.v3.supplychain.HarvestAction;
import org.spdx.library.model.v3.supplychain.HarvestProcess;
import org.spdx.library.model.v3.supplychain.InspectionAction;
import org.spdx.library.model.v3.supplychain.InspectionProcess;
import org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess;
import org.spdx.library.model.v3.supplychain.ManufactureAction;
import org.spdx.library.model.v3.supplychain.ManufactureProcess;
import org.spdx.library.model.v3.supplychain.ModifyAction;
import org.spdx.library.model.v3.supplychain.ModifyProcess;
import org.spdx.library.model.v3.supplychain.OutOfSpecAction;
import org.spdx.library.model.v3.supplychain.PlanAction;
import org.spdx.library.model.v3.supplychain.PlanProcess;
import org.spdx.library.model.v3.supplychain.ReproduceAction;
import org.spdx.library.model.v3.supplychain.ReproduceProcess;
import org.spdx.library.model.v3.supplychain.ResolutionAction;
import org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction;
import org.spdx.library.model.v3.supplychain.ResponsibilityChangeProcess;
import org.spdx.library.model.v3.supplychain.State;
import org.spdx.library.model.v3.supplychain.StateAction;
import org.spdx.library.model.v3.supplychain.StorageAction;
import org.spdx.library.model.v3.supplychain.StorageProcess;
import org.spdx.library.model.v3.supplychain.TestAction;
import org.spdx.library.model.v3.supplychain.TestProcess;
import org.spdx.library.model.v3.supplychain.TransportAction;
import org.spdx.library.model.v3.supplychain.TransportProcess;
import org.spdx.library.model.v3.supplychain.UseAction;
import org.spdx.library.model.v3.supplychain.UseProcess;
import org.spdx.storage.IModelStore;
import org.spdx.storage.PropertyDescriptor;


/**
 * Model object for SPDX 3
 *
 * @author Gary O'Neall
 */
public abstract class ModelObjectV3 extends CoreModelObject {
	
	static final Logger logger = LoggerFactory.getLogger(ModelObjectV3.class);

	/**
	 * @throws InvalidSPDXAnalysisException
	 */
	public ModelObjectV3() throws InvalidSPDXAnalysisException {
		super(SpdxConstantsV3.MODEL_SPEC_VERSION);
	}

	/**
	 * @param objectUri
	 * @throws InvalidSPDXAnalysisException
	 */
	public ModelObjectV3(String objectUri) throws InvalidSPDXAnalysisException {
		super(objectUri, SpdxConstantsV3.MODEL_SPEC_VERSION);
	}

	/**
	 * @param modelStore
	 * @param objectUri
	 * @param copyManager
	 * @param create
	 * @param idPrefix prefix to be used when generating new SPDX IDs
	 * @throws InvalidSPDXAnalysisException
	 */
	public ModelObjectV3(IModelStore modelStore, String objectUri,
			IModelCopyManager copyManager, boolean create, @Nullable String idPrefix)
			throws InvalidSPDXAnalysisException {
		super(modelStore, objectUri, copyManager, create, SpdxConstantsV3.MODEL_SPEC_VERSION, idPrefix);
	}

	/**
	 * @param builder
	 * @throws InvalidSPDXAnalysisException
	 */
	public ModelObjectV3(ModelObjectV3Builder builder)
			throws InvalidSPDXAnalysisException {
		super(builder, SpdxConstantsV3.MODEL_SPEC_VERSION);
	}

	/**
	 * @param specVersion Version of the SPDX spec to verify against
	 * @param verifiedElementUris list of all element object URIs which have already been verified - prevents infinite recursion
	 * @param profiles list of profile identifiers to validate against
	 * @return Any verification errors or warnings associated with this object
	 */
	public List<String> verify(Set<String> verifiedElementUris, String specVersion, List<IndividualUriValue> profiles) {
		if (verifiedElementUris.contains(this.objectUri)) {
			return new ArrayList<>();
		} else {
			verifiedElementUris.add(getObjectUri());
			return _verify(verifiedElementUris, specVersion, profiles);
		}
	}
	
	/**
	 * @param specVersion Version of the SPDX spec to verify against
	 * @param verifiedElementUris list of all element object URIs which have already been verified - prevents infinite recursion
	 * @return Any verification errors or warnings associated with this object
	 */
	public List<String> verify(Set<String> verifiedElementUris, String specVersion) {
		List<IndividualUriValue> profiles = new ArrayList<>();
		if (this instanceof ElementCollection) {
			ElementCollection elementCollection = (ElementCollection)this;
			profiles = new ArrayList<>(elementCollection.getProfileConformances());
		}
		if (!profiles.contains(ProfileIdentifierType.CORE)) {
			profiles.add(ProfileIdentifierType.CORE);
			
		}
		if (!profiles.contains(ProfileIdentifierType.SOFTWARE)) {
			profiles.add(ProfileIdentifierType.SOFTWARE);
		}
		return verify(verifiedElementUris, specVersion, profiles);
	}
	
	/**
	 * @param specVersion Version of the SPDX spec to verify against
	 * @param profiles list of profile identifiers to validate against
	 * @return Any verification errors or warnings associated with this object
	 */
	public List<String> verify(String specVersion, List<IndividualUriValue> profiles) {
		return verify(new HashSet<String>(), specVersion, profiles);
	}
	
	@Override
	protected boolean isNoAssertion(Object value) {
		return value instanceof IndividualLicensingInfo && 
				"https://spdx.org/rdf/3.1/terms/Licensing/NoAssertion".equals(((IndividualLicensingInfo) value).getObjectUri());
	}
	
	/**
	 * Converts property values to an AnyLicenseInfo if possible - if NONE or NOASSERTION URI value, convert to the appropriate license
	 * @param propertyDescriptor descriptor for the property
	 * @return AnyLicenseInfo license info for the property
	 * @throws InvalidSPDXAnalysisException
	 */
	@SuppressWarnings("unchecked")
	protected Optional<AnyLicenseInfo> getAnyLicenseInfoPropertyValue(PropertyDescriptor propertyDescriptor) throws InvalidSPDXAnalysisException {
		Optional<Object> result = getObjectPropertyValue(propertyDescriptor);
		if (!result.isPresent()) {
			return Optional.empty();
		} else if (result.get() instanceof AnyLicenseInfo) {
			return (Optional<AnyLicenseInfo>)(Optional<?>)result;
		} else if (result.get() instanceof SimpleUriValue) {
			Object val = ((SimpleUriValue)(result.get())).toModelObject(modelStore, copyManager, specVersion, AnyLicenseInfo.class);
			if (val instanceof AnyLicenseInfo) {
				return Optional.of((AnyLicenseInfo)val);
			} else {
				logger.error("Invalid type for AnyLicenseInfo property: "+val.getClass().toString());
				throw new SpdxInvalidTypeException("Invalid type for AnyLicenseInfo property: "+val.getClass().toString());
			}
		} else {
			logger.error("Invalid type for AnyLicenseInfo property: "+result.get().getClass().toString());
			throw new SpdxInvalidTypeException("Invalid type for AnyLicenseInfo property: "+result.get().getClass().toString());
		}
	}
	
	/**
	 * Converts property values to an ExtendableLicense if possible
	 * @param propertyDescriptor descriptor for the property
	 * @return AnyLicenseInfo license info for the property
	 * @throws InvalidSPDXAnalysisException
	 */
	@SuppressWarnings("unchecked")
	protected Optional<ExtendableLicense> getExtendableLicensePropertyValue(PropertyDescriptor propertyDescriptor) throws InvalidSPDXAnalysisException {
		Optional<Object> result = getObjectPropertyValue(propertyDescriptor, ExtendableLicense.class);
		if (!result.isPresent()) {
			return Optional.empty();
		} else if (result.get() instanceof ExtendableLicense) {
			return (Optional<ExtendableLicense>)(Optional<?>)result;
		} else if (result.get() instanceof SimpleUriValue) {
			Object val = ((SimpleUriValue)(result.get())).toModelObject(modelStore, copyManager, specVersion, ExtendableLicense.class);
			if (val instanceof ExtendableLicense) {
				return Optional.of((ExtendableLicense)val);
			} else {
				logger.error("Invalid type for ExtendableLicense property: "+val.getClass().toString());
				throw new SpdxInvalidTypeException("Invalid type for ExtendableLicense property: "+val.getClass().toString());
			}
		} else {
			logger.error("Invalid type for ExtendableLicense property: "+result.get().getClass().toString());
			throw new SpdxInvalidTypeException("Invalid type for ExtendableLicense property: "+result.get().getClass().toString());
		}
	}

	/**
	 * Converts property values to an ExtendableLicense if possible
	 * @param propertyDescriptor descriptor for the property
	 * @return AnyLicenseInfo license info for the property
	 * @throws InvalidSPDXAnalysisException
	 */
	@SuppressWarnings("unchecked")
	protected Optional<LicenseAddition> getLicenseAdditionPropertyValue(PropertyDescriptor propertyDescriptor) throws InvalidSPDXAnalysisException {
		Optional<Object> result = getObjectPropertyValue(propertyDescriptor, LicenseAddition.class);
		if (!result.isPresent()) {
			return Optional.empty();
		} else if (result.get() instanceof LicenseAddition) {
			return (Optional<LicenseAddition>)(Optional<?>)result;
		} else if (result.get() instanceof SimpleUriValue) {
			Object val = ((SimpleUriValue)(result.get())).toModelObject(modelStore, copyManager, specVersion, LicenseAddition.class);
			if (val instanceof LicenseAddition) {
				return Optional.of((LicenseAddition)val);
			} else {
				logger.error("Invalid type for LicenseAddition property: "+val.getClass().toString());
				throw new SpdxInvalidTypeException("Invalid type for LicenseAddition property: "+val.getClass().toString());
			}
		} else {
			logger.error("Invalid type for ExtendableLicense property: "+result.get().getClass().toString());
			throw new SpdxInvalidTypeException("Invalid type for LicenseAddition property: "+result.get().getClass().toString());
		}
	}

	/**
	 * Converts property values to an SpdxElement if possible - if individual value, convert to the appropriate SpdxElement
	 * @param propertyDescriptor Descriptor for the property
	 * @return SpdxElement stored
	 * @throws InvalidSPDXAnalysisException
	 */
	@SuppressWarnings("unchecked")
	protected Optional<Element> getElementPropertyValue(PropertyDescriptor propertyDescriptor) throws InvalidSPDXAnalysisException {
		Optional<Object> result = getObjectPropertyValue(propertyDescriptor);
		if (!result.isPresent()) {
			return Optional.empty();
		} else if (result.get() instanceof Element) {
			return (Optional<Element>)(Optional<?>)result;
		} else if (result.get() instanceof SimpleUriValue) {
			Object val = ((SimpleUriValue)(result.get())).toModelObject(modelStore, copyManager, specVersion, Element.class);
			if (val instanceof Element) {
				return Optional.of((Element)val);
			} else {
				logger.error("Invalid type for Element property: "+val.getClass().toString());
				throw new SpdxInvalidTypeException("Invalid type for Element property: "+val.getClass().toString());
			}
		} else {
			logger.error("Invalid type for SpdxElement property: "+result.get().getClass().toString());
			throw new SpdxInvalidTypeException("Invalid type for SpdxElement property: "+result.get().getClass().toString());
		}
	}

	/**
	 * @param propertyDescriptor property descriptor for the object in question
	 * @return true if the object is "to" part of a relationship
	 */
	public boolean isRelatedElement(PropertyDescriptor propertyDescriptor) {
		return SpdxConstantsV3.PROP_TO.equals(propertyDescriptor);
	}

		/**
	 * Create an DimensionsBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Dimensions
	 * @return DimensionsBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Dimensions.DimensionsBuilder createDimensions(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Dimensions.DimensionsBuilder(this, objectUri);
	}


		/**
	 * Create an RegulationBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Regulation
	 * @return RegulationBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Regulation.RegulationBuilder createRegulation(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Regulation.RegulationBuilder(this, objectUri);
	}


		/**
	 * Create an AIPackageBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the AIPackage
	 * @return AIPackageBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public AIPackage.AIPackageBuilder createAIPackage(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new AIPackage.AIPackageBuilder(this, objectUri);
	}


		/**
	 * Create an ChangeProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ChangeProcess
	 * @return ChangeProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ChangeProcess.ChangeProcessBuilder createChangeProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ChangeProcess.ChangeProcessBuilder(this, objectUri);
	}


		/**
	 * Create an TestProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the TestProcess
	 * @return TestProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public TestProcess.TestProcessBuilder createTestProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new TestProcess.TestProcessBuilder(this, objectUri);
	}


		/**
	 * Create an ListedLicenseExceptionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ListedLicenseException
	 * @return ListedLicenseExceptionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ListedLicenseException.ListedLicenseExceptionBuilder createListedLicenseException(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ListedLicenseException.ListedLicenseExceptionBuilder(this, objectUri);
	}


		/**
	 * Create an ExtendableLicenseBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ExtendableLicense
	 * @return ExtendableLicenseBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ExtendableLicense.ExtendableLicenseBuilder createExtendableLicense(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ExtendableLicense.ExtendableLicenseBuilder(this, objectUri);
	}


		/**
	 * Create an SoftwareServiceBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the SoftwareService
	 * @return SoftwareServiceBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public SoftwareService.SoftwareServiceBuilder createSoftwareService(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new SoftwareService.SoftwareServiceBuilder(this, objectUri);
	}


		/**
	 * Create an ListedLicenseBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ListedLicense
	 * @return ListedLicenseBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ListedLicense.ListedLicenseBuilder createListedLicense(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ListedLicense.ListedLicenseBuilder(this, objectUri);
	}


		/**
	 * Create an CustomLicenseBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CustomLicense
	 * @return CustomLicenseBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CustomLicense.CustomLicenseBuilder createCustomLicense(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new CustomLicense.CustomLicenseBuilder(this, objectUri);
	}


		/**
	 * Create an SoftwareAgentBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the SoftwareAgent
	 * @return SoftwareAgentBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public SoftwareAgent.SoftwareAgentBuilder createSoftwareAgent(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new SoftwareAgent.SoftwareAgentBuilder(this, objectUri);
	}


		/**
	 * Create an HarvestProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the HarvestProcess
	 * @return HarvestProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public HarvestProcess.HarvestProcessBuilder createHarvestProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new HarvestProcess.HarvestProcessBuilder(this, objectUri);
	}


		/**
	 * Create an VulnerabilityBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Vulnerability
	 * @return VulnerabilityBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Vulnerability.VulnerabilityBuilder createVulnerability(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Vulnerability.VulnerabilityBuilder(this, objectUri);
	}


		/**
	 * Create an ExternalRefBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ExternalRef
	 * @return ExternalRefBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ExternalRef.ExternalRefBuilder createExternalRef(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ExternalRef.ExternalRefBuilder(this, objectUri);
	}


		/**
	 * Create an StateActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the StateAction
	 * @return StateActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public StateAction.StateActionBuilder createStateAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new StateAction.StateActionBuilder(this, objectUri);
	}


		/**
	 * Create an ToolBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Tool
	 * @return ToolBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Tool.ToolBuilder createTool(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Tool.ToolBuilder(this, objectUri);
	}


		/**
	 * Create an AnyLicenseInfoBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the AnyLicenseInfo
	 * @return AnyLicenseInfoBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public AnyLicenseInfo.AnyLicenseInfoBuilder createAnyLicenseInfo(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new AnyLicenseInfo.AnyLicenseInfoBuilder(this, objectUri);
	}


		/**
	 * Create an ChangeActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ChangeAction
	 * @return ChangeActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ChangeAction.ChangeActionBuilder createChangeAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ChangeAction.ChangeActionBuilder(this, objectUri);
	}


		/**
	 * Create an MeasureOfMassBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the MeasureOfMass
	 * @return MeasureOfMassBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public MeasureOfMass.MeasureOfMassBuilder createMeasureOfMass(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new MeasureOfMass.MeasureOfMassBuilder(this, objectUri);
	}


		/**
	 * Create an CvssV4VulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CvssV4VulnAssessmentRelationship
	 * @return CvssV4VulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CvssV4VulnAssessmentRelationship.CvssV4VulnAssessmentRelationshipBuilder createCvssV4VulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new CvssV4VulnAssessmentRelationship.CvssV4VulnAssessmentRelationshipBuilder(this, objectUri);
	}


		/**
	 * Create an ResolutionActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ResolutionAction
	 * @return ResolutionActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ResolutionAction.ResolutionActionBuilder createResolutionAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ResolutionAction.ResolutionActionBuilder(this, objectUri);
	}


		/**
	 * Create an VexFixedVulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the VexFixedVulnAssessmentRelationship
	 * @return VexFixedVulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public VexFixedVulnAssessmentRelationship.VexFixedVulnAssessmentRelationshipBuilder createVexFixedVulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new VexFixedVulnAssessmentRelationship.VexFixedVulnAssessmentRelationshipBuilder(this, objectUri);
	}


		/**
	 * Create an SpdxPackageBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the SpdxPackage
	 * @return SpdxPackageBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public SpdxPackage.SpdxPackageBuilder createSpdxPackage(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new SpdxPackage.SpdxPackageBuilder(this, objectUri);
	}


		/**
	 * Create an ResponsibilityChangeProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ResponsibilityChangeProcess
	 * @return ResponsibilityChangeProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ResponsibilityChangeProcess.ResponsibilityChangeProcessBuilder createResponsibilityChangeProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ResponsibilityChangeProcess.ResponsibilityChangeProcessBuilder(this, objectUri);
	}


		/**
	 * Create an BulkHardwareBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the BulkHardware
	 * @return BulkHardwareBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public BulkHardware.BulkHardwareBuilder createBulkHardware(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new BulkHardware.BulkHardwareBuilder(this, objectUri);
	}


		/**
	 * Create an CreationInfoBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CreationInfo
	 * @return CreationInfoBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CreationInfo.CreationInfoBuilder createCreationInfo(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new CreationInfo.CreationInfoBuilder(this, objectUri);
	}


		/**
	 * Create an CvssV3VulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CvssV3VulnAssessmentRelationship
	 * @return CvssV3VulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CvssV3VulnAssessmentRelationship.CvssV3VulnAssessmentRelationshipBuilder createCvssV3VulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new CvssV3VulnAssessmentRelationship.CvssV3VulnAssessmentRelationshipBuilder(this, objectUri);
	}


		/**
	 * Create an InstantiateVirtualHardwareProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the InstantiateVirtualHardwareProcess
	 * @return InstantiateVirtualHardwareProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public InstantiateVirtualHardwareProcess.InstantiateVirtualHardwareProcessBuilder createInstantiateVirtualHardwareProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new InstantiateVirtualHardwareProcess.InstantiateVirtualHardwareProcessBuilder(this, objectUri);
	}


		/**
	 * Create an EnergyConsumptionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the EnergyConsumption
	 * @return EnergyConsumptionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public EnergyConsumption.EnergyConsumptionBuilder createEnergyConsumption(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new EnergyConsumption.EnergyConsumptionBuilder(this, objectUri);
	}


		/**
	 * Create an ConjunctiveLicenseSetBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ConjunctiveLicenseSet
	 * @return ConjunctiveLicenseSetBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ConjunctiveLicenseSet.ConjunctiveLicenseSetBuilder createConjunctiveLicenseSet(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ConjunctiveLicenseSet.ConjunctiveLicenseSetBuilder(this, objectUri);
	}


		/**
	 * Create an HashBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Hash
	 * @return HashBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Hash.HashBuilder createHash(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Hash.HashBuilder(this, objectUri);
	}


		/**
	 * Create an TestActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the TestAction
	 * @return TestActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public TestAction.TestActionBuilder createTestAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new TestAction.TestActionBuilder(this, objectUri);
	}


		/**
	 * Create an UseActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the UseAction
	 * @return UseActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public UseAction.UseActionBuilder createUseAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new UseAction.UseActionBuilder(this, objectUri);
	}


		/**
	 * Create an InspectionActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the InspectionAction
	 * @return InspectionActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public InspectionAction.InspectionActionBuilder createInspectionAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new InspectionAction.InspectionActionBuilder(this, objectUri);
	}


		/**
	 * Create an AgentBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Agent
	 * @return AgentBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Agent.AgentBuilder createAgent(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Agent.AgentBuilder(this, objectUri);
	}


		/**
	 * Create an InspectionProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the InspectionProcess
	 * @return InspectionProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public InspectionProcess.InspectionProcessBuilder createInspectionProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new InspectionProcess.InspectionProcessBuilder(this, objectUri);
	}


		/**
	 * Create an AnnotationBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Annotation
	 * @return AnnotationBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Annotation.AnnotationBuilder createAnnotation(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Annotation.AnnotationBuilder(this, objectUri);
	}


		/**
	 * Create an PhysicalHardwareBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the PhysicalHardware
	 * @return PhysicalHardwareBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public PhysicalHardware.PhysicalHardwareBuilder createPhysicalHardware(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new PhysicalHardware.PhysicalHardwareBuilder(this, objectUri);
	}


		/**
	 * Create an StateBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the State
	 * @return StateBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public State.StateBuilder createState(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new State.StateBuilder(this, objectUri);
	}


		/**
	 * Create an BoundaryDefinitionActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the BoundaryDefinitionAction
	 * @return BoundaryDefinitionActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public BoundaryDefinitionAction.BoundaryDefinitionActionBuilder createBoundaryDefinitionAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new BoundaryDefinitionAction.BoundaryDefinitionActionBuilder(this, objectUri);
	}


		/**
	 * Create an CreateProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CreateProcess
	 * @return CreateProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CreateProcess.CreateProcessBuilder createCreateProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new CreateProcess.CreateProcessBuilder(this, objectUri);
	}


		/**
	 * Create an PlanProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the PlanProcess
	 * @return PlanProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public PlanProcess.PlanProcessBuilder createPlanProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new PlanProcess.PlanProcessBuilder(this, objectUri);
	}


		/**
	 * Create an EpssVulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the EpssVulnAssessmentRelationship
	 * @return EpssVulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public EpssVulnAssessmentRelationship.EpssVulnAssessmentRelationshipBuilder createEpssVulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new EpssVulnAssessmentRelationship.EpssVulnAssessmentRelationshipBuilder(this, objectUri);
	}


		/**
	 * Create an BoundaryDefinitionProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the BoundaryDefinitionProcess
	 * @return BoundaryDefinitionProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public BoundaryDefinitionProcess.BoundaryDefinitionProcessBuilder createBoundaryDefinitionProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new BoundaryDefinitionProcess.BoundaryDefinitionProcessBuilder(this, objectUri);
	}


		/**
	 * Create an TransportProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the TransportProcess
	 * @return TransportProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public TransportProcess.TransportProcessBuilder createTransportProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new TransportProcess.TransportProcessBuilder(this, objectUri);
	}


		/**
	 * Create an ReproduceActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ReproduceAction
	 * @return ReproduceActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ReproduceAction.ReproduceActionBuilder createReproduceAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ReproduceAction.ReproduceActionBuilder(this, objectUri);
	}


		/**
	 * Create an ManufactureProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ManufactureProcess
	 * @return ManufactureProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ManufactureProcess.ManufactureProcessBuilder createManufactureProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ManufactureProcess.ManufactureProcessBuilder(this, objectUri);
	}


		/**
	 * Create an EvidenceRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the EvidenceRelationship
	 * @return EvidenceRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public EvidenceRelationship.EvidenceRelationshipBuilder createEvidenceRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new EvidenceRelationship.EvidenceRelationshipBuilder(this, objectUri);
	}


		/**
	 * Create an SpecificationBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Specification
	 * @return SpecificationBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Specification.SpecificationBuilder createSpecification(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Specification.SpecificationBuilder(this, objectUri);
	}


		/**
	 * Create an OrLaterOperatorBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the OrLaterOperator
	 * @return OrLaterOperatorBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public OrLaterOperator.OrLaterOperatorBuilder createOrLaterOperator(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new OrLaterOperator.OrLaterOperatorBuilder(this, objectUri);
	}


		/**
	 * Create an ContentIdentifierBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ContentIdentifier
	 * @return ContentIdentifierBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ContentIdentifier.ContentIdentifierBuilder createContentIdentifier(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ContentIdentifier.ContentIdentifierBuilder(this, objectUri);
	}


		/**
	 * Create an SpdxFileBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the SpdxFile
	 * @return SpdxFileBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public SpdxFile.SpdxFileBuilder createSpdxFile(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new SpdxFile.SpdxFileBuilder(this, objectUri);
	}


		/**
	 * Create an DestroyProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the DestroyProcess
	 * @return DestroyProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public DestroyProcess.DestroyProcessBuilder createDestroyProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new DestroyProcess.DestroyProcessBuilder(this, objectUri);
	}


		/**
	 * Create an RequirementBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Requirement
	 * @return RequirementBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Requirement.RequirementBuilder createRequirement(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Requirement.RequirementBuilder(this, objectUri);
	}


		/**
	 * Create an SimpleLicensingTextBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the SimpleLicensingText
	 * @return SimpleLicensingTextBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public SimpleLicensingText.SimpleLicensingTextBuilder createSimpleLicensingText(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new SimpleLicensingText.SimpleLicensingTextBuilder(this, objectUri);
	}


		/**
	 * Create an BomBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Bom
	 * @return BomBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Bom.BomBuilder createBom(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Bom.BomBuilder(this, objectUri);
	}


		/**
	 * Create an DefinedStateProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the DefinedStateProcess
	 * @return DefinedStateProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public DefinedStateProcess.DefinedStateProcessBuilder createDefinedStateProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new DefinedStateProcess.DefinedStateProcessBuilder(this, objectUri);
	}


		/**
	 * Create an PhysicalLocationBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the PhysicalLocation
	 * @return PhysicalLocationBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public PhysicalLocation.PhysicalLocationBuilder createPhysicalLocation(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new PhysicalLocation.PhysicalLocationBuilder(this, objectUri);
	}


		/**
	 * Create an CdxPropertiesExtensionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CdxPropertiesExtension
	 * @return CdxPropertiesExtensionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CdxPropertiesExtension.CdxPropertiesExtensionBuilder createCdxPropertiesExtension(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new CdxPropertiesExtension.CdxPropertiesExtensionBuilder(this, objectUri);
	}


		/**
	 * Create an ModifyProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ModifyProcess
	 * @return ModifyProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ModifyProcess.ModifyProcessBuilder createModifyProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ModifyProcess.ModifyProcessBuilder(this, objectUri);
	}


		/**
	 * Create an RelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Relationship
	 * @return RelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Relationship.RelationshipBuilder createRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Relationship.RelationshipBuilder(this, objectUri);
	}


		/**
	 * Create an SsvcVulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the SsvcVulnAssessmentRelationship
	 * @return SsvcVulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public SsvcVulnAssessmentRelationship.SsvcVulnAssessmentRelationshipBuilder createSsvcVulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new SsvcVulnAssessmentRelationship.SsvcVulnAssessmentRelationshipBuilder(this, objectUri);
	}


		/**
	 * Create an ResponsibilityChangeActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ResponsibilityChangeAction
	 * @return ResponsibilityChangeActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ResponsibilityChangeAction.ResponsibilityChangeActionBuilder createResponsibilityChangeAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ResponsibilityChangeAction.ResponsibilityChangeActionBuilder(this, objectUri);
	}


		/**
	 * Create an DisjunctiveLicenseSetBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the DisjunctiveLicenseSet
	 * @return DisjunctiveLicenseSetBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public DisjunctiveLicenseSet.DisjunctiveLicenseSetBuilder createDisjunctiveLicenseSet(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new DisjunctiveLicenseSet.DisjunctiveLicenseSetBuilder(this, objectUri);
	}


		/**
	 * Create an BuildBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Build
	 * @return BuildBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Build.BuildBuilder createBuild(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Build.BuildBuilder(this, objectUri);
	}


		/**
	 * Create an DictionaryEntryBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the DictionaryEntry
	 * @return DictionaryEntryBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public DictionaryEntry.DictionaryEntryBuilder createDictionaryEntry(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new DictionaryEntry.DictionaryEntryBuilder(this, objectUri);
	}


		/**
	 * Create an AssemblyProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the AssemblyProcess
	 * @return AssemblyProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public AssemblyProcess.AssemblyProcessBuilder createAssemblyProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new AssemblyProcess.AssemblyProcessBuilder(this, objectUri);
	}


		/**
	 * Create an EnergyConsumptionDescriptionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the EnergyConsumptionDescription
	 * @return EnergyConsumptionDescriptionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public EnergyConsumptionDescription.EnergyConsumptionDescriptionBuilder createEnergyConsumptionDescription(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new EnergyConsumptionDescription.EnergyConsumptionDescriptionBuilder(this, objectUri);
	}


		/**
	 * Create an UseProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the UseProcess
	 * @return UseProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public UseProcess.UseProcessBuilder createUseProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new UseProcess.UseProcessBuilder(this, objectUri);
	}


		/**
	 * Create an UnitOfMeasureBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the UnitOfMeasure
	 * @return UnitOfMeasureBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public UnitOfMeasure.UnitOfMeasureBuilder createUnitOfMeasure(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new UnitOfMeasure.UnitOfMeasureBuilder(this, objectUri);
	}


		/**
	 * Create an IndividualElementBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the IndividualElement
	 * @return IndividualElementBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public IndividualElement.IndividualElementBuilder createIndividualElement(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new IndividualElement.IndividualElementBuilder(this, objectUri);
	}


		/**
	 * Create an VirtualHardwareBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the VirtualHardware
	 * @return VirtualHardwareBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public VirtualHardware.VirtualHardwareBuilder createVirtualHardware(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new VirtualHardware.VirtualHardwareBuilder(this, objectUri);
	}


		/**
	 * Create an BoundaryCrossingActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the BoundaryCrossingAction
	 * @return BoundaryCrossingActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public BoundaryCrossingAction.BoundaryCrossingActionBuilder createBoundaryCrossingAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new BoundaryCrossingAction.BoundaryCrossingActionBuilder(this, objectUri);
	}


		/**
	 * Create an ElementMapBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ElementMap
	 * @return ElementMapBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ElementMap.ElementMapBuilder createElementMap(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ElementMap.ElementMapBuilder(this, objectUri);
	}


		/**
	 * Create an ExportControlClassificationBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ExportControlClassification
	 * @return ExportControlClassificationBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ExportControlClassification.ExportControlClassificationBuilder createExportControlClassification(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ExportControlClassification.ExportControlClassificationBuilder(this, objectUri);
	}


		/**
	 * Create an ExternalMapBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ExternalMap
	 * @return ExternalMapBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ExternalMap.ExternalMapBuilder createExternalMap(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ExternalMap.ExternalMapBuilder(this, objectUri);
	}


		/**
	 * Create an ModifyActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ModifyAction
	 * @return ModifyActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ModifyAction.ModifyActionBuilder createModifyAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ModifyAction.ModifyActionBuilder(this, objectUri);
	}


		/**
	 * Create an WithAdditionOperatorBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the WithAdditionOperator
	 * @return WithAdditionOperatorBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public WithAdditionOperator.WithAdditionOperatorBuilder createWithAdditionOperator(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new WithAdditionOperator.WithAdditionOperatorBuilder(this, objectUri);
	}


		/**
	 * Create an CdxPropertyEntryBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CdxPropertyEntry
	 * @return CdxPropertyEntryBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CdxPropertyEntry.CdxPropertyEntryBuilder createCdxPropertyEntry(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new CdxPropertyEntry.CdxPropertyEntryBuilder(this, objectUri);
	}


		/**
	 * Create an CustomLicenseAdditionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CustomLicenseAddition
	 * @return CustomLicenseAdditionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CustomLicenseAddition.CustomLicenseAdditionBuilder createCustomLicenseAddition(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new CustomLicenseAddition.CustomLicenseAdditionBuilder(this, objectUri);
	}


		/**
	 * Create an ProjectBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Project
	 * @return ProjectBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Project.ProjectBuilder createProject(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Project.ProjectBuilder(this, objectUri);
	}


		/**
	 * Create an LicenseExpressionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the LicenseExpression
	 * @return LicenseExpressionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public LicenseExpression.LicenseExpressionBuilder createLicenseExpression(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new LicenseExpression.LicenseExpressionBuilder(this, objectUri);
	}


		/**
	 * Create an HarvestActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the HarvestAction
	 * @return HarvestActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public HarvestAction.HarvestActionBuilder createHarvestAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new HarvestAction.HarvestActionBuilder(this, objectUri);
	}


		/**
	 * Create an RequirementVerificationBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the RequirementVerification
	 * @return RequirementVerificationBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public RequirementVerification.RequirementVerificationBuilder createRequirementVerification(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new RequirementVerification.RequirementVerificationBuilder(this, objectUri);
	}


		/**
	 * Create an VexAffectedVulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the VexAffectedVulnAssessmentRelationship
	 * @return VexAffectedVulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public VexAffectedVulnAssessmentRelationship.VexAffectedVulnAssessmentRelationshipBuilder createVexAffectedVulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new VexAffectedVulnAssessmentRelationship.VexAffectedVulnAssessmentRelationshipBuilder(this, objectUri);
	}


		/**
	 * Create an SpdxDocumentBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the SpdxDocument
	 * @return SpdxDocumentBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public SpdxDocument.SpdxDocumentBuilder createSpdxDocument(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new SpdxDocument.SpdxDocumentBuilder(this, objectUri);
	}


		/**
	 * Create an PersonBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Person
	 * @return PersonBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Person.PersonBuilder createPerson(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Person.PersonBuilder(this, objectUri);
	}


		/**
	 * Create an IndividualLicensingInfoBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the IndividualLicensingInfo
	 * @return IndividualLicensingInfoBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public IndividualLicensingInfo.IndividualLicensingInfoBuilder createIndividualLicensingInfo(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new IndividualLicensingInfo.IndividualLicensingInfoBuilder(this, objectUri);
	}


		/**
	 * Create an ContactPointRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ContactPointRelationship
	 * @return ContactPointRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ContactPointRelationship.ContactPointRelationshipBuilder createContactPointRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ContactPointRelationship.ContactPointRelationshipBuilder(this, objectUri);
	}


		/**
	 * Create an LifecycleScopedRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the LifecycleScopedRelationship
	 * @return LifecycleScopedRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public LifecycleScopedRelationship.LifecycleScopedRelationshipBuilder createLifecycleScopedRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new LifecycleScopedRelationship.LifecycleScopedRelationshipBuilder(this, objectUri);
	}


		/**
	 * Create an DatasetPackageBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the DatasetPackage
	 * @return DatasetPackageBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public DatasetPackage.DatasetPackageBuilder createDatasetPackage(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new DatasetPackage.DatasetPackageBuilder(this, objectUri);
	}


		/**
	 * Create an SnippetBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Snippet
	 * @return SnippetBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Snippet.SnippetBuilder createSnippet(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Snippet.SnippetBuilder(this, objectUri);
	}


		/**
	 * Create an VexUnderInvestigationVulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the VexUnderInvestigationVulnAssessmentRelationship
	 * @return VexUnderInvestigationVulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public VexUnderInvestigationVulnAssessmentRelationship.VexUnderInvestigationVulnAssessmentRelationshipBuilder createVexUnderInvestigationVulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new VexUnderInvestigationVulnAssessmentRelationship.VexUnderInvestigationVulnAssessmentRelationshipBuilder(this, objectUri);
	}


		/**
	 * Create an ExternalIdentifierBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ExternalIdentifier
	 * @return ExternalIdentifierBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ExternalIdentifier.ExternalIdentifierBuilder createExternalIdentifier(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ExternalIdentifier.ExternalIdentifierBuilder(this, objectUri);
	}


		/**
	 * Create an NamespaceMapBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the NamespaceMap
	 * @return NamespaceMapBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public NamespaceMap.NamespaceMapBuilder createNamespaceMap(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new NamespaceMap.NamespaceMapBuilder(this, objectUri);
	}


		/**
	 * Create an StorageProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the StorageProcess
	 * @return StorageProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public StorageProcess.StorageProcessBuilder createStorageProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new StorageProcess.StorageProcessBuilder(this, objectUri);
	}


		/**
	 * Create an SbomBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Sbom
	 * @return SbomBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Sbom.SbomBuilder createSbom(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Sbom.SbomBuilder(this, objectUri);
	}


		/**
	 * Create an PackageVerificationCodeBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the PackageVerificationCode
	 * @return PackageVerificationCodeBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public PackageVerificationCode.PackageVerificationCodeBuilder createPackageVerificationCode(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new PackageVerificationCode.PackageVerificationCodeBuilder(this, objectUri);
	}


		/**
	 * Create an OutOfSpecActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the OutOfSpecAction
	 * @return OutOfSpecActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public OutOfSpecAction.OutOfSpecActionBuilder createOutOfSpecAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new OutOfSpecAction.OutOfSpecActionBuilder(this, objectUri);
	}


		/**
	 * Create an VexNotAffectedVulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the VexNotAffectedVulnAssessmentRelationship
	 * @return VexNotAffectedVulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public VexNotAffectedVulnAssessmentRelationship.VexNotAffectedVulnAssessmentRelationshipBuilder createVexNotAffectedVulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new VexNotAffectedVulnAssessmentRelationship.VexNotAffectedVulnAssessmentRelationshipBuilder(this, objectUri);
	}


		/**
	 * Create an StorageActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the StorageAction
	 * @return StorageActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public StorageAction.StorageActionBuilder createStorageAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new StorageAction.StorageActionBuilder(this, objectUri);
	}


		/**
	 * Create an DestroyActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the DestroyAction
	 * @return DestroyActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public DestroyAction.DestroyActionBuilder createDestroyAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new DestroyAction.DestroyActionBuilder(this, objectUri);
	}


		/**
	 * Create an ReproduceProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ReproduceProcess
	 * @return ReproduceProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ReproduceProcess.ReproduceProcessBuilder createReproduceProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ReproduceProcess.ReproduceProcessBuilder(this, objectUri);
	}


		/**
	 * Create an OrganizationBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Organization
	 * @return OrganizationBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Organization.OrganizationBuilder createOrganization(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Organization.OrganizationBuilder(this, objectUri);
	}


		/**
	 * Create an ManufactureActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ManufactureAction
	 * @return ManufactureActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ManufactureAction.ManufactureActionBuilder createManufactureAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ManufactureAction.ManufactureActionBuilder(this, objectUri);
	}


		/**
	 * Create an PositiveIntegerRangeBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the PositiveIntegerRange
	 * @return PositiveIntegerRangeBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public PositiveIntegerRange.PositiveIntegerRangeBuilder createPositiveIntegerRange(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new PositiveIntegerRange.PositiveIntegerRangeBuilder(this, objectUri);
	}


		/**
	 * Create an BundleBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Bundle
	 * @return BundleBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Bundle.BundleBuilder createBundle(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Bundle.BundleBuilder(this, objectUri);
	}


		/**
	 * Create an ExploitCatalogVulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ExploitCatalogVulnAssessmentRelationship
	 * @return ExploitCatalogVulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ExploitCatalogVulnAssessmentRelationship.ExploitCatalogVulnAssessmentRelationshipBuilder createExploitCatalogVulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ExploitCatalogVulnAssessmentRelationship.ExploitCatalogVulnAssessmentRelationshipBuilder(this, objectUri);
	}


		/**
	 * Create an CvssV2VulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CvssV2VulnAssessmentRelationship
	 * @return CvssV2VulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CvssV2VulnAssessmentRelationship.CvssV2VulnAssessmentRelationshipBuilder createCvssV2VulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new CvssV2VulnAssessmentRelationship.CvssV2VulnAssessmentRelationshipBuilder(this, objectUri);
	}


		/**
	 * Create an EvaluationResultBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the EvaluationResult
	 * @return EvaluationResultBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public EvaluationResult.EvaluationResultBuilder createEvaluationResult(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new EvaluationResult.EvaluationResultBuilder(this, objectUri);
	}


		/**
	 * Create an ExportControlClassificationAssessmentBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ExportControlClassificationAssessment
	 * @return ExportControlClassificationAssessmentBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ExportControlClassificationAssessment.ExportControlClassificationAssessmentBuilder createExportControlClassificationAssessment(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ExportControlClassificationAssessment.ExportControlClassificationAssessmentBuilder(this, objectUri);
	}


		/**
	 * Create an AssemblyActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the AssemblyAction
	 * @return AssemblyActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public AssemblyAction.AssemblyActionBuilder createAssemblyAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new AssemblyAction.AssemblyActionBuilder(this, objectUri);
	}


		/**
	 * Create an TransportActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the TransportAction
	 * @return TransportActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public TransportAction.TransportActionBuilder createTransportAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new TransportAction.TransportActionBuilder(this, objectUri);
	}


		/**
	 * Create an CreateActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CreateAction
	 * @return CreateActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CreateAction.CreateActionBuilder createCreateAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new CreateAction.CreateActionBuilder(this, objectUri);
	}


		/**
	 * Create an PlanActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the PlanAction
	 * @return PlanActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public PlanAction.PlanActionBuilder createPlanAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new PlanAction.PlanActionBuilder(this, objectUri);
	}


		/**
	 * Create an DefinedTypeBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the DefinedType
	 * @return DefinedTypeBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public DefinedType.DefinedTypeBuilder createDefinedType(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new DefinedType.DefinedTypeBuilder(this, objectUri);
	}


		/**
	 * Create an SupportRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the SupportRelationship
	 * @return SupportRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public SupportRelationship.SupportRelationshipBuilder createSupportRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new SupportRelationship.SupportRelationshipBuilder(this, objectUri);
	}


		/**
	 * Create an ProductSpecificationBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ProductSpecification
	 * @return ProductSpecificationBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ProductSpecification.ProductSpecificationBuilder createProductSpecification(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new ProductSpecification.ProductSpecificationBuilder(this, objectUri);
	}


		/**
	 * Create an MeasureOfLengthBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the MeasureOfLength
	 * @return MeasureOfLengthBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public MeasureOfLength.MeasureOfLengthBuilder createMeasureOfLength(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new MeasureOfLength.MeasureOfLengthBuilder(this, objectUri);
	}


		/**
	 * Create an ExtensionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Extension
	 * @return ExtensionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Extension.ExtensionBuilder createExtension(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Extension.ExtensionBuilder(this, objectUri);
	}



	public static class ModelObjectV3Builder extends CoreModelObjectBuilder {

		/**
		 * @param modelStore
		 * @param objectUri
		 * @param copyManager
		 */
		public ModelObjectV3Builder(IModelStore modelStore, String objectUri,
				IModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}
		
	}
}
