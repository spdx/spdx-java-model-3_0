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
 
package org.spdx.library.model.v3_0_1.software;

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
import org.spdx.library.model.v3_0_1.core.Bom;
import org.spdx.library.model.v3_0_1.core.CreationInfo;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_0_1.core.ExternalRef;
import org.spdx.library.model.v3_0_1.core.IntegrityMethod;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0_1.extension.Extension;
import org.spdx.library.model.v3_0_1.software.Sbom.SbomBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class SbomTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Sbom#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		Sbom testSbom = generator.builderForSbomTests(TEST_OBJECT_URI).build();
		List<String> result = testSbom.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Sbom#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		Sbom testSbom = generator.builderForSbomTests(TEST_OBJECT_URI).build();
		assertEquals("Software.Sbom", testSbom.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Sbom#Element(org.spdx.library.model.v3_0_1.software.Sbom.SbomBuilder)}.
	 */
	public void testSbomSbomBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForSbomTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		Sbom testSbom = generator.builderForSbomTests(TEST_OBJECT_URI).build();
		Sbom test2Sbom = generator.builderForSbomTests("https://testObject2").build();
		assertTrue(testSbom.equivalent(test2Sbom));
		assertTrue(test2Sbom.equivalent(testSbom));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Sbom#setCreationInfo}.
	 */
	public void testSbomsetCreationInfo() throws InvalidSPDXAnalysisException {
		Sbom testSbom = generator.builderForSbomTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testSbom.getCreationInfo());
//		testSbom.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testSbom.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Sbom#setSummary}.
	 */
	public void testSbomsetSummary() throws InvalidSPDXAnalysisException {
		Sbom testSbom = generator.builderForSbomTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testSbom.getSummary());
		String newStringValue = "new summary value";
		testSbom.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testSbom.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Sbom#setDescription}.
	 */
	public void testSbomsetDescription() throws InvalidSPDXAnalysisException {
		Sbom testSbom = generator.builderForSbomTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testSbom.getDescription());
		String newStringValue = "new description value";
		testSbom.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testSbom.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Sbom#setContext}.
	 */
	public void testSbomsetContext() throws InvalidSPDXAnalysisException {
		Sbom testSbom = generator.builderForSbomTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.CONTEXT_TEST_VALUE), testSbom.getContext());
		String newStringValue = "new context value";
		testSbom.setContext(newStringValue);
		assertEquals(Optional.of(newStringValue), testSbom.getContext());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Sbom#setComment}.
	 */
	public void testSbomsetComment() throws InvalidSPDXAnalysisException {
		Sbom testSbom = generator.builderForSbomTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testSbom.getComment());
		String newStringValue = "new comment value";
		testSbom.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testSbom.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Sbom#setName}.
	 */
	public void testSbomsetName() throws InvalidSPDXAnalysisException {
		Sbom testSbom = generator.builderForSbomTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testSbom.getName());
		String newStringValue = "new name value";
		testSbom.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testSbom.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Sbom#getExtension}.
	 */
	public void testSbomgetExtensions() throws InvalidSPDXAnalysisException {
		Sbom testSbom = generator.builderForSbomTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSbom.getExtensions())));
//		testSbom.getExtensions().clear();
//		testSbom.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSbom.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Sbom#getVerifiedUsing}.
	 */
	public void testSbomgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		Sbom testSbom = generator.builderForSbomTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSbom.getVerifiedUsings())));
//		testSbom.getVerifiedUsings().clear();
//		testSbom.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSbom.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Sbom#getRootElement}.
	 */
	public void testSbomgetRootElements() throws InvalidSPDXAnalysisException {
		Sbom testSbom = generator.builderForSbomTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSbom.getRootElements())));
//		testSbom.getRootElements().clear();
//		testSbom.getRootElements().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSbom.getRootElements())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Sbom#getElement}.
	 */
	public void testSbomgetElements() throws InvalidSPDXAnalysisException {
		Sbom testSbom = generator.builderForSbomTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSbom.getElements())));
//		testSbom.getElements().clear();
//		testSbom.getElements().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSbom.getElements())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Sbom#getExternalRef}.
	 */
	public void testSbomgetExternalRefs() throws InvalidSPDXAnalysisException {
		Sbom testSbom = generator.builderForSbomTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSbom.getExternalRefs())));
//		testSbom.getExternalRefs().clear();
//		testSbom.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSbom.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Sbom#getExternalIdentifier}.
	 */
	public void testSbomgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		Sbom testSbom = generator.builderForSbomTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSbom.getExternalIdentifiers())));
//		testSbom.getExternalIdentifiers().clear();
//		testSbom.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSbom.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Sbom#getProfileConformance}.
	 */
	public void testSbomgetProfileConformances() throws InvalidSPDXAnalysisException {
		Sbom testSbom = generator.builderForSbomTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PROFILE_CONFORMANCE_TEST_LIST1, new ArrayList<>(testSbom.getProfileConformances())));
		testSbom.getProfileConformances().clear();
		testSbom.getProfileConformances().addAll(TestValuesGenerator.PROFILE_CONFORMANCE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PROFILE_CONFORMANCE_TEST_LIST2, new ArrayList<>(testSbom.getProfileConformances())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.Sbom#getSbomType}.
	 */
	public void testSbomgetSbomTypes() throws InvalidSPDXAnalysisException {
		Sbom testSbom = generator.builderForSbomTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SBOM_TYPE_TEST_LIST1, new ArrayList<>(testSbom.getSbomTypes())));
		testSbom.getSbomTypes().clear();
		testSbom.getSbomTypes().addAll(TestValuesGenerator.SBOM_TYPE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SBOM_TYPE_TEST_LIST2, new ArrayList<>(testSbom.getSbomTypes())));
	}
}