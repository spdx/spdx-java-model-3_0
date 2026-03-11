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
import org.spdx.library.model.v3.SpdxModelInfoV3_0;
import org.spdx.library.model.v3.TestValuesGenerator;
import org.spdx.library.model.v3.UnitTestHelper;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.Specification.SpecificationBuilder;
import org.spdx.library.model.v3.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class SpecificationTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
		List<String> result = testSpecification.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals("Core.Specification", testSpecification.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#Element(org.spdx.library.model.v3.core.Specification.SpecificationBuilder)}.
	 */
	public void testSpecificationSpecificationBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
		Specification test2Specification = generator.builderForSpecificationTests("https://testObject2").build();
		assertTrue(testSpecification.equivalent(test2Specification));
		assertTrue(test2Specification.equivalent(testSpecification));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#setSuppliedBy}.
	 */
	public void testSpecificationsetSuppliedBy() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testSpecification.getSuppliedBy());
//		testSpecification.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testSpecification.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#setExtension}.
	 */
	public void testSpecificationsetExtension() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testSpecification.getExtension());
//		testSpecification.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testSpecification.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#setCreationInfo}.
	 */
	public void testSpecificationsetCreationInfo() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testSpecification.getCreationInfo());
//		testSpecification.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testSpecification.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#setSpecType}.
	 */
	public void testSpecificationsetSpecType() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SPEC_TYPE_TEST_VALUE1), testSpecification.getSpecType());
		testSpecification.setSpecType(TestValuesGenerator.SPEC_TYPE_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.SPEC_TYPE_TEST_VALUE2), testSpecification.getSpecType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#setIntendedUse}.
	 */
	public void testSpecificationsetIntendedUse() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testSpecification.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testSpecification.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpecification.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#setDescription}.
	 */
	public void testSpecificationsetDescription() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testSpecification.getDescription());
		String newStringValue = "new description value";
		testSpecification.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpecification.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#setBuiltTime}.
	 */
	public void testSpecificationsetBuiltTime() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testSpecification.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSpecification.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpecification.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#setComment}.
	 */
	public void testSpecificationsetComment() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testSpecification.getComment());
		String newStringValue = "new comment value";
		testSpecification.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpecification.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#setValidUntilTime}.
	 */
	public void testSpecificationsetValidUntilTime() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testSpecification.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSpecification.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpecification.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#setReleaseTime}.
	 */
	public void testSpecificationsetReleaseTime() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testSpecification.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testSpecification.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpecification.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#setName}.
	 */
	public void testSpecificationsetName() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testSpecification.getName());
		String newStringValue = "new name value";
		testSpecification.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpecification.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#setSummary}.
	 */
	public void testSpecificationsetSummary() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testSpecification.getSummary());
		String newStringValue = "new summary value";
		testSpecification.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testSpecification.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#getVerifiedUsing}.
	 */
	public void testSpecificationgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpecification.getVerifiedUsings())));
//		testSpecification.getVerifiedUsings().clear();
//		testSpecification.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpecification.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#getExternalRef}.
	 */
	public void testSpecificationgetExternalRefs() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpecification.getExternalRefs())));
//		testSpecification.getExternalRefs().clear();
//		testSpecification.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpecification.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#getOriginatedBy}.
	 */
	public void testSpecificationgetOriginatedBys() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpecification.getOriginatedBys())));
//		testSpecification.getOriginatedBys().clear();
//		testSpecification.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpecification.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#getExternalIdentifier}.
	 */
	public void testSpecificationgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testSpecification.getExternalIdentifiers())));
//		testSpecification.getExternalIdentifiers().clear();
//		testSpecification.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testSpecification.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#getStandardNames}.
	 */
	public void testSpecificationgetStandardNames() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testSpecification.getStandardNames())));
		testSpecification.getStandardNames().clear();
		testSpecification.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testSpecification.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.Specification#getSupportLevel}.
	 */
	public void testSpecificationgetSupportLevels() throws InvalidSPDXAnalysisException {
		Specification testSpecification = generator.builderForSpecificationTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testSpecification.getSupportLevels())));
		testSpecification.getSupportLevels().clear();
		testSpecification.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testSpecification.getSupportLevels())));
	}
}
