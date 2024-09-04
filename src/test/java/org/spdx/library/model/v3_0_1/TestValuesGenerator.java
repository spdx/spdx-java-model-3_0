/**
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (c) 2024 Source Auditor Inc.
 */
package org.spdx.library.model.v3_0_1;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3_0_1.ai.AIPackage.AIPackageBuilder;
import org.spdx.library.model.v3_0_1.ai.EnergyConsumption.EnergyConsumptionBuilder;
import org.spdx.library.model.v3_0_1.ai.EnergyConsumption;
import org.spdx.library.model.v3_0_1.ai.EnergyConsumptionDescription.EnergyConsumptionDescriptionBuilder;
import org.spdx.library.model.v3_0_1.ai.EnergyConsumptionDescription;
import org.spdx.library.model.v3_0_1.ai.EnergyUnitType;
import org.spdx.library.model.v3_0_1.ai.SafetyRiskAssessmentType;
import org.spdx.library.model.v3_0_1.build.Build.BuildBuilder;
import org.spdx.library.model.v3_0_1.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_0_1.core.Agent;
import org.spdx.library.model.v3_0_1.core.Annotation.AnnotationBuilder;
import org.spdx.library.model.v3_0_1.core.AnnotationType;
import org.spdx.library.model.v3_0_1.core.Artifact.ArtifactBuilder;
import org.spdx.library.model.v3_0_1.core.Artifact;
import org.spdx.library.model.v3_0_1.core.Bom.BomBuilder;
import org.spdx.library.model.v3_0_1.core.Bundle.BundleBuilder;
import org.spdx.library.model.v3_0_1.core.CreationInfo.CreationInfoBuilder;
import org.spdx.library.model.v3_0_1.core.CreationInfo;
import org.spdx.library.model.v3_0_1.core.DictionaryEntry.DictionaryEntryBuilder;
import org.spdx.library.model.v3_0_1.core.DictionaryEntry;
import org.spdx.library.model.v3_0_1.core.Element.ElementBuilder;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.core.ElementCollection.ElementCollectionBuilder;
import org.spdx.library.model.v3_0_1.core.ElementCollection;
import org.spdx.library.model.v3_0_1.core.ExternalIdentifier.ExternalIdentifierBuilder;
import org.spdx.library.model.v3_0_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_0_1.core.ExternalIdentifierType;
import org.spdx.library.model.v3_0_1.core.ExternalMap.ExternalMapBuilder;
import org.spdx.library.model.v3_0_1.core.ExternalMap;
import org.spdx.library.model.v3_0_1.core.ExternalRef.ExternalRefBuilder;
import org.spdx.library.model.v3_0_1.core.ExternalRef;
import org.spdx.library.model.v3_0_1.core.ExternalRefType;
import org.spdx.library.model.v3_0_1.core.Hash.HashBuilder;
import org.spdx.library.model.v3_0_1.core.Hash;
import org.spdx.library.model.v3_0_1.core.HashAlgorithm;
import org.spdx.library.model.v3_0_1.core.IntegrityMethod.IntegrityMethodBuilder;
import org.spdx.library.model.v3_0_1.core.IntegrityMethod;
import org.spdx.library.model.v3_0_1.core.LifecycleScopeType;
import org.spdx.library.model.v3_0_1.core.LifecycleScopedRelationship.LifecycleScopedRelationshipBuilder;
import org.spdx.library.model.v3_0_1.core.NamespaceMap.NamespaceMapBuilder;
import org.spdx.library.model.v3_0_1.core.NamespaceMap;
import org.spdx.library.model.v3_0_1.core.Organization.OrganizationBuilder;
import org.spdx.library.model.v3_0_1.core.PackageVerificationCode.PackageVerificationCodeBuilder;
import org.spdx.library.model.v3_0_1.core.Person.PersonBuilder;
import org.spdx.library.model.v3_0_1.core.PositiveIntegerRange.PositiveIntegerRangeBuilder;
import org.spdx.library.model.v3_0_1.core.PositiveIntegerRange;
import org.spdx.library.model.v3_0_1.core.PresenceType;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0_1.core.Relationship.RelationshipBuilder;
import org.spdx.library.model.v3_0_1.core.RelationshipCompleteness;
import org.spdx.library.model.v3_0_1.core.RelationshipType;
import org.spdx.library.model.v3_0_1.core.SoftwareAgent.SoftwareAgentBuilder;
import org.spdx.library.model.v3_0_1.core.SpdxDocument.SpdxDocumentBuilder;
import org.spdx.library.model.v3_0_1.core.SupportType;
import org.spdx.library.model.v3_0_1.core.Tool.ToolBuilder;
import org.spdx.library.model.v3_0_1.core.Tool;
import org.spdx.library.model.v3_0_1.dataset.ConfidentialityLevelType;
import org.spdx.library.model.v3_0_1.dataset.DatasetAvailabilityType;
import org.spdx.library.model.v3_0_1.dataset.DatasetPackage.DatasetPackageBuilder;
import org.spdx.library.model.v3_0_1.dataset.DatasetType;
import org.spdx.library.model.v3_0_1.expandedlicensing.ConjunctiveLicenseSet.ConjunctiveLicenseSetBuilder;
import org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicense.CustomLicenseBuilder;
import org.spdx.library.model.v3_0_1.expandedlicensing.CustomLicenseAddition.CustomLicenseAdditionBuilder;
import org.spdx.library.model.v3_0_1.expandedlicensing.DisjunctiveLicenseSet.DisjunctiveLicenseSetBuilder;
import org.spdx.library.model.v3_0_1.expandedlicensing.ExtendableLicense.ExtendableLicenseBuilder;
import org.spdx.library.model.v3_0_1.expandedlicensing.ExtendableLicense;
import org.spdx.library.model.v3_0_1.expandedlicensing.IndividualLicensingInfo.IndividualLicensingInfoBuilder;
import org.spdx.library.model.v3_0_1.expandedlicensing.License.LicenseBuilder;
import org.spdx.library.model.v3_0_1.expandedlicensing.License;
import org.spdx.library.model.v3_0_1.expandedlicensing.LicenseAddition.LicenseAdditionBuilder;
import org.spdx.library.model.v3_0_1.expandedlicensing.LicenseAddition;
import org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicense.ListedLicenseBuilder;
import org.spdx.library.model.v3_0_1.expandedlicensing.ListedLicenseException.ListedLicenseExceptionBuilder;
import org.spdx.library.model.v3_0_1.expandedlicensing.OrLaterOperator.OrLaterOperatorBuilder;
import org.spdx.library.model.v3_0_1.expandedlicensing.WithAdditionOperator.WithAdditionOperatorBuilder;
import org.spdx.library.model.v3_0_1.extension.CdxPropertiesExtension.CdxPropertiesExtensionBuilder;
import org.spdx.library.model.v3_0_1.extension.CdxPropertyEntry.CdxPropertyEntryBuilder;
import org.spdx.library.model.v3_0_1.extension.CdxPropertyEntry;
import org.spdx.library.model.v3_0_1.extension.Extension.ExtensionBuilder;
import org.spdx.library.model.v3_0_1.extension.Extension;
import org.spdx.library.model.v3_0_1.security.CvssSeverityType;
import org.spdx.library.model.v3_0_1.security.CvssV2VulnAssessmentRelationship.CvssV2VulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3_0_1.security.CvssV3VulnAssessmentRelationship.CvssV3VulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3_0_1.security.CvssV4VulnAssessmentRelationship.CvssV4VulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3_0_1.security.EpssVulnAssessmentRelationship.EpssVulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3_0_1.security.ExploitCatalogType;
import org.spdx.library.model.v3_0_1.security.ExploitCatalogVulnAssessmentRelationship.ExploitCatalogVulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3_0_1.security.SsvcDecisionType;
import org.spdx.library.model.v3_0_1.security.SsvcVulnAssessmentRelationship.SsvcVulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3_0_1.security.VexAffectedVulnAssessmentRelationship.VexAffectedVulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3_0_1.security.VexFixedVulnAssessmentRelationship.VexFixedVulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3_0_1.security.VexJustificationType;
import org.spdx.library.model.v3_0_1.security.VexNotAffectedVulnAssessmentRelationship.VexNotAffectedVulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3_0_1.security.VexUnderInvestigationVulnAssessmentRelationship.VexUnderInvestigationVulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3_0_1.security.VexVulnAssessmentRelationship.VexVulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3_0_1.security.VexVulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.VulnAssessmentRelationship.VulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3_0_1.security.VulnAssessmentRelationship;
import org.spdx.library.model.v3_0_1.security.Vulnerability.VulnerabilityBuilder;
import org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo.AnyLicenseInfoBuilder;
import org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo;
import org.spdx.library.model.v3_0_1.simplelicensing.LicenseExpression.LicenseExpressionBuilder;
import org.spdx.library.model.v3_0_1.simplelicensing.SimpleLicensingText.SimpleLicensingTextBuilder;
import org.spdx.library.model.v3_0_1.software.ContentIdentifier.ContentIdentifierBuilder;
import org.spdx.library.model.v3_0_1.software.ContentIdentifier;
import org.spdx.library.model.v3_0_1.software.ContentIdentifierType;
import org.spdx.library.model.v3_0_1.software.FileKindType;
import org.spdx.library.model.v3_0_1.software.Sbom.SbomBuilder;
import org.spdx.library.model.v3_0_1.software.SbomType;
import org.spdx.library.model.v3_0_1.software.Snippet.SnippetBuilder;
import org.spdx.library.model.v3_0_1.software.SoftwareArtifact.SoftwareArtifactBuilder;
import org.spdx.library.model.v3_0_1.software.SoftwareArtifact;
import org.spdx.library.model.v3_0_1.software.SoftwarePurpose;
import org.spdx.library.model.v3_0_1.software.SpdxFile.SpdxFileBuilder;
import org.spdx.library.model.v3_0_1.software.SpdxFile;
import org.spdx.library.model.v3_0_1.software.SpdxPackage.SpdxPackageBuilder;
import org.spdx.storage.IModelStore.IdType;
import org.spdx.storage.IModelStore;

/**
 * @author Gary O'Neall
 * 
 * GENERATED FROM THE TEMPLATE FILE - DO NOT MODIFY
 * 
 * The class will provide constant or generated test values for the unit tests
 *
 */
public class TestValuesGenerator {

	public static Map<String, Class<?>> MOCK_TYPE_TO_CLASS = new HashMap<>();
	
	static {
		MOCK_TYPE_TO_CLASS.put("MockVexVulnAssessmentRelationship", MockVexVulnAssessmentRelationship.class);
		MOCK_TYPE_TO_CLASS.put("MockIntegrityMethod", MockIntegrityMethod.class);
		MOCK_TYPE_TO_CLASS.put("MockVulnAssessmentRelationship", MockVulnAssessmentRelationship.class);
		MOCK_TYPE_TO_CLASS.put("MockLicense", MockLicense.class);
		MOCK_TYPE_TO_CLASS.put("MockSoftwareArtifact", MockSoftwareArtifact.class);
		MOCK_TYPE_TO_CLASS.put("MockElement", MockElement.class);
		MOCK_TYPE_TO_CLASS.put("MockExtendableLicense", MockExtendableLicense.class);
		MOCK_TYPE_TO_CLASS.put("MockElementCollection", MockElementCollection.class);
		MOCK_TYPE_TO_CLASS.put("MockAnyLicenseInfo", MockAnyLicenseInfo.class);
		MOCK_TYPE_TO_CLASS.put("MockLicenseAddition", MockLicenseAddition.class);
		MOCK_TYPE_TO_CLASS.put("MockArtifact", MockArtifact.class);
		MOCK_TYPE_TO_CLASS.put("MockExtension", MockExtension.class);
	}
	
	static class MockVexVulnAssessmentRelationship extends VexVulnAssessmentRelationship {

		/**
		 * @param builder superclass builder
		 * @throws InvalidSPDXAnalysisException on error
		 */
		protected MockVexVulnAssessmentRelationship(VexVulnAssessmentRelationshipBuilder builder)
				throws InvalidSPDXAnalysisException {
			super(builder);
		}
		
		/**
		 * @param modelStore Model store where the AIAIPackage is to be stored
		 * @param objectUri URI or anonymous ID for the AIAIPackage
		 * @param copyManager Copy manager for the AIAIPackage - can be null if copying is not required
		 * @param create true if AIAIPackage is to be created
		 * @param idPrefix - prefix to be used when generating new SPDX IDs
		 * @throws InvalidSPDXAnalysisException when unable to create the AIAIPackage
		 */
		 @SuppressWarnings("unchecked")
		public MockVexVulnAssessmentRelationship(IModelStore modelStore, String objectUri, IModelCopyManager copyManager,
				boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
		}
		
		/* (non-Javadoc)
		 * @see org.spdx.library.core.CoreModelObject#getType()
		 */
		@Override
		public String getType() {
			return "MockVexVulnAssessmentRelationship";
		}		
		
		static class MockVexVulnAssessmentRelationshipBuilder extends VexVulnAssessmentRelationshipBuilder {

			/**
			 * @param modelStore store for the built object
			 * @param objectUri uri for the built object
			 * @param copyManager optional copyManager
			 */
			public MockVexVulnAssessmentRelationshipBuilder(IModelStore modelStore,
					String objectUri, IModelCopyManager copyManager) {
				super(modelStore, objectUri, copyManager);
			}

			@Override
			public VexVulnAssessmentRelationship build() throws InvalidSPDXAnalysisException {
				return new MockVexVulnAssessmentRelationship(this);
			}
			
