/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.operations;

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
import java.util.regex.Pattern;
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3.MockCopyManager;
import org.spdx.library.model.v3.MockModelStore;
import org.spdx.library.model.v3.SpdxConstantsV3;
import org.spdx.library.model.v3.SpdxModelInfoV3_0;
import org.spdx.library.model.v3.TestValuesGenerator;
import org.spdx.library.model.v3.UnitTestHelper;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.Agent;
import org.spdx.library.model.v3.core.Bundle;
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.extension.Extension;
import org.spdx.library.model.v3.operations.Project.ProjectBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ProjectTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
		List<String> result = testProject.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
		assertEquals("Operations.Project", testProject.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#Element(org.spdx.library.model.v3.operations.Project.ProjectBuilder)}.
	 */
	public void testProjectProjectBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForProjectTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
		Project test2Project = generator.builderForProjectTests("https://testObject2").build();
		assertTrue(testProject.equivalent(test2Project));
		assertTrue(test2Project.equivalent(testProject));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#setProjectOwner}.
	 */
	public void testProjectsetProjectOwner() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testProject.getProjectOwner());
//		testProject.setProjectOwner(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testProject.getProjectOwner());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#setExtension}.
	 */
	public void testProjectsetExtension() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testProject.getExtension());
//		testProject.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testProject.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#setCreationInfo}.
	 */
	public void testProjectsetCreationInfo() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testProject.getCreationInfo());
//		testProject.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testProject.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#setDescription}.
	 */
	public void testProjectsetDescription() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testProject.getDescription());
		String newStringValue = "new description value";
		testProject.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testProject.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#setProjectStartTime}.
	 */
	public void testProjectsetProjectStartTime() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROJECT_START_TIME_TEST_VALUE, testProject.getProjectStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testProject.setProjectStartTime(newStringValue);
		assertEquals(newStringValue, testProject.getProjectStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#setProjectEndTime}.
	 */
	public void testProjectsetProjectEndTime() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROJECT_END_TIME_TEST_VALUE), testProject.getProjectEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testProject.setProjectEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testProject.getProjectEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#setProjectTitle}.
	 */
	public void testProjectsetProjectTitle() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROJECT_TITLE_TEST_VALUE, testProject.getProjectTitle());
		String newStringValue = "new projectTitle value";
		testProject.setProjectTitle(newStringValue);
		assertEquals(newStringValue, testProject.getProjectTitle());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#setComment}.
	 */
	public void testProjectsetComment() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testProject.getComment());
		String newStringValue = "new comment value";
		testProject.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testProject.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#setContext}.
	 */
	public void testProjectsetContext() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.CONTEXT_TEST_VALUE), testProject.getContext());
		String newStringValue = "new context value";
		testProject.setContext(newStringValue);
		assertEquals(Optional.of(newStringValue), testProject.getContext());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#setProjectContract}.
	 */
	public void testProjectsetProjectContract() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROJECT_CONTRACT_TEST_VALUE, testProject.getProjectContract());
		String newStringValue = "new projectContract value";
		testProject.setProjectContract(newStringValue);
		assertEquals(newStringValue, testProject.getProjectContract());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#setName}.
	 */
	public void testProjectsetName() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testProject.getName());
		String newStringValue = "new name value";
		testProject.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testProject.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#setSummary}.
	 */
	public void testProjectsetSummary() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testProject.getSummary());
		String newStringValue = "new summary value";
		testProject.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testProject.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#getRootElement}.
	 */
	public void testProjectgetRootElements() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testProject.getRootElements())));
//		testProject.getRootElements().clear();
//		testProject.getRootElements().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testProject.getRootElements())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#getProjectSponsor}.
	 */
	public void testProjectgetProjectSponsors() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testProject.getProjectSponsors())));
//		testProject.getProjectSponsors().clear();
//		testProject.getProjectSponsors().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testProject.getProjectSponsors())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#getVerifiedUsing}.
	 */
	public void testProjectgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testProject.getVerifiedUsings())));
//		testProject.getVerifiedUsings().clear();
//		testProject.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testProject.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#getExternalRef}.
	 */
	public void testProjectgetExternalRefs() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testProject.getExternalRefs())));
//		testProject.getExternalRefs().clear();
//		testProject.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testProject.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#getExternalIdentifier}.
	 */
	public void testProjectgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testProject.getExternalIdentifiers())));
//		testProject.getExternalIdentifiers().clear();
//		testProject.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testProject.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#getElement}.
	 */
	public void testProjectgetElements() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testProject.getElements())));
//		testProject.getElements().clear();
//		testProject.getElements().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testProject.getElements())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.Project#getProfileConformance}.
	 */
	public void testProjectgetProfileConformances() throws InvalidSPDXAnalysisException {
		Project testProject = generator.builderForProjectTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PROFILE_CONFORMANCE_TEST_LIST1, new ArrayList<>(testProject.getProfileConformances())));
		testProject.getProfileConformances().clear();
		testProject.getProfileConformances().addAll(TestValuesGenerator.PROFILE_CONFORMANCE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PROFILE_CONFORMANCE_TEST_LIST2, new ArrayList<>(testProject.getProfileConformances())));
	}
}
