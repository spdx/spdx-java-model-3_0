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
		this(objectUri, SpdxConstantsV3.MODEL_SPEC_VERSION);
	}

    /**
     * @param objectUri
     * @param specVersion
     * @throws InvalidSPDXAnalysisException
     */
    public ModelObjectV3(String objectUri, String specVersion) throws InvalidSPDXAnalysisException {
        super(objectUri, specVersion);
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
		this(modelStore, objectUri, copyManager, create, SpdxConstantsV3.MODEL_SPEC_VERSION, idPrefix);
	}

    /**
     * @param modelStore
     * @param objectUri
     * @param copyManager
     * @param create
     * @param specVersion
     * @param idPrefix prefix to be used when generating new SPDX IDs
     * @throws InvalidSPDXAnalysisException
     */
    public ModelObjectV3(IModelStore modelStore, String objectUri,
            IModelCopyManager copyManager, boolean create, String specVersion, @Nullable String idPrefix)
            throws InvalidSPDXAnalysisException {
        super(modelStore, objectUri, copyManager, create, specVersion, idPrefix);
    }

	/**
	 * @param builder
	 * @throws InvalidSPDXAnalysisException
	 */
	public ModelObjectV3(ModelObjectV3Builder builder)
			throws InvalidSPDXAnalysisException {
		this(builder, Objects.isNull(builder.getModelSpecVersion()) ? SpdxConstantsV3.MODEL_SPEC_VERSION : builder.getModelSpecVersion());
	}

    /**
     * @param builder
     * @param specVersion
     * @throws InvalidSPDXAnalysisException
     */
    public ModelObjectV3(ModelObjectV3Builder builder, String specVersion)
            throws InvalidSPDXAnalysisException {
        super(builder, specVersion);
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
				"https://spdx.org/rdf/3.1.0/terms/Licensing/NoAssertion".equals(((IndividualLicensingInfo) value).getObjectUri());
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
		Dimensions.DimensionsBuilder retval = new Dimensions.DimensionsBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an RegulationBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Regulation
	 * @return RegulationBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Regulation.RegulationBuilder createRegulation(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Regulation.RegulationBuilder retval = new Regulation.RegulationBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an AIPackageBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the AIPackage
	 * @return AIPackageBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public AIPackage.AIPackageBuilder createAIPackage(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		AIPackage.AIPackageBuilder retval = new AIPackage.AIPackageBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ChangeProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ChangeProcess
	 * @return ChangeProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ChangeProcess.ChangeProcessBuilder createChangeProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ChangeProcess.ChangeProcessBuilder retval = new ChangeProcess.ChangeProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an TestProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the TestProcess
	 * @return TestProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public TestProcess.TestProcessBuilder createTestProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		TestProcess.TestProcessBuilder retval = new TestProcess.TestProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ListedLicenseExceptionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ListedLicenseException
	 * @return ListedLicenseExceptionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ListedLicenseException.ListedLicenseExceptionBuilder createListedLicenseException(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ListedLicenseException.ListedLicenseExceptionBuilder retval = new ListedLicenseException.ListedLicenseExceptionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ExtendableLicenseBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ExtendableLicense
	 * @return ExtendableLicenseBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ExtendableLicense.ExtendableLicenseBuilder createExtendableLicense(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ExtendableLicense.ExtendableLicenseBuilder retval = new ExtendableLicense.ExtendableLicenseBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an SoftwareServiceBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the SoftwareService
	 * @return SoftwareServiceBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public SoftwareService.SoftwareServiceBuilder createSoftwareService(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		SoftwareService.SoftwareServiceBuilder retval = new SoftwareService.SoftwareServiceBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ListedLicenseBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ListedLicense
	 * @return ListedLicenseBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ListedLicense.ListedLicenseBuilder createListedLicense(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ListedLicense.ListedLicenseBuilder retval = new ListedLicense.ListedLicenseBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an CustomLicenseBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CustomLicense
	 * @return CustomLicenseBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CustomLicense.CustomLicenseBuilder createCustomLicense(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		CustomLicense.CustomLicenseBuilder retval = new CustomLicense.CustomLicenseBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an SoftwareAgentBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the SoftwareAgent
	 * @return SoftwareAgentBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public SoftwareAgent.SoftwareAgentBuilder createSoftwareAgent(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		SoftwareAgent.SoftwareAgentBuilder retval = new SoftwareAgent.SoftwareAgentBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an HarvestProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the HarvestProcess
	 * @return HarvestProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public HarvestProcess.HarvestProcessBuilder createHarvestProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		HarvestProcess.HarvestProcessBuilder retval = new HarvestProcess.HarvestProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an VulnerabilityBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Vulnerability
	 * @return VulnerabilityBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Vulnerability.VulnerabilityBuilder createVulnerability(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Vulnerability.VulnerabilityBuilder retval = new Vulnerability.VulnerabilityBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ExternalRefBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ExternalRef
	 * @return ExternalRefBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ExternalRef.ExternalRefBuilder createExternalRef(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ExternalRef.ExternalRefBuilder retval = new ExternalRef.ExternalRefBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an StateActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the StateAction
	 * @return StateActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public StateAction.StateActionBuilder createStateAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		StateAction.StateActionBuilder retval = new StateAction.StateActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ToolBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Tool
	 * @return ToolBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Tool.ToolBuilder createTool(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Tool.ToolBuilder retval = new Tool.ToolBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an AnyLicenseInfoBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the AnyLicenseInfo
	 * @return AnyLicenseInfoBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public AnyLicenseInfo.AnyLicenseInfoBuilder createAnyLicenseInfo(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		AnyLicenseInfo.AnyLicenseInfoBuilder retval = new AnyLicenseInfo.AnyLicenseInfoBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ChangeActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ChangeAction
	 * @return ChangeActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ChangeAction.ChangeActionBuilder createChangeAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ChangeAction.ChangeActionBuilder retval = new ChangeAction.ChangeActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an MeasureOfMassBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the MeasureOfMass
	 * @return MeasureOfMassBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public MeasureOfMass.MeasureOfMassBuilder createMeasureOfMass(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		MeasureOfMass.MeasureOfMassBuilder retval = new MeasureOfMass.MeasureOfMassBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an CvssV4VulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CvssV4VulnAssessmentRelationship
	 * @return CvssV4VulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CvssV4VulnAssessmentRelationship.CvssV4VulnAssessmentRelationshipBuilder createCvssV4VulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		CvssV4VulnAssessmentRelationship.CvssV4VulnAssessmentRelationshipBuilder retval = new CvssV4VulnAssessmentRelationship.CvssV4VulnAssessmentRelationshipBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ResolutionActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ResolutionAction
	 * @return ResolutionActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ResolutionAction.ResolutionActionBuilder createResolutionAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ResolutionAction.ResolutionActionBuilder retval = new ResolutionAction.ResolutionActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an VexFixedVulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the VexFixedVulnAssessmentRelationship
	 * @return VexFixedVulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public VexFixedVulnAssessmentRelationship.VexFixedVulnAssessmentRelationshipBuilder createVexFixedVulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		VexFixedVulnAssessmentRelationship.VexFixedVulnAssessmentRelationshipBuilder retval = new VexFixedVulnAssessmentRelationship.VexFixedVulnAssessmentRelationshipBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an SpdxPackageBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the SpdxPackage
	 * @return SpdxPackageBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public SpdxPackage.SpdxPackageBuilder createSpdxPackage(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		SpdxPackage.SpdxPackageBuilder retval = new SpdxPackage.SpdxPackageBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ResponsibilityChangeProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ResponsibilityChangeProcess
	 * @return ResponsibilityChangeProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ResponsibilityChangeProcess.ResponsibilityChangeProcessBuilder createResponsibilityChangeProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ResponsibilityChangeProcess.ResponsibilityChangeProcessBuilder retval = new ResponsibilityChangeProcess.ResponsibilityChangeProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an BulkHardwareBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the BulkHardware
	 * @return BulkHardwareBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public BulkHardware.BulkHardwareBuilder createBulkHardware(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		BulkHardware.BulkHardwareBuilder retval = new BulkHardware.BulkHardwareBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an CreationInfoBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CreationInfo
	 * @return CreationInfoBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CreationInfo.CreationInfoBuilder createCreationInfo(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		CreationInfo.CreationInfoBuilder retval = new CreationInfo.CreationInfoBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an CvssV3VulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CvssV3VulnAssessmentRelationship
	 * @return CvssV3VulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CvssV3VulnAssessmentRelationship.CvssV3VulnAssessmentRelationshipBuilder createCvssV3VulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		CvssV3VulnAssessmentRelationship.CvssV3VulnAssessmentRelationshipBuilder retval = new CvssV3VulnAssessmentRelationship.CvssV3VulnAssessmentRelationshipBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an InstantiateVirtualHardwareProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the InstantiateVirtualHardwareProcess
	 * @return InstantiateVirtualHardwareProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public InstantiateVirtualHardwareProcess.InstantiateVirtualHardwareProcessBuilder createInstantiateVirtualHardwareProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		InstantiateVirtualHardwareProcess.InstantiateVirtualHardwareProcessBuilder retval = new InstantiateVirtualHardwareProcess.InstantiateVirtualHardwareProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an EnergyConsumptionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the EnergyConsumption
	 * @return EnergyConsumptionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public EnergyConsumption.EnergyConsumptionBuilder createEnergyConsumption(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		EnergyConsumption.EnergyConsumptionBuilder retval = new EnergyConsumption.EnergyConsumptionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ConjunctiveLicenseSetBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ConjunctiveLicenseSet
	 * @return ConjunctiveLicenseSetBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ConjunctiveLicenseSet.ConjunctiveLicenseSetBuilder createConjunctiveLicenseSet(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ConjunctiveLicenseSet.ConjunctiveLicenseSetBuilder retval = new ConjunctiveLicenseSet.ConjunctiveLicenseSetBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an HashBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Hash
	 * @return HashBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Hash.HashBuilder createHash(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Hash.HashBuilder retval = new Hash.HashBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an TestActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the TestAction
	 * @return TestActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public TestAction.TestActionBuilder createTestAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		TestAction.TestActionBuilder retval = new TestAction.TestActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an UseActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the UseAction
	 * @return UseActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public UseAction.UseActionBuilder createUseAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		UseAction.UseActionBuilder retval = new UseAction.UseActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an InspectionActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the InspectionAction
	 * @return InspectionActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public InspectionAction.InspectionActionBuilder createInspectionAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		InspectionAction.InspectionActionBuilder retval = new InspectionAction.InspectionActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an AgentBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Agent
	 * @return AgentBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Agent.AgentBuilder createAgent(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Agent.AgentBuilder retval = new Agent.AgentBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an InspectionProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the InspectionProcess
	 * @return InspectionProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public InspectionProcess.InspectionProcessBuilder createInspectionProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		InspectionProcess.InspectionProcessBuilder retval = new InspectionProcess.InspectionProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an AnnotationBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Annotation
	 * @return AnnotationBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Annotation.AnnotationBuilder createAnnotation(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Annotation.AnnotationBuilder retval = new Annotation.AnnotationBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an PhysicalHardwareBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the PhysicalHardware
	 * @return PhysicalHardwareBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public PhysicalHardware.PhysicalHardwareBuilder createPhysicalHardware(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		PhysicalHardware.PhysicalHardwareBuilder retval = new PhysicalHardware.PhysicalHardwareBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an StateBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the State
	 * @return StateBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public State.StateBuilder createState(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		State.StateBuilder retval = new State.StateBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an BoundaryDefinitionActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the BoundaryDefinitionAction
	 * @return BoundaryDefinitionActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public BoundaryDefinitionAction.BoundaryDefinitionActionBuilder createBoundaryDefinitionAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		BoundaryDefinitionAction.BoundaryDefinitionActionBuilder retval = new BoundaryDefinitionAction.BoundaryDefinitionActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an CreateProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CreateProcess
	 * @return CreateProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CreateProcess.CreateProcessBuilder createCreateProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		CreateProcess.CreateProcessBuilder retval = new CreateProcess.CreateProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an PlanProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the PlanProcess
	 * @return PlanProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public PlanProcess.PlanProcessBuilder createPlanProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		PlanProcess.PlanProcessBuilder retval = new PlanProcess.PlanProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an EpssVulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the EpssVulnAssessmentRelationship
	 * @return EpssVulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public EpssVulnAssessmentRelationship.EpssVulnAssessmentRelationshipBuilder createEpssVulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		EpssVulnAssessmentRelationship.EpssVulnAssessmentRelationshipBuilder retval = new EpssVulnAssessmentRelationship.EpssVulnAssessmentRelationshipBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an BoundaryDefinitionProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the BoundaryDefinitionProcess
	 * @return BoundaryDefinitionProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public BoundaryDefinitionProcess.BoundaryDefinitionProcessBuilder createBoundaryDefinitionProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		BoundaryDefinitionProcess.BoundaryDefinitionProcessBuilder retval = new BoundaryDefinitionProcess.BoundaryDefinitionProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an TransportProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the TransportProcess
	 * @return TransportProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public TransportProcess.TransportProcessBuilder createTransportProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		TransportProcess.TransportProcessBuilder retval = new TransportProcess.TransportProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ReproduceActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ReproduceAction
	 * @return ReproduceActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ReproduceAction.ReproduceActionBuilder createReproduceAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ReproduceAction.ReproduceActionBuilder retval = new ReproduceAction.ReproduceActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ManufactureProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ManufactureProcess
	 * @return ManufactureProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ManufactureProcess.ManufactureProcessBuilder createManufactureProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ManufactureProcess.ManufactureProcessBuilder retval = new ManufactureProcess.ManufactureProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an EvidenceRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the EvidenceRelationship
	 * @return EvidenceRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public EvidenceRelationship.EvidenceRelationshipBuilder createEvidenceRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		EvidenceRelationship.EvidenceRelationshipBuilder retval = new EvidenceRelationship.EvidenceRelationshipBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an SpecificationBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Specification
	 * @return SpecificationBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Specification.SpecificationBuilder createSpecification(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Specification.SpecificationBuilder retval = new Specification.SpecificationBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an OrLaterOperatorBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the OrLaterOperator
	 * @return OrLaterOperatorBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public OrLaterOperator.OrLaterOperatorBuilder createOrLaterOperator(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		OrLaterOperator.OrLaterOperatorBuilder retval = new OrLaterOperator.OrLaterOperatorBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ContentIdentifierBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ContentIdentifier
	 * @return ContentIdentifierBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ContentIdentifier.ContentIdentifierBuilder createContentIdentifier(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ContentIdentifier.ContentIdentifierBuilder retval = new ContentIdentifier.ContentIdentifierBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an SpdxFileBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the SpdxFile
	 * @return SpdxFileBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public SpdxFile.SpdxFileBuilder createSpdxFile(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		SpdxFile.SpdxFileBuilder retval = new SpdxFile.SpdxFileBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an DestroyProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the DestroyProcess
	 * @return DestroyProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public DestroyProcess.DestroyProcessBuilder createDestroyProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		DestroyProcess.DestroyProcessBuilder retval = new DestroyProcess.DestroyProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an RequirementBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Requirement
	 * @return RequirementBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Requirement.RequirementBuilder createRequirement(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Requirement.RequirementBuilder retval = new Requirement.RequirementBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an SimpleLicensingTextBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the SimpleLicensingText
	 * @return SimpleLicensingTextBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public SimpleLicensingText.SimpleLicensingTextBuilder createSimpleLicensingText(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		SimpleLicensingText.SimpleLicensingTextBuilder retval = new SimpleLicensingText.SimpleLicensingTextBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an BomBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Bom
	 * @return BomBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Bom.BomBuilder createBom(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Bom.BomBuilder retval = new Bom.BomBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an DefinedStateProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the DefinedStateProcess
	 * @return DefinedStateProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public DefinedStateProcess.DefinedStateProcessBuilder createDefinedStateProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		DefinedStateProcess.DefinedStateProcessBuilder retval = new DefinedStateProcess.DefinedStateProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an PhysicalLocationBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the PhysicalLocation
	 * @return PhysicalLocationBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public PhysicalLocation.PhysicalLocationBuilder createPhysicalLocation(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		PhysicalLocation.PhysicalLocationBuilder retval = new PhysicalLocation.PhysicalLocationBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an CdxPropertiesExtensionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CdxPropertiesExtension
	 * @return CdxPropertiesExtensionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CdxPropertiesExtension.CdxPropertiesExtensionBuilder createCdxPropertiesExtension(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		CdxPropertiesExtension.CdxPropertiesExtensionBuilder retval = new CdxPropertiesExtension.CdxPropertiesExtensionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ModifyProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ModifyProcess
	 * @return ModifyProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ModifyProcess.ModifyProcessBuilder createModifyProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ModifyProcess.ModifyProcessBuilder retval = new ModifyProcess.ModifyProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an RelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Relationship
	 * @return RelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Relationship.RelationshipBuilder createRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Relationship.RelationshipBuilder retval = new Relationship.RelationshipBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an SsvcVulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the SsvcVulnAssessmentRelationship
	 * @return SsvcVulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public SsvcVulnAssessmentRelationship.SsvcVulnAssessmentRelationshipBuilder createSsvcVulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		SsvcVulnAssessmentRelationship.SsvcVulnAssessmentRelationshipBuilder retval = new SsvcVulnAssessmentRelationship.SsvcVulnAssessmentRelationshipBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ResponsibilityChangeActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ResponsibilityChangeAction
	 * @return ResponsibilityChangeActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ResponsibilityChangeAction.ResponsibilityChangeActionBuilder createResponsibilityChangeAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ResponsibilityChangeAction.ResponsibilityChangeActionBuilder retval = new ResponsibilityChangeAction.ResponsibilityChangeActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an DisjunctiveLicenseSetBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the DisjunctiveLicenseSet
	 * @return DisjunctiveLicenseSetBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public DisjunctiveLicenseSet.DisjunctiveLicenseSetBuilder createDisjunctiveLicenseSet(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		DisjunctiveLicenseSet.DisjunctiveLicenseSetBuilder retval = new DisjunctiveLicenseSet.DisjunctiveLicenseSetBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an BuildBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Build
	 * @return BuildBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Build.BuildBuilder createBuild(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Build.BuildBuilder retval = new Build.BuildBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an DictionaryEntryBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the DictionaryEntry
	 * @return DictionaryEntryBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public DictionaryEntry.DictionaryEntryBuilder createDictionaryEntry(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		DictionaryEntry.DictionaryEntryBuilder retval = new DictionaryEntry.DictionaryEntryBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an AssemblyProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the AssemblyProcess
	 * @return AssemblyProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public AssemblyProcess.AssemblyProcessBuilder createAssemblyProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		AssemblyProcess.AssemblyProcessBuilder retval = new AssemblyProcess.AssemblyProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an EnergyConsumptionDescriptionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the EnergyConsumptionDescription
	 * @return EnergyConsumptionDescriptionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public EnergyConsumptionDescription.EnergyConsumptionDescriptionBuilder createEnergyConsumptionDescription(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		EnergyConsumptionDescription.EnergyConsumptionDescriptionBuilder retval = new EnergyConsumptionDescription.EnergyConsumptionDescriptionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an UseProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the UseProcess
	 * @return UseProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public UseProcess.UseProcessBuilder createUseProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		UseProcess.UseProcessBuilder retval = new UseProcess.UseProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an UnitOfMeasureBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the UnitOfMeasure
	 * @return UnitOfMeasureBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public UnitOfMeasure.UnitOfMeasureBuilder createUnitOfMeasure(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		UnitOfMeasure.UnitOfMeasureBuilder retval = new UnitOfMeasure.UnitOfMeasureBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an IndividualElementBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the IndividualElement
	 * @return IndividualElementBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public IndividualElement.IndividualElementBuilder createIndividualElement(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		IndividualElement.IndividualElementBuilder retval = new IndividualElement.IndividualElementBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an VirtualHardwareBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the VirtualHardware
	 * @return VirtualHardwareBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public VirtualHardware.VirtualHardwareBuilder createVirtualHardware(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		VirtualHardware.VirtualHardwareBuilder retval = new VirtualHardware.VirtualHardwareBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an BoundaryCrossingActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the BoundaryCrossingAction
	 * @return BoundaryCrossingActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public BoundaryCrossingAction.BoundaryCrossingActionBuilder createBoundaryCrossingAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		BoundaryCrossingAction.BoundaryCrossingActionBuilder retval = new BoundaryCrossingAction.BoundaryCrossingActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ElementMapBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ElementMap
	 * @return ElementMapBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ElementMap.ElementMapBuilder createElementMap(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ElementMap.ElementMapBuilder retval = new ElementMap.ElementMapBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ExportControlClassificationBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ExportControlClassification
	 * @return ExportControlClassificationBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ExportControlClassification.ExportControlClassificationBuilder createExportControlClassification(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ExportControlClassification.ExportControlClassificationBuilder retval = new ExportControlClassification.ExportControlClassificationBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ExternalMapBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ExternalMap
	 * @return ExternalMapBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ExternalMap.ExternalMapBuilder createExternalMap(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ExternalMap.ExternalMapBuilder retval = new ExternalMap.ExternalMapBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ModifyActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ModifyAction
	 * @return ModifyActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ModifyAction.ModifyActionBuilder createModifyAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ModifyAction.ModifyActionBuilder retval = new ModifyAction.ModifyActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an WithAdditionOperatorBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the WithAdditionOperator
	 * @return WithAdditionOperatorBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public WithAdditionOperator.WithAdditionOperatorBuilder createWithAdditionOperator(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		WithAdditionOperator.WithAdditionOperatorBuilder retval = new WithAdditionOperator.WithAdditionOperatorBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an CdxPropertyEntryBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CdxPropertyEntry
	 * @return CdxPropertyEntryBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CdxPropertyEntry.CdxPropertyEntryBuilder createCdxPropertyEntry(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		CdxPropertyEntry.CdxPropertyEntryBuilder retval = new CdxPropertyEntry.CdxPropertyEntryBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an CustomLicenseAdditionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CustomLicenseAddition
	 * @return CustomLicenseAdditionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CustomLicenseAddition.CustomLicenseAdditionBuilder createCustomLicenseAddition(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		CustomLicenseAddition.CustomLicenseAdditionBuilder retval = new CustomLicenseAddition.CustomLicenseAdditionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ProjectBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Project
	 * @return ProjectBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Project.ProjectBuilder createProject(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Project.ProjectBuilder retval = new Project.ProjectBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an LicenseExpressionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the LicenseExpression
	 * @return LicenseExpressionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public LicenseExpression.LicenseExpressionBuilder createLicenseExpression(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		LicenseExpression.LicenseExpressionBuilder retval = new LicenseExpression.LicenseExpressionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an HarvestActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the HarvestAction
	 * @return HarvestActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public HarvestAction.HarvestActionBuilder createHarvestAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		HarvestAction.HarvestActionBuilder retval = new HarvestAction.HarvestActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an RequirementVerificationBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the RequirementVerification
	 * @return RequirementVerificationBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public RequirementVerification.RequirementVerificationBuilder createRequirementVerification(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		RequirementVerification.RequirementVerificationBuilder retval = new RequirementVerification.RequirementVerificationBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an VexAffectedVulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the VexAffectedVulnAssessmentRelationship
	 * @return VexAffectedVulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public VexAffectedVulnAssessmentRelationship.VexAffectedVulnAssessmentRelationshipBuilder createVexAffectedVulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		VexAffectedVulnAssessmentRelationship.VexAffectedVulnAssessmentRelationshipBuilder retval = new VexAffectedVulnAssessmentRelationship.VexAffectedVulnAssessmentRelationshipBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an SpdxDocumentBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the SpdxDocument
	 * @return SpdxDocumentBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public SpdxDocument.SpdxDocumentBuilder createSpdxDocument(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		SpdxDocument.SpdxDocumentBuilder retval = new SpdxDocument.SpdxDocumentBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an PersonBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Person
	 * @return PersonBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Person.PersonBuilder createPerson(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Person.PersonBuilder retval = new Person.PersonBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an IndividualLicensingInfoBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the IndividualLicensingInfo
	 * @return IndividualLicensingInfoBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public IndividualLicensingInfo.IndividualLicensingInfoBuilder createIndividualLicensingInfo(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		IndividualLicensingInfo.IndividualLicensingInfoBuilder retval = new IndividualLicensingInfo.IndividualLicensingInfoBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ContactPointRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ContactPointRelationship
	 * @return ContactPointRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ContactPointRelationship.ContactPointRelationshipBuilder createContactPointRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ContactPointRelationship.ContactPointRelationshipBuilder retval = new ContactPointRelationship.ContactPointRelationshipBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an LifecycleScopedRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the LifecycleScopedRelationship
	 * @return LifecycleScopedRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public LifecycleScopedRelationship.LifecycleScopedRelationshipBuilder createLifecycleScopedRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		LifecycleScopedRelationship.LifecycleScopedRelationshipBuilder retval = new LifecycleScopedRelationship.LifecycleScopedRelationshipBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an DatasetPackageBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the DatasetPackage
	 * @return DatasetPackageBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public DatasetPackage.DatasetPackageBuilder createDatasetPackage(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		DatasetPackage.DatasetPackageBuilder retval = new DatasetPackage.DatasetPackageBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an SnippetBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Snippet
	 * @return SnippetBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Snippet.SnippetBuilder createSnippet(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Snippet.SnippetBuilder retval = new Snippet.SnippetBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an VexUnderInvestigationVulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the VexUnderInvestigationVulnAssessmentRelationship
	 * @return VexUnderInvestigationVulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public VexUnderInvestigationVulnAssessmentRelationship.VexUnderInvestigationVulnAssessmentRelationshipBuilder createVexUnderInvestigationVulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		VexUnderInvestigationVulnAssessmentRelationship.VexUnderInvestigationVulnAssessmentRelationshipBuilder retval = new VexUnderInvestigationVulnAssessmentRelationship.VexUnderInvestigationVulnAssessmentRelationshipBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ExternalIdentifierBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ExternalIdentifier
	 * @return ExternalIdentifierBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ExternalIdentifier.ExternalIdentifierBuilder createExternalIdentifier(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ExternalIdentifier.ExternalIdentifierBuilder retval = new ExternalIdentifier.ExternalIdentifierBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an NamespaceMapBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the NamespaceMap
	 * @return NamespaceMapBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public NamespaceMap.NamespaceMapBuilder createNamespaceMap(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		NamespaceMap.NamespaceMapBuilder retval = new NamespaceMap.NamespaceMapBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an StorageProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the StorageProcess
	 * @return StorageProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public StorageProcess.StorageProcessBuilder createStorageProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		StorageProcess.StorageProcessBuilder retval = new StorageProcess.StorageProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an SbomBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Sbom
	 * @return SbomBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Sbom.SbomBuilder createSbom(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Sbom.SbomBuilder retval = new Sbom.SbomBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an PackageVerificationCodeBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the PackageVerificationCode
	 * @return PackageVerificationCodeBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public PackageVerificationCode.PackageVerificationCodeBuilder createPackageVerificationCode(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		PackageVerificationCode.PackageVerificationCodeBuilder retval = new PackageVerificationCode.PackageVerificationCodeBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an OutOfSpecActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the OutOfSpecAction
	 * @return OutOfSpecActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public OutOfSpecAction.OutOfSpecActionBuilder createOutOfSpecAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		OutOfSpecAction.OutOfSpecActionBuilder retval = new OutOfSpecAction.OutOfSpecActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an VexNotAffectedVulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the VexNotAffectedVulnAssessmentRelationship
	 * @return VexNotAffectedVulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public VexNotAffectedVulnAssessmentRelationship.VexNotAffectedVulnAssessmentRelationshipBuilder createVexNotAffectedVulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		VexNotAffectedVulnAssessmentRelationship.VexNotAffectedVulnAssessmentRelationshipBuilder retval = new VexNotAffectedVulnAssessmentRelationship.VexNotAffectedVulnAssessmentRelationshipBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an StorageActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the StorageAction
	 * @return StorageActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public StorageAction.StorageActionBuilder createStorageAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		StorageAction.StorageActionBuilder retval = new StorageAction.StorageActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an DestroyActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the DestroyAction
	 * @return DestroyActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public DestroyAction.DestroyActionBuilder createDestroyAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		DestroyAction.DestroyActionBuilder retval = new DestroyAction.DestroyActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ReproduceProcessBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ReproduceProcess
	 * @return ReproduceProcessBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ReproduceProcess.ReproduceProcessBuilder createReproduceProcess(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ReproduceProcess.ReproduceProcessBuilder retval = new ReproduceProcess.ReproduceProcessBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an OrganizationBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Organization
	 * @return OrganizationBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Organization.OrganizationBuilder createOrganization(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Organization.OrganizationBuilder retval = new Organization.OrganizationBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ManufactureActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ManufactureAction
	 * @return ManufactureActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ManufactureAction.ManufactureActionBuilder createManufactureAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ManufactureAction.ManufactureActionBuilder retval = new ManufactureAction.ManufactureActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an PositiveIntegerRangeBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the PositiveIntegerRange
	 * @return PositiveIntegerRangeBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public PositiveIntegerRange.PositiveIntegerRangeBuilder createPositiveIntegerRange(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		PositiveIntegerRange.PositiveIntegerRangeBuilder retval = new PositiveIntegerRange.PositiveIntegerRangeBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an BundleBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Bundle
	 * @return BundleBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Bundle.BundleBuilder createBundle(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Bundle.BundleBuilder retval = new Bundle.BundleBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ExploitCatalogVulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ExploitCatalogVulnAssessmentRelationship
	 * @return ExploitCatalogVulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ExploitCatalogVulnAssessmentRelationship.ExploitCatalogVulnAssessmentRelationshipBuilder createExploitCatalogVulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ExploitCatalogVulnAssessmentRelationship.ExploitCatalogVulnAssessmentRelationshipBuilder retval = new ExploitCatalogVulnAssessmentRelationship.ExploitCatalogVulnAssessmentRelationshipBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an CvssV2VulnAssessmentRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CvssV2VulnAssessmentRelationship
	 * @return CvssV2VulnAssessmentRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CvssV2VulnAssessmentRelationship.CvssV2VulnAssessmentRelationshipBuilder createCvssV2VulnAssessmentRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		CvssV2VulnAssessmentRelationship.CvssV2VulnAssessmentRelationshipBuilder retval = new CvssV2VulnAssessmentRelationship.CvssV2VulnAssessmentRelationshipBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an EvaluationResultBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the EvaluationResult
	 * @return EvaluationResultBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public EvaluationResult.EvaluationResultBuilder createEvaluationResult(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		EvaluationResult.EvaluationResultBuilder retval = new EvaluationResult.EvaluationResultBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ExportControlClassificationAssessmentBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ExportControlClassificationAssessment
	 * @return ExportControlClassificationAssessmentBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ExportControlClassificationAssessment.ExportControlClassificationAssessmentBuilder createExportControlClassificationAssessment(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ExportControlClassificationAssessment.ExportControlClassificationAssessmentBuilder retval = new ExportControlClassificationAssessment.ExportControlClassificationAssessmentBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an AssemblyActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the AssemblyAction
	 * @return AssemblyActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public AssemblyAction.AssemblyActionBuilder createAssemblyAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		AssemblyAction.AssemblyActionBuilder retval = new AssemblyAction.AssemblyActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an TransportActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the TransportAction
	 * @return TransportActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public TransportAction.TransportActionBuilder createTransportAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		TransportAction.TransportActionBuilder retval = new TransportAction.TransportActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an CreateActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the CreateAction
	 * @return CreateActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public CreateAction.CreateActionBuilder createCreateAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		CreateAction.CreateActionBuilder retval = new CreateAction.CreateActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an PlanActionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the PlanAction
	 * @return PlanActionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public PlanAction.PlanActionBuilder createPlanAction(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		PlanAction.PlanActionBuilder retval = new PlanAction.PlanActionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an DefinedTypeBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the DefinedType
	 * @return DefinedTypeBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public DefinedType.DefinedTypeBuilder createDefinedType(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		DefinedType.DefinedTypeBuilder retval = new DefinedType.DefinedTypeBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an SupportRelationshipBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the SupportRelationship
	 * @return SupportRelationshipBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public SupportRelationship.SupportRelationshipBuilder createSupportRelationship(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		SupportRelationship.SupportRelationshipBuilder retval = new SupportRelationship.SupportRelationshipBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ProductSpecificationBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the ProductSpecification
	 * @return ProductSpecificationBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public ProductSpecification.ProductSpecificationBuilder createProductSpecification(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		ProductSpecification.ProductSpecificationBuilder retval = new ProductSpecification.ProductSpecificationBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an MeasureOfLengthBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the MeasureOfLength
	 * @return MeasureOfLengthBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public MeasureOfLength.MeasureOfLengthBuilder createMeasureOfLength(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		MeasureOfLength.MeasureOfLengthBuilder retval = new MeasureOfLength.MeasureOfLengthBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}


		/**
	 * Create an ExtensionBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Extension
	 * @return ExtensionBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Extension.ExtensionBuilder createExtension(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		Extension.ExtensionBuilder retval = new Extension.ExtensionBuilder(this, objectUri);
		retval.setModelSpecVersion(specVersion);
		return retval;
	}



	public static class ModelObjectV3Builder extends CoreModelObjectBuilder {

		private String modelSpecVersion = null;

		/**
		 * @param modelStore
		 * @param objectUri
		 * @param copyManager
		 */
		public ModelObjectV3Builder(IModelStore modelStore, String objectUri,
									IModelCopyManager copyManager) {
			super(modelStore, objectUri, copyManager);
		}

		/**
		 * @param modelStore
		 * @param objectUri
		 * @param copyManager
		 * @param specVersion
		 */
		public ModelObjectV3Builder(IModelStore modelStore, String objectUri,
				IModelCopyManager copyManager, String specVersion) {
			this(modelStore, objectUri, copyManager);
			this.modelSpecVersion = specVersion;
		}

		public String getModelSpecVersion() {
			return this.modelSpecVersion;
		}

		public void setModelSpecVersion(String modelSpecVersion) {
			this.modelSpecVersion = modelSpecVersion;
		}
	}
}