				/**
			 * Adds a extension to the initial collection
			 * @parameter extension extension to add
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder addExtension(Extension extension) {
				if (Objects.nonNull(extension)) {
					super.extensions.add(extension);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial extension collection
			 * @parameter extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
				/**
			 * Adds a verifiedUsing to the initial collection
			 * @parameter verifiedUsing verifiedUsing to add
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
				if (Objects.nonNull(verifiedUsing)) {
					super.verifiedUsings.add(verifiedUsing);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial verifiedUsing collection
			 * @parameter verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a to to the initial collection
			 * @parameter to to to add
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder addTo(Element to) {
				if (Objects.nonNull(to)) {
					super.tos.add(to);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial to collection
			 * @parameter toCollection collection to initialize the to
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder addAllTo(Collection<Element> toCollection) {
				if (Objects.nonNull(toCollection)) {
					super.tos.addAll(toCollection);
				}
				return this;
			}
				/**
			 * Adds a externalRef to the initial collection
			 * @parameter externalRef externalRef to add
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder addExternalRef(ExternalRef externalRef) {
				if (Objects.nonNull(externalRef)) {
					super.externalRefs.add(externalRef);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalRef collection
			 * @parameter externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					super.externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
				/**
			 * Adds a externalIdentifier to the initial collection
			 * @parameter externalIdentifier externalIdentifier to add
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
				if (Objects.nonNull(externalIdentifier)) {
					super.externalIdentifiers.add(externalIdentifier);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalIdentifier collection
			 * @parameter externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of from
			 * @parameter from value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setFrom(Element from) {
				super.from = from;
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @parameter creationInfo value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of assessedElement
			 * @parameter assessedElement value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setAssessedElement(Element assessedElement) {
				super.assessedElement = assessedElement;
				return this;
			}
			
			/**
			 * Sets the initial value of suppliedBy
			 * @parameter suppliedBy value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setSuppliedBy(Agent suppliedBy) {
				super.suppliedBy = suppliedBy;
				return this;
			}
			
			/**
			 * Sets the initial value of completeness
			 * @parameter completeness value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setCompleteness(RelationshipCompleteness completeness) {
				super.completeness = completeness;
				return this;
			}
			
			/**
			 * Sets the initial value of relationshipType
			 * @parameter relationshipType value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setRelationshipType(RelationshipType relationshipType) {
				super.relationshipType = relationshipType;
				return this;
			}
			
			/**
			 * Sets the initial value of publishedTime
			 * @parameter publishedTime value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setPublishedTime(String publishedTime) {
				super.publishedTime = publishedTime;
				return this;
			}
			
			/**
			 * Sets the initial value of vexVersion
			 * @parameter vexVersion value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setVexVersion(String vexVersion) {
				this.vexVersion = vexVersion;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @parameter summary value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setSummary(String summary) {
				super.summary = summary;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @parameter description value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of endTime
			 * @parameter endTime value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setEndTime(String endTime) {
				super.endTime = endTime;
				return this;
			}
			
			/**
			 * Sets the initial value of statusNotes
			 * @parameter statusNotes value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setStatusNotes(String statusNotes) {
				this.statusNotes = statusNotes;
				return this;
			}
			
			/**
			 * Sets the initial value of startTime
			 * @parameter startTime value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setStartTime(String startTime) {
				super.startTime = startTime;
				return this;
			}
			
			/**
			 * Sets the initial value of withdrawnTime
			 * @parameter withdrawnTime value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setWithdrawnTime(String withdrawnTime) {
				super.withdrawnTime = withdrawnTime;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @parameter comment value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @parameter name value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setName(String name) {
				super.name = name;
				return this;
			}
			
			/**
			 * Sets the initial value of modifiedTime
			 * @parameter modifiedTime value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setModifiedTime(String modifiedTime) {
				super.modifiedTime = modifiedTime;
				return this;
			}
		}
	}
	static class MockIntegrityMethod extends IntegrityMethod {

		/**
		 * @param builder superclass builder
		 * @throws InvalidSPDXAnalysisException on error
		 */
		protected MockIntegrityMethod(IntegrityMethodBuilder builder)
				throws InvalidSPDXAnalysisException {
			super(builder);
		}
		
		/**
		 * @param modelStore Model store where the AIAIPackage is to be stored
		 * @param objectUri URI or anonymous ID for the AIAIPackage
		 * @param copyManager Copy manager for the AIAIPackage - can be null if copying is not required
		 * @param create true if AIAIPackage is to be created
		 * @param idPrefix - prefix to be used when generating new SPDX IDs
		 * @throws InvalidSPDXAnalysisException when unable to create the AIAIPackage
		 */
		 @SuppressWarnings("unchecked")
		public MockIntegrityMethod(IModelStore modelStore, String objectUri, IModelCopyManager copyManager,
				boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
		}
		
		/* (non-Javadoc)
		 * @see org.spdx.library.core.CoreModelObject#getType()
		 */
		@Override
		public String getType() {
			return "MockIntegrityMethod";
		}		
		
		static class MockIntegrityMethodBuilder extends IntegrityMethodBuilder {

			/**
			 * @param modelStore store for the built object
			 * @param objectUri uri for the built object
			 * @param copyManager optional copyManager
			 */
			public MockIntegrityMethodBuilder(IModelStore modelStore,
					String objectUri, IModelCopyManager copyManager) {
				super(modelStore, objectUri, copyManager);
			}

			@Override
			public IntegrityMethod build() throws InvalidSPDXAnalysisException {
				return new MockIntegrityMethod(this);
			}
			
			
			/**
			 * Sets the initial value of comment
			 * @parameter comment value to set
			 * @return this for chaining
			**/
			public MockIntegrityMethodBuilder setComment(String comment) {
				this.comment = comment;
				return this;
			}
		}
	}
	static class MockVulnAssessmentRelationship extends VulnAssessmentRelationship {

		/**
		 * @param builder superclass builder
		 * @throws InvalidSPDXAnalysisException on error
		 */
		protected MockVulnAssessmentRelationship(VulnAssessmentRelationshipBuilder builder)
				throws InvalidSPDXAnalysisException {
			super(builder);
		}
		
		/**
		 * @param modelStore Model store where the AIAIPackage is to be stored
		 * @param objectUri URI or anonymous ID for the AIAIPackage
		 * @param copyManager Copy manager for the AIAIPackage - can be null if copying is not required
		 * @param create true if AIAIPackage is to be created
		 * @param idPrefix - prefix to be used when generating new SPDX IDs
		 * @throws InvalidSPDXAnalysisException when unable to create the AIAIPackage
		 */
		 @SuppressWarnings("unchecked")
		public MockVulnAssessmentRelationship(IModelStore modelStore, String objectUri, IModelCopyManager copyManager,
				boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
		}
		
		/* (non-Javadoc)
		 * @see org.spdx.library.core.CoreModelObject#getType()
		 */
		@Override
		public String getType() {
			return "MockVulnAssessmentRelationship";
		}		
		
		static class MockVulnAssessmentRelationshipBuilder extends VulnAssessmentRelationshipBuilder {

			/**
			 * @param modelStore store for the built object
			 * @param objectUri uri for the built object
			 * @param copyManager optional copyManager
			 */
			public MockVulnAssessmentRelationshipBuilder(IModelStore modelStore,
					String objectUri, IModelCopyManager copyManager) {
				super(modelStore, objectUri, copyManager);
			}

			@Override
			public VulnAssessmentRelationship build() throws InvalidSPDXAnalysisException {
				return new MockVulnAssessmentRelationship(this);
			}
			
				/**
			 * Adds a extension to the initial collection
			 * @parameter extension extension to add
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder addExtension(Extension extension) {
				if (Objects.nonNull(extension)) {
					super.extensions.add(extension);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial extension collection
			 * @parameter extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
				/**
			 * Adds a verifiedUsing to the initial collection
			 * @parameter verifiedUsing verifiedUsing to add
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
				if (Objects.nonNull(verifiedUsing)) {
					super.verifiedUsings.add(verifiedUsing);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial verifiedUsing collection
			 * @parameter verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a to to the initial collection
			 * @parameter to to to add
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder addTo(Element to) {
				if (Objects.nonNull(to)) {
					super.tos.add(to);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial to collection
			 * @parameter toCollection collection to initialize the to
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder addAllTo(Collection<Element> toCollection) {
				if (Objects.nonNull(toCollection)) {
					super.tos.addAll(toCollection);
				}
				return this;
			}
				/**
			 * Adds a externalRef to the initial collection
			 * @parameter externalRef externalRef to add
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder addExternalRef(ExternalRef externalRef) {
				if (Objects.nonNull(externalRef)) {
					super.externalRefs.add(externalRef);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalRef collection
			 * @parameter externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					super.externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
				/**
			 * Adds a externalIdentifier to the initial collection
			 * @parameter externalIdentifier externalIdentifier to add
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
				if (Objects.nonNull(externalIdentifier)) {
					super.externalIdentifiers.add(externalIdentifier);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalIdentifier collection
			 * @parameter externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of from
			 * @parameter from value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setFrom(Element from) {
				super.from = from;
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @parameter creationInfo value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of assessedElement
			 * @parameter assessedElement value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setAssessedElement(Element assessedElement) {
				this.assessedElement = assessedElement;
				return this;
			}
			
			/**
			 * Sets the initial value of suppliedBy
			 * @parameter suppliedBy value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setSuppliedBy(Agent suppliedBy) {
				this.suppliedBy = suppliedBy;
				return this;
			}
			
			/**
			 * Sets the initial value of completeness
			 * @parameter completeness value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setCompleteness(RelationshipCompleteness completeness) {
				super.completeness = completeness;
				return this;
			}
			
			/**
			 * Sets the initial value of relationshipType
			 * @parameter relationshipType value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setRelationshipType(RelationshipType relationshipType) {
				super.relationshipType = relationshipType;
				return this;
			}
			
			/**
			 * Sets the initial value of publishedTime
			 * @parameter publishedTime value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setPublishedTime(String publishedTime) {
				this.publishedTime = publishedTime;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @parameter summary value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setSummary(String summary) {
				super.summary = summary;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @parameter description value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of endTime
			 * @parameter endTime value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setEndTime(String endTime) {
				super.endTime = endTime;
				return this;
			}
			
			/**
			 * Sets the initial value of startTime
			 * @parameter startTime value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setStartTime(String startTime) {
				super.startTime = startTime;
				return this;
			}
			
			/**
			 * Sets the initial value of withdrawnTime
			 * @parameter withdrawnTime value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setWithdrawnTime(String withdrawnTime) {
				this.withdrawnTime = withdrawnTime;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @parameter comment value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @parameter name value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setName(String name) {
				super.name = name;
				return this;
			}
			
			/**
			 * Sets the initial value of modifiedTime
			 * @parameter modifiedTime value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
				return this;
			}
		}
	}
	static class MockLicense extends License {

		/**
		 * @param builder superclass builder
		 * @throws InvalidSPDXAnalysisException on error
		 */
		protected MockLicense(LicenseBuilder builder)
				throws InvalidSPDXAnalysisException {
			super(builder);
		}
		
		/**
		 * @param modelStore Model store where the AIAIPackage is to be stored
		 * @param objectUri URI or anonymous ID for the AIAIPackage
		 * @param copyManager Copy manager for the AIAIPackage - can be null if copying is not required
		 * @param create true if AIAIPackage is to be created
		 * @param idPrefix - prefix to be used when generating new SPDX IDs
		 * @throws InvalidSPDXAnalysisException when unable to create the AIAIPackage
		 */
		 @SuppressWarnings("unchecked")
		public MockLicense(IModelStore modelStore, String objectUri, IModelCopyManager copyManager,
				boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
		}
		
		/* (non-Javadoc)
		 * @see org.spdx.library.core.CoreModelObject#getType()
		 */
		@Override
		public String getType() {
			return "MockLicense";
		}		
		
		static class MockLicenseBuilder extends LicenseBuilder {

			/**
			 * @param modelStore store for the built object
			 * @param objectUri uri for the built object
			 * @param copyManager optional copyManager
			 */
			public MockLicenseBuilder(IModelStore modelStore,
					String objectUri, IModelCopyManager copyManager) {
				super(modelStore, objectUri, copyManager);
			}

			@Override
			public License build() throws InvalidSPDXAnalysisException {
				return new MockLicense(this);
			}
			
