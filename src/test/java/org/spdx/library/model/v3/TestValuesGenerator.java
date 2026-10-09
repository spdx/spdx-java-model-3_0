/**
 * SPDX-FileCopyrightText: Copyright (c)  Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3.ai.AIPackage.AIPackageBuilder;
import org.spdx.library.model.v3.ai.EnergyConsumption.EnergyConsumptionBuilder;
import org.spdx.library.model.v3.ai.EnergyConsumption;
import org.spdx.library.model.v3.ai.EnergyConsumptionDescription.EnergyConsumptionDescriptionBuilder;
import org.spdx.library.model.v3.ai.EnergyConsumptionDescription;
import org.spdx.library.model.v3.ai.EnergyUnitType;
import org.spdx.library.model.v3.ai.SafetyRiskAssessmentType;
import org.spdx.library.model.v3.build.Build.BuildBuilder;
import org.spdx.library.model.v3.core.Action.ActionBuilder;
import org.spdx.library.model.v3.core.Action;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.Agent;
import org.spdx.library.model.v3.core.Annotation.AnnotationBuilder;
import org.spdx.library.model.v3.core.AnnotationType;
import org.spdx.library.model.v3.core.Artifact.ArtifactBuilder;
import org.spdx.library.model.v3.core.Artifact;
import org.spdx.library.model.v3.core.Bom.BomBuilder;
import org.spdx.library.model.v3.core.Bundle.BundleBuilder;
import org.spdx.library.model.v3.core.ContactPointRelationship.ContactPointRelationshipBuilder;
import org.spdx.library.model.v3.core.ContactPointRelationshipType;
import org.spdx.library.model.v3.core.CreationInfo.CreationInfoBuilder;
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.DefinedProcess.DefinedProcessBuilder;
import org.spdx.library.model.v3.core.DefinedProcess;
import org.spdx.library.model.v3.core.DefinedType.DefinedTypeBuilder;
import org.spdx.library.model.v3.core.DefinedType;
import org.spdx.library.model.v3.core.DictionaryEntry.DictionaryEntryBuilder;
import org.spdx.library.model.v3.core.DictionaryEntry;
import org.spdx.library.model.v3.core.Element.ElementBuilder;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.ElementCollection.ElementCollectionBuilder;
import org.spdx.library.model.v3.core.ElementCollection;
import org.spdx.library.model.v3.core.ElementMap.ElementMapBuilder;
import org.spdx.library.model.v3.core.ElementMap;
import org.spdx.library.model.v3.core.ExternalIdentifier.ExternalIdentifierBuilder;
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalIdentifierType;
import org.spdx.library.model.v3.core.ExternalMap.ExternalMapBuilder;
import org.spdx.library.model.v3.core.ExternalMap;
import org.spdx.library.model.v3.core.ExternalRef.ExternalRefBuilder;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.ExternalRefType;
import org.spdx.library.model.v3.core.Hash.HashBuilder;
import org.spdx.library.model.v3.core.Hash;
import org.spdx.library.model.v3.core.HashAlgorithm;
import org.spdx.library.model.v3.core.IndividualElement.IndividualElementBuilder;
import org.spdx.library.model.v3.core.IntegrityMethod.IntegrityMethodBuilder;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.IsoAutomationLevel;
import org.spdx.library.model.v3.core.LifecycleScopeType;
import org.spdx.library.model.v3.core.LifecycleScopedRelationship.LifecycleScopedRelationshipBuilder;
import org.spdx.library.model.v3.core.Location.LocationBuilder;
import org.spdx.library.model.v3.core.Location;
import org.spdx.library.model.v3.core.MeasureOfLength.MeasureOfLengthBuilder;
import org.spdx.library.model.v3.core.MeasureOfLength;
import org.spdx.library.model.v3.core.MeasureOfMass.MeasureOfMassBuilder;
import org.spdx.library.model.v3.core.MeasureOfMass;
import org.spdx.library.model.v3.core.NamespaceMap.NamespaceMapBuilder;
import org.spdx.library.model.v3.core.NamespaceMap;
import org.spdx.library.model.v3.core.Organization.OrganizationBuilder;
import org.spdx.library.model.v3.core.PackageVerificationCode.PackageVerificationCodeBuilder;
import org.spdx.library.model.v3.core.Person.PersonBuilder;
import org.spdx.library.model.v3.core.PhysicalLocation.PhysicalLocationBuilder;
import org.spdx.library.model.v3.core.PositiveIntegerRange.PositiveIntegerRangeBuilder;
import org.spdx.library.model.v3.core.PositiveIntegerRange;
import org.spdx.library.model.v3.core.PresenceType;
import org.spdx.library.model.v3.core.ProcessReadinessType;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.core.Regulation.RegulationBuilder;
import org.spdx.library.model.v3.core.Relationship.RelationshipBuilder;
import org.spdx.library.model.v3.core.RelationshipCompleteness;
import org.spdx.library.model.v3.core.RelationshipType;
import org.spdx.library.model.v3.core.Requirement.RequirementBuilder;
import org.spdx.library.model.v3.core.SoftwareAgent.SoftwareAgentBuilder;
import org.spdx.library.model.v3.core.SpdxDocument.SpdxDocumentBuilder;
import org.spdx.library.model.v3.core.Specification.SpecificationBuilder;
import org.spdx.library.model.v3.core.Specification;
import org.spdx.library.model.v3.core.SpecificationType;
import org.spdx.library.model.v3.core.SupportRelationship.SupportRelationshipBuilder;
import org.spdx.library.model.v3.core.SupportType;
import org.spdx.library.model.v3.core.Tool.ToolBuilder;
import org.spdx.library.model.v3.core.Tool;
import org.spdx.library.model.v3.core.UnitOfMeasure.UnitOfMeasureBuilder;
import org.spdx.library.model.v3.core.UnitOfMeasure;
import org.spdx.library.model.v3.dataset.ConfidentialityLevelType;
import org.spdx.library.model.v3.dataset.DatasetAvailabilityType;
import org.spdx.library.model.v3.dataset.DatasetPackage.DatasetPackageBuilder;
import org.spdx.library.model.v3.dataset.DatasetType;
import org.spdx.library.model.v3.expandedlicensing.ConjunctiveLicenseSet.ConjunctiveLicenseSetBuilder;
import org.spdx.library.model.v3.expandedlicensing.CustomLicense.CustomLicenseBuilder;
import org.spdx.library.model.v3.expandedlicensing.CustomLicenseAddition.CustomLicenseAdditionBuilder;
import org.spdx.library.model.v3.expandedlicensing.DisjunctiveLicenseSet.DisjunctiveLicenseSetBuilder;
import org.spdx.library.model.v3.expandedlicensing.ExtendableLicense.ExtendableLicenseBuilder;
import org.spdx.library.model.v3.expandedlicensing.ExtendableLicense;
import org.spdx.library.model.v3.expandedlicensing.IndividualLicensingInfo.IndividualLicensingInfoBuilder;
import org.spdx.library.model.v3.expandedlicensing.License.LicenseBuilder;
import org.spdx.library.model.v3.expandedlicensing.License;
import org.spdx.library.model.v3.expandedlicensing.LicenseAddition.LicenseAdditionBuilder;
import org.spdx.library.model.v3.expandedlicensing.LicenseAddition;
import org.spdx.library.model.v3.expandedlicensing.ListedLicense.ListedLicenseBuilder;
import org.spdx.library.model.v3.expandedlicensing.ListedLicenseException.ListedLicenseExceptionBuilder;
import org.spdx.library.model.v3.expandedlicensing.OrLaterOperator.OrLaterOperatorBuilder;
import org.spdx.library.model.v3.expandedlicensing.WithAdditionOperator.WithAdditionOperatorBuilder;
import org.spdx.library.model.v3.extension.CdxPropertiesExtension.CdxPropertiesExtensionBuilder;
import org.spdx.library.model.v3.extension.CdxPropertyEntry.CdxPropertyEntryBuilder;
import org.spdx.library.model.v3.extension.CdxPropertyEntry;
import org.spdx.library.model.v3.extension.Extension.ExtensionBuilder;
import org.spdx.library.model.v3.extension.Extension;
import org.spdx.library.model.v3.functionalsafety.EvaluationResult.EvaluationResultBuilder;
import org.spdx.library.model.v3.functionalsafety.EvaluationResultType;
import org.spdx.library.model.v3.functionalsafety.EvidenceRelationship.EvidenceRelationshipBuilder;
import org.spdx.library.model.v3.functionalsafety.EvidenceType;
import org.spdx.library.model.v3.functionalsafety.RequirementVerification.RequirementVerificationBuilder;
import org.spdx.library.model.v3.functionalsafety.RequirementVerification;
import org.spdx.library.model.v3.functionalsafety.VerificationType;
import org.spdx.library.model.v3.hardware.BulkHardware.BulkHardwareBuilder;
import org.spdx.library.model.v3.hardware.Dimensions.DimensionsBuilder;
import org.spdx.library.model.v3.hardware.Dimensions;
import org.spdx.library.model.v3.hardware.Hardware.HardwareBuilder;
import org.spdx.library.model.v3.hardware.Hardware;
import org.spdx.library.model.v3.hardware.PhysicalHardware.PhysicalHardwareBuilder;
import org.spdx.library.model.v3.hardware.ProductSpecification.ProductSpecificationBuilder;
import org.spdx.library.model.v3.hardware.VirtualHardware.VirtualHardwareBuilder;
import org.spdx.library.model.v3.hardware.VirtualHardwareModelType;
import org.spdx.library.model.v3.operations.ExportControlClassification.ExportControlClassificationBuilder;
import org.spdx.library.model.v3.operations.ExportControlClassification;
import org.spdx.library.model.v3.operations.ExportControlClassificationAssessment.ExportControlClassificationAssessmentBuilder;
import org.spdx.library.model.v3.operations.Project.ProjectBuilder;
import org.spdx.library.model.v3.operations.Project;
import org.spdx.library.model.v3.security.CvssSeverityType;
import org.spdx.library.model.v3.security.CvssV2VulnAssessmentRelationship.CvssV2VulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3.security.CvssV3VulnAssessmentRelationship.CvssV3VulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3.security.CvssV4VulnAssessmentRelationship.CvssV4VulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3.security.EpssVulnAssessmentRelationship.EpssVulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3.security.ExploitCatalogType;
import org.spdx.library.model.v3.security.ExploitCatalogVulnAssessmentRelationship.ExploitCatalogVulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3.security.SsvcDecisionType;
import org.spdx.library.model.v3.security.SsvcVulnAssessmentRelationship.SsvcVulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3.security.VexAffectedVulnAssessmentRelationship.VexAffectedVulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3.security.VexFixedVulnAssessmentRelationship.VexFixedVulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3.security.VexJustificationType;
import org.spdx.library.model.v3.security.VexNotAffectedVulnAssessmentRelationship.VexNotAffectedVulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3.security.VexUnderInvestigationVulnAssessmentRelationship.VexUnderInvestigationVulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3.security.VexVulnAssessmentRelationship.VexVulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3.security.VexVulnAssessmentRelationship;
import org.spdx.library.model.v3.security.VulnAssessmentRelationship.VulnAssessmentRelationshipBuilder;
import org.spdx.library.model.v3.security.VulnAssessmentRelationship;
import org.spdx.library.model.v3.security.Vulnerability.VulnerabilityBuilder;
import org.spdx.library.model.v3.service.AuthenticationProtocolType;
import org.spdx.library.model.v3.service.SoftwareService.SoftwareServiceBuilder;
import org.spdx.library.model.v3.simplelicensing.AnyLicenseInfo.AnyLicenseInfoBuilder;
import org.spdx.library.model.v3.simplelicensing.AnyLicenseInfo;
import org.spdx.library.model.v3.simplelicensing.LicenseExpression.LicenseExpressionBuilder;
import org.spdx.library.model.v3.simplelicensing.SimpleLicensingText.SimpleLicensingTextBuilder;
import org.spdx.library.model.v3.software.ContentIdentifier.ContentIdentifierBuilder;
import org.spdx.library.model.v3.software.ContentIdentifier;
import org.spdx.library.model.v3.software.ContentIdentifierType;
import org.spdx.library.model.v3.software.FileKindType;
import org.spdx.library.model.v3.software.Sbom.SbomBuilder;
import org.spdx.library.model.v3.software.SbomType;
import org.spdx.library.model.v3.software.Snippet.SnippetBuilder;
import org.spdx.library.model.v3.software.SoftwareArtifact.SoftwareArtifactBuilder;
import org.spdx.library.model.v3.software.SoftwareArtifact;
import org.spdx.library.model.v3.software.SoftwarePurpose;
import org.spdx.library.model.v3.software.SpdxFile.SpdxFileBuilder;
import org.spdx.library.model.v3.software.SpdxFile;
import org.spdx.library.model.v3.software.SpdxPackage.SpdxPackageBuilder;
import org.spdx.library.model.v3.supplychain.AssemblyAction.AssemblyActionBuilder;
import org.spdx.library.model.v3.supplychain.AssemblyProcess.AssemblyProcessBuilder;
import org.spdx.library.model.v3.supplychain.BoundaryCrossingAction.BoundaryCrossingActionBuilder;
import org.spdx.library.model.v3.supplychain.BoundaryDefinitionAction.BoundaryDefinitionActionBuilder;
import org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess.BoundaryDefinitionProcessBuilder;
import org.spdx.library.model.v3.supplychain.ChangeAction.ChangeActionBuilder;
import org.spdx.library.model.v3.supplychain.ChangeProcess.ChangeProcessBuilder;
import org.spdx.library.model.v3.supplychain.CreateAction.CreateActionBuilder;
import org.spdx.library.model.v3.supplychain.CreateProcess.CreateProcessBuilder;
import org.spdx.library.model.v3.supplychain.DefinedStateProcess.DefinedStateProcessBuilder;
import org.spdx.library.model.v3.supplychain.DefinedStateProcess;
import org.spdx.library.model.v3.supplychain.DestroyAction.DestroyActionBuilder;
import org.spdx.library.model.v3.supplychain.DestroyProcess.DestroyProcessBuilder;
import org.spdx.library.model.v3.supplychain.HarvestAction.HarvestActionBuilder;
import org.spdx.library.model.v3.supplychain.HarvestProcess.HarvestProcessBuilder;
import org.spdx.library.model.v3.supplychain.InspectionAction.InspectionActionBuilder;
import org.spdx.library.model.v3.supplychain.InspectionProcess.InspectionProcessBuilder;
import org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess.InstantiateVirtualHardwareProcessBuilder;
import org.spdx.library.model.v3.supplychain.ManufactureAction.ManufactureActionBuilder;
import org.spdx.library.model.v3.supplychain.ManufactureProcess.ManufactureProcessBuilder;
import org.spdx.library.model.v3.supplychain.ModifyAction.ModifyActionBuilder;
import org.spdx.library.model.v3.supplychain.ModifyProcess.ModifyProcessBuilder;
import org.spdx.library.model.v3.supplychain.OutOfSpecAction.OutOfSpecActionBuilder;
import org.spdx.library.model.v3.supplychain.PlanAction.PlanActionBuilder;
import org.spdx.library.model.v3.supplychain.PlanProcess.PlanProcessBuilder;
import org.spdx.library.model.v3.supplychain.ReproduceAction.ReproduceActionBuilder;
import org.spdx.library.model.v3.supplychain.ReproduceProcess.ReproduceProcessBuilder;
import org.spdx.library.model.v3.supplychain.ResolutionAction.ResolutionActionBuilder;
import org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction.ResponsibilityChangeActionBuilder;
import org.spdx.library.model.v3.supplychain.ResponsibilityChangeProcess.ResponsibilityChangeProcessBuilder;
import org.spdx.library.model.v3.supplychain.ResponsibilityType;
import org.spdx.library.model.v3.supplychain.State.StateBuilder;
import org.spdx.library.model.v3.supplychain.State;
import org.spdx.library.model.v3.supplychain.StateAction.StateActionBuilder;
import org.spdx.library.model.v3.supplychain.StorageAction.StorageActionBuilder;
import org.spdx.library.model.v3.supplychain.StorageProcess.StorageProcessBuilder;
import org.spdx.library.model.v3.supplychain.TestAction.TestActionBuilder;
import org.spdx.library.model.v3.supplychain.TestProcess.TestProcessBuilder;
import org.spdx.library.model.v3.supplychain.TransportAction.TransportActionBuilder;
import org.spdx.library.model.v3.supplychain.TransportProcess.TransportProcessBuilder;
import org.spdx.library.model.v3.supplychain.UseAction.UseActionBuilder;
import org.spdx.library.model.v3.supplychain.UseProcess.UseProcessBuilder;
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
		MOCK_TYPE_TO_CLASS.put("MockElementCollection", MockElementCollection.class);
		MOCK_TYPE_TO_CLASS.put("MockHardware", MockHardware.class);
		MOCK_TYPE_TO_CLASS.put("MockAction", MockAction.class);
		MOCK_TYPE_TO_CLASS.put("MockLocation", MockLocation.class);
		MOCK_TYPE_TO_CLASS.put("MockLicenseAddition", MockLicenseAddition.class);
		MOCK_TYPE_TO_CLASS.put("MockVulnAssessmentRelationship", MockVulnAssessmentRelationship.class);
		MOCK_TYPE_TO_CLASS.put("MockSoftwareArtifact", MockSoftwareArtifact.class);
		MOCK_TYPE_TO_CLASS.put("MockLicense", MockLicense.class);
		MOCK_TYPE_TO_CLASS.put("MockElement", MockElement.class);
		MOCK_TYPE_TO_CLASS.put("MockArtifact", MockArtifact.class);
		MOCK_TYPE_TO_CLASS.put("MockDefinedProcess", MockDefinedProcess.class);
		MOCK_TYPE_TO_CLASS.put("MockVexVulnAssessmentRelationship", MockVexVulnAssessmentRelationship.class);
		MOCK_TYPE_TO_CLASS.put("MockIntegrityMethod", MockIntegrityMethod.class);
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
			 * Adds a rootElement to the initial collection
			 * @param rootElement rootElement to add
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
			 * @param rootElementCollection collection to initialize the rootElement
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addAllRootElement(Collection<Element> rootElementCollection) {
				if (Objects.nonNull(rootElementCollection)) {
					rootElements.addAll(rootElementCollection);
				}
				return this;
			}
				/**
			 * Adds a verifiedUsing to the initial collection
			 * @param verifiedUsing verifiedUsing to add
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
			 * @param verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a externalRef to the initial collection
			 * @param externalRef externalRef to add
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
			 * @param externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					super.externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
				/**
			 * Adds a externalIdentifier to the initial collection
			 * @param externalIdentifier externalIdentifier to add
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
			 * @param externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
				/**
			 * Adds a element to the initial collection
			 * @param element element to add
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
			 * @param elementCollection collection to initialize the element
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addAllElement(Collection<Element> elementCollection) {
				if (Objects.nonNull(elementCollection)) {
					elements.addAll(elementCollection);
				}
				return this;
			}
				/**
			 * Adds a extension to the initial collection
			 * @param extension extension to add
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
			 * @param extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
			
			/**
			 * Adds a profileConformance to the initial collection
			 * @param profileConformance profileConformance to add
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
			 * @param profileConformanceCollection collection to initialize the profileConformance
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
			 * @param creationInfo value to set
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @param description value to set
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @param comment value to set
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @param name value to set
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder setName(String name) {
				super.name = name;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @param summary value to set
			 * @return this for chaining
			**/
			public MockElementCollectionBuilder setSummary(String summary) {
				super.summary = summary;
				return this;
			}
		}
	}
	static class MockHardware extends Hardware {

		/**
		 * @param builder superclass builder
		 * @throws InvalidSPDXAnalysisException on error
		 */
		protected MockHardware(HardwareBuilder builder)
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
		public MockHardware(IModelStore modelStore, String objectUri, IModelCopyManager copyManager,
				boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
		}
		
		/* (non-Javadoc)
		 * @see org.spdx.library.core.CoreModelObject#getType()
		 */
		@Override
		public String getType() {
			return "MockHardware";
		}		
		
		static class MockHardwareBuilder extends HardwareBuilder {

			/**
			 * @param modelStore store for the built object
			 * @param objectUri uri for the built object
			 * @param copyManager optional copyManager
			 */
			public MockHardwareBuilder(IModelStore modelStore,
					String objectUri, IModelCopyManager copyManager) {
				super(modelStore, objectUri, copyManager);
			}

			@Override
			public Hardware build() throws InvalidSPDXAnalysisException {
				return new MockHardware(this);
			}
			
				/**
			 * Adds a externalRef to the initial collection
			 * @param externalRef externalRef to add
			 * @return this for chaining
			**/
			public MockHardwareBuilder addExternalRef(ExternalRef externalRef) {
				if (Objects.nonNull(externalRef)) {
					super.externalRefs.add(externalRef);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalRef collection
			 * @param externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockHardwareBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					super.externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
				/**
			 * Adds a HardwareAdditionalInformation to the initial collection
			 * @param HardwareAdditionalInformation HardwareAdditionalInformation to add
			 * @return this for chaining
			**/
			public MockHardwareBuilder addHardwareAdditionalInformation(DictionaryEntry HardwareAdditionalInformation) {
				if (Objects.nonNull(HardwareAdditionalInformation)) {
					HardwareAdditionalInformations.add(HardwareAdditionalInformation);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial HardwareAdditionalInformation collection
			 * @param HardwareAdditionalInformationCollection collection to initialize the HardwareAdditionalInformation
			 * @return this for chaining
			**/
			public MockHardwareBuilder addAllHardwareAdditionalInformation(Collection<DictionaryEntry> HardwareAdditionalInformationCollection) {
				if (Objects.nonNull(HardwareAdditionalInformationCollection)) {
					HardwareAdditionalInformations.addAll(HardwareAdditionalInformationCollection);
				}
				return this;
			}
				/**
			 * Adds a additionalInformationSpecification to the initial collection
			 * @param additionalInformationSpecification additionalInformationSpecification to add
			 * @return this for chaining
			**/
			public MockHardwareBuilder addAdditionalInformationSpecification(Specification additionalInformationSpecification) {
				if (Objects.nonNull(additionalInformationSpecification)) {
					additionalInformationSpecifications.add(additionalInformationSpecification);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial additionalInformationSpecification collection
			 * @param additionalInformationSpecificationCollection collection to initialize the additionalInformationSpecification
			 * @return this for chaining
			**/
			public MockHardwareBuilder addAllAdditionalInformationSpecification(Collection<Specification> additionalInformationSpecificationCollection) {
				if (Objects.nonNull(additionalInformationSpecificationCollection)) {
					additionalInformationSpecifications.addAll(additionalInformationSpecificationCollection);
				}
				return this;
			}
				/**
			 * Adds a hazard to the initial collection
			 * @param hazard hazard to add
			 * @return this for chaining
			**/
			public MockHardwareBuilder addHazard(DefinedType hazard) {
				if (Objects.nonNull(hazard)) {
					hazards.add(hazard);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial hazard collection
			 * @param hazardCollection collection to initialize the hazard
			 * @return this for chaining
			**/
			public MockHardwareBuilder addAllHazard(Collection<DefinedType> hazardCollection) {
				if (Objects.nonNull(hazardCollection)) {
					hazards.addAll(hazardCollection);
				}
				return this;
			}
				/**
			 * Adds a category to the initial collection
			 * @param category category to add
			 * @return this for chaining
			**/
			public MockHardwareBuilder addCategory(DefinedType category) {
				if (Objects.nonNull(category)) {
					categorys.add(category);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial category collection
			 * @param categoryCollection collection to initialize the category
			 * @return this for chaining
			**/
			public MockHardwareBuilder addAllCategory(Collection<DefinedType> categoryCollection) {
				if (Objects.nonNull(categoryCollection)) {
					categorys.addAll(categoryCollection);
				}
				return this;
			}
				/**
			 * Adds a verifiedUsing to the initial collection
			 * @param verifiedUsing verifiedUsing to add
			 * @return this for chaining
			**/
			public MockHardwareBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
				if (Objects.nonNull(verifiedUsing)) {
					super.verifiedUsings.add(verifiedUsing);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial verifiedUsing collection
			 * @param verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockHardwareBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a originatedBy to the initial collection
			 * @param originatedBy originatedBy to add
			 * @return this for chaining
			**/
			public MockHardwareBuilder addOriginatedBy(Agent originatedBy) {
				if (Objects.nonNull(originatedBy)) {
					super.originatedBys.add(originatedBy);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial originatedBy collection
			 * @param originatedByCollection collection to initialize the originatedBy
			 * @return this for chaining
			**/
			public MockHardwareBuilder addAllOriginatedBy(Collection<Agent> originatedByCollection) {
				if (Objects.nonNull(originatedByCollection)) {
					super.originatedBys.addAll(originatedByCollection);
				}
				return this;
			}
				/**
			 * Adds a externalIdentifier to the initial collection
			 * @param externalIdentifier externalIdentifier to add
			 * @return this for chaining
			**/
			public MockHardwareBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
				if (Objects.nonNull(externalIdentifier)) {
					super.externalIdentifiers.add(externalIdentifier);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalIdentifier collection
			 * @param externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockHardwareBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
				/**
			 * Adds a extension to the initial collection
			 * @param extension extension to add
			 * @return this for chaining
			**/
			public MockHardwareBuilder addExtension(Extension extension) {
				if (Objects.nonNull(extension)) {
					super.extensions.add(extension);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial extension collection
			 * @param extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockHardwareBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
			
			/**
			 * Adds a supportLevel to the initial collection
			 * @param supportLevel supportLevel to add
			 * @return this for chaining
			**/
			public MockHardwareBuilder addSupportLevel(SupportType supportLevel) {
				if (Objects.nonNull(supportLevel)) {
					super.supportLevels.add(supportLevel);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial supportLevel collection
			 * @param supportLevelCollection collection to initialize the supportLevel
			 * @return this for chaining
			**/
			public MockHardwareBuilder addAllSupportLevel(Collection<SupportType> supportLevelCollection) {
				if (Objects.nonNull(supportLevelCollection)) {
					super.supportLevels.addAll(supportLevelCollection);
				}
				return this;
			}
			
			/**
			 * Adds a standardName to the initial collection
			 * @param standardName standardName to add
			 * @return this for chaining
			**/
			public MockHardwareBuilder addStandardName(String standardName) {
				if (Objects.nonNull(standardName)) {
					super.standardNames.add(standardName);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial standardName collection
			 * @param standardNameCollection collection to initialize the standardName
			 * @return this for chaining
			**/
			public MockHardwareBuilder addAllStandardName(Collection<String> standardNameCollection) {
				if (Objects.nonNull(standardNameCollection)) {
					super.standardNames.addAll(standardNameCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of productAgent
			 * @param productAgent value to set
			 * @return this for chaining
			**/
			public MockHardwareBuilder setProductAgent(Agent productAgent) {
				this.productAgent = productAgent;
				return this;
			}
			
			/**
			 * Sets the initial value of suppliedBy
			 * @param suppliedBy value to set
			 * @return this for chaining
			**/
			public MockHardwareBuilder setSuppliedBy(Agent suppliedBy) {
				super.suppliedBy = suppliedBy;
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @param creationInfo value to set
			 * @return this for chaining
			**/
			public MockHardwareBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of batchNumber
			 * @param batchNumber value to set
			 * @return this for chaining
			**/
			public MockHardwareBuilder setBatchNumber(String batchNumber) {
				this.batchNumber = batchNumber;
				return this;
			}
			
			/**
			 * Sets the initial value of serialNumber
			 * @param serialNumber value to set
			 * @return this for chaining
			**/
			public MockHardwareBuilder setSerialNumber(String serialNumber) {
				this.serialNumber = serialNumber;
				return this;
			}
			
			/**
			 * Sets the initial value of intendedUse
			 * @param intendedUse value to set
			 * @return this for chaining
			**/
			public MockHardwareBuilder setIntendedUse(String intendedUse) {
				super.intendedUse = intendedUse;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @param description value to set
			 * @return this for chaining
			**/
			public MockHardwareBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of builtTime
			 * @param builtTime value to set
			 * @return this for chaining
			**/
			public MockHardwareBuilder setBuiltTime(String builtTime) {
				super.builtTime = builtTime;
				return this;
			}
			
			/**
			 * Sets the initial value of partNumber
			 * @param partNumber value to set
			 * @return this for chaining
			**/
			public MockHardwareBuilder setPartNumber(String partNumber) {
				this.partNumber = partNumber;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @param comment value to set
			 * @return this for chaining
			**/
			public MockHardwareBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of validUntilTime
			 * @param validUntilTime value to set
			 * @return this for chaining
			**/
			public MockHardwareBuilder setValidUntilTime(String validUntilTime) {
				super.validUntilTime = validUntilTime;
				return this;
			}
			
			/**
			 * Sets the initial value of releaseDate
			 * @param releaseDate value to set
			 * @return this for chaining
			**/
			public MockHardwareBuilder setReleaseDate(String releaseDate) {
				this.releaseDate = releaseDate;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @param name value to set
			 * @return this for chaining
			**/
			public MockHardwareBuilder setName(String name) {
				super.name = name;
				return this;
			}
			
			/**
			 * Sets the initial value of hardwareVersion
			 * @param hardwareVersion value to set
			 * @return this for chaining
			**/
			public MockHardwareBuilder setHardwareVersion(String hardwareVersion) {
				this.hardwareVersion = hardwareVersion;
				return this;
			}
			
			/**
			 * Sets the initial value of releaseTime
			 * @param releaseTime value to set
			 * @return this for chaining
			**/
			public MockHardwareBuilder setReleaseTime(String releaseTime) {
				super.releaseTime = releaseTime;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @param summary value to set
			 * @return this for chaining
			**/
			public MockHardwareBuilder setSummary(String summary) {
				super.summary = summary;
				return this;
			}
		}
	}
	static class MockAction extends Action {

		/**
		 * @param builder superclass builder
		 * @throws InvalidSPDXAnalysisException on error
		 */
		protected MockAction(ActionBuilder builder)
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
		public MockAction(IModelStore modelStore, String objectUri, IModelCopyManager copyManager,
				boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
		}
		
		/* (non-Javadoc)
		 * @see org.spdx.library.core.CoreModelObject#getType()
		 */
		@Override
		public String getType() {
			return "MockAction";
		}		
		
		static class MockActionBuilder extends ActionBuilder {

			/**
			 * @param modelStore store for the built object
			 * @param objectUri uri for the built object
			 * @param copyManager optional copyManager
			 */
			public MockActionBuilder(IModelStore modelStore,
					String objectUri, IModelCopyManager copyManager) {
				super(modelStore, objectUri, copyManager);
			}

			@Override
			public Action build() throws InvalidSPDXAnalysisException {
				return new MockAction(this);
			}
			
				/**
			 * Adds a actionLocation to the initial collection
			 * @param actionLocation actionLocation to add
			 * @return this for chaining
			**/
			public MockActionBuilder addActionLocation(Location actionLocation) {
				if (Objects.nonNull(actionLocation)) {
					actionLocations.add(actionLocation);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial actionLocation collection
			 * @param actionLocationCollection collection to initialize the actionLocation
			 * @return this for chaining
			**/
			public MockActionBuilder addAllActionLocation(Collection<Location> actionLocationCollection) {
				if (Objects.nonNull(actionLocationCollection)) {
					actionLocations.addAll(actionLocationCollection);
				}
				return this;
			}
				/**
			 * Adds a verifiedUsing to the initial collection
			 * @param verifiedUsing verifiedUsing to add
			 * @return this for chaining
			**/
			public MockActionBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
				if (Objects.nonNull(verifiedUsing)) {
					super.verifiedUsings.add(verifiedUsing);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial verifiedUsing collection
			 * @param verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockActionBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a externalRef to the initial collection
			 * @param externalRef externalRef to add
			 * @return this for chaining
			**/
			public MockActionBuilder addExternalRef(ExternalRef externalRef) {
				if (Objects.nonNull(externalRef)) {
					super.externalRefs.add(externalRef);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalRef collection
			 * @param externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockActionBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					super.externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
				/**
			 * Adds a originatedBy to the initial collection
			 * @param originatedBy originatedBy to add
			 * @return this for chaining
			**/
			public MockActionBuilder addOriginatedBy(Agent originatedBy) {
				if (Objects.nonNull(originatedBy)) {
					super.originatedBys.add(originatedBy);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial originatedBy collection
			 * @param originatedByCollection collection to initialize the originatedBy
			 * @return this for chaining
			**/
			public MockActionBuilder addAllOriginatedBy(Collection<Agent> originatedByCollection) {
				if (Objects.nonNull(originatedByCollection)) {
					super.originatedBys.addAll(originatedByCollection);
				}
				return this;
			}
				/**
			 * Adds a externalIdentifier to the initial collection
			 * @param externalIdentifier externalIdentifier to add
			 * @return this for chaining
			**/
			public MockActionBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
				if (Objects.nonNull(externalIdentifier)) {
					super.externalIdentifiers.add(externalIdentifier);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalIdentifier collection
			 * @param externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockActionBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
				/**
			 * Adds a additionalInformation to the initial collection
			 * @param additionalInformation additionalInformation to add
			 * @return this for chaining
			**/
			public MockActionBuilder addAdditionalInformation(DictionaryEntry additionalInformation) {
				if (Objects.nonNull(additionalInformation)) {
					additionalInformations.add(additionalInformation);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial additionalInformation collection
			 * @param additionalInformationCollection collection to initialize the additionalInformation
			 * @return this for chaining
			**/
			public MockActionBuilder addAllAdditionalInformation(Collection<DictionaryEntry> additionalInformationCollection) {
				if (Objects.nonNull(additionalInformationCollection)) {
					additionalInformations.addAll(additionalInformationCollection);
				}
				return this;
			}
				/**
			 * Adds a extension to the initial collection
			 * @param extension extension to add
			 * @return this for chaining
			**/
			public MockActionBuilder addExtension(Extension extension) {
				if (Objects.nonNull(extension)) {
					super.extensions.add(extension);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial extension collection
			 * @param extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockActionBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
			
			/**
			 * Adds a supportLevel to the initial collection
			 * @param supportLevel supportLevel to add
			 * @return this for chaining
			**/
			public MockActionBuilder addSupportLevel(SupportType supportLevel) {
				if (Objects.nonNull(supportLevel)) {
					super.supportLevels.add(supportLevel);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial supportLevel collection
			 * @param supportLevelCollection collection to initialize the supportLevel
			 * @return this for chaining
			**/
			public MockActionBuilder addAllSupportLevel(Collection<SupportType> supportLevelCollection) {
				if (Objects.nonNull(supportLevelCollection)) {
					super.supportLevels.addAll(supportLevelCollection);
				}
				return this;
			}
			
			/**
			 * Adds a standardName to the initial collection
			 * @param standardName standardName to add
			 * @return this for chaining
			**/
			public MockActionBuilder addStandardName(String standardName) {
				if (Objects.nonNull(standardName)) {
					super.standardNames.add(standardName);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial standardName collection
			 * @param standardNameCollection collection to initialize the standardName
			 * @return this for chaining
			**/
			public MockActionBuilder addAllStandardName(Collection<String> standardNameCollection) {
				if (Objects.nonNull(standardNameCollection)) {
					super.standardNames.addAll(standardNameCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of suppliedBy
			 * @param suppliedBy value to set
			 * @return this for chaining
			**/
			public MockActionBuilder setSuppliedBy(Agent suppliedBy) {
				super.suppliedBy = suppliedBy;
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @param creationInfo value to set
			 * @return this for chaining
			**/
			public MockActionBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of intendedUse
			 * @param intendedUse value to set
			 * @return this for chaining
			**/
			public MockActionBuilder setIntendedUse(String intendedUse) {
				super.intendedUse = intendedUse;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @param description value to set
			 * @return this for chaining
			**/
			public MockActionBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of builtTime
			 * @param builtTime value to set
			 * @return this for chaining
			**/
			public MockActionBuilder setBuiltTime(String builtTime) {
				super.builtTime = builtTime;
				return this;
			}
			
			/**
			 * Sets the initial value of actionEndTime
			 * @param actionEndTime value to set
			 * @return this for chaining
			**/
			public MockActionBuilder setActionEndTime(String actionEndTime) {
				this.actionEndTime = actionEndTime;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @param comment value to set
			 * @return this for chaining
			**/
			public MockActionBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of validUntilTime
			 * @param validUntilTime value to set
			 * @return this for chaining
			**/
			public MockActionBuilder setValidUntilTime(String validUntilTime) {
				super.validUntilTime = validUntilTime;
				return this;
			}
			
			/**
			 * Sets the initial value of releaseTime
			 * @param releaseTime value to set
			 * @return this for chaining
			**/
			public MockActionBuilder setReleaseTime(String releaseTime) {
				super.releaseTime = releaseTime;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @param name value to set
			 * @return this for chaining
			**/
			public MockActionBuilder setName(String name) {
				super.name = name;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @param summary value to set
			 * @return this for chaining
			**/
			public MockActionBuilder setSummary(String summary) {
				super.summary = summary;
				return this;
			}
			
			/**
			 * Sets the initial value of actionStartTime
			 * @param actionStartTime value to set
			 * @return this for chaining
			**/
			public MockActionBuilder setActionStartTime(String actionStartTime) {
				this.actionStartTime = actionStartTime;
				return this;
			}
		}
	}
	static class MockLocation extends Location {

		/**
		 * @param builder superclass builder
		 * @throws InvalidSPDXAnalysisException on error
		 */
		protected MockLocation(LocationBuilder builder)
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
		public MockLocation(IModelStore modelStore, String objectUri, IModelCopyManager copyManager,
				boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
		}
		
		/* (non-Javadoc)
		 * @see org.spdx.library.core.CoreModelObject#getType()
		 */
		@Override
		public String getType() {
			return "MockLocation";
		}		
		
		static class MockLocationBuilder extends LocationBuilder {

			/**
			 * @param modelStore store for the built object
			 * @param objectUri uri for the built object
			 * @param copyManager optional copyManager
			 */
			public MockLocationBuilder(IModelStore modelStore,
					String objectUri, IModelCopyManager copyManager) {
				super(modelStore, objectUri, copyManager);
			}

			@Override
			public Location build() throws InvalidSPDXAnalysisException {
				return new MockLocation(this);
			}
			
				/**
			 * Adds a externalIdentifier to the initial collection
			 * @param externalIdentifier externalIdentifier to add
			 * @return this for chaining
			**/
			public MockLocationBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
				if (Objects.nonNull(externalIdentifier)) {
					super.externalIdentifiers.add(externalIdentifier);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalIdentifier collection
			 * @param externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockLocationBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
				/**
			 * Adds a verifiedUsing to the initial collection
			 * @param verifiedUsing verifiedUsing to add
			 * @return this for chaining
			**/
			public MockLocationBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
				if (Objects.nonNull(verifiedUsing)) {
					super.verifiedUsings.add(verifiedUsing);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial verifiedUsing collection
			 * @param verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockLocationBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a extension to the initial collection
			 * @param extension extension to add
			 * @return this for chaining
			**/
			public MockLocationBuilder addExtension(Extension extension) {
				if (Objects.nonNull(extension)) {
					super.extensions.add(extension);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial extension collection
			 * @param extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockLocationBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
				/**
			 * Adds a externalRef to the initial collection
			 * @param externalRef externalRef to add
			 * @return this for chaining
			**/
			public MockLocationBuilder addExternalRef(ExternalRef externalRef) {
				if (Objects.nonNull(externalRef)) {
					super.externalRefs.add(externalRef);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalRef collection
			 * @param externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockLocationBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					super.externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @param creationInfo value to set
			 * @return this for chaining
			**/
			public MockLocationBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @param description value to set
			 * @return this for chaining
			**/
			public MockLocationBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of locationTime
			 * @param locationTime value to set
			 * @return this for chaining
			**/
			public MockLocationBuilder setLocationTime(String locationTime) {
				this.locationTime = locationTime;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @param comment value to set
			 * @return this for chaining
			**/
			public MockLocationBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @param name value to set
			 * @return this for chaining
			**/
			public MockLocationBuilder setName(String name) {
				super.name = name;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @param summary value to set
			 * @return this for chaining
			**/
			public MockLocationBuilder setSummary(String summary) {
				super.summary = summary;
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
			 * Adds a verifiedUsing to the initial collection
			 * @param verifiedUsing verifiedUsing to add
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
			 * @param verifiedUsingCollection collection to initialize the verifiedUsing
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
			 * @param externalRef externalRef to add
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
			 * @param externalRefCollection collection to initialize the externalRef
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
			 * @param externalIdentifier externalIdentifier to add
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
			 * @param externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
				/**
			 * Adds a extension to the initial collection
			 * @param extension extension to add
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
			 * @param extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
			
			/**
			 * Adds a seeAlso to the initial collection
			 * @param seeAlso seeAlso to add
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
			 * @param seeAlsoCollection collection to initialize the seeAlso
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
			 * @param creationInfo value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of isDeprecatedAdditionId
			 * @param isDeprecatedAdditionId value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setIsDeprecatedAdditionId(Boolean isDeprecatedAdditionId) {
				this.isDeprecatedAdditionId = isDeprecatedAdditionId;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @param description value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of obsoletedBy
			 * @param obsoletedBy value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setObsoletedBy(String obsoletedBy) {
				this.obsoletedBy = obsoletedBy;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @param comment value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of licenseXml
			 * @param licenseXml value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setLicenseXml(String licenseXml) {
				this.licenseXml = licenseXml;
				return this;
			}
			
			/**
			 * Sets the initial value of standardAdditionTemplate
			 * @param standardAdditionTemplate value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setStandardAdditionTemplate(String standardAdditionTemplate) {
				this.standardAdditionTemplate = standardAdditionTemplate;
				return this;
			}
			
			/**
			 * Sets the initial value of additionText
			 * @param additionText value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setAdditionText(String additionText) {
				this.additionText = additionText;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @param name value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setName(String name) {
				super.name = name;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @param summary value to set
			 * @return this for chaining
			**/
			public MockLicenseAdditionBuilder setSummary(String summary) {
				super.summary = summary;
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
			 * Adds a verifiedUsing to the initial collection
			 * @param verifiedUsing verifiedUsing to add
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
			 * @param verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a externalRef to the initial collection
			 * @param externalRef externalRef to add
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
			 * @param externalRefCollection collection to initialize the externalRef
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
			 * @param externalIdentifier externalIdentifier to add
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
			 * @param externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
				/**
			 * Adds a extension to the initial collection
			 * @param extension extension to add
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
			 * @param extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
				/**
			 * Adds a to to the initial collection
			 * @param to to to add
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
			 * @param toCollection collection to initialize the to
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder addAllTo(Collection<Element> toCollection) {
				if (Objects.nonNull(toCollection)) {
					super.tos.addAll(toCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of from
			 * @param from value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setFrom(Element from) {
				super.from = from;
				return this;
			}
			
			/**
			 * Sets the initial value of SecurityAssessedElement
			 * @param SecurityAssessedElement value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setSecurityAssessedElement(SoftwareArtifact SecurityAssessedElement) {
				this.SecurityAssessedElement = SecurityAssessedElement;
				return this;
			}
			
			/**
			 * Sets the initial value of suppliedBy
			 * @param suppliedBy value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setSuppliedBy(Agent suppliedBy) {
				this.suppliedBy = suppliedBy;
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @param creationInfo value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of completeness
			 * @param completeness value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setCompleteness(RelationshipCompleteness completeness) {
				super.completeness = completeness;
				return this;
			}
			
			/**
			 * Sets the initial value of relationshipType
			 * @param relationshipType value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setRelationshipType(RelationshipType relationshipType) {
				super.relationshipType = relationshipType;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @param description value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of publishedTime
			 * @param publishedTime value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setPublishedTime(String publishedTime) {
				this.publishedTime = publishedTime;
				return this;
			}
			
			/**
			 * Sets the initial value of startTime
			 * @param startTime value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setStartTime(String startTime) {
				super.startTime = startTime;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @param comment value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of endTime
			 * @param endTime value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setEndTime(String endTime) {
				super.endTime = endTime;
				return this;
			}
			
			/**
			 * Sets the initial value of modifiedTime
			 * @param modifiedTime value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
				return this;
			}
			
			/**
			 * Sets the initial value of withdrawnTime
			 * @param withdrawnTime value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setWithdrawnTime(String withdrawnTime) {
				this.withdrawnTime = withdrawnTime;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @param name value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setName(String name) {
				super.name = name;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @param summary value to set
			 * @return this for chaining
			**/
			public MockVulnAssessmentRelationshipBuilder setSummary(String summary) {
				super.summary = summary;
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
			 * Adds a verifiedUsing to the initial collection
			 * @param verifiedUsing verifiedUsing to add
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
			 * @param verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a externalRef to the initial collection
			 * @param externalRef externalRef to add
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
			 * @param externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					super.externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
				/**
			 * Adds a originatedBy to the initial collection
			 * @param originatedBy originatedBy to add
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
			 * @param originatedByCollection collection to initialize the originatedBy
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllOriginatedBy(Collection<Agent> originatedByCollection) {
				if (Objects.nonNull(originatedByCollection)) {
					super.originatedBys.addAll(originatedByCollection);
				}
				return this;
			}
				/**
			 * Adds a externalIdentifier to the initial collection
			 * @param externalIdentifier externalIdentifier to add
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
			 * @param externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
				/**
			 * Adds a extension to the initial collection
			 * @param extension extension to add
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
			 * @param extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
				/**
			 * Adds a contentIdentifier to the initial collection
			 * @param contentIdentifier contentIdentifier to add
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
			 * @param contentIdentifierCollection collection to initialize the contentIdentifier
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllContentIdentifier(Collection<ContentIdentifier> contentIdentifierCollection) {
				if (Objects.nonNull(contentIdentifierCollection)) {
					contentIdentifiers.addAll(contentIdentifierCollection);
				}
				return this;
			}
			
			/**
			 * Adds a additionalPurpose to the initial collection
			 * @param additionalPurpose additionalPurpose to add
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
			 * @param additionalPurposeCollection collection to initialize the additionalPurpose
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllAdditionalPurpose(Collection<SoftwarePurpose> additionalPurposeCollection) {
				if (Objects.nonNull(additionalPurposeCollection)) {
					additionalPurposes.addAll(additionalPurposeCollection);
				}
				return this;
			}
			
			/**
			 * Adds a supportLevel to the initial collection
			 * @param supportLevel supportLevel to add
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
			 * @param supportLevelCollection collection to initialize the supportLevel
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllSupportLevel(Collection<SupportType> supportLevelCollection) {
				if (Objects.nonNull(supportLevelCollection)) {
					super.supportLevels.addAll(supportLevelCollection);
				}
				return this;
			}
			
			/**
			 * Adds a attributionText to the initial collection
			 * @param attributionText attributionText to add
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
			 * @param attributionTextCollection collection to initialize the attributionText
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
			 * @param standardName standardName to add
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
			 * @param standardNameCollection collection to initialize the standardName
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder addAllStandardName(Collection<String> standardNameCollection) {
				if (Objects.nonNull(standardNameCollection)) {
					super.standardNames.addAll(standardNameCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of suppliedBy
			 * @param suppliedBy value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setSuppliedBy(Agent suppliedBy) {
				super.suppliedBy = suppliedBy;
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @param creationInfo value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of primaryPurpose
			 * @param primaryPurpose value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setPrimaryPurpose(SoftwarePurpose primaryPurpose) {
				this.primaryPurpose = primaryPurpose;
				return this;
			}
			
			/**
			 * Sets the initial value of artifactSize
			 * @param artifactSize value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setArtifactSize(Integer artifactSize) {
				this.artifactSize = artifactSize;
				return this;
			}
			
			/**
			 * Sets the initial value of intendedUse
			 * @param intendedUse value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setIntendedUse(String intendedUse) {
				super.intendedUse = intendedUse;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @param description value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of builtTime
			 * @param builtTime value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setBuiltTime(String builtTime) {
				super.builtTime = builtTime;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @param comment value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of validUntilTime
			 * @param validUntilTime value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setValidUntilTime(String validUntilTime) {
				super.validUntilTime = validUntilTime;
				return this;
			}
			
			/**
			 * Sets the initial value of copyrightText
			 * @param copyrightText value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setCopyrightText(String copyrightText) {
				this.copyrightText = copyrightText;
				return this;
			}
			
			/**
			 * Sets the initial value of releaseTime
			 * @param releaseTime value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setReleaseTime(String releaseTime) {
				super.releaseTime = releaseTime;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @param name value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setName(String name) {
				super.name = name;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @param summary value to set
			 * @return this for chaining
			**/
			public MockSoftwareArtifactBuilder setSummary(String summary) {
				super.summary = summary;
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
			 * Adds a verifiedUsing to the initial collection
			 * @param verifiedUsing verifiedUsing to add
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
			 * @param verifiedUsingCollection collection to initialize the verifiedUsing
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
			 * @param externalRef externalRef to add
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
			 * @param externalRefCollection collection to initialize the externalRef
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
			 * @param externalIdentifier externalIdentifier to add
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
			 * @param externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockLicenseBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
				/**
			 * Adds a extension to the initial collection
			 * @param extension extension to add
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
			 * @param extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockLicenseBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
			
			/**
			 * Adds a seeAlso to the initial collection
			 * @param seeAlso seeAlso to add
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
			 * @param seeAlsoCollection collection to initialize the seeAlso
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
			 * @param creationInfo value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of isFsfLibre
			 * @param isFsfLibre value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setIsFsfLibre(Boolean isFsfLibre) {
				this.isFsfLibre = isFsfLibre;
				return this;
			}
			
			/**
			 * Sets the initial value of isOsiApproved
			 * @param isOsiApproved value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setIsOsiApproved(Boolean isOsiApproved) {
				this.isOsiApproved = isOsiApproved;
				return this;
			}
			
			/**
			 * Sets the initial value of isDeprecatedLicenseId
			 * @param isDeprecatedLicenseId value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setIsDeprecatedLicenseId(Boolean isDeprecatedLicenseId) {
				this.isDeprecatedLicenseId = isDeprecatedLicenseId;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @param description value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of obsoletedBy
			 * @param obsoletedBy value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setObsoletedBy(String obsoletedBy) {
				this.obsoletedBy = obsoletedBy;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @param comment value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of licenseText
			 * @param licenseText value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setLicenseText(String licenseText) {
				this.licenseText = licenseText;
				return this;
			}
			
			/**
			 * Sets the initial value of licenseXml
			 * @param licenseXml value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setLicenseXml(String licenseXml) {
				this.licenseXml = licenseXml;
				return this;
			}
			
			/**
			 * Sets the initial value of standardLicenseTemplate
			 * @param standardLicenseTemplate value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setStandardLicenseTemplate(String standardLicenseTemplate) {
				this.standardLicenseTemplate = standardLicenseTemplate;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @param name value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setName(String name) {
				super.name = name;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @param summary value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setSummary(String summary) {
				super.summary = summary;
				return this;
			}
			
			/**
			 * Sets the initial value of standardLicenseHeader
			 * @param standardLicenseHeader value to set
			 * @return this for chaining
			**/
			public MockLicenseBuilder setStandardLicenseHeader(String standardLicenseHeader) {
				this.standardLicenseHeader = standardLicenseHeader;
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
			 * Adds a externalIdentifier to the initial collection
			 * @param externalIdentifier externalIdentifier to add
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
			 * @param externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockElementBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
				/**
			 * Adds a verifiedUsing to the initial collection
			 * @param verifiedUsing verifiedUsing to add
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
			 * @param verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockElementBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a extension to the initial collection
			 * @param extension extension to add
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
			 * @param extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockElementBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					extensions.addAll(extensionCollection);
				}
				return this;
			}
				/**
			 * Adds a externalRef to the initial collection
			 * @param externalRef externalRef to add
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
			 * @param externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockElementBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @param creationInfo value to set
			 * @return this for chaining
			**/
			public MockElementBuilder setCreationInfo(CreationInfo creationInfo) {
				this.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @param description value to set
			 * @return this for chaining
			**/
			public MockElementBuilder setDescription(String description) {
				this.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @param comment value to set
			 * @return this for chaining
			**/
			public MockElementBuilder setComment(String comment) {
				this.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @param name value to set
			 * @return this for chaining
			**/
			public MockElementBuilder setName(String name) {
				this.name = name;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @param summary value to set
			 * @return this for chaining
			**/
			public MockElementBuilder setSummary(String summary) {
				this.summary = summary;
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
			 * Adds a verifiedUsing to the initial collection
			 * @param verifiedUsing verifiedUsing to add
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
			 * @param verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockArtifactBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a externalRef to the initial collection
			 * @param externalRef externalRef to add
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
			 * @param externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockArtifactBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					super.externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
				/**
			 * Adds a originatedBy to the initial collection
			 * @param originatedBy originatedBy to add
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
			 * @param originatedByCollection collection to initialize the originatedBy
			 * @return this for chaining
			**/
			public MockArtifactBuilder addAllOriginatedBy(Collection<Agent> originatedByCollection) {
				if (Objects.nonNull(originatedByCollection)) {
					originatedBys.addAll(originatedByCollection);
				}
				return this;
			}
				/**
			 * Adds a externalIdentifier to the initial collection
			 * @param externalIdentifier externalIdentifier to add
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
			 * @param externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockArtifactBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
				/**
			 * Adds a extension to the initial collection
			 * @param extension extension to add
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
			 * @param extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockArtifactBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
			
			/**
			 * Adds a supportLevel to the initial collection
			 * @param supportLevel supportLevel to add
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
			 * @param supportLevelCollection collection to initialize the supportLevel
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
			 * @param standardName standardName to add
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
			 * @param standardNameCollection collection to initialize the standardName
			 * @return this for chaining
			**/
			public MockArtifactBuilder addAllStandardName(Collection<String> standardNameCollection) {
				if (Objects.nonNull(standardNameCollection)) {
					standardNames.addAll(standardNameCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of suppliedBy
			 * @param suppliedBy value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setSuppliedBy(Agent suppliedBy) {
				this.suppliedBy = suppliedBy;
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @param creationInfo value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of intendedUse
			 * @param intendedUse value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setIntendedUse(String intendedUse) {
				this.intendedUse = intendedUse;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @param description value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of builtTime
			 * @param builtTime value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setBuiltTime(String builtTime) {
				this.builtTime = builtTime;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @param comment value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of validUntilTime
			 * @param validUntilTime value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setValidUntilTime(String validUntilTime) {
				this.validUntilTime = validUntilTime;
				return this;
			}
			
			/**
			 * Sets the initial value of releaseTime
			 * @param releaseTime value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setReleaseTime(String releaseTime) {
				this.releaseTime = releaseTime;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @param name value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setName(String name) {
				super.name = name;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @param summary value to set
			 * @return this for chaining
			**/
			public MockArtifactBuilder setSummary(String summary) {
				super.summary = summary;
				return this;
			}
		}
	}
	static class MockDefinedProcess extends DefinedProcess {

		/**
		 * @param builder superclass builder
		 * @throws InvalidSPDXAnalysisException on error
		 */
		protected MockDefinedProcess(DefinedProcessBuilder builder)
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
		public MockDefinedProcess(IModelStore modelStore, String objectUri, IModelCopyManager copyManager,
				boolean create, String idPrefix) throws InvalidSPDXAnalysisException {
			super(modelStore, objectUri, copyManager, create, idPrefix);
		}
		
		/* (non-Javadoc)
		 * @see org.spdx.library.core.CoreModelObject#getType()
		 */
		@Override
		public String getType() {
			return "MockDefinedProcess";
		}		
		
		static class MockDefinedProcessBuilder extends DefinedProcessBuilder {

			/**
			 * @param modelStore store for the built object
			 * @param objectUri uri for the built object
			 * @param copyManager optional copyManager
			 */
			public MockDefinedProcessBuilder(IModelStore modelStore,
					String objectUri, IModelCopyManager copyManager) {
				super(modelStore, objectUri, copyManager);
			}

			@Override
			public DefinedProcess build() throws InvalidSPDXAnalysisException {
				return new MockDefinedProcess(this);
			}
			
				/**
			 * Adds a verifiedUsing to the initial collection
			 * @param verifiedUsing verifiedUsing to add
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder addVerifiedUsing(IntegrityMethod verifiedUsing) {
				if (Objects.nonNull(verifiedUsing)) {
					super.verifiedUsings.add(verifiedUsing);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial verifiedUsing collection
			 * @param verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a externalRef to the initial collection
			 * @param externalRef externalRef to add
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder addExternalRef(ExternalRef externalRef) {
				if (Objects.nonNull(externalRef)) {
					super.externalRefs.add(externalRef);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalRef collection
			 * @param externalRefCollection collection to initialize the externalRef
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder addAllExternalRef(Collection<ExternalRef> externalRefCollection) {
				if (Objects.nonNull(externalRefCollection)) {
					super.externalRefs.addAll(externalRefCollection);
				}
				return this;
			}
				/**
			 * Adds a originatedBy to the initial collection
			 * @param originatedBy originatedBy to add
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder addOriginatedBy(Agent originatedBy) {
				if (Objects.nonNull(originatedBy)) {
					super.originatedBys.add(originatedBy);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial originatedBy collection
			 * @param originatedByCollection collection to initialize the originatedBy
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder addAllOriginatedBy(Collection<Agent> originatedByCollection) {
				if (Objects.nonNull(originatedByCollection)) {
					super.originatedBys.addAll(originatedByCollection);
				}
				return this;
			}
				/**
			 * Adds a externalIdentifier to the initial collection
			 * @param externalIdentifier externalIdentifier to add
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder addExternalIdentifier(ExternalIdentifier externalIdentifier) {
				if (Objects.nonNull(externalIdentifier)) {
					super.externalIdentifiers.add(externalIdentifier);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial externalIdentifier collection
			 * @param externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
				/**
			 * Adds a extension to the initial collection
			 * @param extension extension to add
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder addExtension(Extension extension) {
				if (Objects.nonNull(extension)) {
					super.extensions.add(extension);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial extension collection
			 * @param extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
			
			/**
			 * Adds a supportLevel to the initial collection
			 * @param supportLevel supportLevel to add
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder addSupportLevel(SupportType supportLevel) {
				if (Objects.nonNull(supportLevel)) {
					super.supportLevels.add(supportLevel);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial supportLevel collection
			 * @param supportLevelCollection collection to initialize the supportLevel
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder addAllSupportLevel(Collection<SupportType> supportLevelCollection) {
				if (Objects.nonNull(supportLevelCollection)) {
					super.supportLevels.addAll(supportLevelCollection);
				}
				return this;
			}
			
			/**
			 * Adds a standardName to the initial collection
			 * @param standardName standardName to add
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder addStandardName(String standardName) {
				if (Objects.nonNull(standardName)) {
					super.standardNames.add(standardName);
				}
				return this;
			}
			
			/**
			 * Adds all elements from a collection to the initial standardName collection
			 * @param standardNameCollection collection to initialize the standardName
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder addAllStandardName(Collection<String> standardNameCollection) {
				if (Objects.nonNull(standardNameCollection)) {
					super.standardNames.addAll(standardNameCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of suppliedBy
			 * @param suppliedBy value to set
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder setSuppliedBy(Agent suppliedBy) {
				super.suppliedBy = suppliedBy;
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @param creationInfo value to set
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of processReadiness
			 * @param processReadiness value to set
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder setProcessReadiness(ProcessReadinessType processReadiness) {
				this.processReadiness = processReadiness;
				return this;
			}
			
			/**
			 * Sets the initial value of intendedUse
			 * @param intendedUse value to set
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder setIntendedUse(String intendedUse) {
				super.intendedUse = intendedUse;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @param description value to set
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of builtTime
			 * @param builtTime value to set
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder setBuiltTime(String builtTime) {
				super.builtTime = builtTime;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @param comment value to set
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of processVersion
			 * @param processVersion value to set
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder setProcessVersion(String processVersion) {
				this.processVersion = processVersion;
				return this;
			}
			
			/**
			 * Sets the initial value of validUntilTime
			 * @param validUntilTime value to set
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder setValidUntilTime(String validUntilTime) {
				super.validUntilTime = validUntilTime;
				return this;
			}
			
			/**
			 * Sets the initial value of releaseTime
			 * @param releaseTime value to set
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder setReleaseTime(String releaseTime) {
				super.releaseTime = releaseTime;
				return this;
			}
			
			/**
			 * Sets the initial value of processRationale
			 * @param processRationale value to set
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder setProcessRationale(String processRationale) {
				this.processRationale = processRationale;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @param name value to set
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder setName(String name) {
				super.name = name;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @param summary value to set
			 * @return this for chaining
			**/
			public MockDefinedProcessBuilder setSummary(String summary) {
				super.summary = summary;
				return this;
			}
		}
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
			 * Adds a verifiedUsing to the initial collection
			 * @param verifiedUsing verifiedUsing to add
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
			 * @param verifiedUsingCollection collection to initialize the verifiedUsing
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder addAllVerifiedUsing(Collection<IntegrityMethod> verifiedUsingCollection) {
				if (Objects.nonNull(verifiedUsingCollection)) {
					super.verifiedUsings.addAll(verifiedUsingCollection);
				}
				return this;
			}
				/**
			 * Adds a externalRef to the initial collection
			 * @param externalRef externalRef to add
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
			 * @param externalRefCollection collection to initialize the externalRef
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
			 * @param externalIdentifier externalIdentifier to add
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
			 * @param externalIdentifierCollection collection to initialize the externalIdentifier
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder addAllExternalIdentifier(Collection<ExternalIdentifier> externalIdentifierCollection) {
				if (Objects.nonNull(externalIdentifierCollection)) {
					super.externalIdentifiers.addAll(externalIdentifierCollection);
				}
				return this;
			}
				/**
			 * Adds a extension to the initial collection
			 * @param extension extension to add
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
			 * @param extensionCollection collection to initialize the extension
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder addAllExtension(Collection<Extension> extensionCollection) {
				if (Objects.nonNull(extensionCollection)) {
					super.extensions.addAll(extensionCollection);
				}
				return this;
			}
				/**
			 * Adds a to to the initial collection
			 * @param to to to add
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
			 * @param toCollection collection to initialize the to
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder addAllTo(Collection<Element> toCollection) {
				if (Objects.nonNull(toCollection)) {
					super.tos.addAll(toCollection);
				}
				return this;
			}
			
			/**
			 * Sets the initial value of from
			 * @param from value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setFrom(Element from) {
				super.from = from;
				return this;
			}
			
			/**
			 * Sets the initial value of SecurityAssessedElement
			 * @param SecurityAssessedElement value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setSecurityAssessedElement(SoftwareArtifact SecurityAssessedElement) {
				super.SecurityAssessedElement = SecurityAssessedElement;
				return this;
			}
			
			/**
			 * Sets the initial value of suppliedBy
			 * @param suppliedBy value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setSuppliedBy(Agent suppliedBy) {
				super.suppliedBy = suppliedBy;
				return this;
			}
			
			/**
			 * Sets the initial value of creationInfo
			 * @param creationInfo value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setCreationInfo(CreationInfo creationInfo) {
				super.creationInfo = creationInfo;
				return this;
			}
			
			/**
			 * Sets the initial value of completeness
			 * @param completeness value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setCompleteness(RelationshipCompleteness completeness) {
				super.completeness = completeness;
				return this;
			}
			
			/**
			 * Sets the initial value of relationshipType
			 * @param relationshipType value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setRelationshipType(RelationshipType relationshipType) {
				super.relationshipType = relationshipType;
				return this;
			}
			
			/**
			 * Sets the initial value of description
			 * @param description value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setDescription(String description) {
				super.description = description;
				return this;
			}
			
			/**
			 * Sets the initial value of publishedTime
			 * @param publishedTime value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setPublishedTime(String publishedTime) {
				super.publishedTime = publishedTime;
				return this;
			}
			
			/**
			 * Sets the initial value of startTime
			 * @param startTime value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setStartTime(String startTime) {
				super.startTime = startTime;
				return this;
			}
			
			/**
			 * Sets the initial value of comment
			 * @param comment value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setComment(String comment) {
				super.comment = comment;
				return this;
			}
			
			/**
			 * Sets the initial value of statusNotes
			 * @param statusNotes value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setStatusNotes(String statusNotes) {
				this.statusNotes = statusNotes;
				return this;
			}
			
			/**
			 * Sets the initial value of endTime
			 * @param endTime value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setEndTime(String endTime) {
				super.endTime = endTime;
				return this;
			}
			
			/**
			 * Sets the initial value of modifiedTime
			 * @param modifiedTime value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setModifiedTime(String modifiedTime) {
				super.modifiedTime = modifiedTime;
				return this;
			}
			
			/**
			 * Sets the initial value of withdrawnTime
			 * @param withdrawnTime value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setWithdrawnTime(String withdrawnTime) {
				super.withdrawnTime = withdrawnTime;
				return this;
			}
			
			/**
			 * Sets the initial value of name
			 * @param name value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setName(String name) {
				super.name = name;
				return this;
			}
			
			/**
			 * Sets the initial value of summary
			 * @param summary value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setSummary(String summary) {
				super.summary = summary;
				return this;
			}
			
			/**
			 * Sets the initial value of vexVersion
			 * @param vexVersion value to set
			 * @return this for chaining
			**/
			public MockVexVulnAssessmentRelationshipBuilder setVexVersion(String vexVersion) {
				this.vexVersion = vexVersion;
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
			 * @param comment value to set
			 * @return this for chaining
			**/
			public MockIntegrityMethodBuilder setComment(String comment) {
				this.comment = comment;
				return this;
			}
		}
	}

	public static final Integer ARTIFACT_SIZE_TEST_VALUE = 55;
	public static final Integer WEIGHT_TEST_VALUE = 55;
	public static final Integer END_INTEGER_RANGE_TEST_VALUE = 55;
	public static final Integer DATASET_SIZE_TEST_VALUE = 55;
	public static final Integer BEGIN_INTEGER_RANGE_TEST_VALUE = 55;
	public static final Double PERCENTILE_TEST_VALUE = 55.1;
	public static final Double SCORE_TEST_VALUE = 55.1;
	public static final Double PROBABILITY_TEST_VALUE = 55.1;
	public static final Double ENERGY_QUANTITY_TEST_VALUE = 55.1;
	public static final String EVALUATION_RATIONALE_TEST_VALUE = "test evaluationRationale";
	public static final String PACKAGE_URL_TEST_VALUE = "test packageUrl";
	public static final String PROVINCE_STATE_CODE_TEST_VALUE = "test provinceStateCode";
	public static final String STANDARD_LICENSE_HEADER_TEST_VALUE = "test standardLicenseHeader";
	public static final String VECTOR_STRING_TEST_VALUE = "test vectorString";
	public static final String BUILD_END_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String VALUE_TEST_VALUE = "test value";
	public static final String SUMMARY_TEST_VALUE = "test summary";
	public static final String PROJECT_END_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String LICENSE_XML_TEST_VALUE = "test licenseXml";
	public static final String COUNTY_CODE_TEST_VALUE = "test countyCode";
	public static final String EXTERNAL_SPDX_ID_TEST_VALUE = "test externalSpdxId";
	public static final String CDX_PROP_NAME_TEST_VALUE = "test cdxPropName";
	public static final String IMPACT_STATEMENT_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String NAMESPACE_TEST_VALUE = "test namespace";
	public static final String ACTION_STATEMENT_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String STATEMENT_TEST_VALUE = "test statement";
	public static final String CONTENT_TYPE_TEST_VALUE = UnitTestHelper.genRandPattern("^[^\\/]+\\/[^\\/]+$");
	public static final String VEX_VERSION_TEST_VALUE = "test vexVersion";
	public static final String LICENSE_LIST_VERSION_TEST_VALUE = UnitTestHelper.genRandPattern("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
	public static final String STANDARD_ADDITION_TEMPLATE_TEST_VALUE = "test standardAdditionTemplate";
	public static final String COUNTRY_TEST_VALUE = UnitTestHelper.genRandPattern("^[A-Z]{3}$");
	public static final String EXPORTING_COUNTRY_TEST_VALUE = UnitTestHelper.genRandPattern("^[A-Z]{3}$");
	public static final String ACTION_END_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String IMPACT_STATEMENT_TEST_VALUE = "test impactStatement";
	public static final String CONTENT_IDENTIFIER_VALUE_TEST_VALUE = "test contentIdentifierValue";
	public static final String PROCESS_RATIONALE_TEST_VALUE = "test processRationale";
	public static final String CREATED_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String LIMITATION_TEST_VALUE = "test limitation";
	public static final String LICENSE_TEXT_TEST_VALUE = "test licenseText";
	public static final String MODIFIED_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String ISSUING_AUTHORITY_TEST_VALUE = "test issuingAuthority";
	public static final String POST_OFFICE_BOX_NUMBER_TEST_VALUE = "test postOfficeBoxNumber";
	public static final String RELEASE_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String CDX_PROP_VALUE_TEST_VALUE = "test cdxPropValue";
	public static final String PROJECT_TITLE_TEST_VALUE = "test projectTitle";
	public static final String END_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String ADDITION_TEXT_TEST_VALUE = "test additionText";
	public static final String HOME_PAGE_TEST_VALUE = "test homePage";
	public static final String PART_NUMBER_TEST_VALUE = "test partNumber";
	public static final String CONTEXT_TEST_VALUE = "test context";
	public static final String SECURITY_LOCATOR_TEST_VALUE = "test SecurityLocator";
	public static final String DESCRIPTION_TEST_VALUE = "test description";
	public static final String SOURCE_INFO_TEST_VALUE = "test sourceInfo";
	public static final String OBSOLETED_BY_TEST_VALUE = "test obsoletedBy";
	public static final String INFORMATION_ABOUT_TRAINING_TEST_VALUE = "test informationAboutTraining";
	public static final String LICENSE_EXPRESSION_TEST_VALUE = "test licenseExpression";
	public static final String ACTION_START_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String POSTAL_NAME_TEST_VALUE = "test postalName";
	public static final String START_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String BATCH_NUMBER_TEST_VALUE = "test batchNumber";
	public static final String BUILD_TYPE_TEST_VALUE = "test buildType";
	public static final String EXPORT_CLASSIFICATION_TEST_VALUE = "test exportClassification";
	public static final String SERIAL_NUMBER_TEST_VALUE = "test serialNumber";
	public static final String IDENTIFIER_TEST_VALUE = "test identifier";
	public static final String NAME_TEST_VALUE = "test name";
	public static final String BUILD_ID_TEST_VALUE = "test buildId";
	public static final String INTENDED_USE_TEST_VALUE = "test intendedUse";
	public static final String PUBLISHED_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String QUANTITY_TEST_VALUE = "test quantity";
	public static final String PROCESS_VERSION_TEST_VALUE = "test processVersion";
	public static final String TYPE_FROM_SOURCE_TEST_VALUE = "test typeFromSource";
	public static final String RELEASE_DATE_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String LOCATION_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String COMMENT_TEST_VALUE = "test comment";
	public static final String KEY_TEST_VALUE = "test key";
	public static final String LOCATION_HINT_TEST_VALUE = "test locationHint";
	public static final String ASSESSMENT_TIMESTAMP_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String HARDWARE_VERSION_TEST_VALUE = "test hardwareVersion";
	public static final String BUILD_START_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String LIST_VERSION_ADDED_TEST_VALUE = "test listVersionAdded";
	public static final String DATASET_UPDATE_MECHANISM_TEST_VALUE = "test datasetUpdateMechanism";
	public static final String DOWNLOAD_LOCATION_TEST_VALUE = "test downloadLocation";
	public static final String STATUS_NOTES_TEST_VALUE = "test statusNotes";
	public static final String BUILT_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String REQUIREMENT_STATEMENT_TEST_VALUE = "test requirementStatement";
	public static final String INFORMATION_ABOUT_APPLICATION_TEST_VALUE = "test informationAboutApplication";
	public static final String STANDARD_LICENSE_TEMPLATE_TEST_VALUE = "test standardLicenseTemplate";
	public static final String COPYRIGHT_TEXT_TEST_VALUE = "test copyrightText";
	public static final String HASH_VALUE_TEST_VALUE = "test hashValue";
	public static final String DATASET_INTENDED_USE_TEST_VALUE = "test DatasetIntendedUse";
	public static final String POSTAL_CODE_TEST_VALUE = "test postalCode";
	public static final String DATASET_NOISE_TEST_VALUE = "test datasetNoise";
	public static final String DEPRECATED_VERSION_TEST_VALUE = "test deprecatedVersion";
	public static final String PROJECT_START_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String DATA_COLLECTION_PROCESS_TEST_VALUE = "test dataCollectionProcess";
	public static final String ACTION_STATEMENT_TEST_VALUE = "test actionStatement";
	public static final String VALID_UNTIL_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String CITY_TEST_VALUE = "test city";
	public static final String STREET_ADDRESS_TEST_VALUE = "test streetAddress";
	public static final String WITHDRAWN_TIME_TEST_VALUE = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
	public static final String SPEC_VERSION_TEST_VALUE = UnitTestHelper.genRandPattern("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
	public static final String PREFIX_TEST_VALUE = "test prefix";
	public static final String PROJECT_CONTRACT_TEST_VALUE = "test projectContract";
	public static final String PACKAGE_VERSION_TEST_VALUE = "test packageVersion";
	public static final String UNIT_Q_U_D_T_TEST_VALUE = "test unitQUDT";
	public static final String VERIFICATION_RATIONALE_TEST_VALUE = "test verificationRationale";
	public static final ContentIdentifierType CONTENT_IDENTIFIER_TYPE_TEST_VALUE1 = ContentIdentifierType.values()[0];
	public static final ContentIdentifierType CONTENT_IDENTIFIER_TYPE_TEST_VALUE2 = ContentIdentifierType.values()[1];
	public static final ExploitCatalogType CATALOG_TYPE_TEST_VALUE1 = ExploitCatalogType.values()[0];
	public static final ExploitCatalogType CATALOG_TYPE_TEST_VALUE2 = ExploitCatalogType.values()[1];
	public static final EvaluationResultType EVALUATION_TEST_VALUE1 = EvaluationResultType.values()[0];
	public static final EvaluationResultType EVALUATION_TEST_VALUE2 = EvaluationResultType.values()[1];
	public static final SoftwarePurpose PRIMARY_PURPOSE_TEST_VALUE1 = SoftwarePurpose.values()[0];
	public static final SoftwarePurpose PRIMARY_PURPOSE_TEST_VALUE2 = SoftwarePurpose.values()[1];
	public static final VexJustificationType JUSTIFICATION_TYPE_TEST_VALUE1 = VexJustificationType.values()[0];
	public static final VexJustificationType JUSTIFICATION_TYPE_TEST_VALUE2 = VexJustificationType.values()[1];
	public static final LifecycleScopeType SCOPE_TEST_VALUE1 = LifecycleScopeType.values()[0];
	public static final LifecycleScopeType SCOPE_TEST_VALUE2 = LifecycleScopeType.values()[1];
	public static final PresenceType HAS_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE1 = PresenceType.values()[0];
	public static final PresenceType HAS_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE2 = PresenceType.values()[1];
	public static final RelationshipType RELATIONSHIP_TYPE_TEST_VALUE1 = RelationshipType.values()[0];
	public static final RelationshipType RELATIONSHIP_TYPE_TEST_VALUE2 = RelationshipType.values()[1];
	public static final SafetyRiskAssessmentType SAFETY_RISK_ASSESSMENT_TEST_VALUE1 = SafetyRiskAssessmentType.values()[0];
	public static final SafetyRiskAssessmentType SAFETY_RISK_ASSESSMENT_TEST_VALUE2 = SafetyRiskAssessmentType.values()[1];
	public static final RelationshipCompleteness COMPLETENESS_TEST_VALUE1 = RelationshipCompleteness.values()[0];
	public static final RelationshipCompleteness COMPLETENESS_TEST_VALUE2 = RelationshipCompleteness.values()[1];
	public static final IsoAutomationLevel ISO_AUTOMATION_LEVEL_TEST_VALUE1 = IsoAutomationLevel.values()[0];
	public static final IsoAutomationLevel ISO_AUTOMATION_LEVEL_TEST_VALUE2 = IsoAutomationLevel.values()[1];
	public static final SpecificationType SPEC_TYPE_TEST_VALUE1 = SpecificationType.values()[0];
	public static final SpecificationType SPEC_TYPE_TEST_VALUE2 = SpecificationType.values()[1];
	public static final EnergyUnitType ENERGY_UNIT_TEST_VALUE1 = EnergyUnitType.values()[0];
	public static final EnergyUnitType ENERGY_UNIT_TEST_VALUE2 = EnergyUnitType.values()[1];
	public static final ContactPointRelationshipType CONTACT_TYPE_TEST_VALUE1 = ContactPointRelationshipType.values()[0];
	public static final ContactPointRelationshipType CONTACT_TYPE_TEST_VALUE2 = ContactPointRelationshipType.values()[1];
	public static final CvssSeverityType SEVERITY_TEST_VALUE1 = CvssSeverityType.values()[0];
	public static final CvssSeverityType SEVERITY_TEST_VALUE2 = CvssSeverityType.values()[1];
	public static final PresenceType USE_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE1 = PresenceType.values()[0];
	public static final PresenceType USE_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE2 = PresenceType.values()[1];
	public static final ProcessReadinessType PROCESS_READINESS_TEST_VALUE1 = ProcessReadinessType.values()[0];
	public static final ProcessReadinessType PROCESS_READINESS_TEST_VALUE2 = ProcessReadinessType.values()[1];
	public static final FileKindType FILE_KIND_TEST_VALUE1 = FileKindType.values()[0];
	public static final FileKindType FILE_KIND_TEST_VALUE2 = FileKindType.values()[1];
	public static final DatasetAvailabilityType DATASET_AVAILABILITY_TEST_VALUE1 = DatasetAvailabilityType.values()[0];
	public static final DatasetAvailabilityType DATASET_AVAILABILITY_TEST_VALUE2 = DatasetAvailabilityType.values()[1];
	public static final SupportType SUPPORT_LEVEL_TEST_VALUE1 = SupportType.values()[0];
	public static final SupportType SUPPORT_LEVEL_TEST_VALUE2 = SupportType.values()[1];
	public static final ExternalIdentifierType EXTERNAL_IDENTIFIER_TYPE_TEST_VALUE1 = ExternalIdentifierType.values()[0];
	public static final ExternalIdentifierType EXTERNAL_IDENTIFIER_TYPE_TEST_VALUE2 = ExternalIdentifierType.values()[1];
	public static final VirtualHardwareModelType VIRTUAL_HARDWARE_MODEL_TEST_VALUE1 = VirtualHardwareModelType.values()[0];
	public static final VirtualHardwareModelType VIRTUAL_HARDWARE_MODEL_TEST_VALUE2 = VirtualHardwareModelType.values()[1];
	public static final ExternalRefType EXTERNAL_REF_TYPE_TEST_VALUE1 = ExternalRefType.values()[0];
	public static final ExternalRefType EXTERNAL_REF_TYPE_TEST_VALUE2 = ExternalRefType.values()[1];
	public static final ConfidentialityLevelType CONFIDENTIALITY_LEVEL_TEST_VALUE1 = ConfidentialityLevelType.values()[0];
	public static final ConfidentialityLevelType CONFIDENTIALITY_LEVEL_TEST_VALUE2 = ConfidentialityLevelType.values()[1];
	public static final ResponsibilityType RESPONSIBILITY_CATEGORY_TEST_VALUE1 = ResponsibilityType.values()[0];
	public static final ResponsibilityType RESPONSIBILITY_CATEGORY_TEST_VALUE2 = ResponsibilityType.values()[1];
	public static final PresenceType AUTONOMY_TYPE_TEST_VALUE1 = PresenceType.values()[0];
	public static final PresenceType AUTONOMY_TYPE_TEST_VALUE2 = PresenceType.values()[1];
	public static final HashAlgorithm ALGORITHM_TEST_VALUE1 = HashAlgorithm.values()[0];
	public static final HashAlgorithm ALGORITHM_TEST_VALUE2 = HashAlgorithm.values()[1];
	public static final AnnotationType ANNOTATION_TYPE_TEST_VALUE1 = AnnotationType.values()[0];
	public static final AnnotationType ANNOTATION_TYPE_TEST_VALUE2 = AnnotationType.values()[1];
	public static final SsvcDecisionType DECISION_TYPE_TEST_VALUE1 = SsvcDecisionType.values()[0];
	public static final SsvcDecisionType DECISION_TYPE_TEST_VALUE2 = SsvcDecisionType.values()[1];
	public static final String CONFIG_SOURCE_ENTRYPOINT_COL_TEST_VALUE1 = "test 1 configSourceEntrypoint";
	public static final String CONFIG_SOURCE_ENTRYPOINT_COL_TEST_VALUE2 = "test 2 configSourceEntrypoint";
	public static final String CONFIG_SOURCE_ENTRYPOINT_COL_TEST_VALUE3 = "test 3 configSourceEntrypoint";
	public static final List<String> CONFIG_SOURCE_ENTRYPOINT_TEST_LIST1 = Arrays.asList(new String[] { CONFIG_SOURCE_ENTRYPOINT_COL_TEST_VALUE1, CONFIG_SOURCE_ENTRYPOINT_COL_TEST_VALUE2 });
	public static final List<String> CONFIG_SOURCE_ENTRYPOINT_TEST_LIST2 = Arrays.asList(new String[] { CONFIG_SOURCE_ENTRYPOINT_COL_TEST_VALUE3 });
	public static final String DATA_PREPROCESSING_COL_TEST_VALUE1 = "test 1 dataPreprocessing";
	public static final String DATA_PREPROCESSING_COL_TEST_VALUE2 = "test 2 dataPreprocessing";
	public static final String DATA_PREPROCESSING_COL_TEST_VALUE3 = "test 3 dataPreprocessing";
	public static final List<String> DATA_PREPROCESSING_TEST_LIST1 = Arrays.asList(new String[] { DATA_PREPROCESSING_COL_TEST_VALUE1, DATA_PREPROCESSING_COL_TEST_VALUE2 });
	public static final List<String> DATA_PREPROCESSING_TEST_LIST2 = Arrays.asList(new String[] { DATA_PREPROCESSING_COL_TEST_VALUE3 });
	public static final String PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_COL_TEST_VALUE1 = "test 1 packageVerificationCodeExcludedFile";
	public static final String PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_COL_TEST_VALUE2 = "test 2 packageVerificationCodeExcludedFile";
	public static final String PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_COL_TEST_VALUE3 = "test 3 packageVerificationCodeExcludedFile";
	public static final List<String> PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_LIST1 = Arrays.asList(new String[] { PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_COL_TEST_VALUE1, PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_COL_TEST_VALUE2 });
	public static final List<String> PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_LIST2 = Arrays.asList(new String[] { PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_COL_TEST_VALUE3 });
	public static final String SERVICE_HOSTING_COUNTRY_COL_TEST_VALUE1 = UnitTestHelper.genRandPattern("^[A-Z]{3}$");
	public static final String SERVICE_HOSTING_COUNTRY_COL_TEST_VALUE2 = UnitTestHelper.genRandPattern("^[A-Z]{3}$");
	public static final String SERVICE_HOSTING_COUNTRY_COL_TEST_VALUE3 = UnitTestHelper.genRandPattern("^[A-Z]{3}$");
	public static final List<String> SERVICE_HOSTING_COUNTRY_TEST_LIST1 = Arrays.asList(new String[] { SERVICE_HOSTING_COUNTRY_COL_TEST_VALUE1, SERVICE_HOSTING_COUNTRY_COL_TEST_VALUE2 });
	public static final List<String> SERVICE_HOSTING_COUNTRY_TEST_LIST2 = Arrays.asList(new String[] { SERVICE_HOSTING_COUNTRY_COL_TEST_VALUE3 });
	public static final String ATTRIBUTION_TEXT_COL_TEST_VALUE1 = "test 1 attributionText";
	public static final String ATTRIBUTION_TEXT_COL_TEST_VALUE2 = "test 2 attributionText";
	public static final String ATTRIBUTION_TEXT_COL_TEST_VALUE3 = "test 3 attributionText";
	public static final List<String> ATTRIBUTION_TEXT_TEST_LIST1 = Arrays.asList(new String[] { ATTRIBUTION_TEXT_COL_TEST_VALUE1, ATTRIBUTION_TEXT_COL_TEST_VALUE2 });
	public static final List<String> ATTRIBUTION_TEXT_TEST_LIST2 = Arrays.asList(new String[] { ATTRIBUTION_TEXT_COL_TEST_VALUE3 });
	public static final String TYPE_OF_MODEL_COL_TEST_VALUE1 = "test 1 typeOfModel";
	public static final String TYPE_OF_MODEL_COL_TEST_VALUE2 = "test 2 typeOfModel";
	public static final String TYPE_OF_MODEL_COL_TEST_VALUE3 = "test 3 typeOfModel";
	public static final List<String> TYPE_OF_MODEL_TEST_LIST1 = Arrays.asList(new String[] { TYPE_OF_MODEL_COL_TEST_VALUE1, TYPE_OF_MODEL_COL_TEST_VALUE2 });
	public static final List<String> TYPE_OF_MODEL_TEST_LIST2 = Arrays.asList(new String[] { TYPE_OF_MODEL_COL_TEST_VALUE3 });
	public static final String TRANSPORT_ROUTE_COL_TEST_VALUE1 = "test 1 transportRoute";
	public static final String TRANSPORT_ROUTE_COL_TEST_VALUE2 = "test 2 transportRoute";
	public static final String TRANSPORT_ROUTE_COL_TEST_VALUE3 = "test 3 transportRoute";
	public static final List<String> TRANSPORT_ROUTE_TEST_LIST1 = Arrays.asList(new String[] { TRANSPORT_ROUTE_COL_TEST_VALUE1, TRANSPORT_ROUTE_COL_TEST_VALUE2 });
	public static final List<String> TRANSPORT_ROUTE_TEST_LIST2 = Arrays.asList(new String[] { TRANSPORT_ROUTE_COL_TEST_VALUE3 });
	public static final String MODEL_EXPLAINABILITY_COL_TEST_VALUE1 = "test 1 modelExplainability";
	public static final String MODEL_EXPLAINABILITY_COL_TEST_VALUE2 = "test 2 modelExplainability";
	public static final String MODEL_EXPLAINABILITY_COL_TEST_VALUE3 = "test 3 modelExplainability";
	public static final List<String> MODEL_EXPLAINABILITY_TEST_LIST1 = Arrays.asList(new String[] { MODEL_EXPLAINABILITY_COL_TEST_VALUE1, MODEL_EXPLAINABILITY_COL_TEST_VALUE2 });
	public static final List<String> MODEL_EXPLAINABILITY_TEST_LIST2 = Arrays.asList(new String[] { MODEL_EXPLAINABILITY_COL_TEST_VALUE3 });
	public static final String KNOWN_BIAS_COL_TEST_VALUE1 = "test 1 knownBias";
	public static final String KNOWN_BIAS_COL_TEST_VALUE2 = "test 2 knownBias";
	public static final String KNOWN_BIAS_COL_TEST_VALUE3 = "test 3 knownBias";
	public static final List<String> KNOWN_BIAS_TEST_LIST1 = Arrays.asList(new String[] { KNOWN_BIAS_COL_TEST_VALUE1, KNOWN_BIAS_COL_TEST_VALUE2 });
	public static final List<String> KNOWN_BIAS_TEST_LIST2 = Arrays.asList(new String[] { KNOWN_BIAS_COL_TEST_VALUE3 });
	public static final String CONFIG_SOURCE_URI_COL_TEST_VALUE1 = "test 1 configSourceUri";
	public static final String CONFIG_SOURCE_URI_COL_TEST_VALUE2 = "test 2 configSourceUri";
	public static final String CONFIG_SOURCE_URI_COL_TEST_VALUE3 = "test 3 configSourceUri";
	public static final List<String> CONFIG_SOURCE_URI_TEST_LIST1 = Arrays.asList(new String[] { CONFIG_SOURCE_URI_COL_TEST_VALUE1, CONFIG_SOURCE_URI_COL_TEST_VALUE2 });
	public static final List<String> CONFIG_SOURCE_URI_TEST_LIST2 = Arrays.asList(new String[] { CONFIG_SOURCE_URI_COL_TEST_VALUE3 });
	public static final String IN_LANGUAGE_COL_TEST_VALUE1 = UnitTestHelper.genRandPattern("^[a-zA-Z]{2,8}(-[a-zA-Z0-9]{1,8})*$");
	public static final String IN_LANGUAGE_COL_TEST_VALUE2 = UnitTestHelper.genRandPattern("^[a-zA-Z]{2,8}(-[a-zA-Z0-9]{1,8})*$");
	public static final String IN_LANGUAGE_COL_TEST_VALUE3 = UnitTestHelper.genRandPattern("^[a-zA-Z]{2,8}(-[a-zA-Z0-9]{1,8})*$");
	public static final List<String> IN_LANGUAGE_TEST_LIST1 = Arrays.asList(new String[] { IN_LANGUAGE_COL_TEST_VALUE1, IN_LANGUAGE_COL_TEST_VALUE2 });
	public static final List<String> IN_LANGUAGE_TEST_LIST2 = Arrays.asList(new String[] { IN_LANGUAGE_COL_TEST_VALUE3 });
	public static final String VERIFICATION_PRECONDITION_COL_TEST_VALUE1 = "test 1 verificationPrecondition";
	public static final String VERIFICATION_PRECONDITION_COL_TEST_VALUE2 = "test 2 verificationPrecondition";
	public static final String VERIFICATION_PRECONDITION_COL_TEST_VALUE3 = "test 3 verificationPrecondition";
	public static final List<String> VERIFICATION_PRECONDITION_TEST_LIST1 = Arrays.asList(new String[] { VERIFICATION_PRECONDITION_COL_TEST_VALUE1, VERIFICATION_PRECONDITION_COL_TEST_VALUE2 });
	public static final List<String> VERIFICATION_PRECONDITION_TEST_LIST2 = Arrays.asList(new String[] { VERIFICATION_PRECONDITION_COL_TEST_VALUE3 });
	public static final String SEE_ALSO_COL_TEST_VALUE1 = "test 1 seeAlso";
	public static final String SEE_ALSO_COL_TEST_VALUE2 = "test 2 seeAlso";
	public static final String SEE_ALSO_COL_TEST_VALUE3 = "test 3 seeAlso";
	public static final List<String> SEE_ALSO_TEST_LIST1 = Arrays.asList(new String[] { SEE_ALSO_COL_TEST_VALUE1, SEE_ALSO_COL_TEST_VALUE2 });
	public static final List<String> SEE_ALSO_TEST_LIST2 = Arrays.asList(new String[] { SEE_ALSO_COL_TEST_VALUE3 });
	public static final String LOCATOR_COL_TEST_VALUE1 = "test 1 locator";
	public static final String LOCATOR_COL_TEST_VALUE2 = "test 2 locator";
	public static final String LOCATOR_COL_TEST_VALUE3 = "test 3 locator";
	public static final List<String> LOCATOR_TEST_LIST1 = Arrays.asList(new String[] { LOCATOR_COL_TEST_VALUE1, LOCATOR_COL_TEST_VALUE2 });
	public static final List<String> LOCATOR_TEST_LIST2 = Arrays.asList(new String[] { LOCATOR_COL_TEST_VALUE3 });
	public static final String DOMAIN_COL_TEST_VALUE1 = "test 1 domain";
	public static final String DOMAIN_COL_TEST_VALUE2 = "test 2 domain";
	public static final String DOMAIN_COL_TEST_VALUE3 = "test 3 domain";
	public static final List<String> DOMAIN_TEST_LIST1 = Arrays.asList(new String[] { DOMAIN_COL_TEST_VALUE1, DOMAIN_COL_TEST_VALUE2 });
	public static final List<String> DOMAIN_TEST_LIST2 = Arrays.asList(new String[] { DOMAIN_COL_TEST_VALUE3 });
	public static final String PLANNED_TRANSPORT_ROUTES_COL_TEST_VALUE1 = "test 1 plannedTransportRoutes";
	public static final String PLANNED_TRANSPORT_ROUTES_COL_TEST_VALUE2 = "test 2 plannedTransportRoutes";
	public static final String PLANNED_TRANSPORT_ROUTES_COL_TEST_VALUE3 = "test 3 plannedTransportRoutes";
	public static final List<String> PLANNED_TRANSPORT_ROUTES_TEST_LIST1 = Arrays.asList(new String[] { PLANNED_TRANSPORT_ROUTES_COL_TEST_VALUE1, PLANNED_TRANSPORT_ROUTES_COL_TEST_VALUE2 });
	public static final List<String> PLANNED_TRANSPORT_ROUTES_TEST_LIST2 = Arrays.asList(new String[] { PLANNED_TRANSPORT_ROUTES_COL_TEST_VALUE3 });
	public static final String PART_NUMBER_COL_TEST_VALUE1 = "test 1 partNumber";
	public static final String PART_NUMBER_COL_TEST_VALUE2 = "test 2 partNumber";
	public static final String PART_NUMBER_COL_TEST_VALUE3 = "test 3 partNumber";
	public static final List<String> PART_NUMBER_TEST_LIST1 = Arrays.asList(new String[] { PART_NUMBER_COL_TEST_VALUE1, PART_NUMBER_COL_TEST_VALUE2 });
	public static final List<String> PART_NUMBER_TEST_LIST2 = Arrays.asList(new String[] { PART_NUMBER_COL_TEST_VALUE3 });
	public static final String VERIFICATION_POSTCONDITION_COL_TEST_VALUE1 = "test 1 verificationPostcondition";
	public static final String VERIFICATION_POSTCONDITION_COL_TEST_VALUE2 = "test 2 verificationPostcondition";
	public static final String VERIFICATION_POSTCONDITION_COL_TEST_VALUE3 = "test 3 verificationPostcondition";
	public static final List<String> VERIFICATION_POSTCONDITION_TEST_LIST1 = Arrays.asList(new String[] { VERIFICATION_POSTCONDITION_COL_TEST_VALUE1, VERIFICATION_POSTCONDITION_COL_TEST_VALUE2 });
	public static final List<String> VERIFICATION_POSTCONDITION_TEST_LIST2 = Arrays.asList(new String[] { VERIFICATION_POSTCONDITION_COL_TEST_VALUE3 });
	public static final String ITEM_VERSION_COL_TEST_VALUE1 = "test 1 itemVersion";
	public static final String ITEM_VERSION_COL_TEST_VALUE2 = "test 2 itemVersion";
	public static final String ITEM_VERSION_COL_TEST_VALUE3 = "test 3 itemVersion";
	public static final List<String> ITEM_VERSION_TEST_LIST1 = Arrays.asList(new String[] { ITEM_VERSION_COL_TEST_VALUE1, ITEM_VERSION_COL_TEST_VALUE2 });
	public static final List<String> ITEM_VERSION_TEST_LIST2 = Arrays.asList(new String[] { ITEM_VERSION_COL_TEST_VALUE3 });
	public static final String STANDARD_NAME_COL_TEST_VALUE1 = "test 1 standardName";
	public static final String STANDARD_NAME_COL_TEST_VALUE2 = "test 2 standardName";
	public static final String STANDARD_NAME_COL_TEST_VALUE3 = "test 3 standardName";
	public static final List<String> STANDARD_NAME_TEST_LIST1 = Arrays.asList(new String[] { STANDARD_NAME_COL_TEST_VALUE1, STANDARD_NAME_COL_TEST_VALUE2 });
	public static final List<String> STANDARD_NAME_TEST_LIST2 = Arrays.asList(new String[] { STANDARD_NAME_COL_TEST_VALUE3 });
	public static final String GEOGRAPHIC_POINT_LOCATION_COL_TEST_VALUE1 = "test 1 geographicPointLocation";
	public static final String GEOGRAPHIC_POINT_LOCATION_COL_TEST_VALUE2 = "test 2 geographicPointLocation";
	public static final String GEOGRAPHIC_POINT_LOCATION_COL_TEST_VALUE3 = "test 3 geographicPointLocation";
	public static final List<String> GEOGRAPHIC_POINT_LOCATION_TEST_LIST1 = Arrays.asList(new String[] { GEOGRAPHIC_POINT_LOCATION_COL_TEST_VALUE1, GEOGRAPHIC_POINT_LOCATION_COL_TEST_VALUE2 });
	public static final List<String> GEOGRAPHIC_POINT_LOCATION_TEST_LIST2 = Arrays.asList(new String[] { GEOGRAPHIC_POINT_LOCATION_COL_TEST_VALUE3 });
	public static final String STANDARD_COMPLIANCE_COL_TEST_VALUE1 = "test 1 standardCompliance";
	public static final String STANDARD_COMPLIANCE_COL_TEST_VALUE2 = "test 2 standardCompliance";
	public static final String STANDARD_COMPLIANCE_COL_TEST_VALUE3 = "test 3 standardCompliance";
	public static final List<String> STANDARD_COMPLIANCE_TEST_LIST1 = Arrays.asList(new String[] { STANDARD_COMPLIANCE_COL_TEST_VALUE1, STANDARD_COMPLIANCE_COL_TEST_VALUE2 });
	public static final List<String> STANDARD_COMPLIANCE_TEST_LIST2 = Arrays.asList(new String[] { STANDARD_COMPLIANCE_COL_TEST_VALUE3 });
	public static final String MODEL_DATA_PREPROCESSING_COL_TEST_VALUE1 = "test 1 modelDataPreprocessing";
	public static final String MODEL_DATA_PREPROCESSING_COL_TEST_VALUE2 = "test 2 modelDataPreprocessing";
	public static final String MODEL_DATA_PREPROCESSING_COL_TEST_VALUE3 = "test 3 modelDataPreprocessing";
	public static final List<String> MODEL_DATA_PREPROCESSING_TEST_LIST1 = Arrays.asList(new String[] { MODEL_DATA_PREPROCESSING_COL_TEST_VALUE1, MODEL_DATA_PREPROCESSING_COL_TEST_VALUE2 });
	public static final List<String> MODEL_DATA_PREPROCESSING_TEST_LIST2 = Arrays.asList(new String[] { MODEL_DATA_PREPROCESSING_COL_TEST_VALUE3 });
	public static final String IDENTIFIER_LOCATOR_COL_TEST_VALUE1 = "test 1 identifierLocator";
	public static final String IDENTIFIER_LOCATOR_COL_TEST_VALUE2 = "test 2 identifierLocator";
	public static final String IDENTIFIER_LOCATOR_COL_TEST_VALUE3 = "test 3 identifierLocator";
	public static final List<String> IDENTIFIER_LOCATOR_TEST_LIST1 = Arrays.asList(new String[] { IDENTIFIER_LOCATOR_COL_TEST_VALUE1, IDENTIFIER_LOCATOR_COL_TEST_VALUE2 });
	public static final List<String> IDENTIFIER_LOCATOR_TEST_LIST2 = Arrays.asList(new String[] { IDENTIFIER_LOCATOR_COL_TEST_VALUE3 });
	public static final String ANONYMIZATION_METHOD_USED_COL_TEST_VALUE1 = "test 1 anonymizationMethodUsed";
	public static final String ANONYMIZATION_METHOD_USED_COL_TEST_VALUE2 = "test 2 anonymizationMethodUsed";
	public static final String ANONYMIZATION_METHOD_USED_COL_TEST_VALUE3 = "test 3 anonymizationMethodUsed";
	public static final List<String> ANONYMIZATION_METHOD_USED_TEST_LIST1 = Arrays.asList(new String[] { ANONYMIZATION_METHOD_USED_COL_TEST_VALUE1, ANONYMIZATION_METHOD_USED_COL_TEST_VALUE2 });
	public static final List<String> ANONYMIZATION_METHOD_USED_TEST_LIST2 = Arrays.asList(new String[] { ANONYMIZATION_METHOD_USED_COL_TEST_VALUE3 });
	public static final String REQUIREMENT_RATIONALE_COL_TEST_VALUE1 = "test 1 requirementRationale";
	public static final String REQUIREMENT_RATIONALE_COL_TEST_VALUE2 = "test 2 requirementRationale";
	public static final String REQUIREMENT_RATIONALE_COL_TEST_VALUE3 = "test 3 requirementRationale";
	public static final List<String> REQUIREMENT_RATIONALE_TEST_LIST1 = Arrays.asList(new String[] { REQUIREMENT_RATIONALE_COL_TEST_VALUE1, REQUIREMENT_RATIONALE_COL_TEST_VALUE2 });
	public static final List<String> REQUIREMENT_RATIONALE_TEST_LIST2 = Arrays.asList(new String[] { REQUIREMENT_RATIONALE_COL_TEST_VALUE3 });
	public static final SbomType SBOM_TYPE_COL_TEST_VALUE1 = SbomType.values()[0];
	public static final SbomType SBOM_TYPE_COL_TEST_VALUE2 = SbomType.values()[1];
	public static final List<SbomType> SBOM_TYPE_TEST_LIST1 = Arrays.asList(new SbomType[] { SBOM_TYPE_COL_TEST_VALUE1, SBOM_TYPE_COL_TEST_VALUE2 });
	public static final List<SbomType> SBOM_TYPE_TEST_LIST2 = Arrays.asList(new SbomType[] { SBOM_TYPE_COL_TEST_VALUE1 });
	public static final VerificationType VERIFICATION_METHOD_COL_TEST_VALUE1 = VerificationType.values()[0];
	public static final VerificationType VERIFICATION_METHOD_COL_TEST_VALUE2 = VerificationType.values()[1];
	public static final List<VerificationType> VERIFICATION_METHOD_TEST_LIST1 = Arrays.asList(new VerificationType[] { VERIFICATION_METHOD_COL_TEST_VALUE1, VERIFICATION_METHOD_COL_TEST_VALUE2 });
	public static final List<VerificationType> VERIFICATION_METHOD_TEST_LIST2 = Arrays.asList(new VerificationType[] { VERIFICATION_METHOD_COL_TEST_VALUE1 });
	public static final AuthenticationProtocolType SERVER_AUTHENTICATION_PROTOCOL_COL_TEST_VALUE1 = AuthenticationProtocolType.values()[0];
	public static final AuthenticationProtocolType SERVER_AUTHENTICATION_PROTOCOL_COL_TEST_VALUE2 = AuthenticationProtocolType.values()[1];
	public static final List<AuthenticationProtocolType> SERVER_AUTHENTICATION_PROTOCOL_TEST_LIST1 = Arrays.asList(new AuthenticationProtocolType[] { SERVER_AUTHENTICATION_PROTOCOL_COL_TEST_VALUE1, SERVER_AUTHENTICATION_PROTOCOL_COL_TEST_VALUE2 });
	public static final List<AuthenticationProtocolType> SERVER_AUTHENTICATION_PROTOCOL_TEST_LIST2 = Arrays.asList(new AuthenticationProtocolType[] { SERVER_AUTHENTICATION_PROTOCOL_COL_TEST_VALUE1 });
	public static final EvidenceType EVIDENCE_CATEGORY_COL_TEST_VALUE1 = EvidenceType.values()[0];
	public static final EvidenceType EVIDENCE_CATEGORY_COL_TEST_VALUE2 = EvidenceType.values()[1];
	public static final List<EvidenceType> EVIDENCE_CATEGORY_TEST_LIST1 = Arrays.asList(new EvidenceType[] { EVIDENCE_CATEGORY_COL_TEST_VALUE1, EVIDENCE_CATEGORY_COL_TEST_VALUE2 });
	public static final List<EvidenceType> EVIDENCE_CATEGORY_TEST_LIST2 = Arrays.asList(new EvidenceType[] { EVIDENCE_CATEGORY_COL_TEST_VALUE1 });
	public static final SupportType SUPPORT_LEVEL_COL_TEST_VALUE1 = SupportType.values()[0];
	public static final SupportType SUPPORT_LEVEL_COL_TEST_VALUE2 = SupportType.values()[1];
	public static final List<SupportType> SUPPORT_LEVEL_TEST_LIST1 = Arrays.asList(new SupportType[] { SUPPORT_LEVEL_COL_TEST_VALUE1, SUPPORT_LEVEL_COL_TEST_VALUE2 });
	public static final List<SupportType> SUPPORT_LEVEL_TEST_LIST2 = Arrays.asList(new SupportType[] { SUPPORT_LEVEL_COL_TEST_VALUE1 });
	public static final LifecycleScopeType DEV_LIFECYCLE_STAGE_COL_TEST_VALUE1 = LifecycleScopeType.values()[0];
	public static final LifecycleScopeType DEV_LIFECYCLE_STAGE_COL_TEST_VALUE2 = LifecycleScopeType.values()[1];
	public static final List<LifecycleScopeType> DEV_LIFECYCLE_STAGE_TEST_LIST1 = Arrays.asList(new LifecycleScopeType[] { DEV_LIFECYCLE_STAGE_COL_TEST_VALUE1, DEV_LIFECYCLE_STAGE_COL_TEST_VALUE2 });
	public static final List<LifecycleScopeType> DEV_LIFECYCLE_STAGE_TEST_LIST2 = Arrays.asList(new LifecycleScopeType[] { DEV_LIFECYCLE_STAGE_COL_TEST_VALUE1 });
	public static final ProfileIdentifierType PROFILE_CONFORMANCE_COL_TEST_VALUE1 = ProfileIdentifierType.values()[0];
	public static final ProfileIdentifierType PROFILE_CONFORMANCE_COL_TEST_VALUE2 = ProfileIdentifierType.values()[1];
	public static final List<ProfileIdentifierType> PROFILE_CONFORMANCE_TEST_LIST1 = Arrays.asList(new ProfileIdentifierType[] { PROFILE_CONFORMANCE_COL_TEST_VALUE1, PROFILE_CONFORMANCE_COL_TEST_VALUE2 });
	public static final List<ProfileIdentifierType> PROFILE_CONFORMANCE_TEST_LIST2 = Arrays.asList(new ProfileIdentifierType[] { PROFILE_CONFORMANCE_COL_TEST_VALUE1 });
	public static final SoftwarePurpose ADDITIONAL_PURPOSE_COL_TEST_VALUE1 = SoftwarePurpose.values()[0];
	public static final SoftwarePurpose ADDITIONAL_PURPOSE_COL_TEST_VALUE2 = SoftwarePurpose.values()[1];
	public static final List<SoftwarePurpose> ADDITIONAL_PURPOSE_TEST_LIST1 = Arrays.asList(new SoftwarePurpose[] { ADDITIONAL_PURPOSE_COL_TEST_VALUE1, ADDITIONAL_PURPOSE_COL_TEST_VALUE2 });
	public static final List<SoftwarePurpose> ADDITIONAL_PURPOSE_TEST_LIST2 = Arrays.asList(new SoftwarePurpose[] { ADDITIONAL_PURPOSE_COL_TEST_VALUE1 });
	public static final DatasetType DATASET_TYPE_COL_TEST_VALUE1 = DatasetType.values()[0];
	public static final DatasetType DATASET_TYPE_COL_TEST_VALUE2 = DatasetType.values()[1];
	public static final List<DatasetType> DATASET_TYPE_TEST_LIST1 = Arrays.asList(new DatasetType[] { DATASET_TYPE_COL_TEST_VALUE1, DATASET_TYPE_COL_TEST_VALUE2 });
	public static final List<DatasetType> DATASET_TYPE_TEST_LIST2 = Arrays.asList(new DatasetType[] { DATASET_TYPE_COL_TEST_VALUE1 });
	
	private IModelStore modelStore;
	private IModelCopyManager copyManager;
	CreationInfo creationInfo;
	
	public TestValuesGenerator(IModelStore modelStore, IModelCopyManager copyManager) throws InvalidSPDXAnalysisException {
		this.modelStore = modelStore;
		this.copyManager = copyManager;
		if (!ModelRegistry.getModelRegistry().containsSpecVersion("v3")) {
			ModelRegistry.getModelRegistry().registerModel(new TestSpdxModelInfo());
		}
		creationInfo = new CreationInfo.CreationInfoBuilder(modelStore, modelStore.getNextId(IdType.Anonymous), copyManager)
							.setCreated("2010-01-29T18:30:22Z")
							.setSpecVersion("3.1.0")
							.build();
		AgentBuilder agentBuilder = new AgentBuilder(modelStore, "https://unique/id" + modelStore.getNextId(IdType.SpdxId), copyManager);
		agentBuilder.setCreationInfo(creationInfo);
		agentBuilder.setName("Creator Name");
		creationInfo.getCreatedBys().add(agentBuilder.build());
	}
	
	public CreationInfoBuilder builderForCreationInfoTests(String objectUri) throws InvalidSPDXAnalysisException {
		CreationInfoBuilder retval = new CreationInfoBuilder(modelStore, objectUri, copyManager)
				.setSpecVersion(SPEC_VERSION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setCreated(CREATED_TEST_VALUE)
				.addCreatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addCreatedUsing(builderForToolTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		return retval;
	}
	
	public ElementCollectionBuilder builderForElementCollectionTests(String objectUri) throws InvalidSPDXAnalysisException {
		ElementCollectionBuilder retval = new MockElementCollection.MockElementCollectionBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addProfileConformance(PROFILE_CONFORMANCE_COL_TEST_VALUE1)
				.addProfileConformance(PROFILE_CONFORMANCE_COL_TEST_VALUE2)
				.addRootElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public AIPackageBuilder builderForAIPackageTests(String objectUri) throws InvalidSPDXAnalysisException {
		AIPackageBuilder retval = new AIPackageBuilder(modelStore, objectUri, copyManager)
				.setArtifactSize(ARTIFACT_SIZE_TEST_VALUE)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDownloadLocation(DOWNLOAD_LOCATION_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setCopyrightText(COPYRIGHT_TEXT_TEST_VALUE)
				.setLimitation(LIMITATION_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSourceInfo(SOURCE_INFO_TEST_VALUE)
				.setInformationAboutTraining(INFORMATION_ABOUT_TRAINING_TEST_VALUE)
				.setPackageUrl(PACKAGE_URL_TEST_VALUE)
				.setHomePage(HOME_PAGE_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setPackageVersion(PACKAGE_VERSION_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setInformationAboutApplication(INFORMATION_ABOUT_APPLICATION_TEST_VALUE)
				.addAttributionText(ATTRIBUTION_TEXT_COL_TEST_VALUE1)
				.addAttributionText(ATTRIBUTION_TEXT_COL_TEST_VALUE2)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addModelDataPreprocessing(MODEL_DATA_PREPROCESSING_COL_TEST_VALUE1)
				.addModelDataPreprocessing(MODEL_DATA_PREPROCESSING_COL_TEST_VALUE2)
				.addTypeOfModel(TYPE_OF_MODEL_COL_TEST_VALUE1)
				.addTypeOfModel(TYPE_OF_MODEL_COL_TEST_VALUE2)
				.addDomain(DOMAIN_COL_TEST_VALUE1)
				.addDomain(DOMAIN_COL_TEST_VALUE2)
				.addStandardCompliance(STANDARD_COMPLIANCE_COL_TEST_VALUE1)
				.addStandardCompliance(STANDARD_COMPLIANCE_COL_TEST_VALUE2)
				.addModelExplainability(MODEL_EXPLAINABILITY_COL_TEST_VALUE1)
				.addModelExplainability(MODEL_EXPLAINABILITY_COL_TEST_VALUE2)
				.setSafetyRiskAssessment(SAFETY_RISK_ASSESSMENT_TEST_VALUE1)
				.setUseSensitivePersonalInformation(USE_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE1)
				.setPrimaryPurpose(PRIMARY_PURPOSE_TEST_VALUE1)
				.setAutonomyType(AUTONOMY_TYPE_TEST_VALUE1)
				.setIsoAutomationLevel(ISO_AUTOMATION_LEVEL_TEST_VALUE1)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_COL_TEST_VALUE1)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setEnergyConsumption(builderForEnergyConsumptionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addHyperparameter(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addMetric(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addMetricDecisionThreshold(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addContentIdentifier(builderForContentIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public InspectionProcessBuilder builderForInspectionProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		InspectionProcessBuilder retval = new InspectionProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addPlannedInspectionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ResolutionActionBuilder builderForResolutionActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		ResolutionActionBuilder retval = new ResolutionActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public StorageProcessBuilder builderForStorageProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		StorageProcessBuilder retval = new StorageProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addPlannedStorageLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public HardwareBuilder builderForHardwareTests(String objectUri) throws InvalidSPDXAnalysisException {
		HardwareBuilder retval = new MockHardware.MockHardwareBuilder(modelStore, objectUri, copyManager)
				.setBatchNumber(BATCH_NUMBER_TEST_VALUE)
				.setSerialNumber(SERIAL_NUMBER_TEST_VALUE)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setPartNumber(PART_NUMBER_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseDate(RELEASE_DATE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setHardwareVersion(HARDWARE_VERSION_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setProductAgent(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addHardwareAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformationSpecification(builderForSpecificationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addHazard(builderForDefinedTypeTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addCategory(builderForDefinedTypeTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public DictionaryEntryBuilder builderForDictionaryEntryTests(String objectUri) throws InvalidSPDXAnalysisException {
		DictionaryEntryBuilder retval = new DictionaryEntryBuilder(modelStore, objectUri, copyManager)
				.setKey(KEY_TEST_VALUE)
				.setValue(VALUE_TEST_VALUE)
				;
		return retval;
	}
	
	public NamespaceMapBuilder builderForNamespaceMapTests(String objectUri) throws InvalidSPDXAnalysisException {
		NamespaceMapBuilder retval = new NamespaceMapBuilder(modelStore, objectUri, copyManager)
				.setNamespace(NAMESPACE_TEST_VALUE)
				.setPrefix(PREFIX_TEST_VALUE)
				;
		return retval;
	}
	
	public RegulationBuilder builderForRegulationTests(String objectUri) throws InvalidSPDXAnalysisException {
		RegulationBuilder retval = new RegulationBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setSpecType(SPEC_TYPE_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public PhysicalHardwareBuilder builderForPhysicalHardwareTests(String objectUri) throws InvalidSPDXAnalysisException {
		PhysicalHardwareBuilder retval = new PhysicalHardwareBuilder(modelStore, objectUri, copyManager)
				.setBatchNumber(BATCH_NUMBER_TEST_VALUE)
				.setSerialNumber(SERIAL_NUMBER_TEST_VALUE)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setPartNumber(PART_NUMBER_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseDate(RELEASE_DATE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setHardwareVersion(HARDWARE_VERSION_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setProductAgent(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setDimensions(builderForDimensionsTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setCenterOfMass(builderForDimensionsTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setMassOfHardware(builderForMeasureOfMassTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addHardwareAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformationSpecification(builderForSpecificationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addHazard(builderForDefinedTypeTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addCategory(builderForDefinedTypeTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ElementMapBuilder builderForElementMapTests(String objectUri) throws InvalidSPDXAnalysisException {
		ElementMapBuilder retval = new ElementMapBuilder(modelStore, objectUri, copyManager)
				.setKey(KEY_TEST_VALUE)
				.setElementValue(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		return retval;
	}
	
	public CustomLicenseBuilder builderForCustomLicenseTests(String objectUri) throws InvalidSPDXAnalysisException {
		CustomLicenseBuilder retval = new CustomLicenseBuilder(modelStore, objectUri, copyManager)
				.setIsFsfLibre(true)
				.setIsOsiApproved(true)
				.setIsDeprecatedLicenseId(true)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setObsoletedBy(OBSOLETED_BY_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setLicenseText(LICENSE_TEXT_TEST_VALUE)
				.setLicenseXml(LICENSE_XML_TEST_VALUE)
				.setStandardLicenseTemplate(STANDARD_LICENSE_TEMPLATE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setStandardLicenseHeader(STANDARD_LICENSE_HEADER_TEST_VALUE)
				.addSeeAlso(SEE_ALSO_COL_TEST_VALUE1)
				.addSeeAlso(SEE_ALSO_COL_TEST_VALUE2)
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public AnyLicenseInfoBuilder builderForAnyLicenseInfoTests(String objectUri) throws InvalidSPDXAnalysisException {
		AnyLicenseInfoBuilder retval = new AnyLicenseInfoBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ExploitCatalogVulnAssessmentRelationshipBuilder builderForExploitCatalogVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		ExploitCatalogVulnAssessmentRelationshipBuilder retval = new ExploitCatalogVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setExploited(true)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setSecurityLocator(SECURITY_LOCATOR_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setCatalogType(CATALOG_TYPE_TEST_VALUE1)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSecurityAssessedElement(builderForSoftwareArtifactTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public DisjunctiveLicenseSetBuilder builderForDisjunctiveLicenseSetTests(String objectUri) throws InvalidSPDXAnalysisException {
		DisjunctiveLicenseSetBuilder retval = new DisjunctiveLicenseSetBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addMember(builderForAnyLicenseInfoTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ManufactureProcessBuilder builderForManufactureProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		ManufactureProcessBuilder retval = new ManufactureProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public PhysicalLocationBuilder builderForPhysicalLocationTests(String objectUri) throws InvalidSPDXAnalysisException {
		PhysicalLocationBuilder retval = new PhysicalLocationBuilder(modelStore, objectUri, copyManager)
				.setCountyCode(COUNTY_CODE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setPostOfficeBoxNumber(POST_OFFICE_BOX_NUMBER_TEST_VALUE)
				.setCountry(COUNTRY_TEST_VALUE)
				.setPostalCode(POSTAL_CODE_TEST_VALUE)
				.setPostalName(POSTAL_NAME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProvinceStateCode(PROVINCE_STATE_CODE_TEST_VALUE)
				.setCity(CITY_TEST_VALUE)
				.setStreetAddress(STREET_ADDRESS_TEST_VALUE)
				.setLocationTime(LOCATION_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addGeographicPointLocation(GEOGRAPHIC_POINT_LOCATION_COL_TEST_VALUE1)
				.addGeographicPointLocation(GEOGRAPHIC_POINT_LOCATION_COL_TEST_VALUE2)
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public EvaluationResultBuilder builderForEvaluationResultTests(String objectUri) throws InvalidSPDXAnalysisException {
		EvaluationResultBuilder retval = new EvaluationResultBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setEvaluationRationale(EVALUATION_RATIONALE_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setEvaluation(EVALUATION_TEST_VALUE1)
				.setEvaluationBasedOn(builderForRequirementVerificationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public BoundaryCrossingActionBuilder builderForBoundaryCrossingActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		BoundaryCrossingActionBuilder retval = new BoundaryCrossingActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ExportControlClassificationBuilder builderForExportControlClassificationTests(String objectUri) throws InvalidSPDXAnalysisException {
		ExportControlClassificationBuilder retval = new ExportControlClassificationBuilder(modelStore, objectUri, copyManager)
				.setWeight(WEIGHT_TEST_VALUE)
				.setExportClassification(EXPORT_CLASSIFICATION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setExportingCountry(EXPORTING_COUNTRY_TEST_VALUE)
				.setExportControlSpecification(builderForSpecificationTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		return retval;
	}
	
	public ReproduceActionBuilder builderForReproduceActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		ReproduceActionBuilder retval = new ReproduceActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ManufactureActionBuilder builderForManufactureActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		ManufactureActionBuilder retval = new ManufactureActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ActionBuilder builderForActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		ActionBuilder retval = new MockAction.MockActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public SpdxFileBuilder builderForSpdxFileTests(String objectUri) throws InvalidSPDXAnalysisException {
		SpdxFileBuilder retval = new SpdxFileBuilder(modelStore, objectUri, copyManager)
				.setArtifactSize(ARTIFACT_SIZE_TEST_VALUE)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setCopyrightText(COPYRIGHT_TEXT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setContentType(CONTENT_TYPE_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addAttributionText(ATTRIBUTION_TEXT_COL_TEST_VALUE1)
				.addAttributionText(ATTRIBUTION_TEXT_COL_TEST_VALUE2)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setPrimaryPurpose(PRIMARY_PURPOSE_TEST_VALUE1)
				.setFileKind(FILE_KIND_TEST_VALUE1)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_COL_TEST_VALUE1)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addContentIdentifier(builderForContentIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public SbomBuilder builderForSbomTests(String objectUri) throws InvalidSPDXAnalysisException {
		SbomBuilder retval = new SbomBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setContext(CONTEXT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addSbomType(SBOM_TYPE_COL_TEST_VALUE1)
				.addSbomType(SBOM_TYPE_COL_TEST_VALUE2)
				.addProfileConformance(PROFILE_CONFORMANCE_COL_TEST_VALUE1)
				.addProfileConformance(PROFILE_CONFORMANCE_COL_TEST_VALUE2)
				.addRootElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public DestroyProcessBuilder builderForDestroyProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		DestroyProcessBuilder retval = new DestroyProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ExtensionBuilder builderForExtensionTests(String objectUri) throws InvalidSPDXAnalysisException {
		ExtensionBuilder retval = new ExtensionBuilder(modelStore, objectUri, copyManager)
				;
		return retval;
	}
	
	public LocationBuilder builderForLocationTests(String objectUri) throws InvalidSPDXAnalysisException {
		LocationBuilder retval = new MockLocation.MockLocationBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setLocationTime(LOCATION_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public DefinedTypeBuilder builderForDefinedTypeTests(String objectUri) throws InvalidSPDXAnalysisException {
		DefinedTypeBuilder retval = new DefinedTypeBuilder(modelStore, objectUri, copyManager)
				.setTypeFromSource(TYPE_FROM_SOURCE_TEST_VALUE)
				.setDefinitionSource(builderForSpecificationTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		return retval;
	}
	
	public LicenseAdditionBuilder builderForLicenseAdditionTests(String objectUri) throws InvalidSPDXAnalysisException {
		LicenseAdditionBuilder retval = new MockLicenseAddition.MockLicenseAdditionBuilder(modelStore, objectUri, copyManager)
				.setIsDeprecatedAdditionId(true)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setObsoletedBy(OBSOLETED_BY_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setLicenseXml(LICENSE_XML_TEST_VALUE)
				.setStandardAdditionTemplate(STANDARD_ADDITION_TEMPLATE_TEST_VALUE)
				.setAdditionText(ADDITION_TEXT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addSeeAlso(SEE_ALSO_COL_TEST_VALUE1)
				.addSeeAlso(SEE_ALSO_COL_TEST_VALUE2)
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public VulnAssessmentRelationshipBuilder builderForVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		VulnAssessmentRelationshipBuilder retval = new MockVulnAssessmentRelationship.MockVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSecurityAssessedElement(builderForSoftwareArtifactTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public CreateActionBuilder builderForCreateActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		CreateActionBuilder retval = new CreateActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public UnitOfMeasureBuilder builderForUnitOfMeasureTests(String objectUri) throws InvalidSPDXAnalysisException {
		UnitOfMeasureBuilder retval = new UnitOfMeasureBuilder(modelStore, objectUri, copyManager)
				.setUnitQUDT(UNIT_Q_U_D_T_TEST_VALUE)
				.setQuantity(QUANTITY_TEST_VALUE)
				;
		return retval;
	}
	
	public CvssV2VulnAssessmentRelationshipBuilder builderForCvssV2VulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		CvssV2VulnAssessmentRelationshipBuilder retval = new CvssV2VulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setScore(SCORE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setVectorString(VECTOR_STRING_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSecurityAssessedElement(builderForSoftwareArtifactTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public AssemblyProcessBuilder builderForAssemblyProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		AssemblyProcessBuilder retval = new AssemblyProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public PlanActionBuilder builderForPlanActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		PlanActionBuilder retval = new PlanActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public VexFixedVulnAssessmentRelationshipBuilder builderForVexFixedVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		VexFixedVulnAssessmentRelationshipBuilder retval = new VexFixedVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setStatusNotes(STATUS_NOTES_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setVexVersion(VEX_VERSION_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSecurityAssessedElement(builderForSoftwareArtifactTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public CvssV3VulnAssessmentRelationshipBuilder builderForCvssV3VulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		CvssV3VulnAssessmentRelationshipBuilder retval = new CvssV3VulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setScore(SCORE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setVectorString(VECTOR_STRING_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setSeverity(SEVERITY_TEST_VALUE1)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSecurityAssessedElement(builderForSoftwareArtifactTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public UseProcessBuilder builderForUseProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		UseProcessBuilder retval = new UseProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public StorageActionBuilder builderForStorageActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		StorageActionBuilder retval = new StorageActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
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
	
	public IndividualLicensingInfoBuilder builderForIndividualLicensingInfoTests(String objectUri) throws InvalidSPDXAnalysisException {
		IndividualLicensingInfoBuilder retval = new IndividualLicensingInfoBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public SoftwareServiceBuilder builderForSoftwareServiceTests(String objectUri) throws InvalidSPDXAnalysisException {
		SoftwareServiceBuilder retval = new SoftwareServiceBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addServiceHostingCountry(SERVICE_HOSTING_COUNTRY_COL_TEST_VALUE1)
				.addServiceHostingCountry(SERVICE_HOSTING_COUNTRY_COL_TEST_VALUE2)
				.addServerAuthenticationProtocol(SERVER_AUTHENTICATION_PROTOCOL_COL_TEST_VALUE1)
				.addServerAuthenticationProtocol(SERVER_AUTHENTICATION_PROTOCOL_COL_TEST_VALUE2)
				.addProvider(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ExternalIdentifierBuilder builderForExternalIdentifierTests(String objectUri) throws InvalidSPDXAnalysisException {
		ExternalIdentifierBuilder retval = new ExternalIdentifierBuilder(modelStore, objectUri, copyManager)
				.setIdentifier(IDENTIFIER_TEST_VALUE)
				.setIssuingAuthority(ISSUING_AUTHORITY_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.addIdentifierLocator(IDENTIFIER_LOCATOR_COL_TEST_VALUE1)
				.addIdentifierLocator(IDENTIFIER_LOCATOR_COL_TEST_VALUE2)
				.setExternalIdentifierType(EXTERNAL_IDENTIFIER_TYPE_TEST_VALUE1)
				;
		return retval;
	}
	
	public SimpleLicensingTextBuilder builderForSimpleLicensingTextTests(String objectUri) throws InvalidSPDXAnalysisException {
		SimpleLicensingTextBuilder retval = new SimpleLicensingTextBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setLicenseText(LICENSE_TEXT_TEST_VALUE)
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public SnippetBuilder builderForSnippetTests(String objectUri) throws InvalidSPDXAnalysisException {
		SnippetBuilder retval = new SnippetBuilder(modelStore, objectUri, copyManager)
				.setArtifactSize(ARTIFACT_SIZE_TEST_VALUE)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setCopyrightText(COPYRIGHT_TEXT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addAttributionText(ATTRIBUTION_TEXT_COL_TEST_VALUE1)
				.addAttributionText(ATTRIBUTION_TEXT_COL_TEST_VALUE2)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setPrimaryPurpose(PRIMARY_PURPOSE_TEST_VALUE1)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_COL_TEST_VALUE1)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSnippetFromFile(builderForSpdxFileTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setLineRange(builderForPositiveIntegerRangeTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setByteRange(builderForPositiveIntegerRangeTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addContentIdentifier(builderForContentIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public SoftwareArtifactBuilder builderForSoftwareArtifactTests(String objectUri) throws InvalidSPDXAnalysisException {
		SoftwareArtifactBuilder retval = new MockSoftwareArtifact.MockSoftwareArtifactBuilder(modelStore, objectUri, copyManager)
				.setArtifactSize(ARTIFACT_SIZE_TEST_VALUE)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setCopyrightText(COPYRIGHT_TEXT_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addAttributionText(ATTRIBUTION_TEXT_COL_TEST_VALUE1)
				.addAttributionText(ATTRIBUTION_TEXT_COL_TEST_VALUE2)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setPrimaryPurpose(PRIMARY_PURPOSE_TEST_VALUE1)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_COL_TEST_VALUE1)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addContentIdentifier(builderForContentIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public PersonBuilder builderForPersonTests(String objectUri) throws InvalidSPDXAnalysisException {
		PersonBuilder retval = new PersonBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public BoundaryDefinitionActionBuilder builderForBoundaryDefinitionActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		BoundaryDefinitionActionBuilder retval = new BoundaryDefinitionActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addBoundaryParameter(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public BomBuilder builderForBomTests(String objectUri) throws InvalidSPDXAnalysisException {
		BomBuilder retval = new BomBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setContext(CONTEXT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addProfileConformance(PROFILE_CONFORMANCE_COL_TEST_VALUE1)
				.addProfileConformance(PROFILE_CONFORMANCE_COL_TEST_VALUE2)
				.addRootElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public RequirementBuilder builderForRequirementTests(String objectUri) throws InvalidSPDXAnalysisException {
		RequirementBuilder retval = new RequirementBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setRequirementStatement(REQUIREMENT_STATEMENT_TEST_VALUE)
				.addRequirementRationale(REQUIREMENT_RATIONALE_COL_TEST_VALUE1)
				.addRequirementRationale(REQUIREMENT_RATIONALE_COL_TEST_VALUE2)
				.addDevLifecycleStage(DEV_LIFECYCLE_STAGE_COL_TEST_VALUE1)
				.addDevLifecycleStage(DEV_LIFECYCLE_STAGE_COL_TEST_VALUE2)
				.setRequirementUUID(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ExportControlClassificationAssessmentBuilder builderForExportControlClassificationAssessmentTests(String objectUri) throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessmentBuilder retval = new ExportControlClassificationAssessmentBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setAssessmentTimestamp(ASSESSMENT_TIMESTAMP_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setAssessedElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setAssessmentContext(builderForProjectTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setAssessor(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAssessmentResult(builderForExportControlClassificationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public TestActionBuilder builderForTestActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		TestActionBuilder retval = new TestActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public LifecycleScopedRelationshipBuilder builderForLifecycleScopedRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		LifecycleScopedRelationshipBuilder retval = new LifecycleScopedRelationshipBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setScope(SCOPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public SpdxPackageBuilder builderForSpdxPackageTests(String objectUri) throws InvalidSPDXAnalysisException {
		SpdxPackageBuilder retval = new SpdxPackageBuilder(modelStore, objectUri, copyManager)
				.setArtifactSize(ARTIFACT_SIZE_TEST_VALUE)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDownloadLocation(DOWNLOAD_LOCATION_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setCopyrightText(COPYRIGHT_TEXT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSourceInfo(SOURCE_INFO_TEST_VALUE)
				.setPackageUrl(PACKAGE_URL_TEST_VALUE)
				.setHomePage(HOME_PAGE_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setPackageVersion(PACKAGE_VERSION_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addAttributionText(ATTRIBUTION_TEXT_COL_TEST_VALUE1)
				.addAttributionText(ATTRIBUTION_TEXT_COL_TEST_VALUE2)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setPrimaryPurpose(PRIMARY_PURPOSE_TEST_VALUE1)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_COL_TEST_VALUE1)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addContentIdentifier(builderForContentIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public DimensionsBuilder builderForDimensionsTests(String objectUri) throws InvalidSPDXAnalysisException {
		DimensionsBuilder retval = new DimensionsBuilder(modelStore, objectUri, copyManager)
				.setYAxisLength(builderForMeasureOfLengthTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setZAxisLength(builderForMeasureOfLengthTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setXAxisLength(builderForMeasureOfLengthTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		return retval;
	}
	
	public DestroyActionBuilder builderForDestroyActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		DestroyActionBuilder retval = new DestroyActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addDestructionPerformedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ExternalRefBuilder builderForExternalRefTests(String objectUri) throws InvalidSPDXAnalysisException {
		ExternalRefBuilder retval = new ExternalRefBuilder(modelStore, objectUri, copyManager)
				.setComment(COMMENT_TEST_VALUE)
				.setContentType(CONTENT_TYPE_TEST_VALUE)
				.addLocator(LOCATOR_COL_TEST_VALUE1)
				.addLocator(LOCATOR_COL_TEST_VALUE2)
				.setExternalRefType(EXTERNAL_REF_TYPE_TEST_VALUE1)
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
	
	public OrLaterOperatorBuilder builderForOrLaterOperatorTests(String objectUri) throws InvalidSPDXAnalysisException {
		OrLaterOperatorBuilder retval = new OrLaterOperatorBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setSubjectLicense(builderForLicenseTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public VirtualHardwareBuilder builderForVirtualHardwareTests(String objectUri) throws InvalidSPDXAnalysisException {
		VirtualHardwareBuilder retval = new VirtualHardwareBuilder(modelStore, objectUri, copyManager)
				.setBatchNumber(BATCH_NUMBER_TEST_VALUE)
				.setSerialNumber(SERIAL_NUMBER_TEST_VALUE)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setPartNumber(PART_NUMBER_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseDate(RELEASE_DATE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setHardwareVersion(HARDWARE_VERSION_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setVirtualHardwareModel(VIRTUAL_HARDWARE_MODEL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setProductAgent(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addHardwareAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformationSpecification(builderForSpecificationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addHazard(builderForDefinedTypeTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addCategory(builderForDefinedTypeTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public DefinedStateProcessBuilder builderForDefinedStateProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		DefinedStateProcessBuilder retval = new DefinedStateProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addValidState(builderForStateTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public VexAffectedVulnAssessmentRelationshipBuilder builderForVexAffectedVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		VexAffectedVulnAssessmentRelationshipBuilder retval = new VexAffectedVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setStatusNotes(STATUS_NOTES_TEST_VALUE)
				.setActionStatementTime(ACTION_STATEMENT_TIME_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setActionStatement(ACTION_STATEMENT_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setVexVersion(VEX_VERSION_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSecurityAssessedElement(builderForSoftwareArtifactTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public LicenseBuilder builderForLicenseTests(String objectUri) throws InvalidSPDXAnalysisException {
		LicenseBuilder retval = new MockLicense.MockLicenseBuilder(modelStore, objectUri, copyManager)
				.setIsFsfLibre(true)
				.setIsOsiApproved(true)
				.setIsDeprecatedLicenseId(true)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setObsoletedBy(OBSOLETED_BY_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setLicenseText(LICENSE_TEXT_TEST_VALUE)
				.setLicenseXml(LICENSE_XML_TEST_VALUE)
				.setStandardLicenseTemplate(STANDARD_LICENSE_TEMPLATE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setStandardLicenseHeader(STANDARD_LICENSE_HEADER_TEST_VALUE)
				.addSeeAlso(SEE_ALSO_COL_TEST_VALUE1)
				.addSeeAlso(SEE_ALSO_COL_TEST_VALUE2)
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ModifyActionBuilder builderForModifyActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		ModifyActionBuilder retval = new ModifyActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ModifyProcessBuilder builderForModifyProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		ModifyProcessBuilder retval = new ModifyProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public VexNotAffectedVulnAssessmentRelationshipBuilder builderForVexNotAffectedVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		VexNotAffectedVulnAssessmentRelationshipBuilder retval = new VexNotAffectedVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setImpactStatement(IMPACT_STATEMENT_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setStatusNotes(STATUS_NOTES_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setImpactStatementTime(IMPACT_STATEMENT_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setVexVersion(VEX_VERSION_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setJustificationType(JUSTIFICATION_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSecurityAssessedElement(builderForSoftwareArtifactTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ResponsibilityChangeProcessBuilder builderForResponsibilityChangeProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcessBuilder retval = new ResponsibilityChangeProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.setResponsibilityCategory(RESPONSIBILITY_CATEGORY_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setPlannedPrevious(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setPlannedCurrent(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addPlannedProductOfResponsibilityChange(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ResponsibilityChangeActionBuilder builderForResponsibilityChangeActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		ResponsibilityChangeActionBuilder retval = new ResponsibilityChangeActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setResponsibilityCategory(RESPONSIBILITY_CATEGORY_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setCurrent(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setPrevious(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addResponsibilityChangedOn(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public AnnotationBuilder builderForAnnotationTests(String objectUri) throws InvalidSPDXAnalysisException {
		AnnotationBuilder retval = new AnnotationBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setStatement(STATEMENT_TEST_VALUE)
				.setContentType(CONTENT_TYPE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setAnnotationType(ANNOTATION_TYPE_TEST_VALUE1)
				.setSubject(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public LicenseExpressionBuilder builderForLicenseExpressionTests(String objectUri) throws InvalidSPDXAnalysisException {
		LicenseExpressionBuilder retval = new LicenseExpressionBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setLicenseExpression(LICENSE_EXPRESSION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setLicenseListVersion(LICENSE_LIST_VERSION_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addCustomIdToLicense(builderForElementMapTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addCustomIdToUri(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
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
	
	public PositiveIntegerRangeBuilder builderForPositiveIntegerRangeTests(String objectUri) throws InvalidSPDXAnalysisException {
		PositiveIntegerRangeBuilder retval = new PositiveIntegerRangeBuilder(modelStore, objectUri, copyManager)
				.setBeginIntegerRange(BEGIN_INTEGER_RANGE_TEST_VALUE)
				.setEndIntegerRange(END_INTEGER_RANGE_TEST_VALUE)
				;
		return retval;
	}
	
	public WithAdditionOperatorBuilder builderForWithAdditionOperatorTests(String objectUri) throws InvalidSPDXAnalysisException {
		WithAdditionOperatorBuilder retval = new WithAdditionOperatorBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setSubjectAddition(builderForLicenseAdditionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSubjectExtendableLicense(builderForExtendableLicenseTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ElementBuilder builderForElementTests(String objectUri) throws InvalidSPDXAnalysisException {
		ElementBuilder retval = new MockElement.MockElementBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public SpdxDocumentBuilder builderForSpdxDocumentTests(String objectUri) throws InvalidSPDXAnalysisException {
		SpdxDocumentBuilder retval = new SpdxDocumentBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addProfileConformance(PROFILE_CONFORMANCE_COL_TEST_VALUE1)
				.addProfileConformance(PROFILE_CONFORMANCE_COL_TEST_VALUE2)
				.setDataLicense(builderForAnyLicenseInfoTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addRootElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addNamespaceMap(builderForNamespaceMapTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addSpdxImport(builderForExternalMapTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public InspectionActionBuilder builderForInspectionActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		InspectionActionBuilder retval = new InspectionActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public IndividualElementBuilder builderForIndividualElementTests(String objectUri) throws InvalidSPDXAnalysisException {
		IndividualElementBuilder retval = new IndividualElementBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public CvssV4VulnAssessmentRelationshipBuilder builderForCvssV4VulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		CvssV4VulnAssessmentRelationshipBuilder retval = new CvssV4VulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setScore(SCORE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setVectorString(VECTOR_STRING_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setSeverity(SEVERITY_TEST_VALUE1)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSecurityAssessedElement(builderForSoftwareArtifactTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public DatasetPackageBuilder builderForDatasetPackageTests(String objectUri) throws InvalidSPDXAnalysisException {
		DatasetPackageBuilder retval = new DatasetPackageBuilder(modelStore, objectUri, copyManager)
				.setDatasetSize(DATASET_SIZE_TEST_VALUE)
				.setArtifactSize(ARTIFACT_SIZE_TEST_VALUE)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDownloadLocation(DOWNLOAD_LOCATION_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setDatasetNoise(DATASET_NOISE_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setDataCollectionProcess(DATA_COLLECTION_PROCESS_TEST_VALUE)
				.setCopyrightText(COPYRIGHT_TEXT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSourceInfo(SOURCE_INFO_TEST_VALUE)
				.setPackageUrl(PACKAGE_URL_TEST_VALUE)
				.setHomePage(HOME_PAGE_TEST_VALUE)
				.setDatasetUpdateMechanism(DATASET_UPDATE_MECHANISM_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setPackageVersion(PACKAGE_VERSION_TEST_VALUE)
				.setDatasetIntendedUse(DATASET_INTENDED_USE_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addDataPreprocessing(DATA_PREPROCESSING_COL_TEST_VALUE1)
				.addDataPreprocessing(DATA_PREPROCESSING_COL_TEST_VALUE2)
				.addAttributionText(ATTRIBUTION_TEXT_COL_TEST_VALUE1)
				.addAttributionText(ATTRIBUTION_TEXT_COL_TEST_VALUE2)
				.addAnonymizationMethodUsed(ANONYMIZATION_METHOD_USED_COL_TEST_VALUE1)
				.addAnonymizationMethodUsed(ANONYMIZATION_METHOD_USED_COL_TEST_VALUE2)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addKnownBias(KNOWN_BIAS_COL_TEST_VALUE1)
				.addKnownBias(KNOWN_BIAS_COL_TEST_VALUE2)
				.addInLanguage(IN_LANGUAGE_COL_TEST_VALUE1)
				.addInLanguage(IN_LANGUAGE_COL_TEST_VALUE2)
				.setHasSensitivePersonalInformation(HAS_SENSITIVE_PERSONAL_INFORMATION_TEST_VALUE1)
				.setPrimaryPurpose(PRIMARY_PURPOSE_TEST_VALUE1)
				.setDatasetAvailability(DATASET_AVAILABILITY_TEST_VALUE1)
				.setConfidentialityLevel(CONFIDENTIALITY_LEVEL_TEST_VALUE1)
				.addDatasetType(DATASET_TYPE_COL_TEST_VALUE1)
				.addDatasetType(DATASET_TYPE_COL_TEST_VALUE2)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_COL_TEST_VALUE1)
				.addAdditionalPurpose(ADDITIONAL_PURPOSE_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addContentIdentifier(builderForContentIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addSensor(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public HarvestActionBuilder builderForHarvestActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		HarvestActionBuilder retval = new HarvestActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public HarvestProcessBuilder builderForHarvestProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		HarvestProcessBuilder retval = new HarvestProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
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
	
	public EnergyConsumptionBuilder builderForEnergyConsumptionTests(String objectUri) throws InvalidSPDXAnalysisException {
		EnergyConsumptionBuilder retval = new EnergyConsumptionBuilder(modelStore, objectUri, copyManager)
				.addInferenceEnergyConsumption(builderForEnergyConsumptionDescriptionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTrainingEnergyConsumption(builderForEnergyConsumptionDescriptionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addFinetuningEnergyConsumption(builderForEnergyConsumptionDescriptionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		return retval;
	}
	
	public AssemblyActionBuilder builderForAssemblyActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		AssemblyActionBuilder retval = new AssemblyActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
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
	
	public ToolBuilder builderForToolTests(String objectUri) throws InvalidSPDXAnalysisException {
		ToolBuilder retval = new ToolBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ProductSpecificationBuilder builderForProductSpecificationTests(String objectUri) throws InvalidSPDXAnalysisException {
		ProductSpecificationBuilder retval = new ProductSpecificationBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addPartNumber(PART_NUMBER_COL_TEST_VALUE1)
				.addPartNumber(PART_NUMBER_COL_TEST_VALUE2)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addItemVersion(ITEM_VERSION_COL_TEST_VALUE1)
				.addItemVersion(ITEM_VERSION_COL_TEST_VALUE2)
				.setSpecType(SPEC_TYPE_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addHazard(builderForDefinedTypeTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public CdxPropertyEntryBuilder builderForCdxPropertyEntryTests(String objectUri) throws InvalidSPDXAnalysisException {
		CdxPropertyEntryBuilder retval = new CdxPropertyEntryBuilder(modelStore, objectUri, copyManager)
				.setCdxPropValue(CDX_PROP_VALUE_TEST_VALUE)
				.setCdxPropName(CDX_PROP_NAME_TEST_VALUE)
				;
		return retval;
	}
	
	public BundleBuilder builderForBundleTests(String objectUri) throws InvalidSPDXAnalysisException {
		BundleBuilder retval = new BundleBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setContext(CONTEXT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addProfileConformance(PROFILE_CONFORMANCE_COL_TEST_VALUE1)
				.addProfileConformance(PROFILE_CONFORMANCE_COL_TEST_VALUE2)
				.addRootElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public CreateProcessBuilder builderForCreateProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		CreateProcessBuilder retval = new CreateProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ListedLicenseBuilder builderForListedLicenseTests(String objectUri) throws InvalidSPDXAnalysisException {
		ListedLicenseBuilder retval = new ListedLicenseBuilder(modelStore, objectUri, copyManager)
				.setIsFsfLibre(true)
				.setIsOsiApproved(true)
				.setIsDeprecatedLicenseId(true)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setDeprecatedVersion(DEPRECATED_VERSION_TEST_VALUE)
				.setObsoletedBy(OBSOLETED_BY_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setLicenseText(LICENSE_TEXT_TEST_VALUE)
				.setLicenseXml(LICENSE_XML_TEST_VALUE)
				.setStandardLicenseTemplate(STANDARD_LICENSE_TEMPLATE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setStandardLicenseHeader(STANDARD_LICENSE_HEADER_TEST_VALUE)
				.setListVersionAdded(LIST_VERSION_ADDED_TEST_VALUE)
				.addSeeAlso(SEE_ALSO_COL_TEST_VALUE1)
				.addSeeAlso(SEE_ALSO_COL_TEST_VALUE2)
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ChangeProcessBuilder builderForChangeProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		ChangeProcessBuilder retval = new ChangeProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ProjectBuilder builderForProjectTests(String objectUri) throws InvalidSPDXAnalysisException {
		ProjectBuilder retval = new ProjectBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setProjectStartTime(PROJECT_START_TIME_TEST_VALUE)
				.setProjectEndTime(PROJECT_END_TIME_TEST_VALUE)
				.setProjectTitle(PROJECT_TITLE_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setContext(CONTEXT_TEST_VALUE)
				.setProjectContract(PROJECT_CONTRACT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addProfileConformance(PROFILE_CONFORMANCE_COL_TEST_VALUE1)
				.addProfileConformance(PROFILE_CONFORMANCE_COL_TEST_VALUE2)
				.setProjectOwner(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addRootElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addProjectSponsor(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addElement(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public MeasureOfLengthBuilder builderForMeasureOfLengthTests(String objectUri) throws InvalidSPDXAnalysisException {
		MeasureOfLengthBuilder retval = new MeasureOfLengthBuilder(modelStore, objectUri, copyManager)
				.setUnitQUDT(UNIT_Q_U_D_T_TEST_VALUE)
				.setQuantity(QUANTITY_TEST_VALUE)
				;
		return retval;
	}
	
	public SoftwareAgentBuilder builderForSoftwareAgentTests(String objectUri) throws InvalidSPDXAnalysisException {
		SoftwareAgentBuilder retval = new SoftwareAgentBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public AgentBuilder builderForAgentTests(String objectUri) throws InvalidSPDXAnalysisException {
		AgentBuilder retval = new AgentBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ArtifactBuilder builderForArtifactTests(String objectUri) throws InvalidSPDXAnalysisException {
		ArtifactBuilder retval = new MockArtifact.MockArtifactBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public TransportActionBuilder builderForTransportActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		TransportActionBuilder retval = new TransportActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addTransportRoute(TRANSPORT_ROUTE_COL_TEST_VALUE1)
				.addTransportRoute(TRANSPORT_ROUTE_COL_TEST_VALUE2)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addDropoffLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addPickupLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public CustomLicenseAdditionBuilder builderForCustomLicenseAdditionTests(String objectUri) throws InvalidSPDXAnalysisException {
		CustomLicenseAdditionBuilder retval = new CustomLicenseAdditionBuilder(modelStore, objectUri, copyManager)
				.setIsDeprecatedAdditionId(true)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setObsoletedBy(OBSOLETED_BY_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setLicenseXml(LICENSE_XML_TEST_VALUE)
				.setStandardAdditionTemplate(STANDARD_ADDITION_TEMPLATE_TEST_VALUE)
				.setAdditionText(ADDITION_TEXT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addSeeAlso(SEE_ALSO_COL_TEST_VALUE1)
				.addSeeAlso(SEE_ALSO_COL_TEST_VALUE2)
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public OrganizationBuilder builderForOrganizationTests(String objectUri) throws InvalidSPDXAnalysisException {
		OrganizationBuilder retval = new OrganizationBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addHeadquartersLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public BuildBuilder builderForBuildTests(String objectUri) throws InvalidSPDXAnalysisException {
		BuildBuilder retval = new BuildBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuildEndTime(BUILD_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setBuildType(BUILD_TYPE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setBuildId(BUILD_ID_TEST_VALUE)
				.setBuildStartTime(BUILD_START_TIME_TEST_VALUE)
				.addConfigSourceEntrypoint(CONFIG_SOURCE_ENTRYPOINT_COL_TEST_VALUE1)
				.addConfigSourceEntrypoint(CONFIG_SOURCE_ENTRYPOINT_COL_TEST_VALUE2)
				.addConfigSourceUri(CONFIG_SOURCE_URI_COL_TEST_VALUE1)
				.addConfigSourceUri(CONFIG_SOURCE_URI_COL_TEST_VALUE2)
				.addParameter(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addConfigSourceDigest(builderForHashTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addEnvironment(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public TransportProcessBuilder builderForTransportProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		TransportProcessBuilder retval = new TransportProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addPlannedTransportRoutes(PLANNED_TRANSPORT_ROUTES_COL_TEST_VALUE1)
				.addPlannedTransportRoutes(PLANNED_TRANSPORT_ROUTES_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addForPickupLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addForDropoffLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public EpssVulnAssessmentRelationshipBuilder builderForEpssVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		EpssVulnAssessmentRelationshipBuilder retval = new EpssVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setPercentile(PERCENTILE_TEST_VALUE)
				.setProbability(PROBABILITY_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSecurityAssessedElement(builderForSoftwareArtifactTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public PackageVerificationCodeBuilder builderForPackageVerificationCodeTests(String objectUri) throws InvalidSPDXAnalysisException {
		PackageVerificationCodeBuilder retval = new PackageVerificationCodeBuilder(modelStore, objectUri, copyManager)
				.setHashValue(HASH_VALUE_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.addPackageVerificationCodeExcludedFile(PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_COL_TEST_VALUE1)
				.addPackageVerificationCodeExcludedFile(PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_COL_TEST_VALUE2)
				.setAlgorithm(ALGORITHM_TEST_VALUE1)
				;
		return retval;
	}
	
	public ExtendableLicenseBuilder builderForExtendableLicenseTests(String objectUri) throws InvalidSPDXAnalysisException {
		ExtendableLicenseBuilder retval = new ExtendableLicenseBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public SsvcVulnAssessmentRelationshipBuilder builderForSsvcVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		SsvcVulnAssessmentRelationshipBuilder retval = new SsvcVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setDecisionType(DECISION_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSecurityAssessedElement(builderForSoftwareArtifactTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ListedLicenseExceptionBuilder builderForListedLicenseExceptionTests(String objectUri) throws InvalidSPDXAnalysisException {
		ListedLicenseExceptionBuilder retval = new ListedLicenseExceptionBuilder(modelStore, objectUri, copyManager)
				.setIsDeprecatedAdditionId(true)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setDeprecatedVersion(DEPRECATED_VERSION_TEST_VALUE)
				.setObsoletedBy(OBSOLETED_BY_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setLicenseXml(LICENSE_XML_TEST_VALUE)
				.setStandardAdditionTemplate(STANDARD_ADDITION_TEMPLATE_TEST_VALUE)
				.setAdditionText(ADDITION_TEXT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setListVersionAdded(LIST_VERSION_ADDED_TEST_VALUE)
				.addSeeAlso(SEE_ALSO_COL_TEST_VALUE1)
				.addSeeAlso(SEE_ALSO_COL_TEST_VALUE2)
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public RequirementVerificationBuilder builderForRequirementVerificationTests(String objectUri) throws InvalidSPDXAnalysisException {
		RequirementVerificationBuilder retval = new RequirementVerificationBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setVerificationRationale(VERIFICATION_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addVerificationPostcondition(VERIFICATION_POSTCONDITION_COL_TEST_VALUE1)
				.addVerificationPostcondition(VERIFICATION_POSTCONDITION_COL_TEST_VALUE2)
				.addVerificationPrecondition(VERIFICATION_PRECONDITION_COL_TEST_VALUE1)
				.addVerificationPrecondition(VERIFICATION_PRECONDITION_COL_TEST_VALUE2)
				.addVerificationMethod(VERIFICATION_METHOD_COL_TEST_VALUE1)
				.addVerificationMethod(VERIFICATION_METHOD_COL_TEST_VALUE2)
				.setVerificationUUID(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public DefinedProcessBuilder builderForDefinedProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		DefinedProcessBuilder retval = new MockDefinedProcess.MockDefinedProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public StateBuilder builderForStateTests(String objectUri) throws InvalidSPDXAnalysisException {
		StateBuilder retval = new StateBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public TestProcessBuilder builderForTestProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		TestProcessBuilder retval = new TestProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ChangeActionBuilder builderForChangeActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		ChangeActionBuilder retval = new ChangeActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public SupportRelationshipBuilder builderForSupportRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		SupportRelationshipBuilder retval = new SupportRelationshipBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setSupportLevel(SUPPORT_LEVEL_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public UseActionBuilder builderForUseActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		UseActionBuilder retval = new UseActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public VexVulnAssessmentRelationshipBuilder builderForVexVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		VexVulnAssessmentRelationshipBuilder retval = new MockVexVulnAssessmentRelationship.MockVexVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setStatusNotes(STATUS_NOTES_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setVexVersion(VEX_VERSION_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSecurityAssessedElement(builderForSoftwareArtifactTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public EvidenceRelationshipBuilder builderForEvidenceRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		EvidenceRelationshipBuilder retval = new EvidenceRelationshipBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.addEvidenceCategory(EVIDENCE_CATEGORY_COL_TEST_VALUE1)
				.addEvidenceCategory(EVIDENCE_CATEGORY_COL_TEST_VALUE2)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setEvidenceUUID(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public PlanProcessBuilder builderForPlanProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		PlanProcessBuilder retval = new PlanProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ContactPointRelationshipBuilder builderForContactPointRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		ContactPointRelationshipBuilder retval = new ContactPointRelationshipBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setContactType(CONTACT_TYPE_TEST_VALUE1)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ConjunctiveLicenseSetBuilder builderForConjunctiveLicenseSetTests(String objectUri) throws InvalidSPDXAnalysisException {
		ConjunctiveLicenseSetBuilder retval = new ConjunctiveLicenseSetBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addMember(builderForAnyLicenseInfoTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public VexUnderInvestigationVulnAssessmentRelationshipBuilder builderForVexUnderInvestigationVulnAssessmentRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		VexUnderInvestigationVulnAssessmentRelationshipBuilder retval = new VexUnderInvestigationVulnAssessmentRelationshipBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setStatusNotes(STATUS_NOTES_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setVexVersion(VEX_VERSION_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSecurityAssessedElement(builderForSoftwareArtifactTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public MeasureOfMassBuilder builderForMeasureOfMassTests(String objectUri) throws InvalidSPDXAnalysisException {
		MeasureOfMassBuilder retval = new MeasureOfMassBuilder(modelStore, objectUri, copyManager)
				.setUnitQUDT(UNIT_Q_U_D_T_TEST_VALUE)
				.setQuantity(QUANTITY_TEST_VALUE)
				;
		return retval;
	}
	
	public BulkHardwareBuilder builderForBulkHardwareTests(String objectUri) throws InvalidSPDXAnalysisException {
		BulkHardwareBuilder retval = new BulkHardwareBuilder(modelStore, objectUri, copyManager)
				.setBatchNumber(BATCH_NUMBER_TEST_VALUE)
				.setSerialNumber(SERIAL_NUMBER_TEST_VALUE)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setPartNumber(PART_NUMBER_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseDate(RELEASE_DATE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setHardwareVersion(HARDWARE_VERSION_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setProductAgent(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setBulkQuantity(builderForUnitOfMeasureTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addHardwareAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformationSpecification(builderForSpecificationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addHazard(builderForDefinedTypeTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addCategory(builderForDefinedTypeTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public InstantiateVirtualHardwareProcessBuilder builderForInstantiateVirtualHardwareProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcessBuilder retval = new InstantiateVirtualHardwareProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public ReproduceProcessBuilder builderForReproduceProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		ReproduceProcessBuilder retval = new ReproduceProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public StateActionBuilder builderForStateActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		StateActionBuilder retval = new StateActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setDecisionProcess(builderForDefinedStateProcessTests(modelStore.getNextId(IdType.SpdxId)).build())
				.setCurrentState(builderForStateTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public SpecificationBuilder builderForSpecificationTests(String objectUri) throws InvalidSPDXAnalysisException {
		SpecificationBuilder retval = new SpecificationBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setSpecType(SPEC_TYPE_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public OutOfSpecActionBuilder builderForOutOfSpecActionTests(String objectUri) throws InvalidSPDXAnalysisException {
		OutOfSpecActionBuilder retval = new OutOfSpecActionBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setActionEndTime(ACTION_END_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setActionStartTime(ACTION_START_TIME_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addActionLocation(builderForLocationTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addAdditionalInformation(builderForDictionaryEntryTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
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
	
	public VulnerabilityBuilder builderForVulnerabilityTests(String objectUri) throws InvalidSPDXAnalysisException {
		VulnerabilityBuilder retval = new VulnerabilityBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setPublishedTime(PUBLISHED_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setModifiedTime(MODIFIED_TIME_TEST_VALUE)
				.setWithdrawnTime(WITHDRAWN_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public BoundaryDefinitionProcessBuilder builderForBoundaryDefinitionProcessTests(String objectUri) throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcessBuilder retval = new BoundaryDefinitionProcessBuilder(modelStore, objectUri, copyManager)
				.setIntendedUse(INTENDED_USE_TEST_VALUE)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setBuiltTime(BUILT_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setProcessVersion(PROCESS_VERSION_TEST_VALUE)
				.setValidUntilTime(VALID_UNTIL_TIME_TEST_VALUE)
				.setReleaseTime(RELEASE_TIME_TEST_VALUE)
				.setProcessRationale(PROCESS_RATIONALE_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE1)
				.addStandardName(STANDARD_NAME_COL_TEST_VALUE2)
				.setProcessReadiness(PROCESS_READINESS_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE1)
				.addSupportLevel(SUPPORT_LEVEL_COL_TEST_VALUE2)
				.setSuppliedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addOriginatedBy(builderForAgentTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
	public RelationshipBuilder builderForRelationshipTests(String objectUri) throws InvalidSPDXAnalysisException {
		RelationshipBuilder retval = new RelationshipBuilder(modelStore, objectUri, copyManager)
				.setDescription(DESCRIPTION_TEST_VALUE)
				.setStartTime(START_TIME_TEST_VALUE)
				.setComment(COMMENT_TEST_VALUE)
				.setEndTime(END_TIME_TEST_VALUE)
				.setName(NAME_TEST_VALUE)
				.setSummary(SUMMARY_TEST_VALUE)
				.setCompleteness(COMPLETENESS_TEST_VALUE1)
				.setRelationshipType(RELATIONSHIP_TYPE_TEST_VALUE1)
				.setFrom(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addVerifiedUsing(builderForIntegrityMethodTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalRef(builderForExternalRefTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExternalIdentifier(builderForExternalIdentifierTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addExtension(builderForExtensionTests(modelStore.getNextId(IdType.SpdxId)).build())
				.addTo(builderForElementTests(modelStore.getNextId(IdType.SpdxId)).build())
				;
		retval.setCreationInfo(creationInfo);
		return retval;
	}
	
}
