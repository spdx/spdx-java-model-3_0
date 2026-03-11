/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.supplychain;

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
import java.util.regex.Pattern;
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3_1.MockCopyManager;
import org.spdx.library.model.v3_1.MockModelStore;
import org.spdx.library.model.v3_1.SpdxConstantsV3;
import org.spdx.library.model.v3_1.SpdxModelInfoV3_0;
import org.spdx.library.model.v3_1.TestValuesGenerator;
import org.spdx.library.model.v3_1.UnitTestHelper;
import org.spdx.library.model.v3_1.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_1.core.Agent;
import org.spdx.library.model.v3_1.core.Artifact;
import org.spdx.library.model.v3_1.core.CreationInfo;
import org.spdx.library.model.v3_1.core.Element;
import org.spdx.library.model.v3_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_1.core.ExternalRef;
import org.spdx.library.model.v3_1.core.IntegrityMethod;
import org.spdx.library.model.v3_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_1.core.SupportType;
import org.spdx.library.model.v3_1.extension.Extension;
import org.spdx.library.model.v3_1.supplychain.State.StateBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class StateTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
		List<String> result = testState.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.State", testState.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#Element(org.spdx.library.model.v3_1.supplychain.State.StateBuilder)}.
	 */
	public void testStateStateBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForStateTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
		State test2State = generator.builderForStateTests("https://testObject2").build();
		assertTrue(testState.equivalent(test2State));
		assertTrue(test2State.equivalent(testState));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#setSuppliedBy}.
	 */
	public void testStatesetSuppliedBy() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testState.getSuppliedBy());
//		testState.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testState.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#setExtension}.
	 */
	public void testStatesetExtension() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testState.getExtension());
//		testState.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testState.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#setCreationInfo}.
	 */
	public void testStatesetCreationInfo() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testState.getCreationInfo());
//		testState.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testState.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#setIntendedUse}.
	 */
	public void testStatesetIntendedUse() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testState.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testState.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testState.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#setDescription}.
	 */
	public void testStatesetDescription() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testState.getDescription());
		String newStringValue = "new description value";
		testState.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testState.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#setBuiltTime}.
	 */
	public void testStatesetBuiltTime() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testState.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testState.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testState.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#setComment}.
	 */
	public void testStatesetComment() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testState.getComment());
		String newStringValue = "new comment value";
		testState.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testState.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#setValidUntilTime}.
	 */
	public void testStatesetValidUntilTime() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testState.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testState.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testState.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#setReleaseTime}.
	 */
	public void testStatesetReleaseTime() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testState.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testState.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testState.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#setName}.
	 */
	public void testStatesetName() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testState.getName());
		String newStringValue = "new name value";
		testState.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testState.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#setSummary}.
	 */
	public void testStatesetSummary() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testState.getSummary());
		String newStringValue = "new summary value";
		testState.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testState.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#getVerifiedUsing}.
	 */
	public void testStategetVerifiedUsings() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testState.getVerifiedUsings())));
//		testState.getVerifiedUsings().clear();
//		testState.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testState.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#getExternalRef}.
	 */
	public void testStategetExternalRefs() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testState.getExternalRefs())));
//		testState.getExternalRefs().clear();
//		testState.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testState.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#getOriginatedBy}.
	 */
	public void testStategetOriginatedBys() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testState.getOriginatedBys())));
//		testState.getOriginatedBys().clear();
//		testState.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testState.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#getExternalIdentifier}.
	 */
	public void testStategetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testState.getExternalIdentifiers())));
//		testState.getExternalIdentifiers().clear();
//		testState.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testState.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#getStandardNames}.
	 */
	public void testStategetStandardNames() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testState.getStandardNames())));
		testState.getStandardNames().clear();
		testState.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testState.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.State#getSupportLevel}.
	 */
	public void testStategetSupportLevels() throws InvalidSPDXAnalysisException {
		State testState = generator.builderForStateTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testState.getSupportLevels())));
		testState.getSupportLevels().clear();
		testState.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testState.getSupportLevels())));
	}
}
