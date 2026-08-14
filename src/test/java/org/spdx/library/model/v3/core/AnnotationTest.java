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
import java.util.regex.Pattern;
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3.MockCopyManager;
import org.spdx.library.model.v3.MockModelStore;
import org.spdx.library.model.v3.SpdxConstantsV3;
import org.spdx.library.model.v3.TestValuesGenerator;
import org.spdx.library.model.v3.UnitTestHelper;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.Annotation.AnnotationBuilder;
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class AnnotationTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.core.Annotation#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		Annotation testAnnotation = generator.builderForAnnotationTests(TEST_OBJECT_URI).build();
		List<String> result = testAnnotation.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Annotation#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		Annotation testAnnotation = generator.builderForAnnotationTests(TEST_OBJECT_URI).build();
		assertEquals("Core.Annotation", testAnnotation.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Annotation#Element(org.spdx.library.model.v3.core.Annotation.AnnotationBuilder)}.
	 */
	public void testAnnotationAnnotationBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForAnnotationTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		Annotation testAnnotation = generator.builderForAnnotationTests(TEST_OBJECT_URI).build();
		Annotation test2Annotation = generator.builderForAnnotationTests("https://testObject2").build();
		assertTrue(testAnnotation.equivalent(test2Annotation));
		assertTrue(test2Annotation.equivalent(testAnnotation));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Annotation#setSubject}.
	 */
	public void testAnnotationsetSubject() throws InvalidSPDXAnalysisException {
		Annotation testAnnotation = generator.builderForAnnotationTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testAnnotation.getSubject());
//		testAnnotation.setSubject(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testAnnotation.getSubject());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Annotation#setCreationInfo}.
	 */
	public void testAnnotationsetCreationInfo() throws InvalidSPDXAnalysisException {
		Annotation testAnnotation = generator.builderForAnnotationTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testAnnotation.getCreationInfo());
//		testAnnotation.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testAnnotation.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Annotation#setAnnotationType}.
	 */
	public void testAnnotationsetAnnotationType() throws InvalidSPDXAnalysisException {
		Annotation testAnnotation = generator.builderForAnnotationTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.ANNOTATION_TYPE_TEST_VALUE1, testAnnotation.getAnnotationType());
		testAnnotation.setAnnotationType(TestValuesGenerator.ANNOTATION_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.ANNOTATION_TYPE_TEST_VALUE2, testAnnotation.getAnnotationType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Annotation#setDescription}.
	 */
	public void testAnnotationsetDescription() throws InvalidSPDXAnalysisException {
		Annotation testAnnotation = generator.builderForAnnotationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testAnnotation.getDescription());
		String newStringValue = "new description value";
		testAnnotation.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testAnnotation.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Annotation#setComment}.
	 */
	public void testAnnotationsetComment() throws InvalidSPDXAnalysisException {
		Annotation testAnnotation = generator.builderForAnnotationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testAnnotation.getComment());
		String newStringValue = "new comment value";
		testAnnotation.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testAnnotation.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Annotation#setStatement}.
	 */
	public void testAnnotationsetStatement() throws InvalidSPDXAnalysisException {
		Annotation testAnnotation = generator.builderForAnnotationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.STATEMENT_TEST_VALUE), testAnnotation.getStatement());
		String newStringValue = "new statement value";
		testAnnotation.setStatement(newStringValue);
		assertEquals(Optional.of(newStringValue), testAnnotation.getStatement());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Annotation#setContentType}.
	 */
	public void testAnnotationsetContentType() throws InvalidSPDXAnalysisException {
		Annotation testAnnotation = generator.builderForAnnotationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.CONTENT_TYPE_TEST_VALUE), testAnnotation.getContentType());
		String newStringValue = UnitTestHelper.genRandPattern("^[^\\/]+\\/[^\\/]+$");
		testAnnotation.setContentType(newStringValue);
		assertEquals(Optional.of(newStringValue), testAnnotation.getContentType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Annotation#setName}.
	 */
	public void testAnnotationsetName() throws InvalidSPDXAnalysisException {
		Annotation testAnnotation = generator.builderForAnnotationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testAnnotation.getName());
		String newStringValue = "new name value";
		testAnnotation.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testAnnotation.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Annotation#setSummary}.
	 */
	public void testAnnotationsetSummary() throws InvalidSPDXAnalysisException {
		Annotation testAnnotation = generator.builderForAnnotationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testAnnotation.getSummary());
		String newStringValue = "new summary value";
		testAnnotation.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testAnnotation.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Annotation#getVerifiedUsing}.
	 */
	public void testAnnotationgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		Annotation testAnnotation = generator.builderForAnnotationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAnnotation.getVerifiedUsings())));
//		testAnnotation.getVerifiedUsings().clear();
//		testAnnotation.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAnnotation.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Annotation#getExternalRef}.
	 */
	public void testAnnotationgetExternalRefs() throws InvalidSPDXAnalysisException {
		Annotation testAnnotation = generator.builderForAnnotationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAnnotation.getExternalRefs())));
//		testAnnotation.getExternalRefs().clear();
//		testAnnotation.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAnnotation.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Annotation#getExternalIdentifier}.
	 */
	public void testAnnotationgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		Annotation testAnnotation = generator.builderForAnnotationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAnnotation.getExternalIdentifiers())));
//		testAnnotation.getExternalIdentifiers().clear();
//		testAnnotation.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAnnotation.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Annotation#getExtension}.
	 */
	public void testAnnotationgetExtensions() throws InvalidSPDXAnalysisException {
		Annotation testAnnotation = generator.builderForAnnotationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAnnotation.getExtensions())));
//		testAnnotation.getExtensions().clear();
//		testAnnotation.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAnnotation.getExtensions())));
		//TODO: Implement
	}
}
