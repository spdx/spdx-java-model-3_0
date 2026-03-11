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
import org.spdx.library.model.v3_1.core.PositiveIntegerRange.PositiveIntegerRangeBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class PositiveIntegerRangeTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.core.PositiveIntegerRange#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		PositiveIntegerRange testPositiveIntegerRange = generator.builderForPositiveIntegerRangeTests(TEST_OBJECT_URI).build();
		List<String> result = testPositiveIntegerRange.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PositiveIntegerRange#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		PositiveIntegerRange testPositiveIntegerRange = generator.builderForPositiveIntegerRangeTests(TEST_OBJECT_URI).build();
		assertEquals("Core.PositiveIntegerRange", testPositiveIntegerRange.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PositiveIntegerRange#Element(org.spdx.library.model.v3_1.core.PositiveIntegerRange.PositiveIntegerRangeBuilder)}.
	 */
	public void testPositiveIntegerRangePositiveIntegerRangeBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForPositiveIntegerRangeTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		PositiveIntegerRange testPositiveIntegerRange = generator.builderForPositiveIntegerRangeTests(TEST_OBJECT_URI).build();
		PositiveIntegerRange test2PositiveIntegerRange = generator.builderForPositiveIntegerRangeTests("https://testObject2").build();
		assertTrue(testPositiveIntegerRange.equivalent(test2PositiveIntegerRange));
		assertTrue(test2PositiveIntegerRange.equivalent(testPositiveIntegerRange));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PositiveIntegerRange#setBeginIntegerRange}.
	 */
	public void testPositiveIntegerRangesetBeginIntegerRange() throws InvalidSPDXAnalysisException {
		PositiveIntegerRange testPositiveIntegerRange = generator.builderForPositiveIntegerRangeTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.BEGIN_INTEGER_RANGE_TEST_VALUE, testPositiveIntegerRange.getBeginIntegerRange());
		testPositiveIntegerRange.setBeginIntegerRange(new Integer(653));
		assertEquals(new Integer(653), testPositiveIntegerRange.getBeginIntegerRange());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.core.PositiveIntegerRange#setEndIntegerRange}.
	 */
	public void testPositiveIntegerRangesetEndIntegerRange() throws InvalidSPDXAnalysisException {
		PositiveIntegerRange testPositiveIntegerRange = generator.builderForPositiveIntegerRangeTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.END_INTEGER_RANGE_TEST_VALUE, testPositiveIntegerRange.getEndIntegerRange());
		testPositiveIntegerRange.setEndIntegerRange(new Integer(653));
		assertEquals(new Integer(653), testPositiveIntegerRange.getEndIntegerRange());
	}
}
