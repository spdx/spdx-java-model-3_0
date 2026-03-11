/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.functionalsafety;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3_1.ModelObjectV3;
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
import org.spdx.library.model.v3_1.MockCopyManager;
import org.spdx.library.model.v3_1.MockModelStore;
import org.spdx.library.model.v3_1.SpdxConstantsV3;
import org.spdx.library.model.v3_1.SpdxModelInfoV3_0;
import org.spdx.library.model.v3_1.TestValuesGenerator;
import org.spdx.library.model.v3_1.UnitTestHelper;
import org.spdx.library.model.v3_1.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_1.core.CreationInfo;
import org.spdx.library.model.v3_1.core.Element;
import org.spdx.library.model.v3_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_1.core.ExternalRef;
import org.spdx.library.model.v3_1.core.IntegrityMethod;
import org.spdx.library.model.v3_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_1.extension.Extension;
import org.spdx.library.model.v3_1.functionalsafety.RequirementVerification.RequirementVerificationBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class RequirementVerificationTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.RequirementVerification#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		RequirementVerification testRequirementVerification = generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
		List<String> result = testRequirementVerification.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.RequirementVerification#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		RequirementVerification testRequirementVerification = generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
		assertEquals("FunctionalSafety.RequirementVerification", testRequirementVerification.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.RequirementVerification#Element(org.spdx.library.model.v3_1.functionalsafety.RequirementVerification.RequirementVerificationBuilder)}.
	 */
	public void testRequirementVerificationRequirementVerificationBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		RequirementVerification testRequirementVerification = generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
		RequirementVerification test2RequirementVerification = generator.builderForRequirementVerificationTests("https://testObject2").build();
		assertTrue(testRequirementVerification.equivalent(test2RequirementVerification));
		assertTrue(test2RequirementVerification.equivalent(testRequirementVerification));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.RequirementVerification#setVerificationUUID}.
	 */
	public void testRequirementVerificationsetVerificationUUID() throws InvalidSPDXAnalysisException {
		RequirementVerification testRequirementVerification = generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testRequirementVerification.getVerificationUUID());
//		testRequirementVerification.setVerificationUUID(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testRequirementVerification.getVerificationUUID());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.RequirementVerification#setExtension}.
	 */
	public void testRequirementVerificationsetExtension() throws InvalidSPDXAnalysisException {
		RequirementVerification testRequirementVerification = generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testRequirementVerification.getExtension());
//		testRequirementVerification.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testRequirementVerification.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.RequirementVerification#setCreationInfo}.
	 */
	public void testRequirementVerificationsetCreationInfo() throws InvalidSPDXAnalysisException {
		RequirementVerification testRequirementVerification = generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testRequirementVerification.getCreationInfo());
//		testRequirementVerification.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testRequirementVerification.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.RequirementVerification#setDescription}.
	 */
	public void testRequirementVerificationsetDescription() throws InvalidSPDXAnalysisException {
		RequirementVerification testRequirementVerification = generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testRequirementVerification.getDescription());
		String newStringValue = "new description value";
		testRequirementVerification.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testRequirementVerification.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.RequirementVerification#setComment}.
	 */
	public void testRequirementVerificationsetComment() throws InvalidSPDXAnalysisException {
		RequirementVerification testRequirementVerification = generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testRequirementVerification.getComment());
		String newStringValue = "new comment value";
		testRequirementVerification.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testRequirementVerification.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.RequirementVerification#setVerificationRationale}.
	 */
	public void testRequirementVerificationsetVerificationRationale() throws InvalidSPDXAnalysisException {
		RequirementVerification testRequirementVerification = generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VERIFICATION_RATIONALE_TEST_VALUE), testRequirementVerification.getVerificationRationale());
		String newStringValue = "new verificationRationale value";
		testRequirementVerification.setVerificationRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testRequirementVerification.getVerificationRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.RequirementVerification#setName}.
	 */
	public void testRequirementVerificationsetName() throws InvalidSPDXAnalysisException {
		RequirementVerification testRequirementVerification = generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testRequirementVerification.getName());
		String newStringValue = "new name value";
		testRequirementVerification.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testRequirementVerification.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.RequirementVerification#setSummary}.
	 */
	public void testRequirementVerificationsetSummary() throws InvalidSPDXAnalysisException {
		RequirementVerification testRequirementVerification = generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testRequirementVerification.getSummary());
		String newStringValue = "new summary value";
		testRequirementVerification.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testRequirementVerification.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.RequirementVerification#getVerifiedUsing}.
	 */
	public void testRequirementVerificationgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		RequirementVerification testRequirementVerification = generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testRequirementVerification.getVerifiedUsings())));
//		testRequirementVerification.getVerifiedUsings().clear();
//		testRequirementVerification.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testRequirementVerification.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.RequirementVerification#getExternalRef}.
	 */
	public void testRequirementVerificationgetExternalRefs() throws InvalidSPDXAnalysisException {
		RequirementVerification testRequirementVerification = generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testRequirementVerification.getExternalRefs())));
//		testRequirementVerification.getExternalRefs().clear();
//		testRequirementVerification.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testRequirementVerification.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.RequirementVerification#getExternalIdentifier}.
	 */
	public void testRequirementVerificationgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		RequirementVerification testRequirementVerification = generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testRequirementVerification.getExternalIdentifiers())));
//		testRequirementVerification.getExternalIdentifiers().clear();
//		testRequirementVerification.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testRequirementVerification.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.RequirementVerification#getVerificationPostconditions}.
	 */
	public void testRequirementVerificationgetVerificationPostconditions() throws InvalidSPDXAnalysisException {
		RequirementVerification testRequirementVerification = generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.VERIFICATION_POSTCONDITION_TEST_LIST1, new ArrayList<>(testRequirementVerification.getVerificationPostconditions())));
		testRequirementVerification.getVerificationPostconditions().clear();
		testRequirementVerification.getVerificationPostconditions().addAll(TestValuesGenerator.VERIFICATION_POSTCONDITION_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.VERIFICATION_POSTCONDITION_TEST_LIST2, new ArrayList<>(testRequirementVerification.getVerificationPostconditions())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.RequirementVerification#getVerificationPreconditions}.
	 */
	public void testRequirementVerificationgetVerificationPreconditions() throws InvalidSPDXAnalysisException {
		RequirementVerification testRequirementVerification = generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.VERIFICATION_PRECONDITION_TEST_LIST1, new ArrayList<>(testRequirementVerification.getVerificationPreconditions())));
		testRequirementVerification.getVerificationPreconditions().clear();
		testRequirementVerification.getVerificationPreconditions().addAll(TestValuesGenerator.VERIFICATION_PRECONDITION_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.VERIFICATION_PRECONDITION_TEST_LIST2, new ArrayList<>(testRequirementVerification.getVerificationPreconditions())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.RequirementVerification#getVerificationMethod}.
	 */
	public void testRequirementVerificationgetVerificationMethods() throws InvalidSPDXAnalysisException {
		RequirementVerification testRequirementVerification = generator.builderForRequirementVerificationTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.VERIFICATION_METHOD_TEST_LIST1, new ArrayList<>(testRequirementVerification.getVerificationMethods())));
		testRequirementVerification.getVerificationMethods().clear();
		testRequirementVerification.getVerificationMethods().addAll(TestValuesGenerator.VERIFICATION_METHOD_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.VERIFICATION_METHOD_TEST_LIST2, new ArrayList<>(testRequirementVerification.getVerificationMethods())));
	}
}
