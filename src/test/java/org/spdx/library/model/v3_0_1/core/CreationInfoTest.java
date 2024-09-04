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
import java.util.regex.Pattern;
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3_0_1.MockCopyManager;
import org.spdx.library.model.v3_0_1.MockModelStore;
import org.spdx.library.model.v3_0_1.SpdxConstantsV3;
import org.spdx.library.model.v3_0_1.SpdxModelInfoV3_0;
import org.spdx.library.model.v3_0_1.TestValuesGenerator;
import org.spdx.library.model.v3_0_1.UnitTestHelper;
import org.spdx.library.model.v3_0_1.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_0_1.core.CreationInfo.CreationInfoBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class CreationInfoTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.CreationInfo#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		CreationInfo testCreationInfo = generator.builderForCreationInfoTests(TEST_OBJECT_URI).build();
		List<String> result = testCreationInfo.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.CreationInfo#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		CreationInfo testCreationInfo = generator.builderForCreationInfoTests(TEST_OBJECT_URI).build();
		assertEquals("Core.CreationInfo", testCreationInfo.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.CreationInfo#Element(org.spdx.library.model.v3_0_1.core.CreationInfo.CreationInfoBuilder)}.
	 */
	public void testCreationInfoCreationInfoBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForCreationInfoTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		CreationInfo testCreationInfo = generator.builderForCreationInfoTests(TEST_OBJECT_URI).build();
		CreationInfo test2CreationInfo = generator.builderForCreationInfoTests("https://testObject2").build();
		assertTrue(testCreationInfo.equivalent(test2CreationInfo));
		assertTrue(test2CreationInfo.equivalent(testCreationInfo));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.CreationInfo#setCreated}.
	 */
	public void testCreationInfosetCreated() throws InvalidSPDXAnalysisException {
		CreationInfo testCreationInfo = generator.builderForCreationInfoTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.CREATED_TEST_VALUE, testCreationInfo.getCreated());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCreationInfo.setCreated(newStringValue);
		assertEquals(newStringValue, testCreationInfo.getCreated());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.CreationInfo#setSpecVersion}.
	 */
	public void testCreationInfosetSpecVersion() throws InvalidSPDXAnalysisException {
		CreationInfo testCreationInfo = generator.builderForCreationInfoTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.SPEC_VERSION_TEST_VALUE, testCreationInfo.getSpecVersion());
		String newStringValue = UnitTestHelper.genRandPattern("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");
		testCreationInfo.setSpecVersion(newStringValue);
		assertEquals(newStringValue, testCreationInfo.getSpecVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.CreationInfo#setComment}.
	 */
	public void testCreationInfosetComment() throws InvalidSPDXAnalysisException {
		CreationInfo testCreationInfo = generator.builderForCreationInfoTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testCreationInfo.getComment());
		String newStringValue = "new comment value";
		testCreationInfo.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreationInfo.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.CreationInfo#getCreatedBy}.
	 */
	public void testCreationInfogetCreatedBys() throws InvalidSPDXAnalysisException {
		CreationInfo testCreationInfo = generator.builderForCreationInfoTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCreationInfo.getCreatedBys())));
//		testCreationInfo.getCreatedBys().clear();
//		testCreationInfo.getCreatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCreationInfo.getCreatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.CreationInfo#getCreatedUsing}.
	 */
	public void testCreationInfogetCreatedUsings() throws InvalidSPDXAnalysisException {
		CreationInfo testCreationInfo = generator.builderForCreationInfoTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCreationInfo.getCreatedUsings())));
//		testCreationInfo.getCreatedUsings().clear();
//		testCreationInfo.getCreatedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCreationInfo.getCreatedUsings())));
		//TODO: Implement
	}
}