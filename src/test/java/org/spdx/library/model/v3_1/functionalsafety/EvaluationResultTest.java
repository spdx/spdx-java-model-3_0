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
import org.spdx.library.model.v3_1.functionalsafety.EvaluationResult.EvaluationResultBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class EvaluationResultTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvaluationResult#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		EvaluationResult testEvaluationResult = generator.builderForEvaluationResultTests(TEST_OBJECT_URI).build();
		List<String> result = testEvaluationResult.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvaluationResult#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		EvaluationResult testEvaluationResult = generator.builderForEvaluationResultTests(TEST_OBJECT_URI).build();
		assertEquals("FunctionalSafety.EvaluationResult", testEvaluationResult.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvaluationResult#Element(org.spdx.library.model.v3_1.functionalsafety.EvaluationResult.EvaluationResultBuilder)}.
	 */
	public void testEvaluationResultEvaluationResultBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForEvaluationResultTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		EvaluationResult testEvaluationResult = generator.builderForEvaluationResultTests(TEST_OBJECT_URI).build();
		EvaluationResult test2EvaluationResult = generator.builderForEvaluationResultTests("https://testObject2").build();
		assertTrue(testEvaluationResult.equivalent(test2EvaluationResult));
		assertTrue(test2EvaluationResult.equivalent(testEvaluationResult));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvaluationResult#setEvaluationBasedOn}.
	 */
	public void testEvaluationResultsetEvaluationBasedOn() throws InvalidSPDXAnalysisException {
		EvaluationResult testEvaluationResult = generator.builderForEvaluationResultTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testEvaluationResult.getEvaluationBasedOn());
//		testEvaluationResult.setEvaluationBasedOn(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testEvaluationResult.getEvaluationBasedOn());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvaluationResult#setExtension}.
	 */
	public void testEvaluationResultsetExtension() throws InvalidSPDXAnalysisException {
		EvaluationResult testEvaluationResult = generator.builderForEvaluationResultTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testEvaluationResult.getExtension());
//		testEvaluationResult.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testEvaluationResult.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvaluationResult#setCreationInfo}.
	 */
	public void testEvaluationResultsetCreationInfo() throws InvalidSPDXAnalysisException {
		EvaluationResult testEvaluationResult = generator.builderForEvaluationResultTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testEvaluationResult.getCreationInfo());
//		testEvaluationResult.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testEvaluationResult.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvaluationResult#setEvaluation}.
	 */
	public void testEvaluationResultsetEvaluation() throws InvalidSPDXAnalysisException {
		EvaluationResult testEvaluationResult = generator.builderForEvaluationResultTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.EVALUATION_TEST_VALUE1, testEvaluationResult.getEvaluation());
		testEvaluationResult.setEvaluation(TestValuesGenerator.EVALUATION_TEST_VALUE2);
		assertEquals(TestValuesGenerator.EVALUATION_TEST_VALUE2, testEvaluationResult.getEvaluation());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvaluationResult#setDescription}.
	 */
	public void testEvaluationResultsetDescription() throws InvalidSPDXAnalysisException {
		EvaluationResult testEvaluationResult = generator.builderForEvaluationResultTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testEvaluationResult.getDescription());
		String newStringValue = "new description value";
		testEvaluationResult.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testEvaluationResult.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvaluationResult#setEvaluationRationale}.
	 */
	public void testEvaluationResultsetEvaluationRationale() throws InvalidSPDXAnalysisException {
		EvaluationResult testEvaluationResult = generator.builderForEvaluationResultTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.EVALUATION_RATIONALE_TEST_VALUE, testEvaluationResult.getEvaluationRationale());
		String newStringValue = "new evaluationRationale value";
		testEvaluationResult.setEvaluationRationale(newStringValue);
		assertEquals(newStringValue, testEvaluationResult.getEvaluationRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvaluationResult#setComment}.
	 */
	public void testEvaluationResultsetComment() throws InvalidSPDXAnalysisException {
		EvaluationResult testEvaluationResult = generator.builderForEvaluationResultTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testEvaluationResult.getComment());
		String newStringValue = "new comment value";
		testEvaluationResult.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testEvaluationResult.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvaluationResult#setName}.
	 */
	public void testEvaluationResultsetName() throws InvalidSPDXAnalysisException {
		EvaluationResult testEvaluationResult = generator.builderForEvaluationResultTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testEvaluationResult.getName());
		String newStringValue = "new name value";
		testEvaluationResult.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testEvaluationResult.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvaluationResult#setSummary}.
	 */
	public void testEvaluationResultsetSummary() throws InvalidSPDXAnalysisException {
		EvaluationResult testEvaluationResult = generator.builderForEvaluationResultTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testEvaluationResult.getSummary());
		String newStringValue = "new summary value";
		testEvaluationResult.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testEvaluationResult.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvaluationResult#getVerifiedUsing}.
	 */
	public void testEvaluationResultgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		EvaluationResult testEvaluationResult = generator.builderForEvaluationResultTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testEvaluationResult.getVerifiedUsings())));
//		testEvaluationResult.getVerifiedUsings().clear();
//		testEvaluationResult.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testEvaluationResult.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvaluationResult#getExternalRef}.
	 */
	public void testEvaluationResultgetExternalRefs() throws InvalidSPDXAnalysisException {
		EvaluationResult testEvaluationResult = generator.builderForEvaluationResultTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testEvaluationResult.getExternalRefs())));
//		testEvaluationResult.getExternalRefs().clear();
//		testEvaluationResult.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testEvaluationResult.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.functionalsafety.EvaluationResult#getExternalIdentifier}.
	 */
	public void testEvaluationResultgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		EvaluationResult testEvaluationResult = generator.builderForEvaluationResultTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testEvaluationResult.getExternalIdentifiers())));
//		testEvaluationResult.getExternalIdentifiers().clear();
//		testEvaluationResult.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testEvaluationResult.getExternalIdentifiers())));
		//TODO: Implement
	}
}
