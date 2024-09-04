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
 
package org.spdx.library.model.v3_0_1.build;

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
import java.util.regex.Pattern;
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3_0_1.MockCopyManager;
import org.spdx.library.model.v3_0_1.MockModelStore;
import org.spdx.library.model.v3_0_1.SpdxConstantsV3;
import org.spdx.library.model.v3_0_1.SpdxModelInfoV3_0;
import org.spdx.library.model.v3_0_1.TestValuesGenerator;
import org.spdx.library.model.v3_0_1.UnitTestHelper;
import org.spdx.library.model.v3_0_1.build.Build.BuildBuilder;
import org.spdx.library.model.v3_0_1.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_0_1.core.CreationInfo;
import org.spdx.library.model.v3_0_1.core.DictionaryEntry;
import org.spdx.library.model.v3_0_1.core.Element;
import org.spdx.library.model.v3_0_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_0_1.core.ExternalRef;
import org.spdx.library.model.v3_0_1.core.Hash;
import org.spdx.library.model.v3_0_1.core.IntegrityMethod;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0_1.extension.Extension;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class BuildTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
		List<String> result = testBuild.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
		assertEquals("Build.Build", testBuild.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#Element(org.spdx.library.model.v3_0_1.build.Build.BuildBuilder)}.
	 */
	public void testBuildBuildBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForBuildTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
		Build test2Build = generator.builderForBuildTests("https://testObject2").build();
		assertTrue(testBuild.equivalent(test2Build));
		assertTrue(test2Build.equivalent(testBuild));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#setCreationInfo}.
	 */
	public void testBuildsetCreationInfo() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testBuild.getCreationInfo());
//		testBuild.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testBuild.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#setBuildId}.
	 */
	public void testBuildsetBuildId() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILD_ID_TEST_VALUE), testBuild.getBuildId());
		String newStringValue = "new buildId value";
		testBuild.setBuildId(newStringValue);
		assertEquals(Optional.of(newStringValue), testBuild.getBuildId());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#setBuildEndTime}.
	 */
	public void testBuildsetBuildEndTime() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILD_END_TIME_TEST_VALUE), testBuild.getBuildEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBuild.setBuildEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBuild.getBuildEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#setSummary}.
	 */
	public void testBuildsetSummary() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testBuild.getSummary());
		String newStringValue = "new summary value";
		testBuild.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testBuild.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#setDescription}.
	 */
	public void testBuildsetDescription() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testBuild.getDescription());
		String newStringValue = "new description value";
		testBuild.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testBuild.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#setComment}.
	 */
	public void testBuildsetComment() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testBuild.getComment());
		String newStringValue = "new comment value";
		testBuild.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testBuild.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#setName}.
	 */
	public void testBuildsetName() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testBuild.getName());
		String newStringValue = "new name value";
		testBuild.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testBuild.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#setBuildStartTime}.
	 */
	public void testBuildsetBuildStartTime() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILD_START_TIME_TEST_VALUE), testBuild.getBuildStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBuild.setBuildStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBuild.getBuildStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#setBuildType}.
	 */
	public void testBuildsetBuildType() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.BUILD_TYPE_TEST_VALUE, testBuild.getBuildType());
		String newStringValue = "new buildType value";
		testBuild.setBuildType(newStringValue);
		assertEquals(newStringValue, testBuild.getBuildType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#getEnvironment}.
	 */
	public void testBuildgetEnvironments() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBuild.getEnvironments())));
//		testBuild.getEnvironments().clear();
//		testBuild.getEnvironments().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBuild.getEnvironments())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#getExtension}.
	 */
	public void testBuildgetExtensions() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBuild.getExtensions())));
//		testBuild.getExtensions().clear();
//		testBuild.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBuild.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#getVerifiedUsing}.
	 */
	public void testBuildgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBuild.getVerifiedUsings())));
//		testBuild.getVerifiedUsings().clear();
//		testBuild.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBuild.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#getExternalRef}.
	 */
	public void testBuildgetExternalRefs() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBuild.getExternalRefs())));
//		testBuild.getExternalRefs().clear();
//		testBuild.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBuild.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#getConfigSourceDigest}.
	 */
	public void testBuildgetConfigSourceDigests() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBuild.getConfigSourceDigests())));
//		testBuild.getConfigSourceDigests().clear();
//		testBuild.getConfigSourceDigests().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBuild.getConfigSourceDigests())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#getParameter}.
	 */
	public void testBuildgetParameters() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBuild.getParameters())));
//		testBuild.getParameters().clear();
//		testBuild.getParameters().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBuild.getParameters())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#getExternalIdentifier}.
	 */
	public void testBuildgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBuild.getExternalIdentifiers())));
//		testBuild.getExternalIdentifiers().clear();
//		testBuild.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBuild.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#getConfigSourceEntrypoints}.
	 */
	public void testBuildgetConfigSourceEntrypoints() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.CONFIG_SOURCE_ENTRYPOINT_TEST_LIST1, new ArrayList<>(testBuild.getConfigSourceEntrypoints())));
		testBuild.getConfigSourceEntrypoints().clear();
		testBuild.getConfigSourceEntrypoints().addAll(TestValuesGenerator.CONFIG_SOURCE_ENTRYPOINT_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.CONFIG_SOURCE_ENTRYPOINT_TEST_LIST2, new ArrayList<>(testBuild.getConfigSourceEntrypoints())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.build.Build#getConfigSourceUris}.
	 */
	public void testBuildgetConfigSourceUris() throws InvalidSPDXAnalysisException {
		Build testBuild = generator.builderForBuildTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.CONFIG_SOURCE_URI_TEST_LIST1, new ArrayList<>(testBuild.getConfigSourceUris())));
		testBuild.getConfigSourceUris().clear();
		testBuild.getConfigSourceUris().addAll(TestValuesGenerator.CONFIG_SOURCE_URI_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.CONFIG_SOURCE_URI_TEST_LIST2, new ArrayList<>(testBuild.getConfigSourceUris())));
	}
}