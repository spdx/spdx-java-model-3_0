/**
 * Copyright (c)  Source Auditor Inc.
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
 
package org.spdx.library.model.v3_0_1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.library.model.v3_0_1.core.Element;

import org.spdx.library.model.v3_0_1.core.NoAssertionElement;
import org.spdx.library.model.v3_0_1.core.NoneElement;
import org.spdx.library.model.v3_0_1.expandedlicensing.NoAssertionLicense;
import org.spdx.library.model.v3_0_1.expandedlicensing.NoneLicense;
 
/**
 * *** DO NOT EDIT ***
 * This class is generated by the Model to Java utility
 *
 * This is a static class used to translate a URI into a Java individual class
 * It is a static class with a single public static field <code>uriToIndividual</code> which maps the URI to the individual class
 */
public class SpdxIndividualFactory {
 	/**
	 * Map of individual URI's to their individual values
	 */
	public static Map<String, Object> uriToIndividual;
	
	static {
		Map<String, Element> map = new HashMap<>();
		try {
			map.put("https://spdx.org/rdf/3.0.1/terms/Core/NoAssertionElement", new NoAssertionElement());
			map.put("https://spdx.org/rdf/3.0.1/terms/Core/NoneElement", new NoneElement());
			map.put("https://spdx.org/rdf/3.0.1/terms/ExpandedLicensing/NoAssertionLicense", new NoAssertionLicense());
			map.put("https://spdx.org/rdf/3.0.1/terms/ExpandedLicensing/NoneLicense", new NoneLicense());
		} catch (InvalidSPDXAnalysisException ex) {
			throw new RuntimeException("Unable to load individuals", ex);
		}
		uriToIndividual = Collections.unmodifiableMap(map);
	}

	private SpdxIndividualFactory() {
		// this is only a static class
	}
}
