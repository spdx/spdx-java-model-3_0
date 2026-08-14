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
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.Regulation.RegulationBuilder;
import org.spdx.library.model.v3.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class RegulationTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
		List<String> result = testRegulation.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
		assertEquals("Core.Regulation", testRegulation.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#Element(org.spdx.library.model.v3.core.Regulation.RegulationBuilder)}.
	 */
	public void testRegulationRegulationBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForRegulationTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
		Regulation test2Regulation = generator.builderForRegulationTests("https://testObject2").build();
		assertTrue(testRegulation.equivalent(test2Regulation));
		assertTrue(test2Regulation.equivalent(testRegulation));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#setSuppliedBy}.
	 */
	public void testRegulationsetSuppliedBy() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testRegulation.getSuppliedBy());
//		testRegulation.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testRegulation.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#setCreationInfo}.
	 */
	public void testRegulationsetCreationInfo() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testRegulation.getCreationInfo());
//		testRegulation.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testRegulation.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#setSpecType}.
	 */
	public void testRegulationsetSpecType() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SPEC_TYPE_TEST_VALUE1), testRegulation.getSpecType());
		testRegulation.setSpecType(TestValuesGenerator.SPEC_TYPE_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.SPEC_TYPE_TEST_VALUE2), testRegulation.getSpecType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#setIntendedUse}.
	 */
	public void testRegulationsetIntendedUse() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testRegulation.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testRegulation.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testRegulation.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#setDescription}.
	 */
	public void testRegulationsetDescription() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testRegulation.getDescription());
		String newStringValue = "new description value";
		testRegulation.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testRegulation.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#setBuiltTime}.
	 */
	public void testRegulationsetBuiltTime() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testRegulation.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testRegulation.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testRegulation.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#setComment}.
	 */
	public void testRegulationsetComment() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testRegulation.getComment());
		String newStringValue = "new comment value";
		testRegulation.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testRegulation.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#setValidUntilTime}.
	 */
	public void testRegulationsetValidUntilTime() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testRegulation.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testRegulation.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testRegulation.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#setReleaseTime}.
	 */
	public void testRegulationsetReleaseTime() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testRegulation.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testRegulation.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testRegulation.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#setName}.
	 */
	public void testRegulationsetName() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testRegulation.getName());
		String newStringValue = "new name value";
		testRegulation.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testRegulation.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#setSummary}.
	 */
	public void testRegulationsetSummary() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testRegulation.getSummary());
		String newStringValue = "new summary value";
		testRegulation.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testRegulation.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#getVerifiedUsing}.
	 */
	public void testRegulationgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testRegulation.getVerifiedUsings())));
//		testRegulation.getVerifiedUsings().clear();
//		testRegulation.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testRegulation.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#getExternalRef}.
	 */
	public void testRegulationgetExternalRefs() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testRegulation.getExternalRefs())));
//		testRegulation.getExternalRefs().clear();
//		testRegulation.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testRegulation.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#getOriginatedBy}.
	 */
	public void testRegulationgetOriginatedBys() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testRegulation.getOriginatedBys())));
//		testRegulation.getOriginatedBys().clear();
//		testRegulation.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testRegulation.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#getExternalIdentifier}.
	 */
	public void testRegulationgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testRegulation.getExternalIdentifiers())));
//		testRegulation.getExternalIdentifiers().clear();
//		testRegulation.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testRegulation.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#getExtension}.
	 */
	public void testRegulationgetExtensions() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testRegulation.getExtensions())));
//		testRegulation.getExtensions().clear();
//		testRegulation.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testRegulation.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#getStandardNames}.
	 */
	public void testRegulationgetStandardNames() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testRegulation.getStandardNames())));
		testRegulation.getStandardNames().clear();
		testRegulation.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testRegulation.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Regulation#getSupportLevel}.
	 */
	public void testRegulationgetSupportLevels() throws InvalidSPDXAnalysisException {
		Regulation testRegulation = generator.builderForRegulationTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testRegulation.getSupportLevels())));
		testRegulation.getSupportLevels().clear();
		testRegulation.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testRegulation.getSupportLevels())));
	}
}