				/**
			 * Adds a extension to the initial collection
			 * @parameter extension extension to add
			 * @return this for chaining
			**/
			public MockLicenseBuilder addExtension(Extension extension) {
				if (Objects.nonNull(extension)) {
					super.extensions.add(extension);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial extension collection
			 * @parameter extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockLicenseBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
				/**
			 * Adds a verifiedUsing to the initial collection
			 * @parameter verifiedUsing verifiedUsing to add
			 * @return this for chaining
			**/
			public MockLicenseBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
				if (Objects.nonNull(verifiedUsing)) {
					super.verifiedUsings.add(verifiedUsing);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial verifiedUsing collection
			 * @parameter verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockLicenseBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a externalRef to the initial collection
			 * @parameter externalRef externalRef to add
			 * @return this for chaining
			**/
			public MockLicenseBuilder addExternalRef(ExternalRef externalRef) {
				if (Objects.nonNull(externalRef)) {
					super.externalRefs.add(externalRef);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalRef collection
			 * @parameter externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockLicenseBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					super.externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
				/**
			 * Adds a externalIdentifier to the initial collection
			 * @parameter externalIdentifier externalIdentifier to add
			 * @return this for chaining
			**/
			public MockLicenseBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
				if (Objects.nonNull(externalIdentifier)) {
					super.externalIdentifiers.add(externalIdentifier);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalIdentifier collection
			 * @parameter externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockLicenseBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
			
			/**
			 * Adds a seeAlso to the initial collection
			 * @parameter seeAlso seeAlso to add
			 * @return this for chaining
			**/
			public MockLicenseBuilder addSeeAlso(String seeAlso) {
				if (Objects.nonNull(seeAlso)) {
					seeAlsos.add(seeAlso);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial seeAlso collection
			 * @parameter seeAlsoCollection collection to initialize the seeAlso
			 * @return this for chaining
			**/
			public MockLicenseBuilder addAllSeeAlso(Collection<String> seeAlsoCollection) {
				if (Objects.nonNull(seeAlsoCollection)) {
					seeAlsos.addAll(seeAlsoCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @parameter creationInfo value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of isFsfLibre
			 * @parameter isFsfLibre value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setIsFsfLibre(Boolean isFsfLibre) {
				this.isFsfLibre = isFsfLibre;
				return this;
			}
			
			/**
			 * Sets the initial value of isDeprecatedLicenseId
			 * @parameter isDeprecatedLicenseId value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setIsDeprecatedLicenseId(Boolean isDeprecatedLicenseId) {
				this.isDeprecatedLicenseId = isDeprecatedLicenseId;
				return this;
			}
			
			/**
			 * Sets the initial value of isOsiApproved
			 * @parameter isOsiApproved value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setIsOsiApproved(Boolean isOsiApproved) {
				this.isOsiApproved = isOsiApproved;
				return this;
			}
			
			/**
			 * Sets the initial value of licenseText
			 * @parameter licenseText value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setLicenseText(String licenseText) {
				this.licenseText = licenseText;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @parameter summary value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setSummary(String summary) {
				super.summary = summary;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @parameter description value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of standardLicenseTemplate
			 * @parameter standardLicenseTemplate value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setStandardLicenseTemplate(String standardLicenseTemplate) {
				this.standardLicenseTemplate = standardLicenseTemplate;
				return this;
			}
			
			/**
			 * Sets the initial value of obsoletedBy
			 * @parameter obsoletedBy value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setObsoletedBy(String obsoletedBy) {
				this.obsoletedBy = obsoletedBy;
				return this;
			}
			
			/**
			 * Sets the initial value of licenseXml
			 * @parameter licenseXml value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setLicenseXml(String licenseXml) {
				this.licenseXml = licenseXml;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @parameter comment value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @parameter name value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setName(String name) {
				super.name = name;
				return this;
			}
			
			/**
			 * Sets the initial value of standardLicenseHeader
			 * @parameter standardLicenseHeader value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setStandardLicenseHeader(String standardLicenseHeader) {
				this.standardLicenseHeader = standardLicenseHeader;
				return this;
			}
		}
	}
	static class MockSoftwareArtifact extends SoftwareArtifact {

		/**
		 * @param builder superclass builder
		 * @throws InvalidSPDXAnalysisException on error
		 */
		protected MockSoftwareArtifact(SoftwareArtifactBuilder builder)
				throws InvalidSPDXAnalysisException {
			super(builder);
		}
		
		/**
		 * @param modelStore Model store where the AIAIPackage is to be stored
		 * @param objectUri URI or anonymous ID for the AIAIPackage
		 * @param copyManager Copy manager for the AIAIPackage - can be null if copying is not required
		 * @param create true if AIAIPackage is to be created
		 * @param idPrefix - prefix to be used when generating new SPDX IDs
		 * @throws InvalidSPDXAnalysisException when unable to create the AIAIPackage
		 */
		 @SuppressWarnings("unchecked")
		public MockSoftwareArtifact(IModelStore modelStore, String objectUri, IModelCopyManager copyManager,
				boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
		}
		
		/* (non-Javadoc)
		 * @see org.spdx.library.core.CoreModelObject#getType()
		 */
		@Override
		public String getType() {
			return "MockSoftwareArtifact";
		}		
		
		static class MockSoftwareArtifactBuilder extends SoftwareArtifactBuilder {

			/**
			 * @param modelStore store for the built object
			 * @param objectUri uri for the built object
			 * @param copyManager optional copyManager
			 */
			public MockSoftwareArtifactBuilder(IModelStore modelStore,
					String objectUri, IModelCopyManager copyManager) {
				super(modelStore, objectUri, copyManager);
			}

			@Override
			public SoftwareArtifact build() throws InvalidSPDXAnalysisException {
				return new MockSoftwareArtifact(this);
			}
			
				/**
			 * Adds a contentIdentifier to the initial collection
			 * @parameter contentIdentifier contentIdentifier to add
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addContentIdentifier(ContentIdentifier contentIdentifier) {
				if (Objects.nonNull(contentIdentifier)) {
					contentIdentifiers.add(contentIdentifier);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial contentIdentifier collection
			 * @parameter contentIdentifierCollection collection to initialize the contentIdentifier
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllContentIdentifier(Collection<ContentIdentifier> contentIdentifierCollection) {
				if (Objects.nonNull(contentIdentifierCollection)) {
					contentIdentifiers.addAll(contentIdentifierCollection);
				}
				return this;
			}
				/**
			 * Adds a extension to the initial collection
			 * @parameter extension extension to add
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addExtension(Extension extension) {
				if (Objects.nonNull(extension)) {
					super.extensions.add(extension);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial extension collection
			 * @parameter extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
				/**
			 * Adds a verifiedUsing to the initial collection
			 * @parameter verifiedUsing verifiedUsing to add
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
				if (Objects.nonNull(verifiedUsing)) {
					super.verifiedUsings.add(verifiedUsing);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial verifiedUsing collection
			 * @parameter verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a originatedBy to the initial collection
			 * @parameter originatedBy originatedBy to add
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addOriginatedBy(Agent originatedBy) {
				if (Objects.nonNull(originatedBy)) {
					super.originatedBys.add(originatedBy);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial originatedBy collection
			 * @parameter originatedByCollection collection to initialize the originatedBy
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllOriginatedBy(Collection<Agent> originatedByCollection) {
				if (Objects.nonNull(originatedByCollection)) {
					super.originatedBys.addAll(originatedByCollection);
				}
				return this;
			}
				/**
			 * Adds a externalRef to the initial collection
			 * @parameter externalRef externalRef to add
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addExternalRef(ExternalRef externalRef) {
				if (Objects.nonNull(externalRef)) {
					super.externalRefs.add(externalRef);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalRef collection
			 * @parameter externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					super.externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
				/**
			 * Adds a externalIdentifier to the initial collection
			 * @parameter externalIdentifier externalIdentifier to add
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
				if (Objects.nonNull(externalIdentifier)) {
					super.externalIdentifiers.add(externalIdentifier);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalIdentifier collection
			 * @parameter externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
			
			/**
			 * Adds a supportLevel to the initial collection
			 * @parameter supportLevel supportLevel to add
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addSupportLevel(SupportType supportLevel) {
				if (Objects.nonNull(supportLevel)) {
					super.supportLevels.add(supportLevel);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial supportLevel collection
			 * @parameter supportLevelCollection collection to initialize the supportLevel
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllSupportLevel(Collection<SupportType> supportLevelCollection) {
				if (Objects.nonNull(supportLevelCollection)) {
					super.supportLevels.addAll(supportLevelCollection);
				}
				return this;
			}
			
			/**
			 * Adds a additionalPurpose to the initial collection
			 * @parameter additionalPurpose additionalPurpose to add
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAdditionalPurpose(SoftwarePurpose additionalPurpose) {
				if (Objects.nonNull(additionalPurpose)) {
					additionalPurposes.add(additionalPurpose);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial additionalPurpose collection
			 * @parameter additionalPurposeCollection collection to initialize the additionalPurpose
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllAdditionalPurpose(Collection<SoftwarePurpose> additionalPurposeCollection) {
				if (Objects.nonNull(additionalPurposeCollection)) {
					additionalPurposes.addAll(additionalPurposeCollection);
				}
				return this;
			}
			
			/**
			 * Adds a attributionText to the initial collection
			 * @parameter attributionText attributionText to add
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAttributionText(String attributionText) {
				if (Objects.nonNull(attributionText)) {
					attributionTexts.add(attributionText);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial attributionText collection
			 * @parameter attributionTextCollection collection to initialize the attributionText
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllAttributionText(Collection<String> attributionTextCollection) {
				if (Objects.nonNull(attributionTextCollection)) {
					attributionTexts.addAll(attributionTextCollection);
				}
				return this;
			}
			
			/**
			 * Adds a standardName to the initial collection
			 * @parameter standardName standardName to add
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addStandardName(String standardName) {
				if (Objects.nonNull(standardName)) {
					super.standardNames.add(standardName);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial standardName collection
			 * @parameter standardNameCollection collection to initialize the standardName
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllStandardName(Collection<String> standardNameCollection) {
				if (Objects.nonNull(standardNameCollection)) {
					super.standardNames.addAll(standardNameCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @parameter creationInfo value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of suppliedBy
			 * @parameter suppliedBy value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setSuppliedBy(Agent suppliedBy) {
				super.suppliedBy = suppliedBy;
				return this;
			}
			
			/**
			 * Sets the initial value of primaryPurpose
			 * @parameter primaryPurpose value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setPrimaryPurpose(SoftwarePurpose primaryPurpose) {
				this.primaryPurpose = primaryPurpose;
				return this;
			}
			
			/**
			 * Sets the initial value of validUntilTime
			 * @parameter validUntilTime value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setValidUntilTime(String validUntilTime) {
				super.validUntilTime = validUntilTime;
				return this;
			}
			
			/**
			 * Sets the initial value of builtTime
			 * @parameter builtTime value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setBuiltTime(String builtTime) {
				super.builtTime = builtTime;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @parameter summary value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setSummary(String summary) {
				super.summary = summary;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @parameter description value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of releaseTime
			 * @parameter releaseTime value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setReleaseTime(String releaseTime) {
				super.releaseTime = releaseTime;
				return this;
			}
			
			/**
			 * Sets the initial value of copyrightText
			 * @parameter copyrightText value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setCopyrightText(String copyrightText) {
				this.copyrightText = copyrightText;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @parameter comment value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @parameter name value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setName(String name) {
				super.name = name;
				return this;
			}
		}
	}
	static class MockElement extends Element {

		/**
		 * @param builder superclass builder
		 * @throws InvalidSPDXAnalysisException on error
		 */
		protected MockElement(ElementBuilder builder)
				throws InvalidSPDXAnalysisException {
			super(builder);
		}
		
		/**
		 * @param modelStore Model store where the AIAIPackage is to be stored
		 * @param objectUri URI or anonymous ID for the AIAIPackage
		 * @param copyManager Copy manager for the AIAIPackage - can be null if copying is not required
		 * @param create true if AIAIPackage is to be created
		 * @param idPrefix - prefix to be used when generating new SPDX IDs
		 * @throws InvalidSPDXAnalysisException when unable to create the AIAIPackage
		 */
		 @SuppressWarnings("unchecked")
		public MockElement(IModelStore modelStore, String objectUri, IModelCopyManager copyManager,
				boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
		}
		
		/* (non-Javadoc)
		 * @see org.spdx.library.core.CoreModelObject#getType()
		 */
		@Override
		public String getType() {
			return "MockElement";
		}		
		
		static class MockElementBuilder extends ElementBuilder {

			/**
			 * @param modelStore store for the built object
			 * @param objectUri uri for the built object
			 * @param copyManager optional copyManager
			 */
			public MockElementBuilder(IModelStore modelStore,
					String objectUri, IModelCopyManager copyManager) {
				super(modelStore, objectUri, copyManager);
			}

			@Override
			public Element build() throws InvalidSPDXAnalysisException {
				return new MockElement(this);
			}
			
				/**
			 * Adds a externalRef to the initial collection
			 * @parameter externalRef externalRef to add
			 * @return this for chaining
			**/
			public MockElementBuilder addExternalRef(ExternalRef externalRef) {
				if (Objects.nonNull(externalRef)) {
					externalRefs.add(externalRef);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalRef collection
			 * @parameter externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockElementBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
				/**
			 * Adds a extension to the initial collection
			 * @parameter extension extension to add
			 * @return this for chaining
			**/
			public MockElementBuilder addExtension(Extension extension) {
				if (Objects.nonNull(extension)) {
					extensions.add(extension);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial extension collection
			 * @parameter extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockElementBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					extensions.addAll(extensionCollection);
				}
				return this;
			}
				/**
			 * Adds a verifiedUsing to the initial collection
			 * @parameter verifiedUsing verifiedUsing to add
			 * @return this for chaining
			**/
			public MockElementBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
				if (Objects.nonNull(verifiedUsing)) {
					verifiedUsings.add(verifiedUsing);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial verifiedUsing collection
			 * @parameter verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockElementBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a externalIdentifier to the initial collection
			 * @parameter externalIdentifier externalIdentifier to add
			 * @return this for chaining
			**/
			public MockElementBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
				if (Objects.nonNull(externalIdentifier)) {
					externalIdentifiers.add(externalIdentifier);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalIdentifier collection
			 * @parameter externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockElementBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @parameter creationInfo value to set
			 * @return this for chaining
			**/
			public MockElementBuilder setCreationInfo(CreationInfo creationInfo) {
				this.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @parameter summary value to set
			 * @return this for chaining
			**/
			public MockElementBuilder setSummary(String summary) {
				this.summary = summary;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @parameter description value to set
			 * @return this for chaining
			**/
			public MockElementBuilder setDescription(String description) {
				this.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @parameter comment value to set
			 * @return this for chaining
			**/
			public MockElementBuilder setComment(String comment) {
				this.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @parameter name value to set
			 * @return this for chaining
			**/
			public MockElementBuilder setName(String name) {
				this.name = name;
				return this;
			}
		}
	}
	static class MockExtendableLicense extends ExtendableLicense {

		/**
		 * @param builder superclass builder
		 * @throws InvalidSPDXAnalysisException on error
		 */
		protected MockExtendableLicense(ExtendableLicenseBuilder builder)
				throws InvalidSPDXAnalysisException {
			super(builder);
		}
		
		/**
		 * @param modelStore Model store where the AIAIPackage is to be stored
		 * @param objectUri URI or anonymous ID for the AIAIPackage
		 * @param copyManager Copy manager for the AIAIPackage - can be null if copying is not required
		 * @param create true if AIAIPackage is to be created
		 * @param idPrefix - prefix to be used when generating new SPDX IDs
		 * @throws InvalidSPDXAnalysisException when unable to create the AIAIPackage
		 */
		 @SuppressWarnings("unchecked")
		public MockExtendableLicense(IModelStore modelStore, String objectUri, IModelCopyManager copyManager,
				boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
		}
		
		/* (non-Javadoc)
		 * @see org.spdx.library.core.CoreModelObject#getType()
		 */
		@Override
		public String getType() {
			return "MockExtendableLicense";
		}		
		
		static class MockExtendableLicenseBuilder extends ExtendableLicenseBuilder {

			/**
			 * @param modelStore store for the built object
			 * @param objectUri uri for the built object
			 * @param copyManager optional copyManager
			 */
			public MockExtendableLicenseBuilder(IModelStore modelStore,
					String objectUri, IModelCopyManager copyManager) {
				super(modelStore, objectUri, copyManager);
			}

			@Override
			public ExtendableLicense build() throws InvalidSPDXAnalysisException {
				return new MockExtendableLicense(this);
			}
			
				/**
			 * Adds a externalRef to the initial collection
			 * @parameter externalRef externalRef to add
			 * @return this for chaining
			**/
			public MockExtendableLicenseBuilder addExternalRef(ExternalRef externalRef) {
				if (Objects.nonNull(externalRef)) {
					super.externalRefs.add(externalRef);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalRef collection
			 * @parameter externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockExtendableLicenseBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					super.externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
				/**
			 * Adds a extension to the initial collection
			 * @parameter extension extension to add
			 * @return this for chaining
			**/
			public MockExtendableLicenseBuilder addExtension(Extension extension) {
				if (Objects.nonNull(extension)) {
					super.extensions.add(extension);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial extension collection
			 * @parameter extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockExtendableLicenseBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
				/**
			 * Adds a verifiedUsing to the initial collection
			 * @parameter verifiedUsing verifiedUsing to add
			 * @return this for chaining
			**/
			public MockExtendableLicenseBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
				if (Objects.nonNull(verifiedUsing)) {
					super.verifiedUsings.add(verifiedUsing);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial verifiedUsing collection
			 * @parameter verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockExtendableLicenseBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a externalIdentifier to the initial collection
			 * @parameter externalIdentifier externalIdentifier to add
			 * @return this for chaining
			**/
			public MockExtendableLicenseBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
				if (Objects.nonNull(externalIdentifier)) {
					super.externalIdentifiers.add(externalIdentifier);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalIdentifier collection
			 * @parameter externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockExtendableLicenseBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @parameter creationInfo value to set
			 * @return this for chaining
			**/
			public MockExtendableLicenseBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @parameter summary value to set
			 * @return this for chaining
			**/
			public MockExtendableLicenseBuilder setSummary(String summary) {
				super.summary = summary;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @parameter description value to set
			 * @return this for chaining
			**/
			public MockExtendableLicenseBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @parameter comment value to set
			 * @return this for chaining
			**/
			public MockExtendableLicenseBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @parameter name value to set
			 * @return this for chaining
			**/
			public MockExtendableLicenseBuilder setName(String name) {
				super.name = name;
				return this;
			}
		}
	}
	static class MockElementCollection extends ElementCollection {

		/**
		 * @param builder superclass builder
		 * @throws InvalidSPDXAnalysisException on error
		 */
		protected MockElementCollection(ElementCollectionBuilder builder)
				throws InvalidSPDXAnalysisException {
			super(builder);
		}
		
		/**
		 * @param modelStore Model store where the AIAIPackage is to be stored
		 * @param objectUri URI or anonymous ID for the AIAIPackage
		 * @param copyManager Copy manager for the AIAIPackage - can be null if copying is not required
		 * @param create true if AIAIPackage is to be created
		 * @param idPrefix - prefix to be used when generating new SPDX IDs
		 * @throws InvalidSPDXAnalysisException when unable to create the AIAIPackage
		 */
		 @SuppressWarnings("unchecked")
		public MockElementCollection(IModelStore modelStore, String objectUri, IModelCopyManager copyManager,
				boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
		}
		
		/* (non-Javadoc)
		 * @see org.spdx.library.core.CoreModelObject#getType()
		 */
		@Override
		public String getType() {
			return "MockElementCollection";
		}		
		
		static class MockElementCollectionBuilder extends ElementCollectionBuilder {

			/**
			 * @param modelStore store for the built object
			 * @param objectUri uri for the built object
			 * @param copyManager optional copyManager
			 */
			public MockElementCollectionBuilder(IModelStore modelStore,
					String objectUri, IModelCopyManager copyManager) {
				super(modelStore, objectUri, copyManager);
			}

			@Override
			public ElementCollection build() throws InvalidSPDXAnalysisException {
				return new MockElementCollection(this);
			}
			
				/**
			 * Adds a element to the initial collection
			 * @parameter element element to add
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addElement(Element element) {
				if (Objects.nonNull(element)) {
					elements.add(element);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial element collection
			 * @parameter elementCollection collection to initialize the element
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addAllElement(Collection<Element> elementCollection) {
				if (Objects.nonNull(elementCollection)) {
					elements.addAll(elementCollection);
				}
				return this;
			}
				/**
			 * Adds a externalRef to the initial collection
			 * @parameter externalRef externalRef to add
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addExternalRef(ExternalRef externalRef) {
				if (Objects.nonNull(externalRef)) {
					super.externalRefs.add(externalRef);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalRef collection
			 * @parameter externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					super.externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
				/**
			 * Adds a extension to the initial collection
			 * @parameter extension extension to add
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addExtension(Extension extension) {
				if (Objects.nonNull(extension)) {
					super.extensions.add(extension);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial extension collection
			 * @parameter extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
				/**
			 * Adds a verifiedUsing to the initial collection
			 * @parameter verifiedUsing verifiedUsing to add
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
				if (Objects.nonNull(verifiedUsing)) {
					super.verifiedUsings.add(verifiedUsing);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial verifiedUsing collection
			 * @parameter verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a rootElement to the initial collection
			 * @parameter rootElement rootElement to add
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addRootElement(Element rootElement) {
				if (Objects.nonNull(rootElement)) {
					rootElements.add(rootElement);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial rootElement collection
			 * @parameter rootElementCollection collection to initialize the rootElement
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addAllRootElement(Collection<Element> rootElementCollection) {
				if (Objects.nonNull(rootElementCollection)) {
					rootElements.addAll(rootElementCollection);
				}
				return this;
			}
				/**
			 * Adds a externalIdentifier to the initial collection
			 * @parameter externalIdentifier externalIdentifier to add
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
				if (Objects.nonNull(externalIdentifier)) {
					super.externalIdentifiers.add(externalIdentifier);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalIdentifier collection
			 * @parameter externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
			
			/**
			 * Adds a profileConformance to the initial collection
			 * @parameter profileConformance profileConformance to add
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addProfileConformance(ProfileIdentifierType profileConformance) {
				if (Objects.nonNull(profileConformance)) {
					profileConformances.add(profileConformance);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial profileConformance collection
			 * @parameter profileConformanceCollection collection to initialize the profileConformance
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addAllProfileConformance(Collection<ProfileIdentifierType> profileConformanceCollection) {
				if (Objects.nonNull(profileConformanceCollection)) {
					profileConformances.addAll(profileConformanceCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @parameter creationInfo value to set
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @parameter summary value to set
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder setSummary(String summary) {
				super.summary = summary;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @parameter description value to set
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @parameter comment value to set
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @parameter name value to set
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder setName(String name) {
				super.name = name;
				return this;
			}
		}
	}
	static class MockAnyLicenseInfo extends AnyLicenseInfo {

		/**
		 * @param builder superclass builder
		 * @throws InvalidSPDXAnalysisException on error
		 */
		protected MockAnyLicenseInfo(AnyLicenseInfoBuilder builder)
				throws InvalidSPDXAnalysisException {
			super(builder);
		}
		
		/**
		 * @param modelStore Model store where the AIAIPackage is to be stored
		 * @param objectUri URI or anonymous ID for the AIAIPackage
		 * @param copyManager Copy manager for the AIAIPackage - can be null if copying is not required
		 * @param create true if AIAIPackage is to be created
		 * @param idPrefix - prefix to be used when generating new SPDX IDs
		 * @throws InvalidSPDXAnalysisException when unable to create the AIAIPackage
		 */
		 @SuppressWarnings("unchecked")
		public MockAnyLicenseInfo(IModelStore modelStore, String objectUri, IModelCopyManager copyManager,
				boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
		}
		
		/* (non-Javadoc)
		 * @see org.spdx.library.core.CoreModelObject#getType()
		 */
		@Override
		public String getType() {
			return "MockAnyLicenseInfo";
		}		
		
		static class MockAnyLicenseInfoBuilder extends AnyLicenseInfoBuilder {

			/**
			 * @param modelStore store for the built object
			 * @param objectUri uri for the built object
			 * @param copyManager optional copyManager
			 */
			public MockAnyLicenseInfoBuilder(IModelStore modelStore,
					String objectUri, IModelCopyManager copyManager) {
				super(modelStore, objectUri, copyManager);
			}

			@Override
			public AnyLicenseInfo build() throws InvalidSPDXAnalysisException {
				return new MockAnyLicenseInfo(this);
			}
			
				/**
			 * Adds a externalRef to the initial collection
			 * @parameter externalRef externalRef to add
			 * @return this for chaining
			**/
			public MockAnyLicenseInfoBuilder addExternalRef(ExternalRef externalRef) {
				if (Objects.nonNull(externalRef)) {
					super.externalRefs.add(externalRef);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalRef collection
			 * @parameter externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockAnyLicenseInfoBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					super.externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
				/**
			 * Adds a extension to the initial collection
			 * @parameter extension extension to add
			 * @return this for chaining
			**/
			public MockAnyLicenseInfoBuilder addExtension(Extension extension) {
				if (Objects.nonNull(extension)) {
					super.extensions.add(extension);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial extension collection
			 * @parameter extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockAnyLicenseInfoBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
				/**
			 * Adds a verifiedUsing to the initial collection
			 * @parameter verifiedUsing verifiedUsing to add
			 * @return this for chaining
			**/
			public MockAnyLicenseInfoBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
				if (Objects.nonNull(verifiedUsing)) {
					super.verifiedUsings.add(verifiedUsing);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial verifiedUsing collection
			 * @parameter verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockAnyLicenseInfoBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a externalIdentifier to the initial collection
			 * @parameter externalIdentifier externalIdentifier to add
			 * @return this for chaining
			**/
			public MockAnyLicenseInfoBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
				if (Objects.nonNull(externalIdentifier)) {
					super.externalIdentifiers.add(externalIdentifier);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalIdentifier collection
			 * @parameter externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockAnyLicenseInfoBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @parameter creationInfo value to set
			 * @return this for chaining
			**/
			public MockAnyLicenseInfoBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @parameter summary value to set
			 * @return this for chaining
			**/
			public MockAnyLicenseInfoBuilder setSummary(String summary) {
				super.summary = summary;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @parameter description value to set
			 * @return this for chaining
			**/
			public MockAnyLicenseInfoBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @parameter comment value to set
			 * @return this for chaining
			**/
			public MockAnyLicenseInfoBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @parameter name value to set
			 * @return this for chaining
			**/
			public MockAnyLicenseInfoBuilder setName(String name) {
				super.name = name;
				return this;
			}
		}
	}
	static class MockLicenseAddition extends LicenseAddition {

		/**
		 * @param builder superclass builder
		 * @throws InvalidSPDXAnalysisException on error
		 */
		protected MockLicenseAddition(LicenseAdditionBuilder builder)
				throws InvalidSPDXAnalysisException {
			super(builder);
		}
		
		/**
		 * @param modelStore Model store where the AIAIPackage is to be stored
		 * @param objectUri URI or anonymous ID for the AIAIPackage
		 * @param copyManager Copy manager for the AIAIPackage - can be null if copying is not required
		 * @param create true if AIAIPackage is to be created
		 * @param idPrefix - prefix to be used when generating new SPDX IDs
		 * @throws InvalidSPDXAnalysisException when unable to create the AIAIPackage
		 */
		 @SuppressWarnings("unchecked")
		public MockLicenseAddition(IModelStore modelStore, String objectUri, IModelCopyManager copyManager,
				boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
		}
		
		/* (non-Javadoc)
		 * @see org.spdx.library.core.CoreModelObject#getType()
		 */
		@Override
		public String getType() {
			return "MockLicenseAddition";
		}		
		
		static class MockLicenseAdditionBuilder extends LicenseAdditionBuilder {

			/**
			 * @param modelStore store for the built object
			 * @param objectUri uri for the built object
			 * @param copyManager optional copyManager
			 */
			public MockLicenseAdditionBuilder(IModelStore modelStore,
					String objectUri, IModelCopyManager copyManager) {
				super(modelStore, objectUri, copyManager);
			}

			@Override
			public LicenseAddition build() throws InvalidSPDXAnalysisException {
				return new MockLicenseAddition(this);
			}
			
				/**
			 * Adds a extension to the initial collection
			 * @parameter extension extension to add
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder addExtension(Extension extension) {
				if (Objects.nonNull(extension)) {
					super.extensions.add(extension);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial extension collection
			 * @parameter extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
				/**
			 * Adds a verifiedUsing to the initial collection
			 * @parameter verifiedUsing verifiedUsing to add
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
				if (Objects.nonNull(verifiedUsing)) {
					super.verifiedUsings.add(verifiedUsing);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial verifiedUsing collection
			 * @parameter verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a externalRef to the initial collection
			 * @parameter externalRef externalRef to add
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder addExternalRef(ExternalRef externalRef) {
				if (Objects.nonNull(externalRef)) {
					super.externalRefs.add(externalRef);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalRef collection
			 * @parameter externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					super.externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
				/**
			 * Adds a externalIdentifier to the initial collection
			 * @parameter externalIdentifier externalIdentifier to add
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
				if (Objects.nonNull(externalIdentifier)) {
					super.externalIdentifiers.add(externalIdentifier);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalIdentifier collection
			 * @parameter externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
			
			/**
			 * Adds a seeAlso to the initial collection
			 * @parameter seeAlso seeAlso to add
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder addSeeAlso(String seeAlso) {
				if (Objects.nonNull(seeAlso)) {
					seeAlsos.add(seeAlso);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial seeAlso collection
			 * @parameter seeAlsoCollection collection to initialize the seeAlso
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder addAllSeeAlso(Collection<String> seeAlsoCollection) {
				if (Objects.nonNull(seeAlsoCollection)) {
					seeAlsos.addAll(seeAlsoCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @parameter creationInfo value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of isDeprecatedAdditionId
			 * @parameter isDeprecatedAdditionId value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setIsDeprecatedAdditionId(Boolean isDeprecatedAdditionId) {
				this.isDeprecatedAdditionId = isDeprecatedAdditionId;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @parameter summary value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setSummary(String summary) {
				super.summary = summary;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @parameter description value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of obsoletedBy
			 * @parameter obsoletedBy value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setObsoletedBy(String obsoletedBy) {
				this.obsoletedBy = obsoletedBy;
				return this;
			}
			
			/**
			 * Sets the initial value of additionText
			 * @parameter additionText value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setAdditionText(String additionText) {
				this.additionText = additionText;
				return this;
			}
			
			/**
			 * Sets the initial value of licenseXml
			 * @parameter licenseXml value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setLicenseXml(String licenseXml) {
				this.licenseXml = licenseXml;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @parameter comment value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @parameter name value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setName(String name) {
				super.name = name;
				return this;
			}
			
			/**
			 * Sets the initial value of standardAdditionTemplate
			 * @parameter standardAdditionTemplate value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setStandardAdditionTemplate(String standardAdditionTemplate) {
				this.standardAdditionTemplate = standardAdditionTemplate;
				return this;
			}
		}
	}
	static class MockArtifact extends Artifact {

		/**
		 * @param builder superclass builder
		 * @throws InvalidSPDXAnalysisException on error
		 */
		protected MockArtifact(ArtifactBuilder builder)
				throws InvalidSPDXAnalysisException {
			super(builder);
		}
		
		/**
		 * @param modelStore Model store where the AIAIPackage is to be stored
		 * @param objectUri URI or anonymous ID for the AIAIPackage
		 * @param copyManager Copy manager for the AIAIPackage - can be null if copying is not required
		 * @param create true if AIAIPackage is to be created
		 * @param idPrefix - prefix to be used when generating new SPDX IDs
		 * @throws InvalidSPDXAnalysisException when unable to create the AIAIPackage
		 */
		 @SuppressWarnings("unchecked")
		public MockArtifact(IModelStore modelStore, String objectUri, IModelCopyManager copyManager,
				boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
		}
		
		/* (non-Javadoc)
		 * @see org.spdx.library.core.CoreModelObject#getType()
		 */
		@Override
		public String getType() {
			return "MockArtifact";
		}		
		
		static class MockArtifactBuilder extends ArtifactBuilder {

			/**
			 * @param modelStore store for the built object
			 * @param objectUri uri for the built object
			 * @param copyManager optional copyManager
			 */
			public MockArtifactBuilder(IModelStore modelStore,
					String objectUri, IModelCopyManager copyManager) {
				super(modelStore, objectUri, copyManager);
			}

			@Override
			public Artifact build() throws InvalidSPDXAnalysisException {
				return new MockArtifact(this);
			}
			
				/**
			 * Adds a extension to the initial collection
			 * @parameter extension extension to add
			 * @return this for chaining
			**/
			public MockArtifactBuilder addExtension(Extension extension) {
				if (Objects.nonNull(extension)) {
					super.extensions.add(extension);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial extension collection
			 * @parameter extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockArtifactBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
				/**
			 * Adds a verifiedUsing to the initial collection
			 * @parameter verifiedUsing verifiedUsing to add
			 * @return this for chaining
			**/
			public MockArtifactBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
				if (Objects.nonNull(verifiedUsing)) {
					super.verifiedUsings.add(verifiedUsing);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial verifiedUsing collection
			 * @parameter verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockArtifactBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a originatedBy to the initial collection
			 * @parameter originatedBy originatedBy to add
			 * @return this for chaining
			**/
			public MockArtifactBuilder addOriginatedBy(Agent originatedBy) {
				if (Objects.nonNull(originatedBy)) {
					originatedBys.add(originatedBy);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial originatedBy collection
			 * @parameter originatedByCollection collection to initialize the originatedBy
			 * @return this for chaining
			**/
			public MockArtifactBuilder addAllOriginatedBy(Collection<Agent> originatedByCollection) {
				if (Objects.nonNull(originatedByCollection)) {
					originatedBys.addAll(originatedByCollection);
				}
				return this;
			}
				/**
			 * Adds a externalRef to the initial collection
			 * @parameter externalRef externalRef to add
			 * @return this for chaining
			**/
			public MockArtifactBuilder addExternalRef(ExternalRef externalRef) {
				if (Objects.nonNull(externalRef)) {
					super.externalRefs.add(externalRef);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalRef collection
			 * @parameter externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockArtifactBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					super.externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
				/**
			 * Adds a externalIdentifier to the initial collection
			 * @parameter externalIdentifier externalIdentifier to add
			 * @return this for chaining
			**/
			public MockArtifactBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
				if (Objects.nonNull(externalIdentifier)) {
					super.externalIdentifiers.add(externalIdentifier);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalIdentifier collection
			 * @parameter externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockArtifactBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
			
			/**
			 * Adds a supportLevel to the initial collection
			 * @parameter supportLevel supportLevel to add
			 * @return this for chaining
			**/
			public MockArtifactBuilder addSupportLevel(SupportType supportLevel) {
				if (Objects.nonNull(supportLevel)) {
					supportLevels.add(supportLevel);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial supportLevel collection
			 * @parameter supportLevelCollection collection to initialize the supportLevel
			 * @return this for chaining
			**/
			public MockArtifactBuilder addAllSupportLevel(Collection<SupportType> supportLevelCollection) {
				if (Objects.nonNull(supportLevelCollection)) {
					supportLevels.addAll(supportLevelCollection);
				}
				return this;
			}
			
			/**
			 * Adds a standardName to the initial collection
			 * @parameter standardName standardName to add
			 * @return this for chaining
			**/
			public MockArtifactBuilder addStandardName(String standardName) {
				if (Objects.nonNull(standardName)) {
					standardNames.add(standardName);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial standardName collection
			 * @parameter standardNameCollection collection to initialize the standardName
			 * @return this for chaining
			**/
			public MockArtifactBuilder addAllStandardName(Collection<String> standardNameCollection) {
				if (Objects.nonNull(standardNameCollection)) {
					standardNames.addAll(standardNameCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @parameter creationInfo value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of suppliedBy
			 * @parameter suppliedBy value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setSuppliedBy(Agent suppliedBy) {
				this.suppliedBy = suppliedBy;
				return this;
			}
			
			/**
			 * Sets the initial value of validUntilTime
			 * @parameter validUntilTime value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setValidUntilTime(String validUntilTime) {
				this.validUntilTime = validUntilTime;
				return this;
			}
			
			/**
			 * Sets the initial value of builtTime
			 * @parameter builtTime value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setBuiltTime(String builtTime) {
				this.builtTime = builtTime;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @parameter summary value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setSummary(String summary) {
				super.summary = summary;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @parameter description value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of releaseTime
			 * @parameter releaseTime value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setReleaseTime(String releaseTime) {
				this.releaseTime = releaseTime;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @parameter comment value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @parameter name value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setName(String name) {
				super.name = name;
				return this;
			}
		}
	}
	static class MockExtension extends Extension {

		/**
		 * @param builder superclass builder
		 * @throws InvalidSPDXAnalysisException on error
		 */
		protected MockExtension(ExtensionBuilder builder)
				throws InvalidSPDXAnalysisException {
			super(builder);
		}
		
		/**
		 * @param modelStore Model store where the AIAIPackage is to be stored
		 * @param objectUri URI or anonymous ID for the AIAIPackage
		 * @param copyManager Copy manager for the AIAIPackage - can be null if copying is not required
		 * @param create true if AIAIPackage is to be created
		 * @param idPrefix - prefix to be used when generating new SPDX IDs
		 * @throws InvalidSPDXAnalysisException when unable to create the AIAIPackage
		 */
		 @SuppressWarnings("unchecked")
		public MockExtension(IModelStore modelStore, String objectUri, IModelCopyManager copyManager,
				boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
		}
		
		/* (non-Javadoc)
		 * @see org.spdx.library.core.CoreModelObject#getType()
		 */
		@Override
		public String getType() {
			return "MockExtension";
		}		
		
		static class MockExtensionBuilder extends ExtensionBuilder {

			/**
			 * @param modelStore store for the built object
			 * @param objectUri uri for the built object
			 * @param copyManager optional copyManager
			 */
			public MockExtensionBuilder(IModelStore modelStore,
					String objectUri, IModelCopyManager copyManager) {
				super(modelStore, objectUri, copyManager);
			}

			@Override
			public Extension build() throws InvalidSPDXAnalysisException {
				return new MockExtension(this);
			}
			
		}
	}

	public static final Integer DATASET_SIZE_TEST_VALUE = 55;
	public static final Integer END_INTEGER_RANGE_TEST_VALUE = 55;
	public static final Integer SCORE_TEST_VALUE = 55;
	public static final Integer PERCENTILE_TEST_VALUE = 55;
	public static final Integer BEGIN_INTEGER_RANGE_TEST_VALUE = 55;
	public static final Integer PROBABILITY_TEST_VALUE = 55;
	public static final Integer ENERGY_QUANTITY_TEST_VALUE = 55;
	public static final String STANDARD_LICENSE_TEMPLATE_TEST_VALUE = "test standardLicenseTemplate";
	public static final String INTENDED_USE_TEST_VALUE = "test intendedUse";
	public static final String MODIFIED_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String HASH_VALUE_TEST_VALUE = "test hashValue";
	public static final String IMPACT_STATEMENT_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String ISSUING_AUTHORITY_TEST_VALUE = "test issuingAuthority";
	public static final String INFORMATION_ABOUT_APPLICATION_TEST_VALUE = "test informationAboutApplication";
	public static final String ADDITION_TEXT_TEST_VALUE = "test additionText";
	public static final String NAME_TEST_VALUE = "test name";
	public static final String BUILT_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String LIST_VERSION_ADDED_TEST_VALUE = "test listVersionAdded";
	public static final String VALID_UNTIL_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String VEX_VERSION_TEST_VALUE = "test vexVersion";
	public static final String CDX_PROP_VALUE_TEST_VALUE = "test cdxPropValue";
	public static final String LICENSE_XML_TEST_VALUE = "test licenseXml";
	public static final String DEPRECATED_VERSION_TEST_VALUE = "test deprecatedVersion";
	public static final String LOCATION_HINT_TEST_VALUE = "test locationHint";
	public static final String NAMESPACE_TEST_VALUE = "test namespace";
	public static final String EXTERNAL_SPDX_ID_TEST_VALUE = "test externalSpdxId";
	public static final String PREFIX_TEST_VALUE = "test prefix";
	public static final String SOURCE_INFO_TEST_VALUE = "test sourceInfo";
	public static final String CONTEXT_TEST_VALUE = "test context";
	public static final String DESCRIPTION_TEST_VALUE = "test description";
	public static final String END_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String CONTENT_TYPE_TEST_VALUE = UnitTestHelper.genRandPattern("^[^\\/]+\\/[^\\/]+$");
	public static final String WITHDRAWN_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String SUMMARY_TEST_VALUE = "test summary";
	public static final String LICENSE_TEXT_TEST_VALUE = "test licenseText";
	public static final String START_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String RELEASE_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String STATUS_NOTES_TEST_VALUE = "test statusNotes";
	public static final String PACKAGE_VERSION_TEST_VALUE = "test packageVersion";
	public static final String BUILD_TYPE_TEST_VALUE = "test buildType";
	public static final String ACTION_STATEMENT_TEST_VALUE = "test actionStatement";
	public static final String BUILD_START_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String IMPACT_STATEMENT_TEST_VALUE = "test impactStatement";
	public static final String DATA_COLLECTION_PROCESS_TEST_VALUE = "test dataCollectionProcess";
	public static final String LICENSE_EXPRESSION_TEST_VALUE = "test licenseExpression";
	public static final String BUILD_END_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String PACKAGE_URL_TEST_VALUE = "test packageUrl";
	public static final String STANDARD_ADDITION_TEMPLATE_TEST_VALUE = "test standardAdditionTemplate";
	public static final String COMMENT_TEST_VALUE = "test comment";
	public static final String SPEC_VERSION_TEST_VALUE = UnitTestHelper.genRandPattern("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
	public static final String VECTOR_STRING_TEST_VALUE = "test vectorString";
	public static final String BUILD_ID_TEST_VALUE = "test buildId";
	public static final String CDX_PROP_NAME_TEST_VALUE = "test cdxPropName";
	public static final String STANDARD_LICENSE_HEADER_TEST_VALUE = "test standardLicenseHeader";
	public static final String HOME_PAGE_TEST_VALUE = "test homePage";
	public static final String VALUE_TEST_VALUE = "test value";
	public static final String KEY_TEST_VALUE = "test key";
	public static final String DATASET_UPDATE_MECHANISM_TEST_VALUE = "test datasetUpdateMechanism";
	public static final String INFORMATION_ABOUT_TRAINING_TEST_VALUE = "test informationAboutTraining";
	public static final String LICENSE_LIST_VERSION_TEST_VALUE = UnitTestHelper.genRandPattern("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
	public static final String DOWNLOAD_LOCATION_TEST_VALUE = "test downloadLocation";
	public static final String PUBLISHED_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String CREATED_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String OBSOLETED_BY_TEST_VALUE = "test obsoletedBy";
	public static final String IDENTIFIER_TEST_VALUE = "test identifier";
	public static final String LIMITATION_TEST_VALUE = "test limitation";
	public static final String COPYRIGHT_TEXT_TEST_VALUE = "test copyrightText";
	public static final String DATASET_NOISE_TEST_VALUE = "test datasetNoise";
	public static final String CONTENT_IDENTIFIER_VALUE_TEST_VALUE = "test contentIdentifierValue";
	public static final String SECURITY_LOCATOR_TEST_VALUE = "test SecurityLocator";
	public static final String STATEMENT_TEST_VALUE = "test statement";
	public static final ConfidentialityLevelType CONFIDENTIALITY_LEVEL_TEST_VALUE1 = ConfidentialityLevelType.values()[0];
	public static final ConfidentialityLevelType CONFIDENTIALITY_LEVEL_TEST_VALUE2 = ConfidentialityLevelType.values()[1];
	public static final SafetyRiskAssessmentType SAFETY_RISK_ASSESSMENT_TEST_VALUE1 = SafetyRiskAssessmentType.values()[0];
	public static final SafetyRiskAssessmentType SAFETY_RISK_ASSESSMENT_TEST_VALUE2 = SafetyRiskAssessmentType.values()[1];
	public static final ExploitCatalogType CATALOG_TYPE_TEST_VALUE1 = ExploitCatalogType.values()[0];
	public static final ExploitCatalogType CATALOG_TYPE_TEST_VALUE2 = ExploitCatalogType.values()[1];
	public static final ContentIdentifierType CONTENT_IDENTIFIER_TYPE_TEST_VALUE1 = ContentIdentifierType.values()[0];
	public static final ContentIdentifierType CONTENT_IDENTIFIER_TYPE_TEST_VALUE2 = ContentIdentifierType.values()[1];
	public static final FileKindType FILE_KIND_TEST_VALUE1 = FileKindType.values()[0];
	public static final FileKindType FILE_KIND_TEST_VALUE2 = FileKindType.values()[1];
	public static final AnnotationType ANNOTATION_TYPE_TEST_VALUE1 = AnnotationType.values()[0];
	public static final AnnotationType ANNOTATION_TYPE_TEST_VALUE2 = AnnotationType.values()[1];
	public static final ExternalRefType EXTERNAL_REF_TYPE_TEST_VALUE1 = ExternalRefType.values()[0];
	public static final ExternalRefType EXTERNAL_REF_TYPE_TEST_VALUE2 = ExternalRefType.values()[1];
	public static final CvssSeverityType SEVERITY_TEST_VALUE1 = CvssSeverityType.values()[0];
	public static final CvssSeverityType SEVERITY_TEST_VALUE2 = CvssSeverityType.values()[1];
	public static final SoftwarePurpose PRIMARY_PURPOSE_TEST_VALUE1 = SoftwarePurpose.values()[0];
	public static final SoftwarePurpose PRIMARY_PURPOSE_TEST_VALUE2 = SoftwarePurpose.values()[1];
	public static final ExternalIdentifierType EXTERNAL_IDENTIFIER_TYPE_TEST_VALUE1 = ExternalIdentifierType.values()[0];
	public static final ExternalIdentifierType EXTERNAL_IDENTIFIER_TYPE_TEST_VALUE2 = ExternalIdentifierType.values()[1];
	public static final DatasetAvailabilityType DATASET_AVAILABILITY_TEST_VALUE1 = DatasetAvailabilityType.values()[0];
	public static final DatasetAvailabilityType DATASET_AVAILABILITY_TEST_VALUE2 = DatasetAvailabilityType.values()[1];
	public static final RelationshipType RELATIONSHIP_TYPE_TEST_VALUE1 = RelationshipType.values()[0];
	public static final RelationshipType RELATIONSHIP_TYPE_TEST_VALUE2 = RelationshipType.values()[1];
	public static final PresenceType AUTONOMY_TYPE_TEST_VALUE1 = PresenceType.values()[0];
	public static final PresenceType AUTONOMY_TYPE_TEST_VALUE2 = PresenceType.values()[1];
	public static final EnergyUnitType ENERGY_UNIT_TEST_VALUE1 = EnergyUnitType.values()[0];
	public static final EnergyUnitType ENERGY_UNIT_TEST_VALUE2 = EnergyUnitType.values()[1];
	public static final VexJustificationType JUSTIFICATION_TYPE_TEST_VALUE1 = VexJustificationType.values()[0];
	public static final VexJustificationType JUSTIFICATION_TYPE_TEST_VALUE2 = VexJustificationType.values()[1];
	public static final HashAlgorithm ALGORITHM_TEST_VALUE1 = HashAlgorithm.values()[0];
	public static final HashAlgorithm ALGORITHM_TEST_VALUE2 = HashAlgorithm.values()[1];
	public static final RelationshipCompleteness COMPLETENESS_TEST_VALUE1 = RelationshipCompleteness.values()[0];
	public static final RelationshipCompleteness COMPLETENESS_TEST_VALUE2 = RelationshipCompleteness.values()[1];
	public static final LifecycleScopeType SCOPE_TEST_VALUE1 = LifecycleScopeType.values()[0];
	public static final LifecycleScopeType SCOPE_TEST_VALUE2 = LifecycleScopeType.values()[1];
	public static final PresenceType USE_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE1 = PresenceType.values()[0];
	public static final PresenceType USE_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE2 = PresenceType.values()[1];
	public static final SsvcDecisionType DECISION_TYPE_TEST_VALUE1 = SsvcDecisionType.values()[0];
	public static final SsvcDecisionType DECISION_TYPE_TEST_VALUE2 = SsvcDecisionType.values()[1];
	public static final PresenceType HAS_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE1 = PresenceType.values()[0];
	public static final PresenceType HAS_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE2 = PresenceType.values()[1];
	public static final String DOMAIN_TEST_VALUE1 = "test 1 domain";
	public static final String DOMAIN_TEST_VALUE2 = "test 2 domain";
	public static final String DOMAIN_TEST_VALUE3 = "test 3 domain";
	public static final List<String> DOMAIN_TEST_LIST1 = Arrays.asList(new String[] { DOMAIN_TEST_VALUE1, DOMAIN_TEST_VALUE2 });
	public static final List<String> DOMAIN_TEST_LIST2 = Arrays.asList(new String[] { DOMAIN_TEST_VALUE3 });
	public static final String STANDARD_NAME_TEST_VALUE1 = "test 1 standardName";
	public static final String STANDARD_NAME_TEST_VALUE2 = "test 2 standardName";
	public static final String STANDARD_NAME_TEST_VALUE3 = "test 3 standardName";
	public static final List<String> STANDARD_NAME_TEST_LIST1 = Arrays.asList(new String[] { STANDARD_NAME_TEST_VALUE1, STANDARD_NAME_TEST_VALUE2 });
	public static final List<String> STANDARD_NAME_TEST_LIST2 = Arrays.asList(new String[] { STANDARD_NAME_TEST_VALUE3 });
	public static final String ATTRIBUTION_TEXT_TEST_VALUE1 = "test 1 attributionText";
	public static final String ATTRIBUTION_TEXT_TEST_VALUE2 = "test 2 attributionText";
	public static final String ATTRIBUTION_TEXT_TEST_VALUE3 = "test 3 attributionText";
	public static final List<String> ATTRIBUTION_TEXT_TEST_LIST1 = Arrays.asList(new String[] { ATTRIBUTION_TEXT_TEST_VALUE1, ATTRIBUTION_TEXT_TEST_VALUE2 });
	public static final List<String> ATTRIBUTION_TEXT_TEST_LIST2 = Arrays.asList(new String[] { ATTRIBUTION_TEXT_TEST_VALUE3 });
	public static final String KNOWN_BIAS_TEST_VALUE1 = "test 1 knownBias";
	public static final String KNOWN_BIAS_TEST_VALUE2 = "test 2 knownBias";
	public static final String KNOWN_BIAS_TEST_VALUE3 = "test 3 knownBias";
	public static final List<String> KNOWN_BIAS_TEST_LIST1 = Arrays.asList(new String[] { KNOWN_BIAS_TEST_VALUE1, KNOWN_BIAS_TEST_VALUE2 });
	public static final List<String> KNOWN_BIAS_TEST_LIST2 = Arrays.asList(new String[] { KNOWN_BIAS_TEST_VALUE3 });
	public static final String SEE_ALSO_TEST_VALUE1 = "test 1 seeAlso";
	public static final String SEE_ALSO_TEST_VALUE2 = "test 2 seeAlso";
	public static final String SEE_ALSO_TEST_VALUE3 = "test 3 seeAlso";
	public static final List<String> SEE_ALSO_TEST_LIST1 = Arrays.asList(new String[] { SEE_ALSO_TEST_VALUE1, SEE_ALSO_TEST_VALUE2 });
	public static final List<String> SEE_ALSO_TEST_LIST2 = Arrays.asList(new String[] { SEE_ALSO_TEST_VALUE3 });
	public static final String STANDARD_COMPLIANCE_TEST_VALUE1 = "test 1 standardCompliance";
	public static final String STANDARD_COMPLIANCE_TEST_VALUE2 = "test 2 standardCompliance";
	public static final String STANDARD_COMPLIANCE_TEST_VALUE3 = "test 3 standardCompliance";
	public static final List<String> STANDARD_COMPLIANCE_TEST_LIST1 = Arrays.asList(new String[] { STANDARD_COMPLIANCE_TEST_VALUE1, STANDARD_COMPLIANCE_TEST_VALUE2 });
	public static final List<String> STANDARD_COMPLIANCE_TEST_LIST2 = Arrays.asList(new String[] { STANDARD_COMPLIANCE_TEST_VALUE3 });
	public static final String IDENTIFIER_LOCATOR_TEST_VALUE1 = "test 1 identifierLocator";
	public static final String IDENTIFIER_LOCATOR_TEST_VALUE2 = "test 2 identifierLocator";
	public static final String IDENTIFIER_LOCATOR_TEST_VALUE3 = "test 3 identifierLocator";
	public static final List<String> IDENTIFIER_LOCATOR_TEST_LIST1 = Arrays.asList(new String[] { IDENTIFIER_LOCATOR_TEST_VALUE1, IDENTIFIER_LOCATOR_TEST_VALUE2 });
	public static final List<String> IDENTIFIER_LOCATOR_TEST_LIST2 = Arrays.asList(new String[] { IDENTIFIER_LOCATOR_TEST_VALUE3 });
	public static final String CONFIG_SOURCE_URI_TEST_VALUE1 = "test 1 configSourceUri";
	public static final String CONFIG_SOURCE_URI_TEST_VALUE2 = "test 2 configSourceUri";
	public static final String CONFIG_SOURCE_URI_TEST_VALUE3 = "test 3 configSourceUri";
	public static final List<String> CONFIG_SOURCE_URI_TEST_LIST1 = Arrays.asList(new String[] { CONFIG_SOURCE_URI_TEST_VALUE1, CONFIG_SOURCE_URI_TEST_VALUE2 });
	public static final List<String> CONFIG_SOURCE_URI_TEST_LIST2 = Arrays.asList(new String[] { CONFIG_SOURCE_URI_TEST_VALUE3 });
	public static final String LOCATOR_TEST_VALUE1 = "test 1 locator";
	public static final String LOCATOR_TEST_VALUE2 = "test 2 locator";
	public static final String LOCATOR_TEST_VALUE3 = "test 3 locator";
	public static final List<String> LOCATOR_TEST_LIST1 = Arrays.asList(new String[] { LOCATOR_TEST_VALUE1, LOCATOR_TEST_VALUE2 });
	public static final List<String> LOCATOR_TEST_LIST2 = Arrays.asList(new String[] { LOCATOR_TEST_VALUE3 });
	public static final String MODEL_DATA_PREPROCESSING_TEST_VALUE1 = "test 1 modelDataPreprocessing";
	public static final String MODEL_DATA_PREPROCESSING_TEST_VALUE2 = "test 2 modelDataPreprocessing";
	public static final String MODEL_DATA_PREPROCESSING_TEST_VALUE3 = "test 3 modelDataPreprocessing";
	public static final List<String> MODEL_DATA_PREPROCESSING_TEST_LIST1 = Arrays.asList(new String[] { MODEL_DATA_PREPROCESSING_TEST_VALUE1, MODEL_DATA_PREPROCESSING_TEST_VALUE2 });
	public static final List<String> MODEL_DATA_PREPROCESSING_TEST_LIST2 = Arrays.asList(new String[] { MODEL_DATA_PREPROCESSING_TEST_VALUE3 });
	public static final String PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_VALUE1 = "test 1 packageVerificationCodeExcludedFile";
	public static final String PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_VALUE2 = "test 2 packageVerificationCodeExcludedFile";
	public static final String PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_VALUE3 = "test 3 packageVerificationCodeExcludedFile";
	public static final List<String> PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_LIST1 = Arrays.asList(new String[] { PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_VALUE1, PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_VALUE2 });
	public static final List<String> PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_LIST2 = Arrays.asList(new String[] { PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_VALUE3 });
	public static final String DATA_PREPROCESSING_TEST_VALUE1 = "test 1 dataPreprocessing";
	public static final String DATA_PREPROCESSING_TEST_VALUE2 = "test 2 dataPreprocessing";
	public static final String DATA_PREPROCESSING_TEST_VALUE3 = "test 3 dataPreprocessing";
	public static final List<String> DATA_PREPROCESSING_TEST_LIST1 = Arrays.asList(new String[] { DATA_PREPROCESSING_TEST_VALUE1, DATA_PREPROCESSING_TEST_VALUE2 });
	public static final List<String> DATA_PREPROCESSING_TEST_LIST2 = Arrays.asList(new String[] { DATA_PREPROCESSING_TEST_VALUE3 });
	public static final String ACTION_STATEMENT_TIME_TEST_VALUE1 = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String ACTION_STATEMENT_TIME_TEST_VALUE2 = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String ACTION_STATEMENT_TIME_TEST_VALUE3 = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final List<String> ACTION_STATEMENT_TIME_TEST_LIST1 = Arrays.asList(new String[] { ACTION_STATEMENT_TIME_TEST_VALUE1, ACTION_STATEMENT_TIME_TEST_VALUE2 });
	public static final List<String> ACTION_STATEMENT_TIME_TEST_LIST2 = Arrays.asList(new String[] { ACTION_STATEMENT_TIME_TEST_VALUE3 });
	public static final String CONFIG_SOURCE_ENTRYPOINT_TEST_VALUE1 = "test 1 configSourceEntrypoint";
	public static final String CONFIG_SOURCE_ENTRYPOINT_TEST_VALUE2 = "test 2 configSourceEntrypoint";
	public static final String CONFIG_SOURCE_ENTRYPOINT_TEST_VALUE3 = "test 3 configSourceEntrypoint";
	public static final List<String> CONFIG_SOURCE_ENTRYPOINT_TEST_LIST1 = Arrays.asList(new String[] { CONFIG_SOURCE_ENTRYPOINT_TEST_VALUE1, CONFIG_SOURCE_ENTRYPOINT_TEST_VALUE2 });
	public static final List<String> CONFIG_SOURCE_ENTRYPOINT_TEST_LIST2 = Arrays.asList(new String[] { CONFIG_SOURCE_ENTRYPOINT_TEST_VALUE3 });
	public static final String MODEL_EXPLAINABILITY_TEST_VALUE1 = "test 1 modelExplainability";
	public static final String MODEL_EXPLAINABILITY_TEST_VALUE2 = "test 2 modelExplainability";
	public static final String MODEL_EXPLAINABILITY_TEST_VALUE3 = "test 3 modelExplainability";
	public static final List<String> MODEL_EXPLAINABILITY_TEST_LIST1 = Arrays.asList(new String[] { MODEL_EXPLAINABILITY_TEST_VALUE1, MODEL_EXPLAINABILITY_TEST_VALUE2 });
	public static final List<String> MODEL_EXPLAINABILITY_TEST_LIST2 = Arrays.asList(new String[] { MODEL_EXPLAINABILITY_TEST_VALUE3 });
	public static final String TYPE_OF_MODEL_TEST_VALUE1 = "test 1 typeOfModel";
	public static final String TYPE_OF_MODEL_TEST_VALUE2 = "test 2 typeOfModel";
	public static final String TYPE_OF_MODEL_TEST_VALUE3 = "test 3 typeOfModel";
	public static final List<String> TYPE_OF_MODEL_TEST_LIST1 = Arrays.asList(new String[] { TYPE_OF_MODEL_TEST_VALUE1, TYPE_OF_MODEL_TEST_VALUE2 });
	public static final List<String> TYPE_OF_MODEL_TEST_LIST2 = Arrays.asList(new String[] { TYPE_OF_MODEL_TEST_VALUE3 });
	public static final String ANONYMIZATION_METHOD_USED_TEST_VALUE1 = "test 1 anonymizationMethodUsed";
	public static final String ANONYMIZATION_METHOD_USED_TEST_VALUE2 = "test 2 anonymizationMethodUsed";
	public static final String ANONYMIZATION_METHOD_USED_TEST_VALUE3 = "test 3 anonymizationMethodUsed";
	public static final List<String> ANONYMIZATION_METHOD_USED_TEST_LIST1 = Arrays.asList(new String[] { ANONYMIZATION_METHOD_USED_TEST_VALUE1, ANONYMIZATION_METHOD_USED_TEST_VALUE2 });
	public static final List<String> ANONYMIZATION_METHOD_USED_TEST_LIST2 = Arrays.asList(new String[] { ANONYMIZATION_METHOD_USED_TEST_VALUE3 });
	public static final SoftwarePurpose ADDITIONAL_PURPOSE_TEST_VALUE1 = SoftwarePurpose.values()[0];
	public static final SoftwarePurpose ADDITIONAL_PURPOSE_TEST_VALUE2 = SoftwarePurpose.values()[1];
	public static final List<SoftwarePurpose> ADDITIONAL_PURPOSE_TEST_LIST1 = Arrays.asList(new SoftwarePurpose[] { ADDITIONAL_PURPOSE_TEST_VALUE1, ADDITIONAL_PURPOSE_TEST_VALUE2 });
	public static final List<SoftwarePurpose> ADDITIONAL_PURPOSE_TEST_LIST2 = Arrays.asList(new SoftwarePurpose[] { ADDITIONAL_PURPOSE_TEST_VALUE1 });
	public static final DatasetType DATASET_TYPE_TEST_VALUE1 = DatasetType.values()[0];
	public static final DatasetType DATASET_TYPE_TEST_VALUE2 = DatasetType.values()[1];
	public static final List<DatasetType> DATASET_TYPE_TEST_LIST1 = Arrays.asList(new DatasetType[] { DATASET_TYPE_TEST_VALUE1, DATASET_TYPE_TEST_VALUE2 });
	public static final List<DatasetType> DATASET_TYPE_TEST_LIST2 = Arrays.asList(new DatasetType[] { DATASET_TYPE_TEST_VALUE1 });
	public static final ProfileIdentifierType PROFILE_CONFORMANCE_TEST_VALUE1 = ProfileIdentifierType.values()[0];
	public static final ProfileIdentifierType PROFILE_CONFORMANCE_TEST_VALUE2 = ProfileIdentifierType.values()[1];
	public static final List<ProfileIdentifierType> PROFILE_CONFORMANCE_TEST_LIST1 = Arrays.asList(new ProfileIdentifierType[] { PROFILE_CONFORMANCE_TEST_VALUE1, PROFILE_CONFORMANCE_TEST_VALUE2 });
	public static final List<ProfileIdentifierType> PROFILE_CONFORMANCE_TEST_LIST2 = Arrays.asList(new ProfileIdentifierType[] { PROFILE_CONFORMANCE_TEST_VALUE1 });
	public static final SupportType SUPPORT_LEVEL_TEST_VALUE1 = SupportType.values()[0];
	public static final SupportType SUPPORT_LEVEL_TEST_VALUE2 = SupportType.values()[1];
	public static final List<SupportType> SUPPORT_LEVEL_TEST_LIST1 = Arrays.asList(new SupportType[] { SUPPORT_LEVEL_TEST_VALUE1, SUPPORT_LEVEL_TEST_VALUE2 });
	public static final List<SupportType> SUPPORT_LEVEL_TEST_LIST2 = Arrays.asList(new SupportType[] { SUPPORT_LEVEL_TEST_VALUE1 });
	public static final SbomType SBOM_TYPE_TEST_VALUE1 = SbomType.values()[0];
	public static final SbomType SBOM_TYPE_TEST_VALUE2 = SbomType.values()[1];
	public static final List<SbomType> SBOM_TYPE_TEST_LIST1 = Arrays.asList(new SbomType[] { SBOM_TYPE_TEST_VALUE1, SBOM_TYPE_TEST_VALUE2 });
	public static final List<SbomType> SBOM_TYPE_TEST_LIST2 = Arrays.asList(new SbomType[] { SBOM_TYPE_TEST_VALUE1 });
	
	private IModelStore modelStore;
	private IModelCopyManager copyManager;
	CreationInfo creationInfo;
	
	public TestValuesGenerator(IModelStore modelStore, IModelCopyManager copyManager) throws InvalidSPDXAnalysisException {
		this.modelStore = modelStore;
		this.copyManager = copyManager;
		if (!ModelRegistry.getModelRegistry().containsSpecVersion("3.0.1")) {
			ModelRegistry.getModelRegistry().registerModel(new TestSpdxModelInfo());
		}
		creationInfo = new CreationInfo.CreationInfoBuilder(modelStore, modelStore.getNextId(IdType.Anonymous), copyManager)
							.setCreated("2010-01-29T18:30:22Z")
							.setSpecVersion("3.0.1")
							.build();
		AgentBuilder agentBuilder = new AgentBuilder(modelStore, "https://unique/id" + modelStore.getNextId(IdType.SpdxId), copyManager);
		agentBuilder.setCreationInfo(creationInfo);
		agentBuilder.setName("Creator Name");
		creationInfo.getCreatedBys().add(agentBuilder.build());
	}
	
	public CreationInfoBuilder builderForCreationInfoTests(String objectUri) throws InvalidSPDXAnalysisException {
		CreationInfoBuilder retval = new CreationInfoBuilder(modelStore, objectUri, copyManager)
				.setCreated(CREATED_TEST_VALUE)
				.setSpecVersion(SPEC_VERSION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.addCreatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addCreatedUsing(builderForToolTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		return retval;
	}
	
	public OrLaterOperatorBuilder builderForOrLaterOperatorTests(String objectUri) throws InvalidSPDXAnalysisException {
		OrLaterOperatorBuilder retval = new OrLaterOperatorBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSubjectLicense(builderForLicenseTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public SsvcVulnAssessmentRelationshipBuilder builderForSsvcVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationshipBuilder retval = new SsvcVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setDecisionType(DECISION_TYPE_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setAssessedElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public IndividualLicensingInfoBuilder builderForIndividualLicensingInfoTests(String objectUri) throws InvalidSPDXAnalysisException {
		IndividualLicensingInfoBuilder retval = new IndividualLicensingInfoBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public NamespaceMapBuilder builderForNamespaceMapTests(String objectUri) throws InvalidSPDXAnalysisException {
		NamespaceMapBuilder retval = new NamespaceMapBuilder(modelStore, objectUri, copyManager)
				.setPrefix(PREFIX_TEST_VALUE)
				.setNamespace(NAMESPACE_TEST_VALUE)
				;
		return retval;
	}
	
	public VexVulnAssessmentRelationshipBuilder builderForVexVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		VexVulnAssessmentRelationshipBuilder retval = new MockVexVulnAssessmentRelationship.MockVexVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setVexVersion(VEX_VERSION_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setStatusNotes(STATUS_NOTES_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setAssessedElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public IntegrityMethodBuilder builderForIntegrityMethodTests(String objectUri) throws InvalidSPDXAnalysisException {
		IntegrityMethodBuilder retval = new MockIntegrityMethod.MockIntegrityMethodBuilder(modelStore, objectUri, copyManager)
				.setComment(COMMENT_TEST_VALUE)
				;
		return retval;
	}
	
	public SpdxDocumentBuilder builderForSpdxDocumentTests(String objectUri) throws InvalidSPDXAnalysisException {
		SpdxDocumentBuilder retval = new SpdxDocumentBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addProfileConformance(PROFILE_CONFORMANCE_TEST_VALUE1)
				.addProfileConformance(PROFILE_CONFORMANCE_TEST_VALUE2)
				.setDataLicense(builderForAnyLicenseInfoTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addRootElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addSpdxImport(builderForExternalMapTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addNamespaceMap(builderForNamespaceMapTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public CvssV2VulnAssessmentRelationshipBuilder builderForCvssV2VulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationshipBuilder retval = new CvssV2VulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setScore(SCORE_TEST_VALUE)
				.setVectorString(VECTOR_STRING_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setAssessedElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ConjunctiveLicenseSetBuilder builderForConjunctiveLicenseSetTests(String objectUri) throws InvalidSPDXAnalysisException {
		ConjunctiveLicenseSetBuilder retval = new ConjunctiveLicenseSetBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addMember(builderForAnyLicenseInfoTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ToolBuilder builderForToolTests(String objectUri) throws InvalidSPDXAnalysisException {
		ToolBuilder retval = new ToolBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public DisjunctiveLicenseSetBuilder builderForDisjunctiveLicenseSetTests(String objectUri) throws InvalidSPDXAnalysisException {
		DisjunctiveLicenseSetBuilder retval = new DisjunctiveLicenseSetBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addMember(builderForAnyLicenseInfoTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public VulnAssessmentRelationshipBuilder builderForVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		VulnAssessmentRelationshipBuilder retval = new MockVulnAssessmentRelationship.MockVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setAssessedElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public BuildBuilder builderForBuildTests(String objectUri) throws InvalidSPDXAnalysisException {
		BuildBuilder retval = new BuildBuilder(modelStore, objectUri, copyManager)
				.setBuildId(BUILD_ID_TEST_VALUE)
				.setBuildEndTime(BUILD_END_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setBuildStartTime(BUILD_START_TIME_TEST_VALUE)
				.setBuildType(BUILD_TYPE_TEST_VALUE)
				.addConfigSourceEntrypoint(CONFIG_SOURCE_ENTRYPOINT_TEST_VALUE1)
				.addConfigSourceEntrypoint(CONFIG_SOURCE_ENTRYPOINT_TEST_VALUE2)
				.addConfigSourceUri(CONFIG_SOURCE_URI_TEST_VALUE1)
				.addConfigSourceUri(CONFIG_SOURCE_URI_TEST_VALUE2)
				.addEnvironment(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addConfigSourceDigest(builderForHashTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addParameter(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public BomBuilder builderForBomTests(String objectUri) throws InvalidSPDXAnalysisException {
		BomBuilder retval = new BomBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setContext(CONTEXT_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addProfileConformance(PROFILE_CONFORMANCE_TEST_VALUE1)
				.addProfileConformance(PROFILE_CONFORMANCE_TEST_VALUE2)
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addRootElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public PersonBuilder builderForPersonTests(String objectUri) throws InvalidSPDXAnalysisException {
		PersonBuilder retval = new PersonBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public VexUnderInvestigationVulnAssessmentRelationshipBuilder builderForVexUnderInvestigationVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationshipBuilder retval = new VexUnderInvestigationVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setVexVersion(VEX_VERSION_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setStatusNotes(STATUS_NOTES_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setAssessedElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public HashBuilder builderForHashTests(String objectUri) throws InvalidSPDXAnalysisException {
		HashBuilder retval = new HashBuilder(modelStore, objectUri, copyManager)
				.setHashValue(HASH_VALUE_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setAlgorithm(ALGORITHM_TEST_VALUE1)
				;
		return retval;
	}
	
	public PositiveIntegerRangeBuilder builderForPositiveIntegerRangeTests(String objectUri) throws InvalidSPDXAnalysisException {
		PositiveIntegerRangeBuilder retval = new PositiveIntegerRangeBuilder(modelStore, objectUri, copyManager)
				.setEndIntegerRange(END_INTEGER_RANGE_TEST_VALUE)
				.setBeginIntegerRange(BEGIN_INTEGER_RANGE_TEST_VALUE)
				;
		return retval;
	}
	
	public AnnotationBuilder builderForAnnotationTests(String objectUri) throws InvalidSPDXAnalysisException {
		AnnotationBuilder retval = new AnnotationBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setStatement(STATEMENT_TEST_VALUE)
				.setContentType(CONTENT_TYPE_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setAnnotationType(ANNOTATION_TYPE_TEST_VALUE1)
				.setSubject(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public LifecycleScopedRelationshipBuilder builderForLifecycleScopedRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationshipBuilder retval = new LifecycleScopedRelationshipBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setScope(SCOPE_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public VexFixedVulnAssessmentRelationshipBuilder builderForVexFixedVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationshipBuilder retval = new VexFixedVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setVexVersion(VEX_VERSION_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setStatusNotes(STATUS_NOTES_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setAssessedElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public LicenseBuilder builderForLicenseTests(String objectUri) throws InvalidSPDXAnalysisException {
		LicenseBuilder retval = new MockLicense.MockLicenseBuilder(modelStore, objectUri, copyManager)
				.setIsFsfLibre(true)
				.setIsDeprecatedLicenseId(true)
				.setIsOsiApproved(true)
				.setLicenseText(LICENSE_TEXT_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setStandardLicenseTemplate(STANDARD_LICENSE_TEMPLATE_TEST_VALUE)
				.setObsoletedBy(OBSOLETED_BY_TEST_VALUE)
				.setLicenseXml(LICENSE_XML_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setStandardLicenseHeader(STANDARD_LICENSE_HEADER_TEST_VALUE)
				.addSeeAlso(SEE_ALSO_TEST_VALUE1)
				.addSeeAlso(SEE_ALSO_TEST_VALUE2)
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public LicenseExpressionBuilder builderForLicenseExpressionTests(String objectUri) throws InvalidSPDXAnalysisException {
		LicenseExpressionBuilder retval = new LicenseExpressionBuilder(modelStore, objectUri, copyManager)
				.setLicenseListVersion(LICENSE_LIST_VERSION_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setLicenseExpression(LICENSE_EXPRESSION_TEST_VALUE)
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addCustomIdToUri(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ExternalMapBuilder builderForExternalMapTests(String objectUri) throws InvalidSPDXAnalysisException {
		ExternalMapBuilder retval = new ExternalMapBuilder(modelStore, objectUri, copyManager)
				.setExternalSpdxId(EXTERNAL_SPDX_ID_TEST_VALUE)
				.setLocationHint(LOCATION_HINT_TEST_VALUE)
				.setDefiningArtifact(builderForArtifactTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		return retval;
	}
	
	public SoftwareArtifactBuilder builderForSoftwareArtifactTests(String objectUri) throws InvalidSPDXAnalysisException {
		SoftwareArtifactBuilder retval = new MockSoftwareArtifact.MockSoftwareArtifactBuilder(modelStore, objectUri, copyManager)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setCopyrightText(COPYRIGHT_TEXT_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addAttributionText(ATTRIBUTION_TEXT_TEST_VALUE1)
				.addAttributionText(ATTRIBUTION_TEXT_TEST_VALUE2)
				.addStandardName(STANDARD_NAME_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_TEST_VALUE2)
				.setPrimaryPurpose(PRIMARY_PURPOSE_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_TEST_VALUE2)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_TEST_VALUE1)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addContentIdentifier(builderForContentIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public AIPackageBuilder builderForAIPackageTests(String objectUri) throws InvalidSPDXAnalysisException {
		AIPackageBuilder retval = new AIPackageBuilder(modelStore, objectUri, copyManager)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setDownloadLocation(DOWNLOAD_LOCATION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setPackageVersion(PACKAGE_VERSION_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setCopyrightText(COPYRIGHT_TEXT_TEST_VALUE)
				.setInformationAboutTraining(INFORMATION_ABOUT_TRAINING_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setHomePage(HOME_PAGE_TEST_VALUE)
				.setSourceInfo(SOURCE_INFO_TEST_VALUE)
				.setLimitation(LIMITATION_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setPackageUrl(PACKAGE_URL_TEST_VALUE)
				.setInformationAboutApplication(INFORMATION_ABOUT_APPLICATION_TEST_VALUE)
				.addModelDataPreprocessing(MODEL_DATA_PREPROCESSING_TEST_VALUE1)
				.addModelDataPreprocessing(MODEL_DATA_PREPROCESSING_TEST_VALUE2)
				.addDomain(DOMAIN_TEST_VALUE1)
				.addDomain(DOMAIN_TEST_VALUE2)
				.addAttributionText(ATTRIBUTION_TEXT_TEST_VALUE1)
				.addAttributionText(ATTRIBUTION_TEXT_TEST_VALUE2)
				.addTypeOfModel(TYPE_OF_MODEL_TEST_VALUE1)
				.addTypeOfModel(TYPE_OF_MODEL_TEST_VALUE2)
				.addStandardName(STANDARD_NAME_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_TEST_VALUE2)
				.addStandardCompliance(STANDARD_COMPLIANCE_TEST_VALUE1)
				.addStandardCompliance(STANDARD_COMPLIANCE_TEST_VALUE2)
				.addModelExplainability(MODEL_EXPLAINABILITY_TEST_VALUE1)
				.addModelExplainability(MODEL_EXPLAINABILITY_TEST_VALUE2)
				.setAutonomyType(AUTONOMY_TYPE_TEST_VALUE1)
				.setUseSensitivePersonalInformation(USE_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE1)
				.setSafetyRiskAssessment(SAFETY_RISK_ASSESSMENT_TEST_VALUE1)
				.setPrimaryPurpose(PRIMARY_PURPOSE_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_TEST_VALUE2)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_TEST_VALUE1)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_TEST_VALUE2)
				.setEnergyConsumption(builderForEnergyConsumptionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addContentIdentifier(builderForContentIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addHyperparameter(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addMetric(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addMetricDecisionThreshold(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public EnergyConsumptionBuilder builderForEnergyConsumptionTests(String objectUri) throws InvalidSPDXAnalysisException {
		EnergyConsumptionBuilder retval = new EnergyConsumptionBuilder(modelStore, objectUri, copyManager)
				.addTrainingEnergyConsumption(builderForEnergyConsumptionDescriptionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addFinetuningEnergyConsumption(builderForEnergyConsumptionDescriptionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addInferenceEnergyConsumption(builderForEnergyConsumptionDescriptionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		return retval;
	}
	
	public EnergyConsumptionDescriptionBuilder builderForEnergyConsumptionDescriptionTests(String objectUri) throws InvalidSPDXAnalysisException {
		EnergyConsumptionDescriptionBuilder retval = new EnergyConsumptionDescriptionBuilder(modelStore, objectUri, copyManager)
				.setEnergyQuantity(ENERGY_QUANTITY_TEST_VALUE)
				.setEnergyUnit(ENERGY_UNIT_TEST_VALUE1)
				;
		return retval;
	}
	
	public ExternalIdentifierBuilder builderForExternalIdentifierTests(String objectUri) throws InvalidSPDXAnalysisException {
		ExternalIdentifierBuilder retval = new ExternalIdentifierBuilder(modelStore, objectUri, copyManager)
				.setIdentifier(IDENTIFIER_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setIssuingAuthority(ISSUING_AUTHORITY_TEST_VALUE)
				.addIdentifierLocator(IDENTIFIER_LOCATOR_TEST_VALUE1)
				.addIdentifierLocator(IDENTIFIER_LOCATOR_TEST_VALUE2)
				.setExternalIdentifierType(EXTERNAL_IDENTIFIER_TYPE_TEST_VALUE1)
				;
		return retval;
	}
	
	public VulnerabilityBuilder builderForVulnerabilityTests(String objectUri) throws InvalidSPDXAnalysisException {
		VulnerabilityBuilder retval = new VulnerabilityBuilder(modelStore, objectUri, copyManager)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ElementBuilder builderForElementTests(String objectUri) throws InvalidSPDXAnalysisException {
		ElementBuilder retval = new MockElement.MockElementBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ExtendableLicenseBuilder builderForExtendableLicenseTests(String objectUri) throws InvalidSPDXAnalysisException {
		ExtendableLicenseBuilder retval = new MockExtendableLicense.MockExtendableLicenseBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public VexNotAffectedVulnAssessmentRelationshipBuilder builderForVexNotAffectedVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationshipBuilder retval = new VexNotAffectedVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setVexVersion(VEX_VERSION_TEST_VALUE)
				.setImpactStatementTime(IMPACT_STATEMENT_TIME_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setStatusNotes(STATUS_NOTES_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setImpactStatement(IMPACT_STATEMENT_TEST_VALUE)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setJustificationType(JUSTIFICATION_TYPE_TEST_VALUE1)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setAssessedElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public SpdxFileBuilder builderForSpdxFileTests(String objectUri) throws InvalidSPDXAnalysisException {
		SpdxFileBuilder retval = new SpdxFileBuilder(modelStore, objectUri, copyManager)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setCopyrightText(COPYRIGHT_TEXT_TEST_VALUE)
				.setContentType(CONTENT_TYPE_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addAttributionText(ATTRIBUTION_TEXT_TEST_VALUE1)
				.addAttributionText(ATTRIBUTION_TEXT_TEST_VALUE2)
				.addStandardName(STANDARD_NAME_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_TEST_VALUE2)
				.setPrimaryPurpose(PRIMARY_PURPOSE_TEST_VALUE1)
				.setFileKind(FILE_KIND_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_TEST_VALUE2)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_TEST_VALUE1)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addContentIdentifier(builderForContentIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public VexAffectedVulnAssessmentRelationshipBuilder builderForVexAffectedVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationshipBuilder retval = new VexAffectedVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setVexVersion(VEX_VERSION_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setActionStatement(ACTION_STATEMENT_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setStatusNotes(STATUS_NOTES_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.addActionStatementTime(ACTION_STATEMENT_TIME_TEST_VALUE1)
				.addActionStatementTime(ACTION_STATEMENT_TIME_TEST_VALUE2)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setAssessedElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ElementCollectionBuilder builderForElementCollectionTests(String objectUri) throws InvalidSPDXAnalysisException {
		ElementCollectionBuilder retval = new MockElementCollection.MockElementCollectionBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addProfileConformance(PROFILE_CONFORMANCE_TEST_VALUE1)
				.addProfileConformance(PROFILE_CONFORMANCE_TEST_VALUE2)
				.addElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addRootElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public WithAdditionOperatorBuilder builderForWithAdditionOperatorTests(String objectUri) throws InvalidSPDXAnalysisException {
		WithAdditionOperatorBuilder retval = new WithAdditionOperatorBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSubjectAddition(builderForLicenseAdditionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSubjectExtendableLicense(builderForExtendableLicenseTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public BundleBuilder builderForBundleTests(String objectUri) throws InvalidSPDXAnalysisException {
		BundleBuilder retval = new BundleBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setContext(CONTEXT_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addProfileConformance(PROFILE_CONFORMANCE_TEST_VALUE1)
				.addProfileConformance(PROFILE_CONFORMANCE_TEST_VALUE2)
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addRootElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public CdxPropertiesExtensionBuilder builderForCdxPropertiesExtensionTests(String objectUri) throws InvalidSPDXAnalysisException {
		CdxPropertiesExtensionBuilder retval = new CdxPropertiesExtensionBuilder(modelStore, objectUri, copyManager)
				.addCdxProperty(builderForCdxPropertyEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		return retval;
	}
	
	public DictionaryEntryBuilder builderForDictionaryEntryTests(String objectUri) throws InvalidSPDXAnalysisException {
		DictionaryEntryBuilder retval = new DictionaryEntryBuilder(modelStore, objectUri, copyManager)
				.setValue(VALUE_TEST_VALUE)
				.setKey(KEY_TEST_VALUE)
				;
		return retval;
	}
	
	public CustomLicenseBuilder builderForCustomLicenseTests(String objectUri) throws InvalidSPDXAnalysisException {
		CustomLicenseBuilder retval = new CustomLicenseBuilder(modelStore, objectUri, copyManager)
				.setIsFsfLibre(true)
				.setIsDeprecatedLicenseId(true)
				.setIsOsiApproved(true)
				.setLicenseText(LICENSE_TEXT_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setStandardLicenseTemplate(STANDARD_LICENSE_TEMPLATE_TEST_VALUE)
				.setObsoletedBy(OBSOLETED_BY_TEST_VALUE)
				.setLicenseXml(LICENSE_XML_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setStandardLicenseHeader(STANDARD_LICENSE_HEADER_TEST_VALUE)
				.addSeeAlso(SEE_ALSO_TEST_VALUE1)
				.addSeeAlso(SEE_ALSO_TEST_VALUE2)
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public AnyLicenseInfoBuilder builderForAnyLicenseInfoTests(String objectUri) throws InvalidSPDXAnalysisException {
		AnyLicenseInfoBuilder retval = new MockAnyLicenseInfo.MockAnyLicenseInfoBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ExploitCatalogVulnAssessmentRelationshipBuilder builderForExploitCatalogVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		ExploitCatalogVulnAssessmentRelationshipBuilder retval = new ExploitCatalogVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setExploited(true)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setSecurityLocator(SECURITY_LOCATOR_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setCatalogType(CATALOG_TYPE_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setAssessedElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public OrganizationBuilder builderForOrganizationTests(String objectUri) throws InvalidSPDXAnalysisException {
		OrganizationBuilder retval = new OrganizationBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public SbomBuilder builderForSbomTests(String objectUri) throws InvalidSPDXAnalysisException {
		SbomBuilder retval = new SbomBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setContext(CONTEXT_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addProfileConformance(PROFILE_CONFORMANCE_TEST_VALUE1)
				.addProfileConformance(PROFILE_CONFORMANCE_TEST_VALUE2)
				.addSbomType(SBOM_TYPE_TEST_VALUE1)
				.addSbomType(SBOM_TYPE_TEST_VALUE2)
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addRootElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public CdxPropertyEntryBuilder builderForCdxPropertyEntryTests(String objectUri) throws InvalidSPDXAnalysisException {
		CdxPropertyEntryBuilder retval = new CdxPropertyEntryBuilder(modelStore, objectUri, copyManager)
				.setCdxPropName(CDX_PROP_NAME_TEST_VALUE)
				.setCdxPropValue(CDX_PROP_VALUE_TEST_VALUE)
				;
		return retval;
	}
	
	public CvssV3VulnAssessmentRelationshipBuilder builderForCvssV3VulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationshipBuilder retval = new CvssV3VulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setScore(SCORE_TEST_VALUE)
				.setVectorString(VECTOR_STRING_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setSeverity(SEVERITY_TEST_VALUE1)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setAssessedElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ContentIdentifierBuilder builderForContentIdentifierTests(String objectUri) throws InvalidSPDXAnalysisException {
		ContentIdentifierBuilder retval = new ContentIdentifierBuilder(modelStore, objectUri, copyManager)
				.setComment(COMMENT_TEST_VALUE)
				.setContentIdentifierValue(CONTENT_IDENTIFIER_VALUE_TEST_VALUE)
				.setContentIdentifierType(CONTENT_IDENTIFIER_TYPE_TEST_VALUE1)
				;
		return retval;
	}
	
	public LicenseAdditionBuilder builderForLicenseAdditionTests(String objectUri) throws InvalidSPDXAnalysisException {
		LicenseAdditionBuilder retval = new MockLicenseAddition.MockLicenseAdditionBuilder(modelStore, objectUri, copyManager)
				.setIsDeprecatedAdditionId(true)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setObsoletedBy(OBSOLETED_BY_TEST_VALUE)
				.setAdditionText(ADDITION_TEXT_TEST_VALUE)
				.setLicenseXml(LICENSE_XML_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setStandardAdditionTemplate(STANDARD_ADDITION_TEMPLATE_TEST_VALUE)
				.addSeeAlso(SEE_ALSO_TEST_VALUE1)
				.addSeeAlso(SEE_ALSO_TEST_VALUE2)
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public SoftwareAgentBuilder builderForSoftwareAgentTests(String objectUri) throws InvalidSPDXAnalysisException {
		SoftwareAgentBuilder retval = new SoftwareAgentBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ArtifactBuilder builderForArtifactTests(String objectUri) throws InvalidSPDXAnalysisException {
		ArtifactBuilder retval = new MockArtifact.MockArtifactBuilder(modelStore, objectUri, copyManager)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public AgentBuilder builderForAgentTests(String objectUri) throws InvalidSPDXAnalysisException {
		AgentBuilder retval = new AgentBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public SimpleLicensingTextBuilder builderForSimpleLicensingTextTests(String objectUri) throws InvalidSPDXAnalysisException {
		SimpleLicensingTextBuilder retval = new SimpleLicensingTextBuilder(modelStore, objectUri, copyManager)
				.setLicenseText(LICENSE_TEXT_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public DatasetPackageBuilder builderForDatasetPackageTests(String objectUri) throws InvalidSPDXAnalysisException {
		DatasetPackageBuilder retval = new DatasetPackageBuilder(modelStore, objectUri, copyManager)
				.setDatasetSize(DATASET_SIZE_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setDownloadLocation(DOWNLOAD_LOCATION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setDatasetNoise(DATASET_NOISE_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setPackageVersion(PACKAGE_VERSION_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setCopyrightText(COPYRIGHT_TEXT_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setHomePage(HOME_PAGE_TEST_VALUE)
				.setSourceInfo(SOURCE_INFO_TEST_VALUE)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setDataCollectionProcess(DATA_COLLECTION_PROCESS_TEST_VALUE)
				.setDatasetUpdateMechanism(DATASET_UPDATE_MECHANISM_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setPackageUrl(PACKAGE_URL_TEST_VALUE)
				.addAttributionText(ATTRIBUTION_TEXT_TEST_VALUE1)
				.addAttributionText(ATTRIBUTION_TEXT_TEST_VALUE2)
				.addStandardName(STANDARD_NAME_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_TEST_VALUE2)
				.addAnonymizationMethodUsed(ANONYMIZATION_METHOD_USED_TEST_VALUE1)
				.addAnonymizationMethodUsed(ANONYMIZATION_METHOD_USED_TEST_VALUE2)
				.addKnownBias(KNOWN_BIAS_TEST_VALUE1)
				.addKnownBias(KNOWN_BIAS_TEST_VALUE2)
				.addDataPreprocessing(DATA_PREPROCESSING_TEST_VALUE1)
				.addDataPreprocessing(DATA_PREPROCESSING_TEST_VALUE2)
				.setDatasetAvailability(DATASET_AVAILABILITY_TEST_VALUE1)
				.setConfidentialityLevel(CONFIDENTIALITY_LEVEL_TEST_VALUE1)
				.setHasSensitivePersonalInformation(HAS_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE1)
				.setPrimaryPurpose(PRIMARY_PURPOSE_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_TEST_VALUE2)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_TEST_VALUE1)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_TEST_VALUE2)
				.addDatasetType(DATASET_TYPE_TEST_VALUE1)
				.addDatasetType(DATASET_TYPE_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addContentIdentifier(builderForContentIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addSensor(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ExternalRefBuilder builderForExternalRefTests(String objectUri) throws InvalidSPDXAnalysisException {
		ExternalRefBuilder retval = new ExternalRefBuilder(modelStore, objectUri, copyManager)
				.setContentType(CONTENT_TYPE_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.addLocator(LOCATOR_TEST_VALUE1)
				.addLocator(LOCATOR_TEST_VALUE2)
				.setExternalRefType(EXTERNAL_REF_TYPE_TEST_VALUE1)
				;
		return retval;
	}
	
	public CustomLicenseAdditionBuilder builderForCustomLicenseAdditionTests(String objectUri) throws InvalidSPDXAnalysisException {
		CustomLicenseAdditionBuilder retval = new CustomLicenseAdditionBuilder(modelStore, objectUri, copyManager)
				.setIsDeprecatedAdditionId(true)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setObsoletedBy(OBSOLETED_BY_TEST_VALUE)
				.setAdditionText(ADDITION_TEXT_TEST_VALUE)
				.setLicenseXml(LICENSE_XML_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setStandardAdditionTemplate(STANDARD_ADDITION_TEMPLATE_TEST_VALUE)
				.addSeeAlso(SEE_ALSO_TEST_VALUE1)
				.addSeeAlso(SEE_ALSO_TEST_VALUE2)
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public PackageVerificationCodeBuilder builderForPackageVerificationCodeTests(String objectUri) throws InvalidSPDXAnalysisException {
		PackageVerificationCodeBuilder retval = new PackageVerificationCodeBuilder(modelStore, objectUri, copyManager)
				.setHashValue(HASH_VALUE_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.addPackageVerificationCodeExcludedFile(PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_VALUE1)
				.addPackageVerificationCodeExcludedFile(PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_VALUE2)
				.setAlgorithm(ALGORITHM_TEST_VALUE1)
				;
		return retval;
	}
	
	public SnippetBuilder builderForSnippetTests(String objectUri) throws InvalidSPDXAnalysisException {
		SnippetBuilder retval = new SnippetBuilder(modelStore, objectUri, copyManager)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setCopyrightText(COPYRIGHT_TEXT_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.addAttributionText(ATTRIBUTION_TEXT_TEST_VALUE1)
				.addAttributionText(ATTRIBUTION_TEXT_TEST_VALUE2)
				.addStandardName(STANDARD_NAME_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_TEST_VALUE2)
				.setPrimaryPurpose(PRIMARY_PURPOSE_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_TEST_VALUE2)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_TEST_VALUE1)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setLineRange(builderForPositiveIntegerRangeTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setByteRange(builderForPositiveIntegerRangeTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSnippetFromFile(builderForSpdxFileTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addContentIdentifier(builderForContentIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ListedLicenseBuilder builderForListedLicenseTests(String objectUri) throws InvalidSPDXAnalysisException {
		ListedLicenseBuilder retval = new ListedLicenseBuilder(modelStore, objectUri, copyManager)
				.setIsFsfLibre(true)
				.setIsDeprecatedLicenseId(true)
				.setIsOsiApproved(true)
				.setLicenseText(LICENSE_TEXT_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setStandardLicenseTemplate(STANDARD_LICENSE_TEMPLATE_TEST_VALUE)
				.setObsoletedBy(OBSOLETED_BY_TEST_VALUE)
				.setListVersionAdded(LIST_VERSION_ADDED_TEST_VALUE)
				.setLicenseXml(LICENSE_XML_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setDeprecatedVersion(DEPRECATED_VERSION_TEST_VALUE)
				.setStandardLicenseHeader(STANDARD_LICENSE_HEADER_TEST_VALUE)
				.addSeeAlso(SEE_ALSO_TEST_VALUE1)
				.addSeeAlso(SEE_ALSO_TEST_VALUE2)
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public SpdxPackageBuilder builderForSpdxPackageTests(String objectUri) throws InvalidSPDXAnalysisException {
		SpdxPackageBuilder retval = new SpdxPackageBuilder(modelStore, objectUri, copyManager)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setDownloadLocation(DOWNLOAD_LOCATION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setPackageVersion(PACKAGE_VERSION_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setCopyrightText(COPYRIGHT_TEXT_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setHomePage(HOME_PAGE_TEST_VALUE)
				.setSourceInfo(SOURCE_INFO_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setPackageUrl(PACKAGE_URL_TEST_VALUE)
				.addAttributionText(ATTRIBUTION_TEXT_TEST_VALUE1)
				.addAttributionText(ATTRIBUTION_TEXT_TEST_VALUE2)
				.addStandardName(STANDARD_NAME_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_TEST_VALUE2)
				.setPrimaryPurpose(PRIMARY_PURPOSE_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_TEST_VALUE2)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_TEST_VALUE1)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addContentIdentifier(builderForContentIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ExtensionBuilder builderForExtensionTests(String objectUri) throws InvalidSPDXAnalysisException {
		ExtensionBuilder retval = new MockExtension.MockExtensionBuilder(modelStore, objectUri, copyManager)
				;
		return retval;
	}
	
	public RelationshipBuilder builderForRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		RelationshipBuilder retval = new RelationshipBuilder(modelStore, objectUri, copyManager)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public CvssV4VulnAssessmentRelationshipBuilder builderForCvssV4VulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationshipBuilder retval = new CvssV4VulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setScore(SCORE_TEST_VALUE)
				.setVectorString(VECTOR_STRING_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setSeverity(SEVERITY_TEST_VALUE1)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setAssessedElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ListedLicenseExceptionBuilder builderForListedLicenseExceptionTests(String objectUri) throws InvalidSPDXAnalysisException {
		ListedLicenseExceptionBuilder retval = new ListedLicenseExceptionBuilder(modelStore, objectUri, copyManager)
				.setIsDeprecatedAdditionId(true)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setObsoletedBy(OBSOLETED_BY_TEST_VALUE)
				.setAdditionText(ADDITION_TEXT_TEST_VALUE)
				.setListVersionAdded(LIST_VERSION_ADDED_TEST_VALUE)
				.setLicenseXml(LICENSE_XML_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setStandardAdditionTemplate(STANDARD_ADDITION_TEMPLATE_TEST_VALUE)
				.setDeprecatedVersion(DEPRECATED_VERSION_TEST_VALUE)
				.addSeeAlso(SEE_ALSO_TEST_VALUE1)
				.addSeeAlso(SEE_ALSO_TEST_VALUE2)
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public EpssVulnAssessmentRelationshipBuilder builderForEpssVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationshipBuilder retval = new EpssVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setProbability(PROBABILITY_TEST_VALUE)
				.setPercentile(PERCENTILE_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setAssessedElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
}
