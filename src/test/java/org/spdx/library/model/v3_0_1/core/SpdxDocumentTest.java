/**
 * Copyright (c) 2024 Source Auditor Inc.
 *
 * SPDX-License-Identifier: Apache-2.0
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
 
package org.spdx.library.model.v3_0_1.core;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3_0_1.ModelObjectV3;
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
import org.spdx.library.model.v3_0_1.MockCopyManager;
import org.spdx.library.model.v3_0_1.MockModelStore;
import org.spdx.library.model.v3_0_1.SpdxConstantsV3;
import org.spdx.library.model.v3_0_1.SpdxModelInfoV3_0;
import org.spdx.library.model.v3_0_1.TestValuesGenerator;
import org.spdx.library.model.v3_0_1.UnitTestHelper;
import org.spdx.library.model.v3_0_1.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_0_1.core.CreationInfo;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.core.SpdxDocument.SpdxDocumentBuilder;
import org.spdx.library.model.v3_0_1.extension.Extension;
import org.spdx.library.model.v3_0_1.simplelicensing.AnyLicenseInfo;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class SpdxDocumentTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
		List<String> result = testSpdxDocument.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
		assertEquals("Core.SpdxDocument", testSpdxDocument.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#Element(org.spdx.library.model.v3_0_1.core.SpdxDocument.SpdxDocumentBuilder)}.
	 */
	public void testSpdxDocumentSpdxDocumentBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
		SpdxDocument test2SpdxDocument = generator.builderForSpdxDocumentTests("https://testObject2").build();
		assertTrue(testSpdxDocument.equivalent(test2SpdxDocument));
		assertTrue(test2SpdxDocument.equivalent(testSpdxDocument));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#setCreationInfo}.
	 */
	public void testSpdxDocumentsetCreationInfo() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testSpdxDocument.getCreationInfo());
//		testSpdxDocument.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testSpdxDocument.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#setDataLicense}.
	 */
	public void testSpdxDocumentsetDataLicense() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testSpdxDocument.getDataLicense());
//		testSpdxDocument.setDataLicense(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testSpdxDocument.getDataLicense());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#setSummary}.
	 */
	public void testSpdxDocumentsetSummary() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testSpdxDocument.getSummary());
		String newStringValue = "new summary value";
		testSpdxDocument.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxDocument.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#setDescription}.
	 */
	public void testSpdxDocumentsetDescription() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testSpdxDocument.getDescription());
		String newStringValue = "new description value";
		testSpdxDocument.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxDocument.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#setComment}.
	 */
	public void testSpdxDocumentsetComment() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testSpdxDocument.getComment());
		String newStringValue = "new comment value";
		testSpdxDocument.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxDocument.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#setName}.
	 */
	public void testSpdxDocumentsetName() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testSpdxDocument.getName());
		String newStringValue = "new name value";
		testSpdxDocument.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpdxDocument.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#getExtension}.
	 */
	public void testSpdxDocumentgetExtensions() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxDocument.getExtensions())));
//		testSpdxDocument.getExtensions().clear();
//		testSpdxDocument.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxDocument.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#getVerifiedUsing}.
	 */
	public void testSpdxDocumentgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxDocument.getVerifiedUsings())));
//		testSpdxDocument.getVerifiedUsings().clear();
//		testSpdxDocument.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxDocument.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#getRootElement}.
	 */
	public void testSpdxDocumentgetRootElements() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxDocument.getRootElements())));
//		testSpdxDocument.getRootElements().clear();
//		testSpdxDocument.getRootElements().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxDocument.getRootElements())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#getElement}.
	 */
	public void testSpdxDocumentgetElements() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxDocument.getElements())));
//		testSpdxDocument.getElements().clear();
//		testSpdxDocument.getElements().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxDocument.getElements())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#getExternalRef}.
	 */
	public void testSpdxDocumentgetExternalRefs() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxDocument.getExternalRefs())));
//		testSpdxDocument.getExternalRefs().clear();
//		testSpdxDocument.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxDocument.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#getSpdxImport}.
	 */
	public void testSpdxDocumentgetSpdxImports() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxDocument.getSpdxImports())));
//		testSpdxDocument.getSpdxImports().clear();
//		testSpdxDocument.getSpdxImports().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxDocument.getSpdxImports())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#getNamespaceMap}.
	 */
	public void testSpdxDocumentgetNamespaceMaps() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxDocument.getNamespaceMaps())));
//		testSpdxDocument.getNamespaceMaps().clear();
//		testSpdxDocument.getNamespaceMaps().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxDocument.getNamespaceMaps())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#getExternalIdentifier}.
	 */
	public void testSpdxDocumentgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpdxDocument.getExternalIdentifiers())));
//		testSpdxDocument.getExternalIdentifiers().clear();
//		testSpdxDocument.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpdxDocument.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.SpdxDocument#getProfileConformance}.
	 */
	public void testSpdxDocumentgetProfileConformances() throws InvalidSPDXAnalysisException {
		SpdxDocument testSpdxDocument = generator.builderForSpdxDocumentTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PROFILE_CONFORMANCE_TEST_LIST1, new ArrayList<>(testSpdxDocument.getProfileConformances())));
		testSpdxDocument.getProfileConformances().clear();
		testSpdxDocument.getProfileConformances().addAll(TestValuesGenerator.PROFILE_CONFORMANCE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PROFILE_CONFORMANCE_TEST_LIST2, new ArrayList<>(testSpdxDocument.getProfileConformances())));
	}
}