/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.core;

import org.spdx.core.IndividualUriValue;

/**
 * Information about the relationship between two Elements. 
 */
public enum RelationshipType implements IndividualUriValue {

	REPORTED_BY("reportedBy"),
	HAS_DECLARED_LICENSE("hasDeclaredLicense"),
	UNDER_INVESTIGATION_FOR("underInvestigationFor"),
	TESTED_ON("testedOn"),
	PROVIDES_SUPPORT_FOR("providesSupportFor"),
	MODIFIED_BY("modifiedBy"),
	RESOLVED("resolved"),
	FOUND_BY("foundBy"),
	HAS_PREREQUISITE("hasPrerequisite"),
	REPUBLISHED_BY("republishedBy"),
	HAS_ADDED_FILE("hasAddedFile"),
	LOCATED_AT("locatedAt"),
	USES_TOOL("usesTool"),
	CONFIGURES("configures"),
	HAS_ASSOCIATED_VULNERABILITY("hasAssociatedVulnerability"),
	PERFORMED_BY("performedBy"),
	AVAILABLE_FROM("availableFrom"),
	RUNS_ON("runsOn"),
	FIXED_BY("fixedBy"),
	HAS_OUTPUT("hasOutput"),
	HAS_DELETED_FILE("hasDeletedFile"),
	GENERATES("generates"),
	HAS_ASSESSMENT_FOR("hasAssessmentFor"),
	PATCHED_BY("patchedBy"),
	HAS_DEPENDENCY_MANIFEST("hasDependencyManifest"),
	COORDINATED_BY("coordinatedBy"),
	IMPLEMENTED_BY("implementedBy"),
	TRACED_TO_DETAIL("tracedToDetail"),
	HAS_CONTACT_POINT("hasContactPoint"),
	HAS_EVIDENCE("hasEvidence"),
	HAS_TEST("hasTest"),
	FOLLOWS("follows"),
	DEPENDS_ON("dependsOn"),
	ANCESTOR_OF("ancestorOf"),
	HAS_SPECIFICATION("hasSpecification"),
	EXPANDS_TO("expandsTo"),
	HAS_DISTRIBUTION_ARTIFACT("hasDistributionArtifact"),
	HAS_INPUT("hasInput"),
	DESCRIBES("describes"),
	CONTAINS("contains"),
	VALIDATED_ON("validatedOn"),
	CREATED_BY("createdBy"),
	COPIED_TO("copiedTo"),
	OTHER("other"),
	HAS_TEST_CASE("hasTestCase"),
	HAS_RESOLUTION("hasResolution"),
	HAS_VARIANT("hasVariant"),
	CONFORMS_TO("conformsTo"),
	HAS_STATIC_LINK("hasStaticLink"),
	DOES_NOT_AFFECT("doesNotAffect"),
	HAS_PROVIDED_DEPENDENCY("hasProvidedDependency"),
	FINETUNED_ON("finetunedOn"),
	HAS_DOCUMENTATION("hasDocumentation"),
	PRETRAINED_ON("pretrainedOn"),
	HAS_DATA_FILE("hasDataFile"),
	AFFECTS("affects"),
	DELEGATED_TO("delegatedTo"),
	HAS_OPTIONAL_COMPONENT("hasOptionalComponent"),
	PACKAGED_BY("packagedBy"),
	VERIFIED_BY("verifiedBy"),
	HAS_HOST("hasHost"),
	FIXED_IN("fixedIn"),
	HAS_REQUIREMENT("hasRequirement"),
	HAS_OPTIONAL_DEPENDENCY("hasOptionalDependency"),
	EVALUATED_ON("evaluatedOn"),
	HAS_EXAMPLE("hasExample"),
	TRAINED_ON("trainedOn"),
	AMENDED_BY("amendedBy"),
	INVOKED_BY("invokedBy"),
	EXPLOIT_CREATED_BY("exploitCreatedBy"),
	HAS_METADATA("hasMetadata"),
	PUBLISHED_BY("publishedBy"),
	DESCENDANT_OF("descendantOf"),
	SERIALIZED_IN_ARTIFACT("serializedInArtifact"),
	HAS_DYNAMIC_LINK("hasDynamicLink"),
	HAS_CONCLUDED_LICENSE("hasConcludedLicense");
	
	private String longName;
	
	private RelationshipType(String longName) {
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
		return "https://spdx.org/rdf/3.1/terms/Core/RelationshipType";
	}
}

