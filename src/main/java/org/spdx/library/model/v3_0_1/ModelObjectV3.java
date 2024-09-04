/**
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (c) 2024 Source Auditor Inc.
 */
package org.spdx.library.model.v3_0_1;

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
import org.spdx.library.model.v3_0_1.ai.AIPackage;
import org.spdx.library.model.v3_0_1.ai.EnergyConsumption;
import org.spdx.library.model.v3_0_1.ai.EnergyConsumptionDescription;
import org.spdx.library.model.v3_0_1.ai.ExternalAIPackage;
import org.spdx.library.model.v3_0_1.build.Build;
import org.spdx.library.model.v3_0_1.build.ExternalBuild;
import org.spdx.library.model.v3_0_1.core.Agent;
import org.spdx.library.model.v3_0_1.core.Annotation;
import org.spdx.library.model.v3_0_1.core.Artifact;
import org.spdx.library.model.v3_0_1.core.Bom;
import org.spdx.library.model.v3_0_1.core.Bundle;
import org.spdx.library.model.v3_0_1.core.CreationInfo;
import org.spdx.library.model.v3_0_1.core.DictionaryEntry;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.core.ElementCollection;
import org.spdx.library.model.v3_0_1.core.ExternalAgent;
import org.spdx.library.model.v3_0_1.core.ExternalAnnotation;
import org.spdx.library.model.v3_0_1.core.ExternalArtifact;
import org.spdx.library.model.v3_0_1.core.ExternalBom;
import org.spdx.library.model.v3_0_1.core.ExternalBundle;
import org.spdx.library.model.v3_0_1.core.ExternalElement;
import org.spdx.library.model.v3_0_1.core.ExternalElementCollection;
import org.spdx.library.model.v3_0_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_0_1.core.ExternalLifecycleScopedRelationship;
import org.spdx.library.model.v3_0_1.core.ExternalMap;
import org.spdx.library.model.v3_0_1.core.ExternalOrganization;
import org.spdx.library.model.v3_0_1.core.ExternalPerson;
import org.spdx.library.model.v3_0_1.core.ExternalRef;
import org.spdx.library.model.v3_0_1.core.ExternalRelationship;
import org.spdx.library.model.v3_0_1.core.ExternalSoftwareAgent;
import org.spdx.library.model.v3_0_1.core.ExternalSpdxDocument;
import org.spdx.library.model.v3_0_1.core.ExternalTool;
import org.spdx.library.model.v3_0_1.core.Hash;
import org.spdx.library.model.v3_0_1.core.IntegrityMethod;
import org.spdx.library.model.v3_0_1.core.LifecycleScopedRelationship;
import org.spdx.library.model.v3_0_1.core.NamespaceMap;
import org.spdx.library.model.v3_0_1.core.Organization;
import org.spdx.library.model.v3_0_1.core.PackageVerificationCode;
import org.spdx.library.model.v3_0_1.core.Person;
import org.spdx.library.model.v3_0_1.core.PositiveIntegerRange;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0_1.core.Relationship;
import org.spdx.library.model.v3_0_1.core.SoftwareAgent;
import org.spdx.library.model.v3_0_1.core.SpdxDocument;
import org.spdx.library.model.v3_0_1.core.Tool;
import org.spdx.library.model.v3_0_1.dataset.DatasetPackage;
import org.spdx.library.model.v3_0_1.dataset.ExternalDatasetPackage;
import org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet;
import org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicense;
import org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition;
import org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet;
import org.spdx.library.model.v3_0_1.expandedlicensing.ExtendableLicense;
import org.spdx.library.model.v3_0_1.expandedlicensing.ExternalConjunctiveLicenseSet;
import org.spdx.library.model.v3_0_1.expandedlicensing.ExternalCustomLicense;
import org.spdx.library.model.v3_0_1.expandedlicensing.ExternalCustomLicenseAddition;
import org.spdx.library.model.v3_0_1.expandedlicensing.ExternalDisjunctiveLicenseSet;
import org.spdx.library.model.v3_0_1.expandedlicensing.ExternalExtendableLicense;
import org.spdx.library.model.v3_0_1.expandedlicensing.ExternalIndividualLicensingInfo;
import org.spdx.library.model.v3_0_1.expandedlicensing.ExternalLicense;
import org.spdx.library.model.v3_0_1.expandedlicensing.ExternalLicenseAddition;
import org.spdx.library.model.v3_0_1.expandedlicensing.ExternalListedLicense;
import org.spdx.library.model.v3_0_1.expandedlicensing.ExternalListedLicenseException;
import org.spdx.library.model.v3_0_1.expandedlicensing.ExternalOrLaterOperator;
import org.spdx.library.model.v3_0_1.expandedlicensing.ExternalWithAdditionOperator;
import org.spdx.library.model.v3_0_1.expandedlicensing.IndividualLicensingInfo;
import org.spdx.library.model.v3_0_1.expandedlicensing.License;
import org.spdx.library.model.v3_0_1.expandedlicensing.LicenseAddition;
import org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense;
import org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException;
import org.spdx.library.model.v3_0_1.expandedlicensing.OrLaterOperator;
import org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator;
import org.spdx.library.model.v3_0_1.extension.CdxPropertiesExtension;
import org.spdx.library.model.v3_0_1.extension.CdxPropertyEntry;
import org.spdx.library.model.v3_0_1.extension.Extension;
import org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.CvssV3VulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.ExploitCatalogVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.ExternalCvssV2VulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.ExternalCvssV3VulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.ExternalCvssV4VulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.ExternalEpssVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.ExternalExploitCatalogVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.ExternalSsvcVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.ExternalVexAffectedVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.ExternalVexFixedVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.ExternalVexNotAffectedVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.ExternalVexUnderInvestigationVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.ExternalVexVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.ExternalVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.ExternalVulnerability;
import org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.VexUnderInvestigationVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.VexVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.VulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.Vulnerability;
import org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo;
import org.spdx.library.model.v3_0_1.simplelicensing.ExternalAnyLicenseInfo;
import org.spdx.library.model.v3_0_1.simplelicensing.ExternalLicenseExpression;
import org.spdx.library.model.v3_0_1.simplelicensing.ExternalSimpleLicensingText;
import org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression;
import org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText;
import org.spdx.library.model.v3_0_1.software.ContentIdentifier;
import org.spdx.library.model.v3_0_1.software.ExternalSbom;
import org.spdx.library.model.v3_0_1.software.ExternalSnippet;
import org.spdx.library.model.v3_0_1.software.ExternalSoftwareArtifact;
import org.spdx.library.model.v3_0_1.software.ExternalSpdxFile;
import org.spdx.library.model.v3_0_1.software.ExternalSpdxPackage;
import org.spdx.library.model.v3_0_1.software.Sbom;
import org.spdx.library.model.v3_0_1.software.Snippet;
import org.spdx.library.model.v3_0_1.software.SoftwareArtifact;
import org.spdx.library.model.v3_0_1.software.SpdxFile;
import org.spdx.library.model.v3_0_1.software.SpdxPackage;
import org.spdx.storage.IModelStore;
import org.spdx.storage.PropertyDescriptor;


/**
 * @author Gary O'Neall
 *
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
	 * @param idPrefix - prefix to be used when generating new SPDX IDs
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
				((IndividualLicensingInfo)value).getObjectUri() == "https://spdx.org/rdf/3.0.1/terms/Licensing/NoAssertion";
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
	 * Create an ToolBuilder inheriting model, and other information from this object
	 * @param objectUri - URI or anonymous ID for the Tool
	 * @return ToolBuilder using the same modelStore and documentUri as this object
	 * @throws InvalidSPDXAnalysisException
	 */
	public Tool.ToolBuilder createTool(String objectUri) throws InvalidSPDXAnalysisException {
		Objects.requireNonNull(objectUri, "objectUri can not be null");
		return new Tool.ToolBuilder(this, objectUri);
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
