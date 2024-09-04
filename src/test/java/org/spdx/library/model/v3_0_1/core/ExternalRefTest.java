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
import org.spdx.library.model.v3_0_1.core.ExternalRef.ExternalRefBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class ExternalRefTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.ExternalRef#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ExternalRef testExternalRef = generator.builderForExternalRefTests(TEST_OBJECT_URI).build();
		List<String> result = testExternalRef.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.ExternalRef#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ExternalRef testExternalRef = generator.builderForExternalRefTests(TEST_OBJECT_URI).build();
		assertEquals("Core.ExternalRef", testExternalRef.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.ExternalRef#Element(org.spdx.library.model.v3_0_1.core.ExternalRef.ExternalRefBuilder)}.
	 */
	public void testExternalRefExternalRefBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForExternalRefTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ExternalRef testExternalRef = generator.builderForExternalRefTests(TEST_OBJECT_URI).build();
		ExternalRef test2ExternalRef = generator.builderForExternalRefTests("https://testObject2").build();
		assertTrue(testExternalRef.equivalent(test2ExternalRef));
		assertTrue(test2ExternalRef.equivalent(testExternalRef));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.ExternalRef#setExternalRefType}.
	 */
	public void testExternalRefsetExternalRefType() throws InvalidSPDXAnalysisException {
		ExternalRef testExternalRef = generator.builderForExternalRefTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.EXTERNAL_REF_TYPE_TEST_VALUE1), testExternalRef.getExternalRefType());
		testExternalRef.setExternalRefType(TestValuesGenerator.EXTERNAL_REF_TYPE_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.EXTERNAL_REF_TYPE_TEST_VALUE2), testExternalRef.getExternalRefType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.ExternalRef#setContentType}.
	 */
	public void testExternalRefsetContentType() throws InvalidSPDXAnalysisException {
		ExternalRef testExternalRef = generator.builderForExternalRefTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.CONTENT_TYPE_TEST_VALUE), testExternalRef.getContentType());
		String newStringValue = UnitTestHelper.genRandPattern("^[^\\/]+\\/[^\\/]+$");
		testExternalRef.setContentType(newStringValue);
		assertEquals(Optional.of(newStringValue), testExternalRef.getContentType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.ExternalRef#setComment}.
	 */
	public void testExternalRefsetComment() throws InvalidSPDXAnalysisException {
		ExternalRef testExternalRef = generator.builderForExternalRefTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testExternalRef.getComment());
		String newStringValue = "new comment value";
		testExternalRef.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testExternalRef.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.ExternalRef#getLocators}.
	 */
	public void testExternalRefgetLocators() throws InvalidSPDXAnalysisException {
		ExternalRef testExternalRef = generator.builderForExternalRefTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.LOCATOR_TEST_LIST1, new ArrayList<>(testExternalRef.getLocators())));
		testExternalRef.getLocators().clear();
		testExternalRef.getLocators().addAll(TestValuesGenerator.LOCATOR_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.LOCATOR_TEST_LIST2, new ArrayList<>(testExternalRef.getLocators())));
	}
}