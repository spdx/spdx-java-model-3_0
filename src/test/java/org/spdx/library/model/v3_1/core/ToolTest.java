/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.core;

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
import org.spdx.library.model.v3_1.core.Tool.ToolBuilder;
import org.spdx.library.model.v3_1.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ToolTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.core.Tool#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		Tool testTool = generator.builderForToolTests(TEST_OBJECT_URI).build();
		List<String> result = testTool.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.Tool#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		Tool testTool = generator.builderForToolTests(TEST_OBJECT_URI).build();
		assertEquals("Core.Tool", testTool.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.Tool#Element(org.spdx.library.model.v3_1.core.Tool.ToolBuilder)}.
	 */
	public void testToolToolBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForToolTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		Tool testTool = generator.builderForToolTests(TEST_OBJECT_URI).build();
		Tool test2Tool = generator.builderForToolTests("https://testObject2").build();
		assertTrue(testTool.equivalent(test2Tool));
		assertTrue(test2Tool.equivalent(testTool));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.Tool#setExtension}.
	 */
	public void testToolsetExtension() throws InvalidSPDXAnalysisException {
		Tool testTool = generator.builderForToolTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testTool.getExtension());
//		testTool.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testTool.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.Tool#setCreationInfo}.
	 */
	public void testToolsetCreationInfo() throws InvalidSPDXAnalysisException {
		Tool testTool = generator.builderForToolTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testTool.getCreationInfo());
//		testTool.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testTool.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.Tool#setDescription}.
	 */
	public void testToolsetDescription() throws InvalidSPDXAnalysisException {
		Tool testTool = generator.builderForToolTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testTool.getDescription());
		String newStringValue = "new description value";
		testTool.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testTool.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.Tool#setComment}.
	 */
	public void testToolsetComment() throws InvalidSPDXAnalysisException {
		Tool testTool = generator.builderForToolTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testTool.getComment());
		String newStringValue = "new comment value";
		testTool.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testTool.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.Tool#setName}.
	 */
	public void testToolsetName() throws InvalidSPDXAnalysisException {
		Tool testTool = generator.builderForToolTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testTool.getName());
		String newStringValue = "new name value";
		testTool.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testTool.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.Tool#setSummary}.
	 */
	public void testToolsetSummary() throws InvalidSPDXAnalysisException {
		Tool testTool = generator.builderForToolTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testTool.getSummary());
		String newStringValue = "new summary value";
		testTool.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testTool.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.Tool#getExternalIdentifier}.
	 */
	public void testToolgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		Tool testTool = generator.builderForToolTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTool.getExternalIdentifiers())));
//		testTool.getExternalIdentifiers().clear();
//		testTool.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTool.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.Tool#getVerifiedUsing}.
	 */
	public void testToolgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		Tool testTool = generator.builderForToolTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTool.getVerifiedUsings())));
//		testTool.getVerifiedUsings().clear();
//		testTool.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTool.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.Tool#getExternalRef}.
	 */
	public void testToolgetExternalRefs() throws InvalidSPDXAnalysisException {
		Tool testTool = generator.builderForToolTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTool.getExternalRefs())));
//		testTool.getExternalRefs().clear();
//		testTool.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTool.getExternalRefs())));
		//TODO: Implement
	}
}
