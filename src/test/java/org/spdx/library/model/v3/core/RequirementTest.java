/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.core;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3.ModelObjectV3;
import org.spdx.storage.IModelStore;
import org.spdx.storage.IModelStore.IdType;
import org.spdx.storage.IModelStore.IModelStoreLock;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3.MockCopyManager;
import org.spdx.library.model.v3.MockModelStore;
import org.spdx.library.model.v3.SpdxConstantsV3;
import org.spdx.library.model.v3.SpdxModelInfoV3_0;
import org.spdx.library.model.v3.TestValuesGenerator;
import org.spdx.library.model.v3.UnitTestHelper;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.Requirement.RequirementBuilder;
import org.spdx.library.model.v3.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class RequirementTest extends TestCase {

	static final String TEST_OBJECT_URI = "https://test.uri/testuri";
	
	TestValuesGenerator generator;
	
	protected void setUp() throws Exception {
		super.setUp();
		generator = new TestValuesGenerator(new MockModelStore(), new MockCopyManager());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Requirement#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		Requirement testRequirement = generator.builderForRequirementTests(TEST_OBJECT_URI).build();
		List<String> result = testRequirement.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Requirement#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		Requirement testRequirement = generator.builderForRequirementTests(TEST_OBJECT_URI).build();
		assertEquals("Core.Requirement", testRequirement.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Requirement#Element(org.spdx.library.model.v3.core.Requirement.RequirementBuilder)}.
	 */
	public void testRequirementRequirementBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForRequirementTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		Requirement testRequirement = generator.builderForRequirementTests(TEST_OBJECT_URI).build();
		Requirement test2Requirement = generator.builderForRequirementTests("https://testObject2").build();
		assertTrue(testRequirement.equivalent(test2Requirement));
		assertTrue(test2Requirement.equivalent(testRequirement));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Requirement#setRequirementUUID}.
	 */
	public void testRequirementsetRequirementUUID() throws InvalidSPDXAnalysisException {
		Requirement testRequirement = generator.builderForRequirementTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testRequirement.getRequirementUUID());
//		testRequirement.setRequirementUUID(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testRequirement.getRequirementUUID());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Requirement#setExtension}.
	 */
	public void testRequirementsetExtension() throws InvalidSPDXAnalysisException {
		Requirement testRequirement = generator.builderForRequirementTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testRequirement.getExtension());
//		testRequirement.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testRequirement.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Requirement#setCreationInfo}.
	 */
	public void testRequirementsetCreationInfo() throws InvalidSPDXAnalysisException {
		Requirement testRequirement = generator.builderForRequirementTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testRequirement.getCreationInfo());
//		testRequirement.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testRequirement.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Requirement#setDescription}.
	 */
	public void testRequirementsetDescription() throws InvalidSPDXAnalysisException {
		Requirement testRequirement = generator.builderForRequirementTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testRequirement.getDescription());
		String newStringValue = "new description value";
		testRequirement.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testRequirement.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Requirement#setComment}.
	 */
	public void testRequirementsetComment() throws InvalidSPDXAnalysisException {
		Requirement testRequirement = generator.builderForRequirementTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testRequirement.getComment());
		String newStringValue = "new comment value";
		testRequirement.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testRequirement.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Requirement#setName}.
	 */
	public void testRequirementsetName() throws InvalidSPDXAnalysisException {
		Requirement testRequirement = generator.builderForRequirementTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testRequirement.getName());
		String newStringValue = "new name value";
		testRequirement.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testRequirement.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Requirement#setSummary}.
	 */
	public void testRequirementsetSummary() throws InvalidSPDXAnalysisException {
		Requirement testRequirement = generator.builderForRequirementTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testRequirement.getSummary());
		String newStringValue = "new summary value";
		testRequirement.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testRequirement.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Requirement#setRequirementStatement}.
	 */
	public void testRequirementsetRequirementStatement() throws InvalidSPDXAnalysisException {
		Requirement testRequirement = generator.builderForRequirementTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.REQUIREMENT_STATEMENT_TEST_VALUE, testRequirement.getRequirementStatement());
		String newStringValue = "new requirementStatement value";
		testRequirement.setRequirementStatement(newStringValue);
		assertEquals(newStringValue, testRequirement.getRequirementStatement());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Requirement#getVerifiedUsing}.
	 */
	public void testRequirementgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		Requirement testRequirement = generator.builderForRequirementTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testRequirement.getVerifiedUsings())));
//		testRequirement.getVerifiedUsings().clear();
//		testRequirement.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testRequirement.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Requirement#getExternalRef}.
	 */
	public void testRequirementgetExternalRefs() throws InvalidSPDXAnalysisException {
		Requirement testRequirement = generator.builderForRequirementTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testRequirement.getExternalRefs())));
//		testRequirement.getExternalRefs().clear();
//		testRequirement.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testRequirement.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Requirement#getExternalIdentifier}.
	 */
	public void testRequirementgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		Requirement testRequirement = generator.builderForRequirementTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testRequirement.getExternalIdentifiers())));
//		testRequirement.getExternalIdentifiers().clear();
//		testRequirement.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testRequirement.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Requirement#getRequirementRationales}.
	 */
	public void testRequirementgetRequirementRationales() throws InvalidSPDXAnalysisException {
		Requirement testRequirement = generator.builderForRequirementTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.REQUIREMENT_RATIONALE_TEST_LIST1, new ArrayList<>(testRequirement.getRequirementRationales())));
		testRequirement.getRequirementRationales().clear();
		testRequirement.getRequirementRationales().addAll(TestValuesGenerator.REQUIREMENT_RATIONALE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.REQUIREMENT_RATIONALE_TEST_LIST2, new ArrayList<>(testRequirement.getRequirementRationales())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Requirement#getDevLifecycleStage}.
	 */
	public void testRequirementgetDevLifecycleStages() throws InvalidSPDXAnalysisException {
		Requirement testRequirement = generator.builderForRequirementTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.DEV_LIFECYCLE_STAGE_TEST_LIST1, new ArrayList<>(testRequirement.getDevLifecycleStages())));
		testRequirement.getDevLifecycleStages().clear();
		testRequirement.getDevLifecycleStages().addAll(TestValuesGenerator.DEV_LIFECYCLE_STAGE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.DEV_LIFECYCLE_STAGE_TEST_LIST2, new ArrayList<>(testRequirement.getDevLifecycleStages())));
	}
}
