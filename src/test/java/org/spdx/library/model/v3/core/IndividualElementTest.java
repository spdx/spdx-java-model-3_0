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
import org.spdx.library.model.v3.TestValuesGenerator;
import org.spdx.library.model.v3.UnitTestHelper;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.IndividualElement.IndividualElementBuilder;
import org.spdx.library.model.v3.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class IndividualElementTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.core.IndividualElement#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		IndividualElement testIndividualElement = generator.builderForIndividualElementTests(TEST_OBJECT_URI).build();
		List<String> result = testIndividualElement.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.IndividualElement#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		IndividualElement testIndividualElement = generator.builderForIndividualElementTests(TEST_OBJECT_URI).build();
		assertEquals("Core.IndividualElement", testIndividualElement.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.IndividualElement#Element(org.spdx.library.model.v3.core.IndividualElement.IndividualElementBuilder)}.
	 */
	public void testIndividualElementIndividualElementBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForIndividualElementTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		IndividualElement testIndividualElement = generator.builderForIndividualElementTests(TEST_OBJECT_URI).build();
		IndividualElement test2IndividualElement = generator.builderForIndividualElementTests("https://testObject2").build();
		assertTrue(testIndividualElement.equivalent(test2IndividualElement));
		assertTrue(test2IndividualElement.equivalent(testIndividualElement));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.IndividualElement#setCreationInfo}.
	 */
	public void testIndividualElementsetCreationInfo() throws InvalidSPDXAnalysisException {
		IndividualElement testIndividualElement = generator.builderForIndividualElementTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testIndividualElement.getCreationInfo());
//		testIndividualElement.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testIndividualElement.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.IndividualElement#setDescription}.
	 */
	public void testIndividualElementsetDescription() throws InvalidSPDXAnalysisException {
		IndividualElement testIndividualElement = generator.builderForIndividualElementTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testIndividualElement.getDescription());
		String newStringValue = "new description value";
		testIndividualElement.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testIndividualElement.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.IndividualElement#setComment}.
	 */
	public void testIndividualElementsetComment() throws InvalidSPDXAnalysisException {
		IndividualElement testIndividualElement = generator.builderForIndividualElementTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testIndividualElement.getComment());
		String newStringValue = "new comment value";
		testIndividualElement.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testIndividualElement.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.IndividualElement#setName}.
	 */
	public void testIndividualElementsetName() throws InvalidSPDXAnalysisException {
		IndividualElement testIndividualElement = generator.builderForIndividualElementTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testIndividualElement.getName());
		String newStringValue = "new name value";
		testIndividualElement.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testIndividualElement.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.IndividualElement#setSummary}.
	 */
	public void testIndividualElementsetSummary() throws InvalidSPDXAnalysisException {
		IndividualElement testIndividualElement = generator.builderForIndividualElementTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testIndividualElement.getSummary());
		String newStringValue = "new summary value";
		testIndividualElement.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testIndividualElement.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.IndividualElement#getExternalIdentifier}.
	 */
	public void testIndividualElementgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		IndividualElement testIndividualElement = generator.builderForIndividualElementTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testIndividualElement.getExternalIdentifiers())));
//		testIndividualElement.getExternalIdentifiers().clear();
//		testIndividualElement.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testIndividualElement.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.IndividualElement#getVerifiedUsing}.
	 */
	public void testIndividualElementgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		IndividualElement testIndividualElement = generator.builderForIndividualElementTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testIndividualElement.getVerifiedUsings())));
//		testIndividualElement.getVerifiedUsings().clear();
//		testIndividualElement.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testIndividualElement.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.IndividualElement#getExtension}.
	 */
	public void testIndividualElementgetExtensions() throws InvalidSPDXAnalysisException {
		IndividualElement testIndividualElement = generator.builderForIndividualElementTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testIndividualElement.getExtensions())));
//		testIndividualElement.getExtensions().clear();
//		testIndividualElement.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testIndividualElement.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.IndividualElement#getExternalRef}.
	 */
	public void testIndividualElementgetExternalRefs() throws InvalidSPDXAnalysisException {
		IndividualElement testIndividualElement = generator.builderForIndividualElementTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testIndividualElement.getExternalRefs())));
//		testIndividualElement.getExternalRefs().clear();
//		testIndividualElement.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testIndividualElement.getExternalRefs())));
		//TODO: Implement
	}
}
